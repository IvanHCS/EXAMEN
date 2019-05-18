
 import java.util.Scanner;

public class VehiculosIHCS {
    public static void plus1(){
    int acum=1;
   double d1=1,d2=1,d3=1,total=1;
    Scanner leer=new Scanner(System.in);
    
    while(acum<=3){
        System.out.println("Introdusca la categoria que desea probar");
        int pro=leer.nextInt();
        System.out.println("Introdusca la cantidad: "+pro+" es: ");
        int pros=leer.nextInt();
        if(pro==1){
            d1=pros*0.10;
        }else if(pro==2){
            d2=pros*0.07;
        }else if(pro==3){
            d3=pros*0.05;
        }
    acum++;
    total=d1+d2+d3;
    }
    System.out.println("impuesto del primer vehiculo es: "+d1);
    System.out.println("impuesto del primer vehiculo es: "+d2);
    System.out.println("impuento del primer vehiculo es: "+d3);
    System.out.println("Total "+total);
}
public static void main(String[] args) {
   plus1();
}
}
