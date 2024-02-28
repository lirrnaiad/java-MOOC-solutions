import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if(vehicleRegistry.containsKey(licensePlate)) {
            return false;
        }

        vehicleRegistry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return vehicleRegistry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicleRegistry.containsKey(licensePlate)) {
            vehicleRegistry.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : vehicleRegistry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersAlreadyPrinted = new ArrayList<>();

        for (String owner : vehicleRegistry.values()) {
            if (ownersAlreadyPrinted.contains(owner)) {
                continue;
            }

            System.out.println(owner);
            ownersAlreadyPrinted.add(owner);
        }
    }
}
