package aula1_ex3_desafio;

public class Aula1_Ex3_Desafio {

    public static void main(String[] args) {
        int maiorN = 1;
        long maiorContador = 1;
        
        for (int i = 2; i < 1000000; i++) {
            int n = i;

            long contador = 1;
            while (n > 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                contador++;
            }
            
            if(contador > maiorContador){
                maiorContador = contador;
                maiorN = i;
            }
        }
        
        System.out.println("O número " + maiorN + " com " + maiorContador + " itens foi a maior sequência.");

    }

}
