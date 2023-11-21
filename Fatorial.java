public class Fatorial{
   public static void main(String[] args){
      system.out.println(calcularFatorial(5));
   }

   public static int calcularFatorial(int n) {
      int resultado = 1;
      for (int i = 0; i < n; i++)
         resultado*=i;
         return resultado;
   }
}