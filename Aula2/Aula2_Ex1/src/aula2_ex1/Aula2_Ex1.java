package aula2_ex1;

public class Aula2_Ex1 {

    public static void main(String[] args) {
        int n = 6;
        VetorInteiros vetInt = new VetorInteiros(n);
        
        String sequencia = vetInt.toString();
        System.out.println(sequencia);
        
        float media = vetInt.calcularMedia();
        System.out.println(media);
    }
    
}
