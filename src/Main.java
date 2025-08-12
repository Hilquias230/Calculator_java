import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Insira o primeiro número:");
        int firstNumber = scanner.nextInt();
        System.out.println("Insira o segundo número:");
        int secondNumber = scanner.nextInt();
        System.out.println("=============================");
        while (true) {

            System.out.println("====CALCULADORA SIMPLES====");
            System.out.println("1 - ADIÇÃO");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.println("5 - SAIR");
            System.out.println("============================");
            System.out.println("Escolha um deles para realizar a operação:");
            var option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    System.out.println("====ADIÇÃO====");

                    var result = Operators.SUM.execute(firstNumber, secondNumber);

                    System.out.printf("O resultado de %s + %s é = %s \n", firstNumber, secondNumber, result);
                }
                case 2 -> {
                    System.out.println("====SUBTRAÇÃO====");

                    var result = Operators.SUB.execute(firstNumber, secondNumber);

                    System.out.printf("O resultado de %s - %s é = %s \n", firstNumber, secondNumber, result);

                }
                case 3 -> {
                    System.out.println("====MULTIPLICAÇÃO====");

                    var result = Operators.MULTI.execute(firstNumber, secondNumber);

                    System.out.printf("O resultado de %s X %s é = %s \n", firstNumber, secondNumber, result);
                }
                case 4 -> {
                    System.out.println("====DIVISÃO====");

                    var result = Operators.DIV.execute(firstNumber, secondNumber);

                    System.out.printf("O resultado de %s / %s é = %s \n", firstNumber, secondNumber, result);

                }
                case 5 -> System.exit(0);

                default -> System.out.println("Opção inválida");
            }
        }
    }
}