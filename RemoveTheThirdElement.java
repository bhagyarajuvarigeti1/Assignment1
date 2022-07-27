import java.util.ArrayList;

public class RemoveTheThirdElement {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(34);
        integers.add(35);
        integers.add(235);
        integers.add(26);
        integers.add(98);

        System.out.println(integers);

        integers.remove(3);

        System.out.println(integers);
    }
}
