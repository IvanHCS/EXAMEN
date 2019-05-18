import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculadoraIHCS {
    BufferedReader br = new BufferedReader(new 
    InputStreamReader(System.in));    
    
    public int leer(int dato, String texto){          
        try {
            System.out.println(texto);
            dato=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }
    
    public String leer(String dato, String texto){       
        try {
            System.out.println(texto);
            dato=br.readLine();
        } catch (IOException e) { 
            System.err.println(e.getMessage());
        }
        return dato;
    }
    
    public double leer(double dato, String texto){         
        try {
            System.out.println(texto);
            dato=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
      public char leer(char dato, String mensage){
        try {
            System.out.println(mensage);
            dato=br.readLine().charAt(0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    return dato;
    }
          public boolean leer(boolean dato, String texto){         
        try {
            System.out.println(texto);
            dato=Boolean.parseBoolean(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
          public static void plus2(){
     int n1,n2, total=1;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        n1=leer.nextInt();
        System.out.println("Ingresa la operacion: ");
        String plus2=leer.next();
        System.out.println("Ingrese el segundo numero: ");
        n2=leer.nextInt();
        if(null != plus2)switch (plus2) {
            case "+":
                total=n1+n2;
                break;
            case "-":
                total=n1-n2;
                break;
            case "x":
                total=n1*n2;
                break;
        }if("/".equals(plus2)){
            total=n1/n2;
        }
        System.out.println("el Resultado es "+n1+" "+plus2+" "+n2+ " = "+total);
        
    }
    public static void main(String[] args) {
        plus2();
        
        
    }
    
}
