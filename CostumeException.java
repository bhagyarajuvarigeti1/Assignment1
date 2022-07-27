import java.util.Scanner;

public class CostumeException extends Exception {
    public CostumeException(String message){
        super(message);
    }
}

class Example{
    public static void main(String[] args) throws CostumeException {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if(y <= 0){
            throw new CostumeException("Exception occurs donot enter zero as value of 'y'.");
        }
        else {
            System.out.println(x/y);
        }
    }
}