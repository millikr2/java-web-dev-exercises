package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

//        first exercise

//        Scanner input = new Scanner(System.in);
//        System.out.println("Hello, what is your name:");
//        String name = input.nextLine();
//        System.out.println("Hello " + name);
//        input.close();
//
//        second exercise with Alice
        Scanner input = new Scanner(System.in);

        System.out.println("Search for a word in the beginning of Alice in Wonderland");
        String word = input.nextLine().toLowerCase();
        input.close();

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        if(sentence.toLowerCase().contains(word)){
            System.out.println("Your word was found at index: " + sentence.toLowerCase().indexOf(word) + " and has a length of: " + word.length());
            sentence = sentence.toLowerCase().replace(word,"").trim();
            System.out.println("Your new sentence with the word removed is: " + sentence);
        } else {
            System.out.println("Your word was not found");
        }


    }

}
