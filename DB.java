/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity_billing_system;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
     private static DB DB;
    private final static String userName = "root";
    private final static String password = "";
    private final static String dbName = "volt";


    Connection con;
    
    private DB()
{
    
        try {
            //Loading the jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Get a connection to database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, userName, password);
        } catch (Exception e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());
        }
}
    public static DB getInstance()
{
    if (DB==null)
    {
        DB = new DB();
        
    }
    else
    {
        return DB;
    }
    return DB;
} 
    


    
    public void Change_Price_Rate(double M) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO manager (pricerate) VALUES (" + M + ")");
            System.out.println("new price added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
    
        public void AddCollector(Electricity_Collector M) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO electricity_collector (name, SSN, DOB, Position, Address, Phone_Number, Shift, Covered_Area, Collector_ID, password) VALUES ('" + M.getName() + "', '" + M.getSSN() + "', '" + M.getDOB() + "', '" + M.getPosition() + "', '" + M.getAddress() + "', '" + M.getPhone_Number() + "', '" + M.getShift() + "', '" + M.getCovered_Area() + "', '" + M.getCollector_ID() + "', '" + M.getPassword() + "')");
            System.out.println("new Collector added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
        
        
 public void updateCollector(int id, String position, String address, String shift, String area,int number) {
    try {
        // Assuming 'con' is your database connection
        Statement stmt = con.createStatement();
        // Construct SQL query to update multiple columns
        String query = "UPDATE electricity_collector SET  Position = '" + position +
                       "', Address = '" + address +
                       "', shift = '" + shift +
                       "', covered_area = '" + area +
                 "', Phone_number = '" + number +
                       "' WHERE Collector_ID = " + id;
        // Execute the update query
        stmt.executeUpdate(query);
        System.out.println("Student updated");
    } catch (Exception e) {
        // Handle any errors
        System.err.println("DATABASE UPDATE ERROR: " + e.toString());
    }
}
 
public void updateCustomer(int id, String address, String area, int phoneNumber) {
    try {
        Statement stmt = con.createStatement();
        String query = "UPDATE Customer SET Address = '" + address +
                       "', `Phone number` = '" + phoneNumber +
                       "', Area = '" + area +
                       "' WHERE id = " + id;
        // Execute the update query
        stmt.executeUpdate(query);
        System.out.println("Customer updated");
    } catch (Exception e) {
        // Handle any errors
        System.err.println("DATABASE UPDATE ERROR: " + e.toString());
    }
}

public void addAdmin(Admin d) {
    try {
        Statement stmt = con.createStatement();
        String query = "INSERT INTO Admin (name, AdminID, SSN, DOB, Address, phonenumber, password) VALUES ('" + d.getName() + "', '" + d.getAdmin_ID() + "', '" + d.getSSN() + "', '" + d.getDOB() + "', '" + d.getAddress() + "', '" + d.getPhone_Number() + "', '" + d.getPassword() + "')";
        stmt.executeUpdate(query);
        System.out.println("New Admin added");
    } catch (SQLException e) {
        System.err.println("DATABASE INSERTION ERROR: " + e.toString());
    }
}

public void deleteAdmin(int d) {
    try {
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM Admin WHERE AdminID = " + d);
        System.out.println("Admin with ID " + d + " deleted successfully");
    } catch (SQLException e) {
        System.err.println("DATABASE DELETION ERROR: " + e.toString());
    }
}

public void AddCust(Customer M , int Subid ) {
    try {
        Statement stmt = con.createStatement();
        String query = "INSERT INTO Customer (name, ID, Address, `Phone number`, Area, Subscription_Date, Subscription_ID) VALUES ('" + M.getName() + "', '" + M.getCust_ID() + "', '" + M.getAddress() + "', '" + M.getPhone_Number() + "', '" + M.getArea() + "', '" + M.getDate_Of_Subscription() + "', '" + Subid + "')";
        stmt.executeUpdate(query);
        System.out.println("New customer added");
    } catch (Exception e) {
        System.err.println("DATABASE INSERTION ERROR: " + e.toString());
    }
}
public void addSubscription(int subscriptionID, String startDate, String newState) {
    try {
        Statement stmt = con.createStatement();
        String query = "INSERT INTO subscription_db (Subscription_ID, Start_Date, newstate) VALUES (" + subscriptionID + ", '" + startDate + "', '" + newState + "')";
        stmt.executeUpdate(query);
        System.out.println("New subscription added");
    } catch (Exception e) {
        System.err.println("DATABASE INSERTION ERROR: " + e.toString());
    }
}


      
     public void deleteCollector(int c) {
    try {
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM electricity_collector WHERE Collector_ID = " + c);
        System.out.println("Collector with ID " + c + " deleted successfully");
    } catch (SQLException e) {
        System.err.println("DATABASE DELETION ERROR: " + e.toString());
    }
        

}
     
    public void deleteCust(int c) {
    try {
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM customer WHERE ID = " + c);
        System.out.println("Customer with ID " + c + " deleted successfully");
    } catch (SQLException e) {
        System.err.println("DATABASE DELETION ERROR: " + e.toString());
    }
        

}
    
    public boolean isMeterIdExists(int meterId) {
    try {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS count FROM meter WHERE ID = " + meterId);
        if (rs.first()) {
            int count = rs.getInt("count");
            return count > 0; // Return true if the count is greater than 0 (meter ID exists)
        }
    } catch (SQLException e) {
        System.err.println("DATABASE QUERY ERROR: " + e.toString());
    }
    return false; // Return false if an error occurs or if the meter ID does not exist
}
    
    public boolean getMeterStatusById(int meterId) {
    try {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT meter_state FROM meter WHERE ID = " + meterId);
        if (rs.first()) {
            return rs.getBoolean("meter_state"); // Return the status of the meter
        }
    } catch (SQLException e) {
        System.err.println("DATABASE QUERY ERROR: " + e.toString());
    }
    return false; // Return false if an error occurs or if the meter ID does not exist
}
    
    public void updatemeterreading(int id, double newreading) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update meter set meterReading = " + newreading + "where ID = '" + id + "'");
            System.out.println("meter updated");
        } catch (Exception e) {
            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
        }
    }
        public void updatemeterstate(int id, Boolean state) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update meter set meter_state = " + state + "where id = '" + id + "'");
            System.out.println("meter state updated");
        } catch (Exception e) {
            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
        }
    }
    
     public boolean iscustomerIdExists(int Id) {
    try {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS count FROM customer WHERE ID = " + Id);
        if (rs.first()) {
            int count = rs.getInt("count");
            return count > 0; // Return true if the count is greater than 0 (meter ID exists)
        }
    } catch (SQLException e) {
        System.err.println("DATABASE QUERY ERROR: " + e.toString());
    }
    return false; // Return false if an error occurs or if the meter ID does not exist
}

     
public Customer getcustByid(int id) {
    try {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM customer WHERE ID = '" + id + "'");
        if (rs.first()) {
            return new Customer(
                rs.getString("name"),
                rs.getInt("ID"), // Assuming ID is an integer
                rs.getString("Address"),
                rs.getInt("Phone number"), // Assuming Phone number is an integer
                rs.getString("Area"),
                rs.getString("Subscription_Date")
            );
        }
    } catch (SQLException e) {
        System.err.println("DATABASE QUERY ERROR: " + e.toString());
    }
    return null;
}

public Subscription getSubscriptionById(int id) {
    try {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Subscription_db WHERE Subscription_ID = " + id);
        if (rs.first()) {
            return new Subscription(
                rs.getInt("Subscription_ID"),
                rs.getString("Start_Date"),
                rs.getString("End_Date")
            );
        }
    } catch (SQLException e) {
        System.err.println("DATABASE QUERY ERROR: " + e.toString());
    }
    return null;
}




public Electricity_Collector getcollectorByid(int id) {
    try {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM electricity_collector WHERE Collector_ID = '" + id + "'");
        if (rs.first()) {
            return new Electricity_Collector(
                rs.getString("covered_area"),
                rs.getInt("Collector_ID"), 
                rs.getString("name"),
                rs.getInt("SSN"), 
                rs.getString("DOB"),
                rs.getString("Position"),
                rs.getString("Address"),
                rs.getInt("Phone_Number"),
                rs.getString("shift"),
                rs.getString("password")      
            );
        }
        
        
    } catch (SQLException e) {
        System.err.println("DATABASE QUERY ERROR: " + e.toString());
    }
    return null;
}

public Meter getmeterByid(int id) {
    try {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM meter WHERE ID = '" + id + "'");
        if (rs.first()) {
               return new Meter(
                rs.getInt("ID"),
                rs.getInt("Collector_ID"),
                rs.getString("installation_date"),
                rs.getDouble("meterReading"),
                rs.getBoolean("meter_state")
            );
        }

    } 
    catch (SQLException e) {
        System.err.println("DATABASE QUERY ERROR: " + e.toString());
    }
   return null;
}

private String sanitize(int id) {
    // Implement your sanitization logic here (e.g., removing special characters)
    // For simplicity, this example assumes no special sanitization is required
    return String.valueOf(id);
}


    public int addBillk(Bill f) {
        try {
            Statement stmt = con.createStatement();
            System.out.println("Bill added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
         return f.getID();
    }
    
        public void updateBillAmount(int id, double amount) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update bill set amount = " + amount + "where ID = '" + id + "'");
            System.out.println("amount updated");
        } catch (Exception e) {
            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
        }
    }

        
        ////////LOGIN
        
        
        
        public boolean authenticateAdmin(int id, String password) {
    try {
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM Admin WHERE AdminID = '" + id + "' AND password = '" + password + "'";
        ResultSet rs = stmt.executeQuery(query);
        
        // Check if any record matches the provided ID and password
        if (rs.next()) {
            // Match found, return true
            return true;
        } else {
            // No match found, return false
            return false;
        }
    } catch (SQLException e) {
        // Handle any database errors
        System.err.println("DATABASE ERROR: " + e.toString());
        return false;
    }
}
        
        
   public boolean authenticateManager(int id, String password) {
    try {
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM manager WHERE managerid = '" + id + "' AND password = '" + password + "'";
        ResultSet rs = stmt.executeQuery(query);
        
        // Check if any record matches the provided ID and password
        if (rs.next()) {
            // Match found, return true
            return true;
        } else {
            // No match found, return false
            return false;
        }
    } catch (SQLException e) {
        // Handle any database errors
        System.err.println("DATABASE ERROR: " + e.toString());
        return false;
    }
}
   
      public boolean authenticateCollector(int id, String password) {
    try {
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM electricity_collector WHERE Collector_ID = '" + id + "' AND Password = '" + password + "'";
        ResultSet rs = stmt.executeQuery(query);
        
        // Check if any record matches the provided ID and password
        if (rs.next()) {
            // Match found, return true
            return true;
        } else {
            // No match found, return false
            return false;
        }
    } catch (SQLException e) {
        // Handle any database errors
        System.err.println("DATABASE ERROR: " + e.toString());
        return false;
    }
}
 //add complain
public void AddComplain(Complain x) {
        try {
            Statement stmt = con.createStatement();
stmt.executeUpdate("INSERT INTO Complain (Complain_Description) VALUES ('" + x.getComplain_Description() + "')");
            System.out.println("Complain added successfully");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }

//payvisa
PayVisa_1 x;
public void Pay_Visa() {
        try {
            Statement stmt = con.createStatement();
stmt.executeUpdate("INSERT INTO Visa (Card_Number, CardHolder_Name,CVV) VALUES ('" + x.getCard_Number()+x.getCardHolder_Name()+x.getCVV()+ "')");
            System.out.println("Payment made successfully");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }

//paypal

PayPal1 z;
    public void Pay_pal() {
        try {
            Statement stmt = con.createStatement();
stmt.executeUpdate("INSERT INTO Visa (PayPal_Email, PayPal_Password) VALUES ('" + z.getPayPal_Email()+z.getPayPal_Password()+ "')");
            System.out.println("Payment made successfully");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
    
    Warning w;

public void Send_Warning() {
        try {
            Statement stmt = con.createStatement();
stmt.executeUpdate("INSERT INTO Warning (Warning_ID, Warning_Description, Warning_Count, Date) VALUES ('" + w.getWarning_ID() + w.getWarning_Description() + w.getWarning_Count() + w.getDate()+"')");
            System.out.println("Warning sent successfully");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
}

      
//        public void updateSubscriptionId(int customerId, int subscriptionId) {
//    try {
//        Statement stmt = con.createStatement();
//        String query = "UPDATE customer SET Subscription_Id = " + subscriptionId + " WHERE ID = " + customerId;
//        stmt.executeUpdate(query);
//        System.out.println("Subscription ID updated for customer with ID: " + customerId);
//    } catch (Exception e) {
//        System.err.println("DATABASE UPDATE ERROR: " + e.toString());
//    }




//    public void updateGPA(int id, double totamount) {
//        try {
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("update students set gpa = " + newGPA + "where name = '" + name + "'");
//            System.out.println("Student updated");
//        } catch (Exception e) {
//            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
//        }
//    }



         
//        public void updateBillamount(int id, double newreading) {
//        try {
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("update meter set meterReading = " + newreading + "where ID = '" + id + "'");
//            System.out.println("meter updated");
//        } catch (Exception e) {
//            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
//        }
//    }
        
//   public Electricity_Collector getCollectorByID(int collectorID) {
//    Electricity_Collector collector = null;
//    try {
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM electricity_collector WHERE Collector_ID = " + collectorID);
//        if (rs.next()) {
//           Electricity_Collector collector = new Electricity_Collector();
//            collector.setName(rs.getString("name"));
//            // Populate other fields as needed
//        }
//        rs.close();
//    } catch (SQLException e) {
//        System.err.println("DATABASE QUERY ERROR: " + e.toString());
//    }
//    return collector;
//}
        
//
//    public void addFeedback(Feedback f) {
//        try {
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("insert into Feedback (id, type) values('" +f.getId() + "', '" + f.getType() + "')");
//            System.out.println("Feedback added");
//        } catch (Exception e) {
//            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
//        }
//    }

//    public void deleteStudent(String name) {
//        try {
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("delete from students where name = '" + name + "'");
//            System.out.println("Student deleted");
//        } catch (Exception e) {
//            System.err.println("DATABASE DELETION ERROR: " + e.toString());
//        }
//    }

//    public void updateGPA(String name, double newGPA) {
//        try {
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("update students set gpa = " + newGPA + "where name = '" + name + "'");
//            System.out.println("Student updated");
//        } catch (Exception e) {
//            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
//        }
//    }

//    public Student getStudentByName(String name) {
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from students where name = '" + name + "'");
//            if (rs.first()) {
//                return new Student(rs.getString("name"), rs.getDouble("gpa"));
//            }
//        } catch (Exception e) {
//            System.err.println("DATABASE QUERY ERROR: " + e.toString());
//        }
//        return null;
//    }

//    public ArrayList<Student> getAllStudents() {
//        ArrayList<Student> result = new ArrayList();
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from students");
//            while (rs.next()) {
//                result.add(new Student(rs.getString("name"), rs.getDouble("GPA")));
//            }
//        } catch (Exception e) {
//            System.err.println("DATABASE QUERY ERROR: " + e.toString());
//        }
//        return result;
//}
    
   
}
