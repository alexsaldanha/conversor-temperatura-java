import java.util.Scanner;

public class ConverterTemperatura {

    public static void menu() {

        System.out.println("__________ CONVERSOR DE TEMPERATURAS ( Cº , F , K )  _________ ");
        System.out.println("Qual temperatura voce quer converter: ");
        System.out.println("0. SAIR");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
    }


    public static void celsius () {
        System.out.println("Digite a temperatura em Celsius: ");
        Scanner temp = new Scanner(System.in);
        float celsius = 0;
        float fare = 0;
        float kelvin = 0;
        celsius = temp.nextFloat();
        fare = (float) ((celsius * 1.8) + 32);
        kelvin = (float) (celsius + 273.15);
        System.out.println("A temperatura em Kelvin eh: " + kelvin + " " + "e em Fahrenheit eh: " + fare);
    }
    public static void fare () {
        System.out.println("Digite a temperatura em Fahrenheit: ");
        Scanner temp = new Scanner(System.in);
        float celsius = 0;
        float fare = 0;
        float kelvin = 0;
        fare = temp.nextFloat();
        celsius = (float) ((fare - 32) * 5/9);
        kelvin = (float) (((fare - 32) * 5/9) + 273.15);
        System.out.println("A temperatura em Celsius eh: " + celsius + " " + "e em kelvin eh: " + kelvin);

    }

    public static void kelvin () {
        System.out.println("Digite a temperatura em Kelvin: ");
        Scanner temp = new Scanner(System.in);
        float celsius = 0;
        float fare = 0;
        float kelvin = 0;
        kelvin = temp.nextFloat();
        fare = (float) (((kelvin - 273.15) * 9/5) + 32);
        celsius = (float) (kelvin - 273.15);
        System.out.println("A temperatura em Fahrenheit eh: " + fare + " " + "e em Celsius eh: " + celsius);
    }

    public static void sair () {
    }

        public static void main(String[] args){

            int opcao = 0;
            Scanner entrada = new Scanner(System.in);


            menu();

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    celsius();
                    break;
                case 2:
                    fare();
                    break;
                case 3:
                    kelvin();
                    break;
                case 0:
                    sair();
                    break;
                default:
                    System.out.println("Opcao invalida, saindo do programa!!!");
            }

        }

}