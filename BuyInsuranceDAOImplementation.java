package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.BuyInsurance;

public class BuyInsuranceDAOImplementation implements BuyInsuranceDAO 
{
    Connection conn ; 
	
	public BuyInsuranceDAOImplementation() 
	{
		try {
		
			System.out.println("Trying to load the driver...");
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded....");
			
			
			System.out.println("Trying to connect....");
			conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected : "+ conn);
			
						
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void insertInsurance(BuyInsurance ins) {
		
		
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO INSDB VALUES (?,?,?,?,?,?,?,?,?,?)");

			pst.setInt(1, ins.getUserId());
            pst.setInt(2, ins.getVehicelId());
			pst.setstring(3, ins.getVehcileType());
			pst.setString(4,ins.getVehcileManufacturer());
            pst.setString(5, ins.getVehcileModel());
			pst.setString(6, ins.getDrivingLicense());
			pst.setString(7,ins.getPurchaseDate());
			pst.setInt(8, ins.getRegistrationNumber());
			pst.setString(9,ins.getEngineNumber());
			pst.setString(10, ins.getChasisNumber());
			
			
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	
	}
	
    public BuyInsurance selectInsurance(int userId) {
		
    	BuyInsurance insObj =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			
			ResultSet result = statement.executeQuery("SELECT * FROM INSDB WHERE REGNO="+regNumber);
			
			
			if(result.next()) {
				insObj = new BuyInsurance(); 
				
				insObj.setUserId(result.getInt(1));
                insobj.setVehicelId(result.getInt(2));
				insObj.setvehcileType(result.getstring(3));
				insObj.setVehcileManufacturer(result.getString(4));
                insObj.setVehcileModel(result.getString(5));
				insObj.setDrivingLicense(result.getString(6));
				insObj.setPurchaseDate(result.getString(7));
				insObj.setRegistrationNumber(result.getInt(8));
				insObj.setEngineNumber(result.getString(9));
				insObj.setChasisNumber(result.getString(10));
				
				

			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return insObj;
	}
    
   public List<BuyInsurance> selectInsurance() {
		
		List<BuyInsurance> insList = new ArrayList<BuyInsurance>();
		try {
			
			 
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			
			ResultSet result = statement.executeQuery("SELECT * FROM INSDB");
			
			
			while(result.next()) 
			{
				BuyInsurance insObj = new BuyInsurance(); 
				
			
				insObj.setUserId(result.getInt(1));
                insobj.setVehicelId(result.getInt(2));
				insObj.setvehcileType(result.getstring(3));
				insObj.setVehcileManufacturer(result.getString(4));
                insObj.setVehcileModel(result.getString(5));
				insObj.setDrivingLicense(result.getString(6));
				insObj.setPurchaseDate(result.getString(7));
				insObj.setRegistrationNumber(result.getInt(8));
				insObj.setEngineNumber(result.getString(9));
				insObj.setChasisNumber(result.getString(10));
			}
		    }
		   catch (SQLException e) {
			
			e.printStackTrace();
		   }
		   return insList;
	}
   
   public void updateInsurance(BuyInsurance ins) 
   {
		
		
		try {
			PreparedStatement pst =conn.prepareStatement("UPDATE INSDB vid=?, vtype=? ,vmanu=? ,vmod=?,dl=?,date=?,rno=?,eno=?,chno=? =>where uid=?");
					
			
            pst.setInt(10, ins.getUserId());
            pst.setInt(1, ins.getVehicelId());
			pst.setstring(2, ins.getVehcileType());
			pst.setString(3,ins.getVehcileManufacturer());
            pst.setString(4, ins.getVehcileModel());
			pst.setString(5, ins.getDrivingLicense());
			pst.setString(6,ins.getPurchaseDate());
			pst.setInt(7, ins.getRegistrationNumber());
			pst.setString(8,ins.getEngineNumber());
			pst.setString(9, ins.getChasisNumber());
			System.out.println("PreparedStatement is created : "+ pst);
					
					
			int rows = pst.executeUpdate();
					
			System.out.println("Row MODIFIED : "+rows);
		} 
		catch (SQLException e) 
		{
					
			e.printStackTrace();
		}
	}
   public void deleteInsurance(int userId) {
		
		
		try {
			PreparedStatement pst = conn.prepareStatement("DELETE FROM INSDB where uid=?");
			
			pst.setInt(1,userId); 

			
			System.out.println("PreparedStatement is created : "+ pst);
			
			
			int rows = pst.executeUpdate();
			
			System.out.println("Row DELETED : "+rows);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
