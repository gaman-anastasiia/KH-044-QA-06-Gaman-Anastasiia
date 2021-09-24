import sun.text.normalizer.UCharacter;

import java.util.Scanner;
public class HomeTask4 {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any three words using comma");
        String str = scanner.nextLine();
            String[] words = str.split(",");
            for (String word : words)
                System.out.println(word);

            System.out.println("Select one of the following filters:\n" +
                        "1 - maximum length \n" +
                        "2 - start with\n" +
                        "3 - end with\n" +
                        "4 - contains\n" +
                        "0 - exit\n");
                    String filter = scanner.nextLine();

              do {
                   switch (filter) {
                       case "0":
                           System.out.println("Exit");
                           break;
                       case "1":
                           System.out.println("input maximum length");
                           String maximum_length = scanner.nextLine();
                           for (int i = 0; i < words.length; i++){
                               if (Integer.parseInt(maximum_length) == words[i].length()){
                                   System.out.println(words[i]);
                               }
                           }
                           System.out.println("Select one of the following filters:\n" +
                                   "1 - maximum length \n" +
                                   "2 - start with\n" +
                                   "3 - end with\n" +
                                   "4 - contains\n" +
                                   "0 - exit\n");
                           filter = scanner.nextLine();
                           break;
                       case "2":
                           System.out.println("input first letters");
                           String first_letters = scanner.nextLine();
                           for (int i = 0; i < words.length; i++){
                               if (words[i].startsWith(first_letters)) {
                                   System.out.print(words[i] + "\n");
                               }
                           }
                           System.out.println("Select one of the following filters:\n" +
                                   "1 - maximum length \n" +
                                   "2 - start with\n" +
                                   "3 - end with\n" +
                                   "4 - contains\n" +
                                   "0 - exit\n");
                           filter = scanner.nextLine();
                           break;
                       case "3":
                           System.out.println("input last letters");
                           String last_letter = scanner.nextLine();
                           for (int i = 0; i < words.length; i++){
                               if (words[i].endsWith(last_letter)) {
                                   System.out.print(words[i] + "\n");
                               }
                           }
                           System.out.println("Select one of the following filters:\n" +
                                   "1 - maximum length \n" +
                                   "2 - start with\n" +
                                   "3 - end with\n" +
                                   "4 - contains\n" +
                                   "0 - exit\n");
                           filter = scanner.nextLine();
                           break;
                       case "4":
                           System.out.println("input part of the word");
                           String word_part = scanner.nextLine();
                           for (int i = 0; i < words.length; i++){
                               if (words[i].contains(word_part)) {
                                   System.out.print(words[i] + "\n");
                               }
                           }
                           System.out.println("Select one of the following filters:\n" +
                                   "1 - maximum length \n" +
                                   "2 - start with\n" +
                                   "3 - end with\n" +
                                   "4 - contains\n" +
                                   "0 - exit\n");
                           filter = scanner.nextLine();
                           break;
                       default:
                           System.out.println("Error. Inputted wrong value");
                           System.out.println("Select one of the following filters:\n" +
                                   "1 - maximum length \n" +
                                   "2 - start with\n" +
                                   "3 - end with\n" +
                                   "4 - contains\n" +
                                   "0 - exit\n");
                           filter = scanner.nextLine();
                   }
               } while (!filter.equals("0"));
                System.out.println("Game over");
    }
}