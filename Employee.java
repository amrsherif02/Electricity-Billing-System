/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package electricity_billing_system;

import java.util.Date;

/**
 *
 * @author DELL
 */
abstract class Employee {
    private String Name;
    private int SSN;
    private String DOB;
    private String Position;
    private String Address;
    private int Phone_Number;
    private String Shift;
    private String Password ;

    public Employee(String Name, int SSN, String DOB, String Position, String Address, int Phone_Number, String Shift, String Password) {
        this.Name = Name;
        this.SSN = SSN;
        this.DOB = DOB;
        this.Position = Position;
        this.Address = Address;
        this.Phone_Number = Phone_Number;
        this.Shift = Shift;
        this.Password = Password;
    }
    



  

    public Employee() {
    }

    
    
    public Employee(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }



    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(int Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String Shift) {
        this.Shift = Shift;
    }



    public Employee(String Name, int SSN, String DOB, String Position, String Address, int Phone_Number, String Shift) {
        this.Name = Name;
        this.SSN = SSN;
        this.DOB = DOB;
        this.Position = Position;
        this.Address = Address;
        this.Phone_Number = Phone_Number;
        this.Shift = Shift;
    }
    
    
    
    
}

