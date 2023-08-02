package dao;

import java.util.List;

//import entities.Insurance;

public interface InsuranceDAO {
	public void insertInsurance(Insurance ins); //C
	public Department selectInsurance(int regNumber);//R
	public List<Insurance> selectInsurance(); //RA
	public void updateInsurance(Insurance ins); //U
	public void deleteDepartment(int regNumber); 
}
