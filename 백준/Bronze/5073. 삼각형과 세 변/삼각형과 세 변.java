import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      String input = br.readLine();
      
      while(!input.equals("0 0 0")) {
         String[] lengths = input.split(" ");
         int[] arr = new int[3];
         
         for(int i=0; i<3; i++) {
        	 arr[i] = Integer.parseInt(lengths[i]);
         }
         Arrays.sort(arr);
         
         int a = arr[0];
         int b = arr[1];
         int c = arr[2];
         
         if(c >= a+b) {
            sb.append("Invalid\n");
         }else {
        	 if(a==b && b==c) {
                 sb.append("Equilateral\n");
             }
             
             if(a==b || b==c || c==a) {
            	 if(a==b && b!=c || b==c && c!=a || c==a && a!=b) {
            		 sb.append("Isosceles\n");
            	 }
             }
             
             if(a != b && b != c && c != a) {
                 sb.append("Scalene\n");
             }
         }
         
         input = br.readLine();
      }
      
      System.out.println(sb);
   }
}