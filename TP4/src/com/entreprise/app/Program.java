package com.entreprise.app;

import com.entreprise.compta.Facture;
import com.entreprise.compta.Payable;
import com.entreprise.exceptions.EquipeCompleteException;
import com.entreprise.exceptions.MontantInvalideException;
import com.entreprise.rh.Augmentable;
import com.entreprise.rh.ChefProjet;
import com.entreprise.rh.Commercial;
import com.entreprise.rh.Employe;
import com.entreprise.rh.Permanent;

public class Program {
    public static void main(String[] args) {

        Service service = new Service(4);

        try {
            service.ajouter(new Commercial("Karim", 3000, 40000, "Rabat"));
            service.ajouter(new ChefProjet("Salma", 6000, "Casablanca"));
        } catch (MontantInvalideException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        String[] noms = {"Nadia", "Omar", "Yassine", "Leila", "Hamza"};
        String[] salaires = {"4500", "abc", "-800", "3800", "5200"};
        int tentatives = 0;

        for (int i = 0; i < noms.length; i++) {
            try {
                double salaire = Double.parseDouble(salaires[i]);
                Permanent p = new Permanent(noms[i], salaire);
                service.ajouter(p);
                System.out.println("Embauche de " + noms[i] + " : " + salaire);
            } catch (NumberFormatException e) {
                System.out.println("Saisie ignorée : \"" + salaires[i] + "\" n'est pas un montant");
            } catch (MontantInvalideException e) {
                System.out.println("Erreur : " + e.getMessage());
            } catch (EquipeCompleteException e) {
                System.out.println("Erreur : " + e.getMessage());
            } finally {
              
                tentatives++;
            }
        }
