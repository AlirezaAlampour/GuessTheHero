
import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Run();
//    System.out.print("Is your hero an Agility hero?");
    }
    public static void Run(){
        Scanner sc = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Think of a hero ...");
        if(JOptionPane.showConfirmDialog(null,"Is your hero not an Intelligence or Strength hero?",null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            Agility.Run();
        }
        else if(JOptionPane.showConfirmDialog(null,"Is your hero a Strength hero?",null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
//            Strength.Run();
        }
        else {
            //Intelligence.Run();
        }
    }
}
