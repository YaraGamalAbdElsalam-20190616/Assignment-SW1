package pack;

import java.util.*;

public class Customer implements User {
	Scanner sc= new Scanner(System.in);
	Order r = new Order () ;
	Rating rate1 = new Rating ();
	private Driver driver=new Driver();
	Admin admin=new Admin();
	
	private String UserName;
	private String MobileNum ;
	private String Email  ;
	private String Password;
	
	public String getUserName() {
        return UserName;
    }

	@Override
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
	@Override
    public String getPassword() {
        return Password;
    }

	@Override
    public void setPassword(String Password) {
        this.Password = Password;
    }

	@Override
    public String getEmail() {
        return Email;
    }

	@Override 
    public void setEmail(String Email) {
        this.Email = Email;
    }

	@Override
    public String getMobileNum() {
        return MobileNum;
    }

	@Override 
    public void setMobileNum(String MobileNum) {
        this.MobileNum = MobileNum;
    }

	
	public void AddRide () {
		String sourceArea = sc.next();
		String distinationArea = sc.next();
		r.setSourceArea(sourceArea);
		r.setDistinationArea(distinationArea);
	}
	
	public void Notify(){
		driver.update(rate1.getRate());
	}
	public void update(double price){
		System.out.println("the price of the trip is: "+price);
		
	}
	public void suspendCheck(Customer customer) {
    	if(admin.suspendCustomer(customer)==true)
    	{
    		System.out.println("You cannot login");
    		
    	}
    }
}

