package service;

import java.util.List;

import dao.BuyInsuranceDAO;
import dao.BuyInsuranceDAOImplementation;
import entities.BuyInsurance;

public class BuyInsuranceServiceImplementation implements BuyInsuranceService {
	BuyInsuranceDAO insDAO = new BuyInsuranceDAOImplementation();
	public void createInsuranceService(BuyInsurance ins) {
			insDAO.insertInsurance(ins);
	}
	public BuyInsurance findInsuranceService(int userId) {	
		return insDAO.selectInsurance(userId);
	}
	public List<BuyInsurance> findInsuranceService() {
		return insDAO.selectInsurance();
	}
	public void modifyInsuranceService(BuyInsurance ins) {
		insDAO.updateInsurance(ins);
	}
	public void removeInsuranceService(int deptNumber) {
		deptDAO.deleteInsurance(deptNumber);
	}

}