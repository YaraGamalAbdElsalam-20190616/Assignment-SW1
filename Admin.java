package pack;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class Admin {
	
	public String UserName;
	public String MobileNum = " ";
	public String Email = " " ;
	public String Password = " ";
	
	private Store store1=new Store();
	public boolean verifyDriver(String name,String pass)
	{
		boolean verify=false;
		for(int i=0;i<store1.drivers.size();i++)
		{
			if(name==store1.displayDrivers().getUserName()&&pass==store1.displayDrivers().getPassword())
			{
				verify=true;
				break;
			}
		}
		return verify;
	}
	public boolean verifyPendingDriver(String name,String pass)
	{
		boolean verify=false;
		for(int i=0;i<store1.PendingDrivers.size();i++)
		{
			if(name==store1.displayPendingDrivers().getUserName()&&pass==store1.displayPendingDrivers().getPassword())
			{
				verify=true;
				break;
			}
		}
		return verify;
	}
	public boolean suspendDriver(Driver driver)
	{
		boolean check=false;
		if(driver.getUserName()==null||driver.getPassword()==null||driver.getEmail()==null||driver.getMobileNum()==null||driver.getDrivingLicence()==null||driver.getNationalID()==null) {
			check = false ;
		}
		else {
			check = true ;
		}
		return check ;
	}
	public boolean suspendCustomer(Customer customer)
	{
		boolean check=false;
		if(customer.getUserName()==null||customer.getPassword()==null||customer.getEmail()==null||customer.getMobileNum()==null) {
			check = false ;
		}
		else {
			check = true ;
		}
		return check ;
	}
	

}
