/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.marceau.dao;

import fr.marceau.model.Personne;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author joelg
 */
public class UserDao {
    public static Personne getByLoginAndMdp(String login, String mdp) throws SQLException{
        Personne result = null;
        
        String sql = "SELECT * FROM personne WHERE login=? AND mdp=?";
        
        Connection connexion = AccessBD.getConnection();
        
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, login);
        prepare.setString(2, mdp);
        
        ResultSet rs = prepare.executeQuery();
        
        if(rs.next()){
            result = new Personne();
            result.setNom(rs.getString("nom"));
            result.setAge(rs.getInt("age"));
            result.setLogin(rs.getString("login"));
        }
        
        return result;
    }
}
