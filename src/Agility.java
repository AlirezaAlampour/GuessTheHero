import javax.swing.*;
public class Agility implements MyInterface{

    private static boolean option(String input){
        return JOptionPane.showConfirmDialog(null, input, null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
    public static void Run(){
        if(option(msg[0])){ // is your hero ranged? splits ranged and melee possible outputs
            JOptionPane.showMessageDialog(null,AgiRanged());
        }
        else JOptionPane.showMessageDialog(null,AgiMelee());
    }

    private static String AgiRanged() {
        if (option(msg[1])) {
            return "Sniper";
        } else if (option(msg[2])) {
            if (option(msg[3])) {
                if (option(msg[4])) {
                    return "Luna";
                } else return "Mirana";
            } else if (option(msg[5])) {
                if (option(msg[6])) {
                    return "Medusa";
                } else return "Templar Assassin";
            } else if (option(msg[7])) {
                return "Drow Ranger";
            } else return "Vengeful Spirit";
        }
        else if(option(msg[8])){
            if(option(msg[9])){
                if(option(msg[10])){
                    return "Venomancer";
                }
                else return "Viper";
            }
            else return "Weaver";
        }
        else if(option(msg[11])){
            if(option(msg[12])){
                if(option(msg[13])){
                    return "Lone Druid";
                }
                else if(option(msg[14])){
                    return "Arc Warden";
                }
                else return "TerrorBlade";
            }
            else if(option(msg[15])){
                return "Gyrocopter";
            }
            else if(option(msg[16])){
                return "Clinkz";
            }
            else return "Troll Warlord";
        }
        else if(option(msg[17])){
            return "Shadow Fiend";
        }
        else if(option(msg[18])){
            return "Morphling";
        }
        else return "Razor";
    }

    private static String AgiMelee(){
        if(option(msg[19])){
           if(option(msg[20])){
               if(option(msg[21])){
                   return "Riki";
               }
               else if(option(msg[22])){
                   return "Bounty Hunter";
               }
               else return "Nyx Assassin";
           }
           else if(option(msg[23])){
               if(option(msg[24])){
                   return "Ursa";
               }
               else if(option(msg[25])){
                   return "Monkey King";
               }
               else return "Pangolier";
           }
           else if(option(msg[26])){
               if(option(msg[27])){
                   if(option(msg[28])){
                       return "Meepo";
                   }
                   else if(option(msg[29])){
                       return "TerrorBlade";
                   }
                   else return "Phantom Lancer";
               }
               else return "Lone Druid";
           }
           else if(option(msg[33])){
               if(option(msg[34])){
                   return "Anti Mage";
               }
               else if(option(msg[35])){
                   return "BloodSeeker";
               }
               else if(option(msg[36])){
                   return "Ember Spirit";
               }
               else return "Troll Warlord";
           }
           else if(option(msg[37])){
               return "Faceless Void";
           }
           else if(option(msg[38])){
               return "Slark";
           }
           else return "Juggernaut";
        }
        else if(option(msg[30])){
            return "Brood Mother";
        }
        else if(option(msg[31])){
            return "Phantom Assassin";
        }
        else if(option(msg[32])){
            return "Naga Siren";
        }
         return "Spectre";
    }

    private static String[] msg = { //messages array
            "Is your hero ranged?", //0
            "Does your hero use an aiming gun?", //1
            "Is your hero female?", //2
            "Is your hero a rider?", //3
            "Is your hero associated with eclipses?", //4
            "Does your hero have a blocking ability?", //5
            "Is your hero in Greek mythology?", //6
            "Is your hero played in a famous strategy which is associated with pushing?",  //7
            "Is your hero a reptile or an insect?", //8
            "Is your hero poisonous?", //9
            "Does your hero have the ability to summon poisonous wards?", //10
            "Does your hero have legs and arms like humans?", //11
            "Does your hero use illusions, clones or summon abilities?", //12
            "Does a your hero have a bear companion?", //13
            "Can your hero clone himself?", //14
            "Does your hero use a flying device?", //15
            "Is your hero a skeleton?", //16
            "Is your hero associated with souls?", //17
            "Does your hero have a liquid body?", //18
            "Is your hero male?", //19
            "Does your hero have invisible abilities?", //20
            "Is your hero interested in backstabbing?", //21
            "Does your hero like to track people?", //22
            "Is your hero an animal known to humans?", //23
            "Does Roshan fear your hero?", //24
            "Does your hero jump on trees?", //25
            "Does your hero use illusions,clones or summon abilities?", //26
            "Does your hero have multiple illusions or clones of himself?", //27
            "Is your hero hard to play and has a trapping ability?", //28
            "Does your hero have the ability to transforms into a powerful demon with a ranged attack?", //29
            "Is your hero a mother?", //30
            "Does your hero have a high physical damage with critical hits?", //31
            "Is your hero a sea creature?", //32
            "Does your hero uses 2 weapons?", //33
            "Does your hero hate magic?", //34
            "Does your hero get stronger by the wounds of his enemies?", //35
            "Is your hero associated with flames?", //36
            "Can your hero play with time?", //37
            "Has your hero spend half his life in an underwater prison?", //38
    };

}
