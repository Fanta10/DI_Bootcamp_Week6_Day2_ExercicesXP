import java.util.Scanner;


public class exercice1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Demander aux users d'entrer leur grade
		System.out.println("entrer votre grade");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		//convertir les points de grade en lettre
		
		if(grade >= 93 && grade <= 100){
			System.out.print("letter grades is : A");
		}
		else if(grade >= 90 && grade <= 92){
			System.out.print("letter grades is : A-");
		}
		else if(grade >= 87 && grade <= 89){
			System.out.print("letter grades is : B+");
		}
		else if(grade >= 83 && grade <= 86){
			System.out.print("letter grades is : B");
		}
		else if(grade >= 80 && grade <= 82){
			System.out.print("letter grades is : B-");
		}
		else if(grade >= 77 && grade <= 79){
			System.out.print("letter grades is : C+");
		}
		else if(grade >= 70 && grade <= 76){
			System.out.print("letter grades is : C");
		}
		else if(grade >= 60 && grade <= 69){
			System.out.print("letter grades is : D");
		}
		else if(grade >= 0 && grade <= 59){
			System.out.print("letter grades is : F");
		}
		else {
			System.out.print("Ce grade n'est pas pris en compte, saisissez à nouveau votre grade");
		}

	}

}
