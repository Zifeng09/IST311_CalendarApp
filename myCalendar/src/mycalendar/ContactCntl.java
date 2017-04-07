package mycalendar;

/**
 *
 * @author zifengxia
 */
public class ContactCntl {
    
    private NavigationCntl theNavigationCntl = null;
    private ContactList theContactList = null;
    private ContactListUI theContactListUI = null;
    private ContactUI theContactUI = null;
    private ContactTableModel theContactTableModel= null;
    
    public ContactCntl(NavigationCntl parentNavigationCntl){
        theNavigationCntl = parentNavigationCntl;
        theContactList = new ContactList();
        theContactTableModel = new ContactTableModel(theContactList.getListOfContact());
        theContactListUI = new ContactListUI(this);
        theContactListUI.setVisible(true);
    }
    
    public void ContactListUI(){
        theContactListUI.setVisible(true);
    }
    
    public void updateContact(int row, Contact newContact){
        theContactUI.setVisible(false);
        theContactList.getListOfContact().set(row, newContact);
        theContactTableModel.fireTableDataChanged();
        theContactListUI.setVisible(true);
    }
    
    public void saveNewContact(Contact newContact){
        theContactUI.setVisible(false);
        theContactList.getListOfContact().add(newContact);
        theContactTableModel.fireTableDataChanged();
        theContactListUI.setVisible(true);
    }
    
    public void getConactDataUI(int selectedRowID, Contact theSelectedContact){
        theContactListUI.setVisible(false);
        if(theSelectedContact != null){
            theContactUI = new ContactUI(this, selectedRowID, theSelectedContact);
        }else{
            theContactUI = new ContactUI(this, -1, null);
        }
        theContactUI.setLocationRelativeTo(null);
        theContactUI.setVisible(true);
    }
    
    public void getNavigationCntl(){
        theContactListUI.setVisible(false);
        theContactListUI.dispose();
        this.theNavigationCntl.getNavigationCntl();
    }
    
    public ContactTableModel getContactTableModel(){
        return theContactTableModel;
    }
    
    public ContactList getContactList(){
        return theContactList;
    }
    
    
    
}

