import javax.swing.*;

public class Strength implements MyInterface {

    private static boolean option(String input){
        return JOptionPane.showConfirmDialog(null, input, null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public static void Run(){
        if(option(msg[0])){ // is your hero ranged? splits ranged and melee possible outputs
            JOptionPane.showMessageDialog(null,Str1()); // heroes starting letter is ABCDE
        }
        else JOptionPane.showMessageDialog(null,Str2()); // not ABCDE
    }

    private static String Str1(){
        if(option(msg[23])){
            if(option(msg[24])){
                if(option(msg[25])){
                    if(option(msg[26])){
                        return "Earth Spirit";
                    }
                    else return "Earthshaker";
                }
                else if(option(msg[27])){
                    return "Centaur Warrunner";
                }
                else if(option(msg[28])){
                    return "Alchemist";
                }
                else return "Axe";
            }
            else if(option(msg[29])){
                return "Clockwerk";
            }
            else if(option(msg[30])){
                return "Elder Titan";
            }
            else return "Alchemist";
        }
        else if(option(msg[31])){
            if(option(msg[32])){
                if(option(msg[33])){
                    return "Brewmaster";
                }
                else return "Beastmaster";
            }
            else if(option(msg[34])){
                return "Doom";
            }
            else if(option(msg[35])){
                return "Bristleback";
            }
            else if(option(msg[36])){
                return "Dragon Knight";
            }
            else return "Abaddon";
        }
        else if(option(msg[37])){
            return "Alchemist";
        }
        else if(option(msg[38])){
            return "Chaos Knight";
        }
        else return "Dragon Knight";
    }

    private static String Str2(){
        if(option(msg[1])){
            if(option(msg[7])){
                return "Pudge";
            }
            else if(option(msg[8])){
                if(option(msg[9])){
                    if(option(msg[13])){
                        return "Lycan";
                    }
                    else return "Wraith King";
                }
                else if(option(msg[10])){
                    if(option(msg[14])){
                        return "Huskar";
                    }
                    else return "Legion Commander";
                }
                else if(option(msg[11])){
                    if(option(msg[12])){
                        return "Treant Protector";
                    }
                    else return "Lifestealer";
                }
                else return "Omni Knight";
            }
            else if(option(msg[15])){
                if(option(msg[16])){
                    if(option(msg[17])){
                        return "Tide Hunter";
                    }
                    else return "Slardar";
                }
                else if(option(msg[18])){
                    if(option(msg[19])){
                        return "Tiny";
                    }
                    else return "Sand King";
                }
                else return "Sven";
            }
            else if(option(msg[20])){
                return "Spirit Breaker";
            }
            else if(option(msg[21])){
                return "Night Stalker";
            }
            else if(option(msg[22])){
                return "Timbersaw";
            }
            else return "Underlord";
        }
        else if(option(msg[2])){
            if(option(msg[3])){
                return "Phoenix";
            }
            else return "Io";
        }
        else if(option(msg[4])){
            if(option(msg[5])){
                return "Kunkka";
            }
            else return "Magnus";
        }
        if(option(msg[6])){
            return "Tusk";
        }
        else return "Undying";
    }

    private static String[] msg = { //Messages
            "Does your hero's name start with letters A,B,C,D,E?",//0
            "Does your hero have a passive ability?",//1
            "Is your hero ranged?",//2
            "Is your hero a bird?",//3
            "Does your hero have the ability to deal cleave damage?",//4
            "Is your hero associated with ships?",//5
            "Is your hero associated with snowballs?",//6
            "Does your hero hook his enemies?",//7
            "Can your hero heal, lifesteal or give bonus health to himself or allies with his abilities?",//8
            "Can your hero summon units with his abilities?",//9
            "Is your hero either ranged or female?",//10
            "Does your hero use bare hands to attack?",//11
            "Is your hero associated with nature?",//12
            "Is your hero a werewolf?",//13
            "Does your hero like being on low health?",//14
            "Is blink dagger one of the ideal items on your hero?",//15
            "Is your hero associated with the sea?",//16
            "Does your hero walk on foot?",//17
            "Is your hero associated with rocks and sand?",//18
            "Does your hero grow in size as the game goes on?",//19
            "Does your hero moo?",//20
            "Does your hero like darkness?",//21
            "Does your hero destroy trees?",//22
            "Does your hero have one or more AOE disable abilities?",//23
            "Is blink one of the best items on your hero?",//24
            "Is your hero associated with earth?",//25
            "Can your hero kick enemies?",//26
            "Is your hero 4 footed?",//27
            "Can your hero make more gold using his passive ability?",//28
            "Does your hero work like a machine?",//29
            "Can your hero stun using his spirit?",//30
            "Is your hero usually played as an offlaner?",//31
            "Is your hero a master?",//32
            "Does your hero drink?",//33
            "Does your hero use a curse that prevents an enemy from casting spells or using items?",//34
            "Does your hero have a hard back?",//35
            "Can your hero turn into a flying beast?",//36
            "Can your hero make more gold using his passive ability?",//37
            "Does your hero have strong illusions?",//38
    };

}

