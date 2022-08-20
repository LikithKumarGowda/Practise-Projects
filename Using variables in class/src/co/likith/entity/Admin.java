package co.likith.entity;

public class Admin {
	private int adminId;
    private String emailId;
    private String firstName;
    private String password;
    
    public Admin(int adminId,String emailId,String firstName,String password){
        this.adminId=adminId;
        this.emailId=emailId;
        this.firstName=firstName;
        this.password=password;
    }
    public int getAdminId(){ return adminId;}
    public String getEmailId(){ return emailId;}
    public String getFirstName(){ return firstName;}
    public String getPassword(){ return password;}
    
    public void setAdminId(int adminId){ this.adminId=adminId;}
    public void setEmailId(String emailId){ this.emailId=emailId;}
    public void setFirstName(String firstName){ this.firstName=firstName;}
    public void setPassword(String password){ this.password=password;}
    @Override
    public String toString(){
        return "Admin [adminID="+adminId+", emailId="+emailId+", firstName="+firstName+", password="+password+"]";
    }
}
