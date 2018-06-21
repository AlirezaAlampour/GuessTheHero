import javax.swing.*;
import java.util.*;
public class Agility {

    public static void Run(){
        if(Main.option("Is your hero ranged?")){
            JOptionPane.showMessageDialog(null,AgiRanged());
        }
        else JOptionPane.showMessageDialog(null,AgiMelee());
    }

    public static String AgiRanged() {
        if (Main.option("Does your hero use an aiming gun?")) {
            return "Sniper";
        } else if (Main.option("Is your hero female?")) {
            if (Main.option("Is your hero a rider?")) {
                if (Main.option("Is your hero associated with eclipses?")) {
                    return "Luna";
                } else return "Mirana";
            } else if (Main.option("Does your hero have a blocking ability?")) {
                if (Main.option("Is your hero in Greek mythology?")) {
                    return "Medusa";
                } else return "Templar Assassin";
            } else if (Main.option("Is your hero played in a famous strategy which is associated with pushing?")) {
                return "Drow Ranger";
            } else return "Vengeful Spirit";
        }
        else if(Main.option("Is your hero a reptile or an insect?")){
            if(Main.option("Is your hero poisonous?")){
                if(Main.option("Does your hero have the ability to summon poisonous wards?")){
                    return "Venomancer";
                }
                else return "Viper";
            }
            else return "Weaver";
        }
        else if(Main.option("Does your hero have legs and arms like humans?")){
            if(Main.option("Does your hero use illusions, clones or summon abilities?")){
                if(Main.option("Does a your hero have a bear companion?")){
                    return "Lone Druid";
                }
                else if(Main.option("Can your hero clone himself?")){
                    return "Arc Warden";
                }
                else return "TerrorBlade";
            }
            else if(Main.option("Does your hero use a flying device?")){
                return "Gyrocopter";
            }
            else if(Main.option("Is your hero a skeleton?")){
                return "Clinkz";
            }
            else return "Troll Warlord";
        }
        else if(Main.option("Is your hero associated with souls?")){
            return "Shadow Fiend";
        }
        else if(Main.option("Does your hero have a liquid body?")){
            return "Morphling";
        }
        else return "Razor";
    }

    public static String AgiMelee(){
        if(Main.option("Is your hero male?")){
           if(Main.option("Does your hero have invisible abilities?")){
               if(Main.option("Is your hero interested in backstabbing?")){
                   return "Riki";
               }
               else if(Main.option("Does your hero like to track people?")){
                   return "Bounty Hunter";
               }
               else return "Nyx Assassin";
           }
           else if(Main.option("Is your hero an animal?")){
               if(Main.option("Does Roshan fear your hero?")){
                   return "Ursa";
               }
               else if(Main.option("Does your hero jump on trees?")){
                   return "Monkey King";
               }
               else return "Pangolier";
           }
           else if(Main.option("Does your hero use illusions,clones or summon abilities?")){
               if(Main.option("Does your hero have multiple illusions or clones of himself?")){
                   if(Main.option("Is your hero hard to play and has a trapping ability?")){
                       return "Meepo";
                   }
                   else if(Main.option("Does your hero have the ability to transforms into a powerful demon with a ranged attack?")){
                       return "TerrorBlade";
                   }
                   else return "Phantom Lancer";
               }
               else return "Lone Druid";
           }
        }
        else if(Main.option("Is your hero a mother?")){
            return "Brood Mother";
        }
        else if(Main.option("Does your hero have a high physical damage with critical hits?")){
            return "Phantom Assassin";
        }
        else if(Main.option("Is your hero a sea creature?")){
            return "Naga Siren";
        }
         return "Spectre";
    }
}
