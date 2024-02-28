
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }


    @Override
    public boolean equals(Object objectCompared) {
        if (this == objectCompared) {
            return true;
        }

        if (!(objectCompared instanceof LicensePlate)) {
            return false;
        }

        LicensePlate comparedPlate = (LicensePlate) objectCompared;

        if (this.country.equals(comparedPlate.country) && this.liNumber.equals(comparedPlate.liNumber)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.country, this.liNumber);
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
