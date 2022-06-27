//Test
import java.util.Scanner;
public class Menue{
        public static void main(String[] args) {
                final int PROGRAMMENDE=0;
                boolean isEnde=false;
                Scanner scanner = new Scanner(System.in);
                while(!isEnde){     
                        int wahl = scanner.nextInt();
                        switch (wahl) {
                                case PROGRAMMENDE:
                                        System.out.println("Ciao");
                                        isEnde=true;
                                break;
                                case 1:
                                        System.out.println("Michael Sauer");
                                break;
                                case 2:
<<<<<<< HEAD
                                        //wer da sonst noch so wäre ...
                                        System.out.println("Michael Sauer");
=======
                                        System.out.println("Florian Staudt");
                                break;
                                case 9: 
                                        System.out.println("Joscha Kirchen");
                                     System.out.println("Walaa Alhalabi");
                                case 10: 
                                        System.out.println("Lennart Großart");

                                break;
                                case 11:

                                        System.out.println("Damian Siol");
                                break;
                                case 17:
                                        System.out.println("123");
>>>>>>> 4f3602e806d454e9a0eb133ba12bb18f49738c65
                                break;
                                case 69:
                                        System.out.println("Nick Paul");
                                break;
                                case 8:
                                        System.out.println("Tim Nimsgern");
                                break;
                                case 101:
                                System.out.println("Jonas Dietrich");
                                break;
                                default:
                                        System.out.println("Fehler: Kenne ich nicht!");
                        }     
                }
                scanner.close();
        } 
}
