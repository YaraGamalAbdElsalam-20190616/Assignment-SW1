package pack;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class Rating {
	private int rate;
    static int count=0;
    static int length=0;
    double avgRatings;
    
    public Rating(){
        rate=0;
    }
   public Rating(int R){
       rate=R;
       count++;
    }
   
    public void setRate(int r) {
        rate=r;
        length+=r;
    }
    public int getRate(){
        return rate;
    }
    
    
    public double avgRatings(){
        avgRatings=length/count;
        return avgRatings;
        
    }
    

}
