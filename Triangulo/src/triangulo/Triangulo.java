package triangulo;

public class Triangulo {

	public static void main(String[] args) {
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantos números vas a introducir?");
		int input = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < input; i++) {
			System.out.println("Introduce un numero");
			int num=Integer.parseInt(sc.nextLine());
			
			if(num%2 !=0) {
				cont++;
			}
		}
		System.out.println("La cantidad impares es" + cont);
		sc.close();
		}
}
