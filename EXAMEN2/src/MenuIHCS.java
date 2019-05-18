import java.util.Scanner;

public class MenuIHCS {
    
public static void main(String[] args) {
        System.out.println("INGRESE EL NUMERO DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: VehiculosIHCS.plus1(); break;
            case 2: CalculadoraIHCS.plus2();break;
            case 3: OrdenamientoIHCS.plus2(); break;
            case 4: BusquedaIHCS.imprimir(args); break;
            
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE EL NUMERO DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
}
}
