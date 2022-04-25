import java.util.Scanner;

import veiculos.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Carro brasilia = new Carro("PAA1234", 123456789);
        System.out.printf("Carro contém a placa %s e o número de chassi %d \n", brasilia.getPlaca(), brasilia.getNumeroChassi());
        System.out.printf("Velocidade atual: %d\n", brasilia.getVelocidadeAtual());

        System.out.println("Acelerando minha brasília!");
        for (int i = 0; i < 10; i++) {
            brasilia.acelerar();
        }

        System.out.printf("\nVelocidade atual: %d\n", brasilia.getVelocidadeAtual());

        System.out.println("Informe a que velocidade você quer acelerar:");
        int velocidade = scanner.nextInt();

        System.out.printf("Acelerando minha brasília no piloto automático até %dKM/h!\n", velocidade);
        brasilia.acelerar(velocidade);

        System.out.printf("\nVelocidade atual: %d\n", brasilia.getVelocidadeAtual());

        scanner.close();
    }
}
