class MyDetails {
    private String myName;
    private String myRoll;
    private String myNative;
    private int myAge;
 
    public String getName() {
        return myName; 
    }
 
    public String getRoll() { 
        return myRoll; 
    }
 
    public String getNative() { 
        return myNative; 
    }

    public int getAge() { 
        return myAge; 
    }

    public void setName(String newName){
        myName = newName;
    }
 
    public void setRoll(String newRoll) { 
        myRoll = newRoll; 
    }

    public void setNative(String newNative) { 
        myNative = newNative; 
    }
 
    public void setAge(int newAge) { 
        myAge = newAge; 
    }
}
 
public class Encapsulate {
    public static void main(String[] args)
    {
        MyDetails details = new MyDetails();
 
        details.setName("Subrahmanya");
        details.setRoll("Software Developer");
        details.setNative("Honnavara");
        details.setAge(23);
        
        System.out.println("Name: " + details.getName());
        System.out.println("Roll: " + details.getRoll());
        System.out.println("Native: " + details.getNative());
        System.out.println("Age: " + details.getAge());
    }
}