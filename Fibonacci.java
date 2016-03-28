package fibonacci;

import java.util.Scanner;
public class Fibonacci {
    static Scanner s;
    static int angka;

    public static void main(String[] args) {
      s = new Scanner(System.in);
        System.out.println("Masukan Jumah Angka: ");
        angka= s.nextInt();
        
     int n1=1,n2=1,n3,i,count=angka;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<angka;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }
        System.out.println("");
}
}
