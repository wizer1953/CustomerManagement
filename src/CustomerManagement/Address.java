package CustomerManagement;

public class Address implements CustomerAddress {
	private String houseNumber;
	private String sector;
	private String city;
	private String state;
	private String zipCode;

	@Override public void setAddress(String houseNumber,String sector, String city, String state, String zipCode)
	{
		this.houseNumber = houseNumber;
		this.sector = sector;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	@Override public String toString()
	{
		return("House No: "+houseNumber+" Sec: "+sector+ " "+city+" "+zipCode+" "+state);
	}
}
