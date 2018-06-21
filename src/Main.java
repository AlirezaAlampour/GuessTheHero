
import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Run();
    }
    public static void Run(){
        JOptionPane.showMessageDialog(null,"Think of a hero ...");
        if(option("Is your hero an Agility hero?")){
            Agility.Run();
        }
        else if(option("Is your hero a Strength hero?")){
//            Strength.Run();
        }
        else {
            //Intelligence.Run();
        }
    }
    public static boolean option(String input){
        return JOptionPane.showConfirmDialog(null, input, null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
}


