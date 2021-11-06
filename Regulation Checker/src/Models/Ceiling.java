package Models;

public class Ceiling {
    String family;
    int height;
    long id;

    public Ceiling(String family, String yPosition, String id) {
        this.family = family;
        this.height = Integer.parseInt(yPosition);
        this.id = Integer.parseInt(id);
    }

    public String getFamily() {
        return family;
    }

    public int getHeight() {
        return height;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "Family='" + family + '\'' +
                ", height=" + height +
                ", id=" + id +
                '}';
    }
}
