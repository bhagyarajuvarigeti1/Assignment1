public class TraverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 23, 74};
        int element = 23;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                System.out.println(i + " is Index of the " + element);
            }
        }
    }
}
