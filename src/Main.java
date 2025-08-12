import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("====CALCULADORA SIMPLES====");
            System.out.println("1 - ADIÇÃO");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - DIVISÃO");
            System.out.println("4 - MULTIPLICAÇÃO");
            System.out.println("5 - SAIR");
            System.out.println("============================");
            System.out.println("Escolha:");
            var option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    System.out.println("====ADIÇÃO====");
                    System.out.println("Insira o primeiro número:");
                    int firstNumber = scanner.nextInt();
                    System.out.println("Insira o segundo número:");
                    int secondNumber = scanner.nextInt();

                    var sum = firstNumber + secondNumber;

                    System.out.printf("O resultado de %s + %s é = %s \n", firstNumber, secondNumber, sum);
                }
                case 2 -> {
                    System.out.println("====SUBTRAÇÃO====");
                    System.out.println("Insira o primeiro número:");
                    int firstNumber = scanner.nextInt();
                    System.out.println("Insira o segundo número:");
                    int secondNumber = scanner.nextInt();

                    var subtraction = firstNumber - secondNumber;

                    System.out.printf("O resultado de %s + %s é = %s", firstNumber, secondNumber, subtraction);

                }
                case 3 -> {
                    System.out.println("====DIVISÃO====");
                    System.out.println("Insira o primeiro número:");
                    int firstNumber = scanner.nextInt();
                    System.out.println("Insira o segundo número:");
                    int secondNumber = scanner.nextInt();

                    var division = firstNumber / secondNumber;

                    System.out.printf("O resultado de %s + %s é = %s", firstNumber, secondNumber, division);
                }
                case 4 -> {
                    System.out.println("====MULTIPLICAÇÃO====");
                    System.out.println("Insira o primeiro número:");
                    int firstNumber = scanner.nextInt();
                    System.out.println("Insira o segundo número:");
                    int secondNumber = scanner.nextInt();

                    var multiplication = firstNumber * secondNumber;

                    System.out.printf("O resultado de %s + %s é = %s", firstNumber, secondNumber, multiplication);

                }
                case 5 -> System.exit(0);

                default -> System.out.println("Opção inválida");
            }
        }
    }
}