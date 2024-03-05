
package Classes;

import java.time.LocalDate;


public class UserClass {
    
    private int ID;
    private String FullName;
    private String Email;
    private String Password;
    private String Role;
    private String Gender;
    private String Address;
    private String PhoneNumber;
    private double Balance;
    private LocalDate DOB;
    private String profilePicture;
    
    
    // Getter and Setter for ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // Getter and Setter for FullName
    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    // Getter and Setter for Email
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    // Getter and Setter for Password
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    // Getter and Setter for Gender
    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    // Getter and Setter for Address
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    // Getter and Setter for PhoneNumber
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    // Getter and Setter for Balance
    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    // Getter and Setter for DOB
    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate dob) {
        DOB = dob;
    }

    // Getter and Setter for Role
    public String getRole() {
        return Role;
    }

    
    public void setRole(String Role) {
        this.Role = Role;
    }

    
    public String getProfilePicture() {
        return profilePicture;
    }
    
    
    
}


