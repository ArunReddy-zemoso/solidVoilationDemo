import java.util.*;
import java.io.*;
interface  Features{
    void sendMessage();
    void calling();
}
class Phone implements Features{
    String ram,rom,operatingSystem;
    Scanner sc=new Scanner(System.in);
    String message;
    String mobileNumber;
    public void sendMessage(){
        System.out.println("Enter the message");
        message=sc.next();
        System.out.println("Enter the mobileNumber");
        mobileNumber=sc.next();
        System.out.println("Sending "+message+" to: "+mobileNumber);
    }
    public void calling(){
        System.out.println("Enter the mobileNumber");
        mobileNumber=sc.next();
        System.out.println("Calling to: "+mobileNumber);
    }
}
class Tablet extends Phone{

    public void connectMouse(){
        Mouse mouse=new Mouse();
        mouse.connect();
    }
    public void connectKeyBoard(){
        KeyBoard keyBoard=new KeyBoard();
        keyBoard.connect();
    }
}
class Mouse{
    public void connect(){
        System.out.println("mouse connected");
    }
}
class KeyBoard{
    public void connect(){
        System.out.println("keyboard connected");
    }
}
public class Main{
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.sendMessage();
        phone.calling();
        Tablet tablet=new Tablet();
        tablet.connectMouse();
        tablet.connectKeyBoard();
    }
}