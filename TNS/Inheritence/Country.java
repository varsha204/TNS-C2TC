package Inheritence;

public class Country {
  private String CountryName;
  private String capital;
  
  public String getCountryName() {
	return CountryName;
  }
  public void setCountryName(String countryName) {
	CountryName = countryName;
  }
  public String getCapital() {
	return capital;
  }
  public void setCapital(String capital) {
	this.capital = capital;
  }
  @Override
  public String toString() {
	return "Country [CountryName=" + CountryName + ", capital=" + capital + "]";
  }
}
