
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
					break;
				case 5:
					System.out.println("Tamara Braun");
<<<<<<< HEAD
                                break;
                                case 9: 

                                        break;
=======
					break;
>>>>>>> b3d194713c41fc0cf42b4774771d21862837a18c
                                case 9:

                                        System.out.println("Joscha Kirchen");
<<<<<<< HEAD
=======
					break;
>>>>>>> b3d194713c41fc0cf42b4774771d21862837a18c
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

                                case 4444:
                                System.out.println("Tim Blittersdorf"); 
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

=======
                                case 346:
                                        System.out.println("Sally Khout");
                                        break;
<<<<<<< HEAD
>>>>>>> 90c23cb8bea389c0f9798d478f54607d716f6c6b
=======
				case 24:
					System.out.println("Festim Krasniqi");
					break;
>>>>>>> refs/remotes/origin/main
                                default:
                                        System.out.println("Fehler: Kenne ich nicht!");
                        }
                }
                scanner.close();
        }
}
