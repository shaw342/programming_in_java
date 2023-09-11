package projet;

public class contact {
   private String firstName;
   private String lastName;
   private String PhoneNumber;


   public contact(String firstName,String lastName,String PhoneNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.PhoneNumber = PhoneNumber;
   }
    public String getFirstName() {
        return firstName;
    }
     public void setFirstName(String firstName){
        this.firstName= firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }
}
