package model;

import java.util.Scanner;

/**
 * 
 * @author najet
 *
 */
public class Test {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("***** call constructors ******");
		Etudiant e1 = new Etudiant();
		System.out.println("***** Default constructor ******");
		e1.info(); // call to default constructor with no parameteres ==> it will print default values of instance atttibutes
		Etudiant e2 = new Etudiant("Najet", 20, 20, "Tunis");
		System.out.println("***** Constructor with parameters******");
		e2.info(); // call to constructor with parameters ==> it will print values of passed parameters 
		
		System.out.println("***** using Scanner ******");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Please enter your score: ");
        double score = scanner.nextDouble();
        System.out.print("Please enter your adress: ");
        String adress = scanner.next();
        
        System.out.println("\n printing informations result \n");
        Etudiant e3 = new Etudiant(name, age, score, adress);
        e3.info();
        
        scanner.close();
		
        System.out.println("***** Testing getters and setters  ******");
       
        e1.setNom("amal");
        e1.setAge(10);
        e1.setMoyenne(-1);
        e1.setAdresse("tunis");
       System.out.println("getter Name : " + e1.getNom()); 
       System.out.println("getter Age : " + e1.getAge());
       System.out.println("getter Score : "  +e1.getMoyenne());
       System.out.println("getter Adress : "  +e1.getAdresse());
       
        Etudiant e4  = new Etudiant();
         e4.setNom(name);
         e4.setAge(age);
         e4.setMoyenne(score);
         e4.setAdresse(adress);
         
         System.out.println("to string method" + e4.toString());
        

	}

}
