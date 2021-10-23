public class SquareDigit {
//https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
    public static int squareDigits(int n) {
        String inputedNumber = Integer.toString(n);
        String result = "";
        int i = 0;
        for (i=0; i < inputedNumber.length(); i++){
            int value = Character.getNumericValue(inputedNumber.charAt(i));
            result += String.valueOf(value*value);
        }

        return Integer.parseInt(result);
    }

}