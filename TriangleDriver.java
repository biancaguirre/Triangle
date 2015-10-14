import java.util.*;
public class TriangleDriver{
   public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
      System.out.print("This program will take three (X,Y) coordinates of the requested number of triangles and return:");
      System.out.print("\nthe perimeter, if it is a right triange, if it is an equalateral, and"); 
      System.out.print("\nif it is equal to another triangle.");
      System.out.print("\nHow many triangles would you like to compare?");
      int count = kb.nextInt();
      Triangle[] T = new Triangle[count];
      for(int i=0; i<count;i++){
         System.out.println();
         System.out.println("\nTriangle: "+ (i+1));
         System.out.println("Please enter the X coordinate for point one");
         int x1 = kb.nextInt();
         System.out.println("Please enter the Y coordinate for point one");
         int y1 = kb.nextInt();
         System.out.println("Please enter the X coordinate for point two");
         int x2 = kb.nextInt();
         System.out.println("Please enter the Y coordinate for point two");
         int y2 = kb.nextInt();
         System.out.println("Please enter the X coordinate for point three");
         int x3 = kb.nextInt();
         System.out.println("Please enter the Y coordinate for point three");
         int y3 = kb.nextInt();
         //for(int x =0;x==i;x++){
            Triangle T1 = new Triangle(x1,x2,x3,y1,y2,y3);
            T[i] = T1;
         //}
      } 
      for(int i = 0; i < count; i++){
         System.out.println();
         System.out.println(T[i].toString());
         System.out.println("Perimeter: " + T[i].perimeter());
         System.out.println("Equilateral: " + T[i].equilateral());
         System.out.println("Right Triangle: " + T[i].rightTriangle());
      }
      for(int i=0;i<count-1; i++){
      System.out.println("Triangle "+ i + " = Triangle " + (i+1) + "? " + T[i].equals(T[i+1]));
      }
   }

}