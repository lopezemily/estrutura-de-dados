package aula1_ex3;

import java.util.Scanner;

public class Aula1_Ex3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n = leia.nextInt();

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
    }

}
