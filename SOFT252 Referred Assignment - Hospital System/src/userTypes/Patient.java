/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userTypes;

/**
 *
 * @author User
 */
public class Patient extends GenericUser {
    
    public Patient(String firstName, String surname, String userID, String password) {
        setFirstName(firstName);
        setSurname(surname);
        setID("A"+ userID);
        setPassword(password);
    }
}
