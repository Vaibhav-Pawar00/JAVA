public class OOPS{
    public static void main(String[]args){
        /*
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);
        */
        
        BankAccount myAcc = new BankAccount();
        myAcc.username = "vaibhaPawar";
        // System.out.println(myAcc.password); ----> not visible due to private string and cannnot be accessed
        myAcc.setPassword("abcdefghi");

        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

/*
class Pen{
    String color;
    int tip;
    
    void setColor(String newColor){
        color = newColor;
    }
    
    void setTip(int newTip){
        tip = newTip;
    }
}
*/

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    // Getters
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    // Setters
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}