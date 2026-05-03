import java.util.Scanner;
public class CalculadoraPintura4261212202 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida do lado do quarto (em metros): ");
        double lado = scanner.nextDouble();

        double altura = 2.70;
        double areaParedes = 4 * (lado * altura);
        double areaComDesconto = areaParedes * 0.90; // Aplicando o desconto de 10%
        double litrosTinta = areaComDesconto / 10; // Cada litro cobre 10 m²

        System.out.printf("A quantidade de litros de tinta necessária é: %.2f litros%n", litrosTinta);

        scanner.close();
    }

}
