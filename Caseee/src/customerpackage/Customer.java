package customerpackage;

public class Customer {
	//registration
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	private String proofType;
	private String proofId;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email2) {
		this.email=email2;
		
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	
	
	public void updateEmail(int custid, String nemail, String[] emailid, int emid) 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<emid;i++)
		{
			if(i==custid-1)
			{
				System.out.println("old emailid :"+""+emailid[i]);
				emailid[i]=nemail;
				System.out.println("updated email id is:"+""+emailid[i]);
			}
		}
	}
	
	
	
	
}
