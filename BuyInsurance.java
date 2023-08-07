package entities;

public class BuyInsurance {
	
    private int userId;
    private int vehicelId;
	private String vehcileType; // two wheeler or four wheeler
    private String vehcileManufacturer;
    private String vehcileModel;
    private String drivingLicense;
    private String purchaseDate;
    private int registrationNumber;
    private String engineNumber ;
    private String chasisNumber;
    public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
    public int getVehicelId() {
		return registrationNumber;
	}
	public void setVehicelId(int vehicelId) {
		this.vehicelId = vehicelId;
	}
	public void setVechileType(String vehcileType){
        this.vehcileType = vehcileType ;
    }
    public String getVehcileType() {
		return vehcileType;
	}
	public String getVehcileManufacturer() {
		return vehcileManufacturer;
	}
	public void setVehcileManufacturer(String vehcileManufacturer) {
		this.vehcileManufacturer = vehcileManufacturer;
	}
	public String getVehcileModel() {
		return vehcileModel;
	}
	public void setVehcileModel(String vehcileModel) {
		this.vehcileModel = vehcileModel;
	}
	public String getDrivingLicense() {
		return drivingLicense;
	}
	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getChasisNumber() {
		return chasisNumber;
	}
	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}
	
	
	
	
    
    
}