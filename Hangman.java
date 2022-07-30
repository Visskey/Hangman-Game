import java.util.*;

class Game {
    static Scanner input;
    
    public static void hangman()
    {
        input = new Scanner(System.in);

        // Array i kompanive te ndryshme
        String[] company = { "Lamborghini", "Wolkswagen", "Porsche", "Tesla", "Adidas", "Nike", "Rebook", "Google", "Apple", "Samsung"};
        System.out.println("    Miresevini ne lojen HANGMAN    ");
        
        Random obj = new Random();
        int Ran_num = obj.nextInt(10);
        
        String word = (company[Ran_num]);
        word = word.toUpperCase();
        
        String word1 = word.replaceAll("[A-Z]", "_ ");
        
        System.out.println("Fillojme lojen: ");
        FillojmeLojen(word, word1);
    }
    public static void FillojmeLojen(String word, String word1)
    {
        int guess_ = 0;
        int wrong = 0;

        String guess;
        char letter;

        boolean guessescontainsguess;
        String guesses = "";
        boolean guessinword;


        while (wrong < 5 && word1.contains("_")) {

            System.out.println(word1 + "\n");
            int temp = 5 - wrong;
            if (wrong != 0) {
                System.out.println("Ju keni " + temp + " jeta te mbetura");
            }
            System.out.print("Shkronja juaj:");
    }
        
public static void main(String[] args)
    {
        
    }
}
