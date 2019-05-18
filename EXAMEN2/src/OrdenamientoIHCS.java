
import java.util.Scanner;

public class OrdenamientoIHCS {
    public int[]OrdenacionCreciente(int[] vector){
        int aux, c;
        for (int i = 1; i < vector.length; i++) {
            aux=vector[i];
            c=i;
            while(c>0 && aux<vector[c-1]){
            vector[c]=vector[c-1];
            c--;
            }
            vector[c]=aux;
        }        
    return vector;
        
    }
    
    public int[]OrdenacionDecreciente(int[] vector){
        int aux, c;
        for (int i = 1; i < vector.length; i++) {
            aux=vector[i];
            c=i;
            while(c>0 && aux>vector[c-1]){
            vector[c]=vector[c-1];
            c--;
            }
            vector[c]=aux;
        }        
    return vector;
        
    }
    public void Imprimir (int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector["+i+"]="+vector[i]);
        }
    }
    public static void plus2(){
    double re = 0;
        int[] vector={2,6,1,3,4};
        Scanner leer=new Scanner(System.in);
        System.out.println("ASCENDENTE = 1 :");
        System.out.println("DESCENDENTE = 2 :");
        System.out.println("Precione :");
        re=leer.nextInt();
        OrdenamientoIHCS or=new OrdenamientoIHCS();
        if(re==1){
            or.Imprimir(or.OrdenacionCreciente(vector));
        }else if (re==2){
            or.Imprimir(or.OrdenacionDecreciente(vector));
}
    }
    public static void main(String[] args) {
        plus2();
        
     
    }
}
