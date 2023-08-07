package dao;

import java.util.List;

import entities.BuyInsurance;

public interface BuyInsuranceDAO {
	public void insertInsurance(BuyInsurance ins); //C
	public BuyInsurance selectInsurance(int userId);//R
	public List<BuyInsurance> selectInsurance(); //RA
	public void updateInsurance(BuyInsurance ins); //U
	public void deleteInsurance(int userId); 
}
