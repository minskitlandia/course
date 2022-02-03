package by.itland.itjava.timshina.lesson11.Apps;

public class Apps {
    private String name;
    private String font;
    private Boolean frames;

    public Apps() {

    }

    public Apps(String name, String font, Boolean frames) {
        this.name = name;
        this.font = font;
        this.frames = frames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public Boolean getFrames() {
        return frames;
    }

    public void setFrames(Boolean frames) {
        this.frames = frames;
    }
}
