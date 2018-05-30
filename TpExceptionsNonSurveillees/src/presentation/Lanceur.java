package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.crypto.AEADBadTagException;

public class Lanceur {
	
	public static int calcul(int a, int b) {
		return a/b;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			
		//afficher une excepation a la place du messages qui s'affiche dans la console en cas d'erreur avec try/catsh	
		int resultat = 0;
		try {
			System.out.println("saisir a: ");
			int a = sc.nextInt();
			System.out.println("saisir b: ");
			int b = sc.nextInt();
			resultat = calcul(a,b);
			System.out.println("resultat = "+ resultat);
			
		} catch (ArithmeticException e) { //verfier que le diviseur est different de 0
			// TODO Auto-generated catch block
			System.out.println("ERREUR ATTENTION DEVISION PAR ZERO");
		
		} catch (InputMismatchException e) {//sureveille la sesie Scanner de l'utilisateur
			// TODO Auto-generated catch block
			System.out.println("ATTENTION, ENTREE UN NOMBRE ENTIER");
		} finally {
			
		}
		
		sc.close();
	}

}
