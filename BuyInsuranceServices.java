package service;

import java.util.List;

import entities.BuyInsurance;

public interface BuyInsuranceService {
	void createInsuranceService(BuyInsurance ins);
	BuyInsurance findInsuranceService(int userId);
	List<BuyInsurance> findInsuranceService();
	void modifyInsuranceService(BuyInsurance ins);
	void removeInsuranceService(int userId);
}
