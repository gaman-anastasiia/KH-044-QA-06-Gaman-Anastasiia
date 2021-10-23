public class Vowels {
//https://www.codewars.com/kata/54ff3102c1bad923760001f3/java
    public static int getCount(String str) {
        int vowelsCount = 0;

        int i = 0;
        for (i = 0; i < str.length(); i++){
            switch(str.charAt(i)){
                case 'a':
                    vowelsCount++;
                    break;

                case 'e':
                    vowelsCount++;
                    break;

                case 'i':
                    vowelsCount++;
                    break;

                case 'o':
                    vowelsCount++;
                    break;

                case 'u':
                    vowelsCount++;
                    break;
            };
        }
        return vowelsCount;
    }
}