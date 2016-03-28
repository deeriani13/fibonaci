package fibonachi2;

import java.util.Scanner;
public class Fibonacci3 {
    static Scanner s;
    static int angka;
    
    public static void main(String[] args) {
      int[] temp = new int[10];
      s = new Scanner(System.in);
        System.out.println("Masukan Jumah Angka: ");
        angka= s.nextInt();
        
        temp[0]=1;
        temp[1]=1;
        
     int n1=1,n2=1,n3,i,count=angka;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<angka;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;
  temp[i]=n3;
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }
        System.out.println("");
        System.out.println("Dibalik: ");
        for (int j = angka-1; j >=0; j--) {
            System.out.print(temp[j]+" ");
        }
        System.out.println("");
}
}
