import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            
            if (pertenceFibonacci(numero)) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence à sequência de Fibonacci.");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public static boolean pertenceFibonacci(int num) {
        if (num < 0) return false;
    
        long x1 = 5 * (long) num * num + 4;
        long x2 = 5 * (long) num * num - 4;
       
        return ehQuadradoPerfeito(x1) || ehQuadradoPerfeito(x2);
    }
     
    public static boolean ehQuadradoPerfeito(long n) {
        long raiz = (long) Math.sqrt(n);
        return raiz * raiz == n;
    }
}
