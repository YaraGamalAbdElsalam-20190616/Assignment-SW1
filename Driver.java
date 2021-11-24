package pack;

import java.util.*;

public class Driver implements User  {

	private String DrivingLicence ;
	private String NationalID ;
	Admin admin=new Admin();
	
	private String UserName;
	private String MobileNum ;
	private String Email  ;
	private String Password;
	
    private Offer offer1=new Offer();
    private Store store2=new Store();
    private Customer customer = new Customer ();
	ArrayList <String> FavouritreAreas = new ArrayList <String>() ;
	Scanner sc= new Scanner(System.in);
	
	public String getUserName() {
        return UserName;
    }

	@Override
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMobileNum() {
        return MobileNum;
    }

    public void setMobileNum(String MobileNum) {
        this.MobileNum = MobileNum;
    }
    
	
	public void setPrice()
     {
        System.out.println("Please enter the price that you want to set it");
         double price=sc.nextDouble();
         offer1.setPrice(price);
     }
	public void Notify()
	{
		customer.update(offer1.getPrice());
	}
	
	public void update(int rate)
	{
		System.out.println("your rate is: "+rate);
	}
	/*public Driver(String name,String pass,String email,String mobilnum,String drivingLicence,String NationalID)
	{
		UserName = name;
		
	}*/
	
	public void setDrivingLicenec (String DrivingLicence) {
		this.DrivingLicence = DrivingLicence ;
	}
	
	public void setNationalID (String NationalID) {
		this.NationalID = NationalID ;
	}
	
	public String getDrivingLicence () {
		return DrivingLicence ;
	}
	
	public String getNationalID () {
		return NationalID ;
	}
	
	public void setFavouritreAreas (String[] FavouritreAreas) {
		for (int i=0 ; i<FavouritreAreas.length ; i++) {
		this.FavouritreAreas.add(FavouritreAreas[i]) ;
		}
	}
	public ArrayList<String> getFavouritreAreas(){
	    return FavouritreAreas;
	}	
	
     public void addFavouritreAreas(String favArea){
            for (int i=0;i<FavouritreAreas.size();i++){
                FavouritreAreas.add(favArea);
            }
        }
     public void displayFavouritreAreas()
        {
            for(int i=0;i<FavouritreAreas.size();i++)
            {
                System.out.println(FavouritreAreas.get(i));
            }
        }
      public void logIn(String name,String pass)
        {
        	if(admin.verifyDriver(name, pass)==true)
        	{
        		System.out.println("You can login");
        	}
        	else 
        	{
        		System.out.println("Please check your information");
        	}
        }
      public void suspendCheck(Driver driver)
        {
        	if(admin.suspendDriver(driver)==true)
        	{
        		System.out.println("You cannot login");
        		
        	}
        }
	 
}

