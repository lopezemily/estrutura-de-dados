package aula1_ex2_resalter;

import java.util.Scanner;

public class Aula1_Ex2_ResAlter {

    public static void main(String[] args) {
        int jogadorA, jogadorB;
        Scanner leia = new Scanner(System.in);
        String[][] matrizConsulta = { {"Empate", "Jogador B", "Jogador A"},
                                      {"Jogador A", "Empate", "Jogador B"},
                                      {"Jogador B", "Jogador A", "Empate"}};

        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");
        
        System.out.println("Jogador A escolhe sua jogada:");
        jogadorA = leia.nextInt();
        System.out.println("Jogador B escolhe sua jogada:");
        jogadorB = leia.nextInt();
        
        System.out.println("Resultado: " + matrizConsulta[jogadorA][jogadorB]);
    }
    
}
