package mycalendar;

/**
 *
 * @author zifengxia
 */
public class Contact{
    
    private String name = "";
    private int phonenum = 0;
    private String gender = "";
    private String comment = "";
    
    
    public Contact(){
        System.out.println("Called: Contact()");
    }
    
 
    
    public Contact(String newName, int newPhonenum, String newGender){
        // System.out.println("Called: Media(String title, long lengthInSeconds)");
        this.name = newName;
        this.phonenum = newPhonenum;
        this.gender = newGender;
    }
    
  
    
    public String getName(){
        return this.name;
    }
    
    public int getPhonenum(){
        return this.phonenum;
    }
    
    public String getGender(){
        return this.gender;
    }
    
     public String toString(){
        String contactString = this.name+ " "+ this.gender+" "+this.phonenum;
        return contactString;
  }


    
}
