import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(34);
        integers.add(35);
        integers.add(235);
        integers.add(26);
        integers.add(98);

        Collections.sort(integers);
        System.out.println(integers);
    }
}