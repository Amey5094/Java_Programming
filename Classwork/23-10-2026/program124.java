
import java.util.Scanner;

class Digit {

    public static void displayDigits(int iNo) {

        int iDigit = 0;
        while (iNo != 0) {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            System.out.println(iDigit);
        }

    }

}

class program124 {

    public static void main(String A[]) {
        Scanner Scanner = new Scanner(System.in);
        Digit digit = new Digit();
        System.out.println("Enter Number\n");
        int iValue = Scanner.nextInt();
        digit.displayDigits(iValue);

    }
}
