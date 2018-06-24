import javax.swing.*;

public interface MyInterface {
     static boolean option(String input){
        return JOptionPane.showConfirmDialog(null, input, null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

}
