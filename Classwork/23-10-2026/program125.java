
import java.util.Scanner;

class Digit {

    public static void displayDigits(int iNo) {

        int iDigit = 0;
        if (iNo < 0) {
            iNo = -iNo;
        }
        while (iNo != 0) {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            System.out.println(iDigit);
        }

    }

}

class program125 {

    public static void main(String A[]) {
        Scanner Scanner = new Scanner(System.in);
        Digit digit = new Digit();
        System.out.println("Enter Number\n");
        int iValue = Scanner.nextInt();
        digit.displayDigits(iValue);

    }
}
