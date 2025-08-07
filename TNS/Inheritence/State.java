package Inheritence;

public class State extends Country{
  private String StateName;
  private String Language;
  
  
 
  public String getStateName() {
	return StateName;
  }
  public void setStateName(String stateName) {
	this.StateName = stateName;
  }
  public String getLanguage() {
	return Language;
  }
  public void setLanguage(String language) {
	this.Language = language;
  }
  @Override
  public String toString() {
	return "State [StateName=" + StateName + ", Language=" + Language + ",CountryName=" + getCountryName()
			+ ",Capital=" + getCapital() + "]";
  }
}
