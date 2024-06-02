import java.util.Scanner;

public class Main {
    static Scanner scan;
    public static void main(String[] args) {

        int seleccion = 0;
        int i = 0;

        scan = new Scanner(System.in);
        Menu menues = new Menu();

        System.out.printf(menues.mostrarMenuInicial());
        System.out.println("ingrese una opcion: ");
        seleccion = scan.nextInt();

        switch (seleccion)
        {
            case 1:
                for(i=0; i<10; i++)
                {
                    System.out.println("");
                }

                break;
            case 2:
                for(i=0; i<10; i++)
                {
                    System.out.println("");
                }

                System.out.println(menues.mostrarMenuInstrucciones());

                break;
            case 3:
                for(i=0; i<10; i++)
                {
                    System.out.println("");
                }

                break;
            default:
                for(i=0; i<10; i++)
                {
                    System.out.println("");
                }

                System.out.printf("Opcion ingresada invalida, vuelvalo a intentar");

                ///aca llamaria al metodo de mostrarMenuInicial, y para no poner de nuevo el scan directamente
                /// lo que puedo hacer es poner el scan dentro del mismo metodo para ahorrarmelo.
        }
    }
}