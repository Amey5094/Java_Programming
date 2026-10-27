
import java.util.Scanner;

class Digit {

    public int countDigits(int iNo) {

        int iDigit = 0;
        int iCount = 0;
        if (iNo < 0) {
            iNo = -iNo;
        }
        while (iNo != 0) {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iCount++;
        }
        return iCount;
    }

}

class program126 {

    public static void main(String A[]) {
        Scanner Scanner = new Scanner(System.in);
        int iRet = 0;
        Digit digit = new Digit();
        System.out.println("Enter Number\n");
        int iValue = Scanner.nextInt();
        iRet = digit.countDigits(iValue);
        System.out.println("Number of Digits:" + iRet);

    }
}
