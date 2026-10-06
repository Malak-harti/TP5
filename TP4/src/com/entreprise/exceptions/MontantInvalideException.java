package com.entreprise.exceptions;

public class MontantInvalideException extends Exception {
	 private double valeur;

	 public MontantInvalideException(String champ, double valeur) {
	     super(champ + " invalide : " + valeur);
	     this.valeur = valeur;
	 }

	 public double getValeur() {
	     return valeur;
	 }
	@ Override
	 public String toString() {
		return "MontantInvalideException [valeur=" + valeur + "]";
	 }

	 public void setValeur(double valeur) {
		this.valeur = valeur;
	 }
	

}
