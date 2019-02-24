package aula1_ex2;

import java.util.Scanner;

public class Aula1_Ex2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        int jogadorA;
        System.out.println("Jogador A escolhe sua jogada:");
        jogadorA = leia.nextInt();

        int jogadorB;
        System.out.println("Jogador B escolhe sua jogada:");
        jogadorB = leia.nextInt();

        if (jogadorA == 1 && jogadorB == 2) {
            System.out.println("Vitoria do jogador B");
        } else if (jogadorA == 1 && jogadorB == 3) {
            System.out.println("Vitoria do jogador A");
        } else if (jogadorA == 2 && jogadorB == 1) {
            System.out.println("Vitoria do jogador A");
        } else if (jogadorA == 2 && jogadorB == 3) {
            System.out.println("Vitoria do jogador B");
        } else if (jogadorA == 3 && jogadorB == 1) {
            System.out.println("Vitoria do jogador B");
        } else if (jogadorA == 3 && jogadorB == 2) {
            System.out.println("Vitoria do jogador A");
        } else {
            System.out.println("Empate");
        }
    }

}
