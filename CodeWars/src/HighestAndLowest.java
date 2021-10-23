public class HighestAndLowest {
    //https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
    public static String HighAndLow(String numbers) {
        String strArray[] = numbers.split(" ");
        int intArray_size = strArray.length;
        int intArray[] = new int[intArray_size];

        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.valueOf(strArray[i]);
        }

        int highest = intArray[0];
        int lowest = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > highest) {
                highest = intArray[i];
            }
            if (intArray[i] < lowest) {
                lowest = intArray[i];
            }
        }

        return String.valueOf(highest) + " " + String.valueOf(lowest);
    }

}
