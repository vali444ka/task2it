/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7test;

/**
 *
 * @author Office PC
 */
public class Lab7test {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      int a = 11;
      int b = 6;
      int c = minFunction(a, b);
      System.out.println("Максимальне число= " + c);
   }

   /* Возвращает минимум из двух чисел */
   public static int minFunction(int n1, int n2) {
      int min;
      if (n1 < n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
    
}
