/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment13;
import java.util.Scanner;
public class Assignment13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
     int markcount;
     double total=0;
     double average;
     System.out.print("how many marks for this student : ");
     markcount =keyboard.nextInt();
     int[] marks =new int[markcount];
     int i;
     for (i=0 ;i <markcount ;i++)
     {
         System.out.print("please enter mark " + (i+1 )+ ": ");
         marks[i]=keyboard.nextInt();
         total = total+ marks[i];
         
        
          
     }
      System.out.print("marks are : ");
      for (i=0 ;i <markcount ;i++){
          System.out.print(marks[i]);
          if(i<(markcount-1)){
               System.out.print(",");
          }
          
      }
      System.out.println("");
     average =total/marks.length;
     System.out.println("average = " + average);
     
    }
     
}
