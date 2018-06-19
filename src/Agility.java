import javax.swing.*;
import java.util.*;
public class Agility {

    public static void Run(){
        if(JOptionPane.showConfirmDialog(null,"Is your hero Ranged?",null, JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,AgiRanged());
        }
        else AgiMelee();
    }

    public static String AgiRanged() {
        if (JOptionPane.showConfirmDialog(null, "Does your hero use an aiming gun?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            return "Sniper";
        } else if (JOptionPane.showConfirmDialog(null, "Is your hero female?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (JOptionPane.showConfirmDialog(null, "Is your hero a rider?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (JOptionPane.showConfirmDialog(null, "Is your hero associated with eclipses?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    return "Luna";
                } else return "Mirana";
            } else if (JOptionPane.showConfirmDialog(null, "Does your hero have a blocking ability?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (JOptionPane.showConfirmDialog(null, "Is your hero in Greek mythology?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    return "Medusa";
                } else return "Templar Assassin";
            } else if (JOptionPane.showConfirmDialog(null, "Is your hero played in a famous strategy which is associated with pushing?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                return "Drow Ranger";
            }
        } return "Vengeful Spirit";
    }

    public static String AgiMelee(){
        return null;
    }
}
