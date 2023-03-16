package ProvaSCI;

import java.util.Scanner;

/**
 *
 * @author Marlon Milliorini
 */
public class Java5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] notas = new double[3][4];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = input.nextLine();
            for (int x = 0; x < notas[i].length; x++) {
                System.out.print("Digite a nota " + (x + 1) + " do aluno " + nome + ": ");
                notas[i][x] = input.nextDouble();
            }
            input.nextLine(); 
        }

        double[] medias = new double[3];
        String[] nomes = new String[3];
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int x = 0; x < notas[i].length; x++) {
                soma += notas[i][x];
            }
            medias[i] = soma / notas[i].length;
            nomes[i] = input.nextLine();
            System.out.println("O aluno " + nomes[i] + " obteve média " + medias[i]);
        }

        // Encontrar o aluno com a maior e a menor média
        int indiceMaior = 0, indiceMenor = 0;
        for (int i = 1; i < medias.length; i++) {
            if (medias[i] > medias[indiceMaior]) {
                indiceMaior = i;
            }
            if (medias[i] < medias[indiceMenor]) {
                indiceMenor = i;
            }
        }
        System.out.println("O aluno com a maior média é " + nomes[indiceMaior]);
        System.out.println("O aluno com a menor média é " + nomes[indiceMenor]);
    }
}
