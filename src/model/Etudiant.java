package model;

/**
 * 
 * @author najet
 *
 */
public class Etudiant {
	private String nom;
	private int age;
	private double moyenne;
	private String adresse;
	
	
	
	void info() {
		
		System.out.println("Nom : "+ nom);
		System.out.println("Age : "+ age);
		System.out.println("Moyenne : "+ moyenne);
		System.out.println("Adresse : "+ adresse);
	}

	//default constructor	
	public Etudiant() {
		
	};
	
	// constructor with parameters to initialize instance variables 
	public Etudiant(String nom, int age, double moyenne, String adresse) {
		super();
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}

	
	// implement getters and setters 
	
	/**
	 * 
	 * @return student name
	 */
	public String getNom() {
		return nom;
	}

/**
 * 	
 * @param nom
 */
	public void setNom(String nom) {
		if(nom.length() >= 8 & nom.length() <= 30) 
		
		this.nom = nom;
	
	}
/**
 * 
 * @return student age 
 */
	public int getAge() {
		return age;
	}
/**
 * 
 * @param age
 */
	public void setAge(int age) {
		if(age >= 18 & age <= 28 )
			
			this.age = age;	

		
	}
/**
 * 
 * @return student score
 */
	public double getMoyenne() {
		return moyenne;
	}
/**
 * 
 * @param moyenne
 */
	public void setMoyenne(double moyenne) {
		if(moyenne >= 0 & moyenne <= 20)
		this.moyenne = moyenne;
	}
	
/**
 * 
 * @return student adress 
 */
	public String getAdresse() {
		return adresse;
	}
/**
 * 
 * @param adresse
 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + ", moyenne=" + moyenne + ", adresse=" + adresse + "]";
	}
	
	

}
