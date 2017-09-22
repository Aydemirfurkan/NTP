
package furkan1;
import java.util. *;
public class Furkan1 {
    

 public static int toplam(int a,int b){
     
 int toplam;
 
       
       toplam =(a+b);
       
       System.out.println("Sonuc"+toplam+"dir");
     
     return toplam ; 
 }
    public static void main(String[] args) {
       
       toplam(60,1);
       Cıkarma(60,1);
       Bölme(60,1);
       Carpma(60,1);
    }
    
    public static int Cıkarma(int a,int b){
       int Cıkarma;
 
       
       Cıkarma =(a-b);
       
       System.out.println("Sonuc"+Cıkarma+"dir");
     
     return Cıkarma ;
       
    }
     public static int Bölme(int a,int b){
       int Bölme;
 
       
       Bölme =(a/b);
       
       System.out.println("Sonuc"+Bölme+"dir");
     
     return Bölme ;
    
    
     }
     public static int Carpma(int a,int b){
       int Carpma;
 
       
       Carpma =(a*b);
       
       System.out.println("Sonuc"+Carpma+"dir");
     
     return Carpma ;
     }
    
    }
    

