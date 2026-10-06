package com.entreprise.exceptions;

public class EquipementCompleteException extends RuntimeException {
    private int capacite;

    public void EquipeCompleteException(int capacite) {
    	
        super("équipe complète (capacité : " + capacite + ")");
        
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }

}
