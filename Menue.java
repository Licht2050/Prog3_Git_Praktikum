
//Test
import java.util.Scanner;

public class Menue {
        public static void main(String[] args) {
                final int PROGRAMMENDE = 0;
                boolean isEnde = false;
                Scanner scanner = new Scanner(System.in);
                while (!isEnde) {
                        int wahl = scanner.nextInt();
                        switch (wahl) {
                                case PROGRAMMENDE:
                                        System.out.println("Ciao");
                                        isEnde = true;
                                        break;
                                case 1:
                                        System.out.println("Michael Sauer");
                                        break;

                                case 3:
                                        // wer da sonst noch so wäre ...
                                        System.out.println("Valentin Schneider");

                                case 2:
                                        System.out.println("Florian Staudt");
<<<<<<< HEAD
				break;

				case 5:
					System.out.println("Tamara Braun");
                                break;
                                case 9: 
=======
                                        break;
                                case 9:
>>>>>>> eed55016a560bcddf7cef7e213e2eed219c47a23
                                        System.out.println("Joscha Kirchen");
                                case 93:
                                        System.out.println("Lennart Großart");
<<<<<<< HEAD
                                break;

				case 28;
					System.out.println("Nico Schorr");
				break;

=======
                                    
>>>>>>> refs/remotes/origin/main
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
                                case 345:
                                        System.out.println("Dennis Holzer");
                                        break;
                                default:
                                        System.out.println("Fehler: Kenne ich nicht!");
                        }
                }
                scanner.close();
        }
}
