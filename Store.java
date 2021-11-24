package pack;

import java.util.ArrayList;

public class Store {
	ArrayList <Customer>  customers=new ArrayList<>(); 
	ArrayList <Driver>  drivers=new ArrayList<>(); 
	ArrayList <Driver>  PendingDrivers=new ArrayList<>();
	ArrayList <Rating>  ratings=new ArrayList<>();
	ArrayList <String> AllRides=new ArrayList<>();
	public Store()
	{
		
	}
	public void AddCustomer(Customer customer)
	{
		customers.add(customer);
	}
	public void AddDriver(Driver driver)
	{
		drivers.add(driver);
	}
	public void AddPendingDriver(Driver pendingDriver)
	{
		PendingDrivers.add(pendingDriver);
	}
	public void AddRatings(Rating rating)
	{
		ratings.add(rating);
	}
	public void AddAllRides(String ride)
	{
		AllRides.add(ride);
	}
	public Driver displayDrivers()
	{
		for(int i=0;i<drivers.size();i++)
		{
			return drivers.get(i);
		}
		return null;
	}
	public Customer displayCustomer()
	{
		for(int i=0;i<customers.size();i++)
		{
			return customers.get(i);
		}
		return null;
	}
	public Driver displayPendingDrivers()
	{
		for(int i=0;i<PendingDrivers.size();i++)
		{
			return PendingDrivers.get(i);
		}
		return null;
	}
	public Rating displayRatings()
	{
		for(int i=0;i<ratings.size();i++)
		{
			return ratings.get(i);
		}
		return null;
	}
	public String displayAllRidess()
	{
		for(int i=0;i<AllRides.size();i++)
		{
			return AllRides.get(i);
		}
		return null;
	}

}
