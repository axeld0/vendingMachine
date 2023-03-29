import java.util.Scanner;
import vendingMachine.VendingMachine;

public class Main
{
//*MAQUINA EXPENDEDORA
///PRIMERA ETAPA DE REFINAMIENTO Y MODELADO
    //sustantivos
/*            maquinaExpendedora
                    -estado on/off  booleano o entero (para manejar distintos estados)
            boleto
                    -precio emitido
                    -
            dinero
            //cliente   NO SE MENCIONA. NO CORRESPONDE
            cantidadBoletos
            //cambio/vuelto  NO SE MENCIONA. NO CORRESPONDE.
            //tecnico  NO SE MENCIONA. NO CORRESPONDE.
            //reembolso  NO SE MENCIONA. NO CORRESPONDE.
            //estado (rota o no)  NO SE MENCIONA. NO CORRESPONDE.

    //verbos
            verRecaudacion
            imprimirBoleto : boleto TIENE QUE ESTAR COMO PARTE DE LA MAQUINA EXPENDEDORA
            prender
            apagar
            vaciarRecaudacion
            reponerBoletos
            verBoleto
//
//SEGUNDA ETAPA

CLASE ENVOLTORIO: MAQUINA EXPENDEDORA. ATRIBUTOS:
                                                 -precio actual
                                                 -ESTADO
                                                 -ID
                                                 -recaudacion
                                                 -saldo (cuando el precio es igual al salgo imprime el boleto)
                                       METODOS:
                                                 -imprimirBoleto() : boleto
                                                 -verRecaudacion() : doble
                                                 -vaciarRecaudacion()  : doble (que la devuelva, a ver cuanto estás vaciando)
                                                 -cambiarEstado()
                                                 -ingresarDinero()
                BOLETO.
                                       ATRIBUTOS:
                                                 -PRECIO ACTUAL
                                                 -ID

    GETTERS Y SETTERS

    getPrecioActual() : tiene que estar
    setPrecioActual() : se pasa una vez sola así que NO ES NECESARIO.
    getId():
    setRecaudación() : no es necesario
    getSaldo(): es necesario
    setSaldo () : no es necesario. está encapsulada en el método de ingresarDinero()


*/
static Scanner scan;
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();
        int ticketPrice = 0;
        int insertedMoney = 0;

        System.out.printf("Welcome to our vending Machine\nPlease turn on the system.");
        System.out.printf("Push Enter to start!");
        scan.nextLine();
        System.out.println("Excelent! You've started the vending machine");
        System.out.println("Please set the ticket price");
        ticketPrice = scan.nextInt();
        vm.changeState(ticketPrice);  //turns on the machine and sets the price according to keyboard imput.
        System.out.println("Ok! The ticket price is now set to: $"+vm.getActualPrice());

        System.out.println("what do you want to do now?");

        int options;
        do{
            System.out.println("1) Insert money.\n2)Check today's income\n3)Clear today's income.\n4)Exit program.");
            options = scan.nextInt();
            switch (options) {
                case 1:
                    System.out.println("How much money are you inserting? Be honest ;) ");
                    vm.insertMoney(scan.nextInt());
                    System.out.println("Great, you've just inserted $ " + vm.getInsertedMoney());
                    vm.checkInsertedMoney();
                    break;
                case 2:
                    System.out.println("today's income so far is $ : " + vm.getIncome());
                    break;

                case 3:
                    vm.emptyIncome();
                    System.out.println("You've just emptied today's income. Now, today's income is $ " + vm.getIncome());
                    break;
                default:
                    System.out.println("sorry, wrong option!");
                    break;
            }
        }while (options != 4);

        scan.close();
    }
}