
import java.util.Scanner;


public class BusquedaIHCS {
    
    public int busqueda(int[] v, int valorB){  
      int posicion=0;
      for (int i = 0; i < v.length; i++) {
          if(v[i]==valorB){
              posicion= i;
              break;
          }else{           
          }
      }
      return posicion;
  }
    public int numero(int n){
        
        return n;
    
    }       
    public static void imprimir(String[] args) {
        BusquedaIHCS ivan=new BusquedaIHCS();
        int[] vector={1,10,9,8,11,7,6,12,2,3,4,5};
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero de mes para buscarlo: ");
        int n=leer.nextInt();
        System.out.println("El numero de mes "+n+" fue encontrado en la posicion "+ivan.busqueda(vector, n)+" del vector");
    }
    public static void main(String[] args) {
        imprimir(args);
    }
    
}