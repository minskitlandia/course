package by.itland.itjava.naumenko;

public class DotaExample {

    public static void main(String[] args) throws InterruptedException {

        Hero hero1 = new Hero("ROHAN", 505, 50, 25);
        Hero hero2 = new Hero("AXE", 450, 30, 20);

        Thread thread1 = new Thread(() -> {
            System.out.println("поток her1 start");
            while (true) {
                if (Thread.currentThread().isInterrupted())
                    break;
                try {
                    hero1.atack(hero2);
                    Thread.sleep(1000 / hero1.getDexterity());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("поток her1 fin");
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted())
                    break;
                try {
                    hero2.atack(hero1);
                    Thread.sleep(1000 / hero2.getDexterity());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread game = new Thread(() -> {
            thread1.start();
            thread2.start();
            while (!Thread.currentThread().isInterrupted()) {
                if (hero1.isDeath() || hero2.isDeath()) {
                    thread1.interrupt();
                    thread2.interrupt();
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("GAME over");
        });
        game.start();



        while (true) {
            if (hero1.isDeath() || hero2.isDeath()) {
                hero1.status(hero2);
                break;

            }
//            Thread.sleep(5000);
            System.out.println(hero1);
            System.out.println(hero2);
        }
        System.out.println(hero1);
        System.out.println(hero2);


    }
}

class Hero {
    private String name;
    private int power;
    private int dexterity;
    private volatile int hp;
    private int exp = 0;
    private int level = 1;

    public Hero() {
    }

    public Hero(String name, int hp, int power, int lovkost) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.dexterity = lovkost;
    }

    private void printInfoHero(String text) {
        System.out.printf("ГЕРОЙ %s %s \n", name, text);
    }

    public void addLevel() {
        level++;
        power += 2;
        dexterity += 2;
        hp += level * 2;
        printInfoHero("получил новый уровень");
    }

    public synchronized void atack(Hero other) {
        if (exp >= 1000 * level && level < 25) {
            addLevel();
        }

        if ((int) (Math.random() * 100) >= (100 - other.dexterity)) {
            int atack = (int) (Math.random() * this.power);
            other.hp -= atack;
            int expForAtack = (int) (Math.random() * 100 * level);
            this.exp += expForAtack;
            printInfoHero("Нанес удар");
            System.out.println(atack);
        } else {
            other.printInfoHero("уклонился--------------------------------");
        }
    }

    public boolean isDeath() {
        return this.hp <= 0;
    }

    public void death() {
        if (isDeath())
            printInfoHero("умер");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", lovkost=" + dexterity +
                ", hp=" + hp +
                ", exp=" + exp +
                ", level=" + level +
                '}';
    }

    public int getDexterity() {
        return dexterity;
    }

    public void status(Hero other) {
        if (this.isDeath()) {
            printInfoHero("Умер");
            other.printInfoHero("Победил");
        } else {
            other.printInfoHero("Умер");
            printInfoHero("Победил");
        }

    }
}
