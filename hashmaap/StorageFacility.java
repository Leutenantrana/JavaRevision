package hashmaap;

import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        String roomString = stringifyString(unit);
        this.facility.putIfAbsent(roomString, new ArrayList<>());
        ArrayList<String> wareHouse = this.facility.get(roomString);
        wareHouse.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> wareHouse = this.facility.get(stringifyString(storageUnit));
        return wareHouse;
    }

    public String stringifyString(String input) {
        return input.toLowerCase().trim();
    }

    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }

    public void remove(String storageUnit, String item) {
        String unitToDelete = stringifyString(storageUnit);
        if (this.facility.containsKey(unitToDelete)) {
            ArrayList<String> contents = this.facility.get(unitToDelete);
            contents.remove(item);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitList = new ArrayList<>();
        for (String unitName : this.facility.keySet()) {
            unitList.add(unitName);
        }
        return unitList;
    }
}
