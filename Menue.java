
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
		                        break;
				                case 25:
                                        System.out.println("Alexander Weißmüller");
<<<<<<< HEAD
					            break;
				                case 5:
					                    System.out.println("Tamara Braun");
=======
					break;
				case 5:
					System.out.println("Tamara Braun");

>>>>>>> ac8c176a2a6f22b383e6b3722445a2bada6d225d
                                break;

<<<<<<< HEAD
=======
                                        break;
					break;
>>>>>>> ac8c176a2a6f22b383e6b3722445a2bada6d225d
                                case 9:
                                        System.out.println("Joscha Kirchen");
<<<<<<< HEAD
                                break;
=======
					break;
>>>>>>> ac8c176a2a6f22b383e6b3722445a2bada6d225d
                                case 93:
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
<<<<<<< HEAD
                                break;
=======
				
				case 27:
					System.out.println("Niklas Jochem");
				break;
				
                                        break;
>>>>>>> ac8c176a2a6f22b383e6b3722445a2bada6d225d
                                case 36:
                                        System.out.println("Christoph Wörz");
                                break;
                                case 69:
                                        System.out.println("Nick Paul");
                                break;
                                case 8:
                                        System.out.println("Tim Nimsgern");
                                break;
                                case 7:
                                        System.out.println("Yannik Schneider");
                                break;
                                case 101:

                                System.out.println("Jonas Dietrich");
                                break;
                                case 4444:
                                System.out.println("Tim Blittersdorf"); 
                                break;
                                case 5416328:
                                System.out.println("Igor Gorban");
                                break;



                                        System.out.println("Jonas Dietrich");
                                        break;
                                case 35:
                                        System.out.println("Kevin Baumgart");
                                        break;
                                case 88:
                                        System.out.println("Stephan Schmidt");
                                        break;
                                case 325:
                                        System.out.println("Philipp Gerard");
                                        break;
                                case 345:
                                        System.out.println("Dennis Holzer");
                                        break;
<<<<<<< HEAD
<<<<<<< HEAD
                                case 345:
                                        System.out.println("Selvanitha Selvanayagam");
                                        break;
=======
<<<<<<< HEAD
=======
>>>>>>> 0fe1e5037d96e52165ca1755e5d4a76f9f982d49

                                case 346:
                                        System.out.println("Sally Khout");
                                        break;
<<<<<<< HEAD

				case 24:
					System.out.println("Festim Krasniqi");
					break;

=======
				case 24:
					System.out.println("Festim Krasniqi");
					break;
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/main
>>>>>>> 1936926e5522e22ebeae27bf686f8c4dd2cf0656
=======
>>>>>>> ac8c176a2a6f22b383e6b3722445a2bada6d225d
>>>>>>> 0fe1e5037d96e52165ca1755e5d4a76f9f982d49
                                default:
                                        System.out.println("Fehler: Kenne ich nicht!");
                        }
                }
                scanner.close();
        }
}
