package by.itland.itjava.bulatsky.lesson11;

public class Desktop extends Telephone {

    String oplace;
    int osize;
    int resize;
    boolean fullscreen;

    public Desktop(String name, String font, boolean ram, String oplace, int osize, int resize, boolean fullscreen) {
        super(name, font, ram);
        this.oplace = oplace;
        this.osize = osize;
        this.resize = resize;
        this.fullscreen = fullscreen;
    }

    public String getOplace() {
        return oplace;
    }

    public int getOsize() {
        return osize;
    }

    public int getResize() {
        return resize;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    public void setOplace(String oplace) {
        this.oplace = oplace;
    }

    public void setOsize(int osize) {
        this.osize = osize;
    }

    public void setResize(int resize) {
        this.resize = resize;
    }

    public void setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "oplace='" + oplace + '\'' +
                ", osize=" + osize +
                ", resize=" + resize +
                ", fullscreen=" + fullscreen +
                ", name='" + name + '\'' +
                ", font='" + font + '\'' +
                ", ram=" + ram +
                '}';
    }
}
