package fr.devavance.metier.beans;

import lombok.Data;

/**
 *
 * @author bouchaib.lemaire
 */

@Data
public class User {
    private String userName = "";  // Nom d'utilisateur
    private String password = "";  // Mot de passe
    private String profil = "";  // Profil de l'utilisateur "admin" ou "user"
    private Boolean auth = false; // Important : déconnecté par défaut
    
    public User () {}
    
    public User (String userName , String password ){
        this.userName  = userName ; 
        this.password = password ; 
    }
    
    public boolean equals (String userName){
        return userName.equals(this.userName);
    }
}