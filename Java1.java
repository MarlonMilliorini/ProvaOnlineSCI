package ProvaSCI;

import java.util.Scanner;

/**
 *
 * @author Marlon Milliorini
 */
public class Java1 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        int num, par = 0, impar = 0, media = 0, soma = 0;

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número");
            num = n.nextInt();
            
            soma += num;
            media = soma / 5;
            if(num % 2 == 0){
                par++;
            }

            if(num % 2 == 1){
                impar++;
            }
        }
        
        System.out.println("Foram digitados " + par + " números pares \n");
        System.out.println("Foram digitados "+ impar+ " números ímpares");
        System.out.println("A média da soma dos numeros é : " +media);
    }
}

