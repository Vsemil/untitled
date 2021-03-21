import java.awt.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String arg = "save";

        MenuItems menuItems;

        if (arg.equals(MenuItems.SAVE.getName())) {
            menuItems = MenuItems.SAVE;
        } else if (arg.equals(MenuItems.FIND.getName())) {
            menuItems = MenuItems.FIND;
        } else {
            menuItems = MenuItems.DELETE;
        }

        String any;

        switch (menuItems) {
            case SAVE:
                any = "1";
                break;
            case FIND:
                any = "2";
                break;
            case DELETE:
                any = "3";
                break;
            default:
                any = "default";
        }

        System.out.println(any);

        MenuItems[] values = MenuItems.values();
        for (MenuItems item : values) {
            System.out.println(item);
        }

        HashMap<Integer, Object> hashMap = new HashMap<>();

        Set<Integer> keySet = hashMap.keySet();
        Collection<Object> objects = hashMap.values();

        Set<Map.Entry<Integer, Object>> entries = hashMap.entrySet();

        for (Map.Entry<Integer, Object> entry : entries) {
            Integer key = entry.getKey();
            Object value = entry.getValue();
        }

        Cat cat = new Cat(Breed.PERSIAN);

        if (cat.getBreed() == Breed.PERSIAN) {

        }

    }
}
