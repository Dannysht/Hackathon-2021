package Models;

public class Ceiling {
    String family;
    double height;
    long id;

    public Ceiling(String family, String yPosition, String id) {
        this.family = family;
        this.height = Double.parseDouble(yPosition);
        this.id = Long.parseLong(id);
    }

    public String getFamily() {
        return family;
    }

    public double getHeight() {
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
