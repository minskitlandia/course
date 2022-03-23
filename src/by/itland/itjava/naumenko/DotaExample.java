package by.itland.itjava.naumenko;

public class DotaExample {

    public static void main(String[] args) throws InterruptedException {

        Hero hero1 = new Hero("ROHAN", 20, 25, 25);
        Hero hero2 = new Hero("AXE", 20, 30, 20);

        Thread thread1 = new Thread(() -> {
            System.out.println("поток her1 start");
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    hero1.atack(hero2);
                    Thread.sleep(1000 / hero1.getDexterity() + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("поток her1 fin");
        });

        Thread thread2 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
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
                    thread1.stop();
                    thread2.stop();
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
    private int hp;
    private int exp = 0;
    private int level = 1;

    public Hero() {
    }

    public Hero(String name, int hp, int power, int dexterity) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.dexterity = dexterity;
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

    public void atack(Hero other) {
        if (exp >= 1000 * level && level < 25) {
            addLevel();
        }
        if (!other.isDeath()) {
            other.hp -= 1;
//        int expForAtack = (int) (Math.random() * 100 * level);
            this.exp += 100;
            printInfoHero("Нанес удар");
            System.out.println(power);
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
