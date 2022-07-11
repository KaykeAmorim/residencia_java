package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] entrada = {0,0,0,0,0,0,0,0,0,0};
		int[] saida = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i = 0; i < entrada.length; i++) {
			entrada[i] = sc.nextInt();
		}
		
		for(int i = 0; i < saida.length; i++) {
			int[] array = max(entrada);
			saida[i] = array[0];
			entrada[array[1]] = -999999999; 
		}
		
		show(saida);
		
		sc.close();
	}
	
	public static int[] max(int[] vetor){
		int num = vetor[0];
		int index = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] > num) {
				num = vetor[i];
				index = i;
			}
		}
		
		return new int[]{num, index};
	}
	
	public static void show(int[] vetor){
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("vetor[" + i + "] = " + vetor[i]);
		}
	}

}
