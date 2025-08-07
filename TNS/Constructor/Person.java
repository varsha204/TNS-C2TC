package Constructor;

public class Person {
    private String personName;
	private String personCity;
	private int personID;
	
	//default constructor
	public Person() {
		this.personName="Apoorva R S";
		this.personCity="Kengeri";
		this.personID=1;
	}
	//parameterizes
	public Person(String personName, String personCity, int personID) {
		super();
		this.personName = personName;
		this.personCity = personCity;
		this.personID = personID;
	}

	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personCity=" + personCity + ", personID=" + personID + "]";
	}
}
