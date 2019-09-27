import java.util.Scanner;

//4 Le programme ne va pas fonctionner car la méthode n'est pas statique
// après test du programme on observe que la méthode n'est pas static dans la
// classe Main

public class Main {	
	public static void main(String[] args) {
		prenom();
		somme();
		division();	
		volume();
	}
	public static void prenom() {
		System.out.println("Bonjour, quel est votre prénom ?");
		Scanner scanner = new Scanner(System.in);
		String prenom = scanner.nextLine();
		System.out.println("Bonjour," + prenom);
	}
//5.1
	
	public static void somme() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier entier");
		int premierEntier = scanner.nextInt();
		System.out.println("Veuillez saisir le deuxieme entier");
		int deuxiemeEntier = scanner.nextInt();
		int somme = premierEntier + deuxiemeEntier;
		System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egal a " + somme);	
	}
//5.2
    public static void division() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Veuillez saisir le premier entier");
    	int premierEntier = scanner.nextInt();
    	System.out.println("Veuillez saisir le deuxieme entier");
    	int deuxiemeEntier = scanner.nextInt();
    	int division = premierEntier / deuxiemeEntier;
    	System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier + " est egal a " + division);		
    }
//5.3
//1) Nous avons besoin de 3 variables
//2) Le type de ces variables est le type float
//3) On les demande à l'utilisateur en utilisant Scanner
//4) On multiplie la largeur avec la longueur et la hauteur du pavé droit
//5) On doit afficher le résultat
     public static void volume() {
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("Veuillez saisir la longueur du pavé droit");
    	 float longueur = scanner.nextFloat();
    	 System.out.println("Veuillez saisir la largeur");
    	 float largeur = scanner.nextFloat();
    	 System.out.println("Veuillez saisir la hauteur");
    	 float hauteur = scanner.nextFloat();
    	 float volume = longueur * largeur * hauteur;
    	 System.out.println("Le volume du pavé droit est de " + volume);
     }
}	

