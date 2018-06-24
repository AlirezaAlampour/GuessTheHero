import javax.swing.*;
import java.applet.*;

public class Intelligence extends Applet implements MyInterface {

    private static boolean option(String input){
        return JOptionPane.showConfirmDialog(null, input, null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public static void Run(){
        if(option(msg[0])){ // is your hero ranged? splits ranged and melee possible outputs
            JOptionPane.showMessageDialog(null,Int1());
        }
        else if(option(msg[1])){
            JOptionPane.showMessageDialog(null,Int2());
        }
        else JOptionPane.showMessageDialog(null,Int3());
    }

    private static String Int1(){
        if(option(msg[2])){
            if(option(msg[3])){
                if(option(msg[4])){
                    return "Winter Wyvern";
                }
                else return "Cristal Maiden";
            }
            else if(option(msg[5])){
                return "Lina";
            }
            else return "Dark Willow";
        }
        else if(option(msg[6])){
            if(option(msg[7])){
                if(option(msg[10])){
                    if(option(msg[11])){
                        return "Disruptor";
                    }
                    else if(option(msg[12])){
                        return "Skywarth Mage";
                    }
                    else if(option(msg[13])){
                        return "Techies";
                    }
                    else return "Silencer";
                }
                else if(option(msg[8])){
                    return "Dazzle";
                }
                else if(option(msg[9])){
                    return "Shadow Shamen";
                }
                else return "Rubick";
            }
            else if(option(msg[14])){
                if(option(msg[15])){
                    return "Lich";
                }
                else if(option(msg[16])){
                    return "Jakiro";
                }
                else return "Ancient Apparition";
            }
            else if(option(msg[17])){
                return "Leshrac";
            }
            else return "Witch Doctor";
        }
        else if(option(msg[18])){
            if(option(msg[19])){
                if(option(msg[20])){
                    return "Keeper of the Light";
                }
                else return "Lion";
            }
            else if(option(msg[21])){
                if(option(msg[22])){
                    return "Ogre magi";
                }
                else return "Silencer";
            }
            else if(option(msg[23])){
                return "Rubick";
            }
            else return "Shadow Shamen";
        }
        else if(option(msg[24])){
            return "Bane";
        }
        else if(option(msg[25])){
            return "Witch Doctor";
        }
        else if(option(msg[26])){
            return "Oracle";
        }
        else return "Shadow Demon";
    }
    private static String Int2(){
        if(option(msg[27])){
            if(option(msg[28])){
                if(option(msg[29])){
                    return "Dark Seer";
                }
                else if(option(msg[30])){
                    return "Natures Prophet";
                }
                else if(option(msg[31])){
                    return "Enchantress";
                }
                else return "Invoker";
            }
            else if(option(msg[32])){
                return "Death Prophet";
            }
            else if(option(msg[33])){
                return "Enigma";
            }
            else return "Visage";
        }
        else if(option(msg[34])){
            if(option(msg[35])){
                if(option(msg[36])){
                    return "Chen";
                }
                else return "Enchantress";
            }
            else if(option(msg[37])){
                return "Enigma";
            }
            else return "Natures Prophet";
        }
        else if(option(msg[38])){
            if(option(msg[39])){
                return "Visage";
            }
            else if(option(msg[40])){
                return "Warlock";
            }
            else return "Shadow Shamen";
        }
        else return "Shadow Demon";
    }
    private static String Int3(){
        if(option(msg[41])){
            if(option(msg[42])){
                if(option(msg[43])){
                    if(option(msg[60])){
                        if(option(msg[44])){
                            return "Invoker";
                        }
                        else if(option(msg[45])){
                            return "Enigma";
                        }
                        else return "Tinker";
                    }
                    else return "Outworld Devourer";
                }
                else if(option(msg[46])){
                    if(option(msg[47])){
                        return "Skywarth Mage";
                    }
                    else return "Batrider";
                }
                else if(option(msg[48])){
                    if(option(msg[49])){
                        return "Zeus";
                    }
                    else if(option(msg[50])){
                        return "Leshrac";
                    }
                    else return "Storm Spirit";
                }
                else if(option(msg[51])){
                    return "Silencer";
                }
                else if(option(msg[52])){
                    return "Techies";
                }
                else if(option(msg[53])){
                    return "Dark Seer";
                }
                else return "Necrophos";
            }
            else if(option(msg[54])){
                if(option(msg[55])){
                    return "Queen of Pain";
                }
                else return "Windranger";
            }
            else if(option(msg[56])){
                return "Puck";
            }
            else if(option(msg[57])){
                return "Lina";
            }
            else if(option(msg[58])){
                return "Enchantress";
            }
            else return "Death Prophet";
        }
        else if(option(msg[59])){
            return "Techies";
        }
        else return "Necrophos";
    }
    private static String[] msg = {
            "Is your hero usually a support?",//0
            "Does your hero have the ability to summon creatures or illusions or take control of jungle creeps?",//1
            "Is your hero female?",//2
            "Is your hero associated with Ice?",//3
            "Can your hero fly?",//4
            "Is your hero associated with flames?",//5
            "Does your hero have an AOE ultimate ability?",//6
            "Does your hero use a weapon?",//7
            "Can your hero save allies from certain death?",//8
            "Can your hero turn enemies into harmless creatures?",//9
            "Does your hero have the ability to silence?",//10
            "Is your hero a rider?",//11
            "Can your hero fly or hover?",//12
            "Is your hero suicidal?",//13
            "Is your hero associated with Ice?",//14
            "Does your hero have the ability to sacrifice friendly creeps?",//15
            "Does your hero have 2 heads?",//16
            "Is your hero 4 footed?",//17
            "Does your hero use weapons to attack?",//18
            "Can your hero mess with enemies' mana?",//19
            "is your hero old?",//20
            "Does your hero have the ability to do damage over time?",//21
            "Does your hero have 2 heads?",//22
            "Does your hero copy enemy abilities?",//23
            "Is your hero associated with nightmares?",//24
            "Is your hero a doctor?",//25
            "Can your hero predict future?",//26
            "Is your hero a core most of the time?",//27 start of Int2
            "Does your hero walk on foot?",//28
            "Is your hero melee?",//29
            "Does your hero have the ability to tp anywhere on the map?",//30
            "Does your hero have a passive ability?",//31
            "Is your hero female?",//32
            "Is your hero associated with Black holes?",//33
            "Can your hero jungle effectively?",//34
            "Is your hero either a rider or 4 footed?",//35
            "Can your hero send allies back to the fountain?",//36
            "Is your hero associated with Black holes?",//37
            "Does your hero use his ultimate ability to summon creatures?",//38
            "Does your hero fly?",//39
            "Does your hero have the ability to slow enemies?",//40
            "Is your hero a usual mid or offlane hero?",//41  start of Int3
            "Is your hero male?",//42
            "Does your hero deal pure damage?",//43
            "Does your hero have the highest number of castable abilities in game?",//44
            "Is your hero associated with Black holes?",//45
            "Does your hero either fly or hover?",//46
            "Does your hero have the ability to silence an enemy?",//47
            "Is your hero associated with lightnings?",//48
            "Is your hero a god?",//49
            "Is your hero 4 footed?",//50
            "Does your hero hate talking?",//51
            "Is your hero suicidal?",//52
            "Is your hero associated with illusions?",//53
            "Does your hero use weapons to attack?",//54
            "Does your hero have the ability to blink?",//55
            "Is your hero a fairy dragon?",//56
            "Is your hero associated with fire?",//57
            "Is your hero 4 footed?",//58
            "Is your hero suicidal?",//59
            "Does your hero walk on foot?"//60
    };
}
