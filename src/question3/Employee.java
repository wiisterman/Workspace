package question3;

public class Employee //Model
{

	private String name;
	private String id;
	private String phoneNum;
	private String address;
	private String jobTitle;

	public Employee(String name, String id,String phoneNum, String address,String jobTitle) 
		{
			super();
			this.name = name;
			this.id = id;
			this.phoneNum = phoneNum;
			this.address = address;
			this.jobTitle = jobTitle;
		}

	public Employee() {};
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	@Override
	public String toString() {
		return "Employee [name: " + name + "\nid: " + id + "]";
	}

	
}