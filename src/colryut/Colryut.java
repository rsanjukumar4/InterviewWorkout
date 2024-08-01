package colryut;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class Colryut {

    private Comparator getNameComparator = Comparator.comparing(Item::getName);
    private Comparator getPriceComparator = Comparator.comparing(Item::getPrice);

    public static void main(String[] args) {
        EmployeeVO employeeVO = EmployeeVO.getInstance();
        employeeVO.hello();

        Colryut colryut = new Colryut();
        List<Item> items = List.of(
                new Item("rice", 123.00),
                new Item("sugar", 456.00),
                new Item("oil", 342.00)
        );
        System.out.println(items);
        colryut.sortItems(items,"name");
        System.out.println(items);
       // create sort items list , name of attributes
    }

    void sortItems(List<Item> items, String sortKey)  {
        Function<Item, Object> getName;

        Map<String,Comparator> map = new HashMap<>();
//        List<String> filterList = List.of("name","price");
//        String filteredKey = filterList.stream()
//                .filter(value -> filterList.equals(value))
//                .findFirst().orElse(null);
//        if("name".equals(sortKey)) {
//            getName = Item::getName;
////            items.sort(Comparator.comparing(getName));
//        } else {
//            getName = Item::getPrice;
////            items.sort(Comparator.comparing(Item::getPrice));
//        }
//        items.sort(Comparator.comparing(getName));

    }




}
