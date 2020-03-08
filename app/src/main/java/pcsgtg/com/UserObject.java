package pcsgtg.com;

public class UserObject {
    private String  name,
                    phone;

    public UserObject(String name,String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {return  name;}
    public String getphone() {return  phone;}
}
