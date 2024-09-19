package day.six.collection.task;

public class PersonalCustomer extends Customer{

	private String homePhone;
	private String workPhone;
	
	public PersonalCustomer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String getHomePhone() {
		return homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	@Override
	public String toString() {
		return "PersonalCustomer [homePhone=" + homePhone + ", workPhone=" + workPhone + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
