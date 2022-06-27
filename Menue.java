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

                                case 3:
                                        //wer da sonst noch so wäre ...
                                        System.out.println("Valentin Schneider");

                                case 2:
<<<<<<< HEAD
                                        //wer da sonst noch so wäre ...
                                        System.out.println("Michael Sauer");
=======
                                        System.out.println("Florian Staudt");
                                break;
                                case 9: 
                                        System.out.println("Joscha Kirchen");
<<<<<<< HEAD
                                     
                                case 10: 
=======
                                case 93: 
>>>>>>> f87f7477c3e48ce69403cb0611cea574eb526616
                                        System.out.println("Lennart Großart");
                                break;
                                case 11:
                                        System.out.println("Damian Siol");
				                break;
                                case 14:
					                    System.out.println("Marcel Splettstößer");
                                break;
                                case 12:
                                        System.out.println("Nadir Tatar");
                                        break;

                                case 13:
                                        System.out.println("Moritz Jost");
                                        break;
                                case 17:
                                        System.out.println("123");
>>>>>>> 4f3602e806d454e9a0eb133ba12bb18f49738c65
                                break;
                                case 36:
                                    System.out.println("Christoph Wörz");
                                break;
                                case 69:
                                        System.out.println("Nick Paul");
                                break;
                                case 8:
                                        System.out.println("Tim Nimsgern");
                                case 7:
                                        System.out.println("Yannik Schneider");
                                break;
                                case 101:
                                        System.out.println("Jonas Dietrich");
                                break;
                                case 35:
                                        System.out.println("Kevin Baumgart");
                                break;
                                                                case 325:
                                        System.out.println("Philipp Gerard");
                                break;
                                case 37: 
				System.out.println("Walaa Alhalabi");
				break;
                                default:
                                        System.out.println("Fehler: Kenne ich nicht!");
                        }     
                }
                scanner.close();
        } 
}
