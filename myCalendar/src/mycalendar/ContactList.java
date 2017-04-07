package mycalendar;

/**
 *
 * @author zifengxia
 */
import java.util.ArrayList;
public class ContactList{
    
    private ArrayList<Contact> theListofContact = null;
    
    public ContactList(){
        if(theListofContact == null){
            buildTestContactList();
        }
    }
    
    public ArrayList<Contact> getListOfContact(){
        if(theListofContact == null){
            buildTestContactList();
        }
        return theListofContact;
    }
    
    public void buildTestContactList(){
        theListofContact = new ArrayList<Contact>();
        for(int i = 0; i < 100; i++){
            Contact tempContact = new Contact(("steve"+i), i,("m"));
            theListofContact.add(tempContact);
        }
    }
    
}
