import java.util.ArrayList;

public class CompareTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(34);
        list1.add(35);
        list1.add(78);
        list1.add(26);
        list1.add(98);
        list2.add(34);
        list2.add(35);
        list2.add(78);
        list2.add(26);
        list2.add(98);
        if(list1.size() != list2.size()){
            System.out.println("Both are not equal" );
        }
        else {
            for(int i = 0; i < list1.size(); i++){
                if(list1.get(i) != list2.get(i)){
                    System.out.println(list2.get(i) +"Both are not equal" + list1.get(i));
                    return;
                }
            }
        }

        System.out.println("Both are equal");
    }
}
