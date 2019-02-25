package aula2_ex1;

import sun.security.util.Length;

public class VetorInteiros {

    int[] vet;

    public VetorInteiros(int n) {
        vet = new int[n];
        for (int i = 0; i < n; i++) {
            vet[i] = 3 * i - 1;
        }
    }
    
    public String toString(){
        StringBuilder strB = new StringBuilder();
        
        for(int i = 0; i < vet.length; i++){
            strB.append(vet[i]);
            strB.append("; ");
        }
        
        return strB.toString();
    }
    
    public float calcularMedia(){
        float soma = 0;
        
        for(int i = 0; i < vet.length; i++){
            soma = soma + vet[i];
        }
        
        float media = soma / vet.length;
        return media;
    }
}
