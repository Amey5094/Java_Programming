
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

class program123 {

    public static void main(String A[]) {
        Digit digit = new Digit();
        digit.displayDigits(9752);

    }
}
