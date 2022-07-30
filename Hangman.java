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
            
            guess = input.nextLine(); //pergjigja e lojtarit
            guess = guess.toUpperCase();

            letter = guess.charAt(0); // marrim vetem shkronjen e pare

            guessescontainsguess = (guesses.indexOf(letter)) != -1;
            guesses += letter;


            letter = Character.toUpperCase(letter);
            System.out.println();

            if (guessescontainsguess == true) {
                System.out.println("Ju e keni zgjedhur me pare shkronjen: " + letter + ". \n");
            }

            guessinword = (word.indexOf(letter)) != -1;


            if (guessinword == true) {
                
                System.out.println(letter + " eshte ne kete fjale");
                System.out.print("\n");

                //zevendesojme _ me shkronjen nese ajo eshte e sakte
                for (int position = 0; position < word.length(); position++) {

                    if (word.charAt(position) == letter && word1.charAt(position) != letter) {

                        word1 = word1.replaceAll("_ ", "_");
                        String word2;
                        word2 = word1.substring(0, position) + letter + word1.substring(position+ 1);
                        word2 = word2.replaceAll("_", "_ ");
                        word1 = word2;
                    }
                }
            }
            else {
                System.out.println(letter + " nuk eshte ne kete fjale.");
                wrong++;
            }
            guess_++;
        }

        if (wrong == 5) {
            System.out.println("Ju humbet");
        }
        else {
            System.out.print("Fjala eshte: " + word1 + "\n Well Played, you did it!!");
        }
    }
        
public static void main(String[] args)
    {
        hangman();
    }
}
