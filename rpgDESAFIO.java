import java.util.Scanner;

public class rpgDESAFIO {

    public static void main(String [] args) throws Exception {

        Scanner leia = new Scanner (System.in);

        System.out.println("\n!ESCOLHA O CAMINHO QUE DESEJA SEGUIR!");
        System.out.println("=============================\n" +
        "        RPG GAME\n" +
        "=============================\n" +
        "  [████████████████████]\n" +
        "     LOADING COMPLETE\n" +
        "=============================\n");
        System.out.println("\n1 - CAVERNA\n2 - RUÍNAS\n3 - LAGO\n4 - MONTANHAS");

        int escolha = leia.nextInt();

        switch (escolha){

            case 1:
                System.out.println("       _________\n" +
                                   "      /         \\\n" +
                                   "     /  CAVERNA  \\\n" +
                                   "    /             \\\n" +
                                   "   /               \\\n" +
                                   "  /_________________\\\n"
                                  );
            break;
            
            case 2:
                System.out.println("      |  |    |  |\n" +
                                   "     _|__|____|__|_\n" +
                                   "    |              |\n" +
                                   "    |    RUÍNAS    |\n" +
                                   "    |              |\n" +
                                   "    |____      ____|\n"
                                  );
            break;

            case 3:
                System.out.println(" ~   ~   ~   ~   ~\n" +
                                   "  ~   ~   ~   ~   ~\n" +
                                   " ~      LAGO      ~\n" +
                                   "~~~~~~~~~~~~~~~~~~~~\n" +
                                   " ~   ~   ~   ~   ~\n"
                                  );
            break;

            case 4:
                System.out.println("        /\\      /\\\n" +
                                   "       /  \\    /  \\\n" +
                                   "      /    \\  /    \\\n" +
                                   "     /      \\/      \\\n" +
                                   "    /    MONTANHAS    \\\n" +
                                   "   /___________________\\\n"
                                  );
            break;

            default:
                System.out.println("\nValor inválido");
        }

    }

}