import java.util.*;
import java.io.*;
public interface  Features{
    public void writeMessage();
    public void sendMessage();
    public void calling();
}
public class phone implements Features{
    String ram,rom,operatingSystem;
    Scanner sc=new Scanner(System.in);
    String message;
    String mobileNumber;
    void writeMessage(){
        message=sc.next();
        System.out.println("The message is: "+message);
    }
    void sendMessage(){
        mobileNumber=sc.next();
        System.out.println("Sending message to: "+mobileNumber);
    }
    void calling(){
        mobileNumber=sc.next();
        System.out.println("Calling to: "+mobileNumber);
    }
}
public class tablet extends phone{
    Mouse mouse;
    KeyBoard keyBoard;
    void mouseConnection(Mouse mouse){
        this.mouse=mouse;
        mouse.connect();
    }
    void keyBoardConnection(KeyBoard keyBoard){
        this.keyBoard=keyBoard;
        keyBoard.connect();
    }
}
public class Mouse{
    void connect(){
        System.out.println("mouse connected");
    }
}
public class KeyBoard{
    void connect(){
        System.out.println("keyboard connected");
    }
}