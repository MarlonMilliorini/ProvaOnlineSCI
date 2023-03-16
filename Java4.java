package ProvaSCI;

import java.util.Scanner;

/**
 *
 * @author Marlon Milliorini
 */
public class Java4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = input.nextInt();
        }
       System.out.printf("O valor da terceira posição é %d", vetor[2]);
    }
}

