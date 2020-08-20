/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.marceau.controler;

import fr.marceau.dao.UserDao;
import fr.marceau.model.Personne;

/**
 *
 * @author joelg
 */
public class Program {
    
    public static void main(String[] args) {
        
        try {
            Personne p = UserDao.getByLoginAndMdp("test", "test");
            
            if(p != null){
                System.out.println("ok ok ok");
            }
            else{
                System.out.println("incorrecte");
            }
        } catch (Exception e) {
            System.out.println("exp recup data " + e.getMessage());
        }
    }
    
}
