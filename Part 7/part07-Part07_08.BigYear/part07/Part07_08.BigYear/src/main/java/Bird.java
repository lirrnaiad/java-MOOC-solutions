public class Bird {
    private String name;
    private String nameLatin;
    private int observations;
    public Bird (String common, String latin) {
        this.name = common;
        this.nameLatin = latin;
        this.observations = 0;
    }

    public String toString() {
        return name + " (" + nameLatin + "): " + observations + " observations";
    }

    public String getName() {
        return this.name;
    }

    public void addObservation() {
        this.observations++;
    }
}