package registration;

import customerpackage.Customer;

public class Registration 
{
	String firstName;
	 String middleName;
	 String lastName;
	 String email;
	 String phone;
	 String address;
	 String proofType;
	 String proofId;
	
    Customer customer=new Customer();
	
	 public void display()
	{
		System.out.println("Full Name : "+customer.getFirstName()+" "+ customer.getMiddleName()+" "+ customer.getLastName());
		System.out.println("Email : "+customer.getEmail());
		System.out.println("Phone : "+customer.getPhone());
		System.out.println("Address : "+customer.getAddress());
		System.out.println("proof Type : "+customer.getProofType());
		System.out.println("proof Id : "+customer.getProofId());
		
	}

	public void register(String firstName,String middleName,String lastName,String email,String phone,String address,String proofType,String proofId) {
		// TODO Auto-generated method stub
		customer.setFirstName(firstName);
		 customer.setMiddleName(middleName);
		 customer.setLastName(lastName);
		 customer.setEmail(email);
		 customer.setPhone(phone);
		 customer.setAddress(address);
		 customer.setProofType(proofType);
		 customer.setProofId(proofId);
		 System.out.println("Thanks for registering ");
		 System.out.println("Your details are");
		 this.display();
	}

}
