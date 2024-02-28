import java.util.HashMap;

public class Abbreviations {
    private HashMap <String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (hasAbbreviation(abbreviation)) {
            System.out.println("Abbreviation already exists!");
            return;
        }

        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviations.get(abbreviation);
    }
}