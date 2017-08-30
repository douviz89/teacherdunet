package com.teachersdunet.javaintermediaire;

public class Personne {
	
	private String nom;
	private String prenom;
	private int age;
	
	public static final int NOMBRE_MAX_OREILLES = 2;
	public static int nombreTotalDePersonnes = 0;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		nombreTotalDePersonnes++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age <= 15){
			throw new IllegalArgumentException("l'age doit être supérieur à 15");
		}else{
			this.age = age;
		}
	}
	
	
	
}
