
import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinariaIHCS {

    
    public static void main(String[] args) {
        int[] array = { 2, 7, 25, 57, 8, 5, 72, 17, 60, 48, 97 };
		Arrays.sort(array);
                System.out.println(Arrays.toString(array));
                int d1,d2,d3;
                Scanner fre=new Scanner(System.in);
                System.out.println("Ingresar el numero");
                d1=fre.nextInt();
		System.out.println(busca(array, d1));
                d2=fre.nextInt();
		System.out.println(busca(array, d2));
                d3=fre.nextInt();
		System.out.println(busca(array, d3));
	}

	private static int busca(int[] array, int chave) {
		return buscaBinariaRecursiva(array, 0, array.length - 1, chave);
	}

	private static int buscaBinariaRecursiva(int[] array, int menor, int maior,
			int chave) {
		int media = (maior + menor) / 2;
		int valorMeio = array[media];

		if (menor > maior)
			return -1;
		else if(valorMeio == chave) 
			return media;
		else if (valorMeio < chave)
			return buscaBinariaRecursiva(array, media+1, maior, chave);
		else
			return buscaBinariaRecursiva(array, menor, media-1, chave);
	}
    }
