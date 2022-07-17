package Faizan;

public class store {
    private String Address;
    private String name;
    private String address;
    public store(String theName,String theAddress){
        this.name=theName;
        this.Address=theAddress;
    }
    public String getName(){
        return  this.name;
    }
    public  String getAddress(){
        return this.Address;
    }

}
