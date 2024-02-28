import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> items = storage.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storage.getOrDefault(storageUnit, new ArrayList<String>());
    }

    public void remove(String storageUnit, String item) {
        if (storage.get(storageUnit).size() == 1) {
            storage.remove(storageUnit);
        } else storage.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String storageUnit : storage.keySet()) {
            if (storageUnit == null || storage.get(storageUnit) == null || storage.get(storageUnit).isEmpty()) {
                continue;
            }

            units.add(storageUnit);
        }

        return units;
    }
}
