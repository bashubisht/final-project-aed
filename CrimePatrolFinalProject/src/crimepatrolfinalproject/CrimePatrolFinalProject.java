/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crimepatrolfinalproject;
import PoliceDepartment.Case;
import PoliceDepartment.Precinct;
import utilPackage.SnowflakeConnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Citizen;
import model.Community;
import model.Location;
import utilPackage.S3BucketOperations;
import utilPackage.Helper; 
import utilPackage.Helper;
import utilPackage.ResultSetMapper;
import utilPackage.SystemConstants;
import utilPackage.SendNotification;


/**
 *
 * @author aryan
 */
public class CrimePatrolFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        
//        ResultSetMapper<Community> credentialsResultSetMapper = new ResultSetMapper<Community>();
//        
//        ResultSet resultSet = null;
//        
//        resultSet = Helper.getData("select * from community");
//        
//        List<Community> credList = credentialsResultSetMapper.mapResultSetToObject(resultSet, Location.class);
//        
//        for(Community cred: credList) {
//            System.out.println("UserName: " + cred.getHeatLevel()+ " and Password: " + cred.getName());
//        }
//        
//  
       new Login().setVisible(true);
        
    //    SendNotification.sendEmailNotification("Good Morning From Java", "Testing the code", "aryan.s@northeastern.edu");
    //    SendNotification.sendEmailNotification("Good Morning From Java", "Testing the code", "bisht.b@northeastern.edu");
    //    SendNotification.sendEmailNotification("Good Morning From Java", "Testing the code", "padyal.s@northeastern.edu");
        
        
//        Properties properties = new Properties();
//        properties.put("user", "SNEHILARYAN"); 
//        properties.put("password", "Breakingbad@1");
//        properties.put("warehouse", "MY_WH");
//        properties.put("db", "CRIMEPATROL"); 
//        properties.put("schema", "PUBLIC"); 
//        Connection conn = null;
//        
//        try{
//            String connectStr = "jdbc:snowflake://cfukojb-pm07945.snowflakecomputing.com"; 
//            conn = DriverManager.getConnection(connectStr, properties);
//            System.out.println("connection success " + conn);
//        }
//        
//        catch (SQLException ex) {
//            System.out.println("connection failed");
//        }


    //    S3BucketOperations.putObjectToS3("crime-patrol-evidence", "C:/Users/aryan/Desktop/Capture.JPG", "tested-from-final-froject.JPG");
    //    S3BucketOperations.getObjectFromS3("crime-patrol-evidence", "CaptureFromAws.JPG", "tested-from-final-froject.JPG"); 
//    
//        Helper.insertData("insert into credentials values('12334', 'Breakingbad@1')");
//        String query = "insert into person values(12345, 'bashu', 1234, 'aryan.s@northeastern.edu', 9334117595, to_date('03-02-1998', 'mm-dd-yyyy'), 'A+', 'Male', 'Citizen')";
//        Helper.insertData(query);
//        
//        
//        
//        ResultSet res = Helper.getData("SELECT * FROM COMMUNITY where ");
//        
//         while (res.next()) {
//            System.out.println(res.getString(1));  
//        }
//        
//   
//        
//        Location location = new Location(1000, 12.5, 12.5, comm);
//        Citizen cit = new Citizen(0, false, false, "Sahil", location, "helloEmail", Long.parseLong("9334117595"), null, 12349876, "A+", "Citizen", "Male");
//        cit.addToPersonTable(cit);8000001

    
        Helper.insertData("insert into credentials values('12334', 'Breakingbad@1')");
        String query = "insert into person values(12345, 'bashu', 1234, 'aryan.s@northeastern.edu', 9334117595, to_date('03-02-1998', 'mm-dd-yyyy'), 'A+', 'Male', 'Citizen')";
        Helper.insertData(query);
        
        Community comm = new Community("Roxbury", 0, 10202);
        
   
        
        Location location = new Location(1000, 12.5);
        Citizen cit = new Citizen(0, false, false, "Sahil", location, "helloEmail", Long.parseLong("9334117595"), null, 12349876, "A+", "Citizen", "Male");
        cit.addToPersonTable(cit);
        
//        Community comm = Helper.fetchCommunity(8000001);
//        System.out.println(comm.getName());

//          Location loc = Helper.fetchLocation(7000001);
//          System.out.println(loc.getComminity());
//          System.out.println(loc.getLatitude());

//            Location loc = Helper.fetchLocation(10);
//            Precinct pre = Helper.fetchPrecinct(precinctId);
//            Case cas = new Case(caseId, description, loc, pre, policeId, lawyerId, caseType, dateOfCase, caseStatus);
//            cas.addToCaseTable(cas);
        }

    }
    

