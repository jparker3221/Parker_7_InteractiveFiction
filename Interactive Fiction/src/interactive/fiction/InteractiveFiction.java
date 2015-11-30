package interactive.fiction;

import java.util.Random;
import java.util.Scanner;
// @author jparker3221

public class InteractiveFiction {

    //startgame
    static String playgame;
    static boolean start = false;
    static String playerclass;//#hero
    static String classcorrect;
    static String statselectquestion1;
    static String statselectquestion2;
    static String statselectquestion3;
    //player stats
    static int litness = 3;
    static int classiness = 3;
    static int savagery = 3;
    static int trash = 10;
    static int playerhealth = 300;
    //combat vars
    static int damage;
    static String currentcombatant;
    static String combatchoice;
    static int litnessdefense;
    static int savagerydefense;
    static int classinessdefense;
    static int enemyhealth = 0;
    static int endurance;
    //enemies
    static int simpleskellingtonhealth = 25;//enemyobject
    static int skellingtonarcher1health = 30;
    static int skellingtonwarrior1health = 40;
    static int skellingtonarmoredarcher1health = 50;
    static int JOHNCENAHEALTH = 999999999;
    //midgame
    static String dungeonB2choice1;
    static String dungeonB2choice2;
    static String dungeonB1choice1;
    static boolean dungeonB1armorydone;
    static boolean dungeonB1prisonerdone;
    //companions
    static boolean prisoner1;
    static boolean prisoner2;

    /**
     * @param args the command line arguments
     */
    //menu
    public static void main(String[] args) {
        System.out.println("d888888P dP     dP   88888888b  .88888.   .d888888  8888ba.88ba   88888888b  .88888.   88888888b  888888ba   88888888b  888888ba   88888888b ");
        System.out.println("   88    88     88   88        d8'   `88 d8'    88  88  `8b  `8b  88        d8'   `8b  88         88    `8b  88         88    `8b  88        ");
        System.out.println("   88    88aaaaa88a a88aaaa    88        88aaaaa88a 88   88   88 a88aaaa    88     88 a88aaaa    a88aaaa8P' a88aaaa    a88aaaa8P' a88aaaa    ");
        System.out.println("   88    88     88   88        88   YP88 88     88  88   88   88  88        88     88  88         88         88         88         88        ");
        System.out.println("   88    88     88   88        Y8.   .88 88     88  88   88   88  88        Y8.   .8P  88         88         88         88         88       ");
        System.out.println("   dP    dP     dP   88888888P  `88888'  88     88  dP   dP   dP  88888888P  `8888P'   dP         dP         88888888P  dP         88888888P");
        System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("Type start to start");
        Scanner userinputstart = new Scanner(System.in);
        playgame = userinputstart.nextLine().toLowerCase();
        if (playgame.contains("start")) {
            start = true;
        }
        if (playgame.contains("john cena")) {
            litness = 15;
            savagery = 15;
            classiness = 15;
            trash = 0;
            playerhealth = 600;
            combatJOHNCENA();
        }
        if (start) {
            backstory();
            characterselection();

        }
    }
//starting the game

    static void backstory() {//method1
        System.out.println("Your name is Pepe the Frog. King of Memes. Dominating the market of memes in the current state. But the King Doge "
                + "took away your fortune and oppurtunities.");
        System.out.println("He did easy work of your family and locked you up to threaten the world of memes. "
                + "You, Pepe, wake up in a dark soot filled room chained to the floor, the chain weak");
        System.out.println("from years of rust. You struggle to break them. "
                + "But, you have been blessed by the Goddess Miss Piggy from the Muppets along with our Lord and Savior Dr. Dre.");
        System.out.println("They bless you with messiahal power and release you from your chains and send you on a journey to reclaim what is rightfully yours.");
    }

    static void characterselection() {//method2
        System.out.println("Choose your class");
        System.out.println("Fedora Tipper");
        System.out.println("Spoopy Skeleton");
        System.out.println("Tyrone");
        Scanner userinputclass = new Scanner(System.in);
        playerclass = userinputclass.nextLine();
        playerclass = playerclass.toLowerCase();
        if (classcorrect()) {
            statselectquestion1();
        } else {
            System.out.println("invalid class try again");
            characterselection();
        }
    }

    static boolean classcorrect() {//method3
        if (playerclass.contains("fed") || playerclass.contains("skel") || playerclass.contains("ty")) {
            return (true);
        } else {
            return (false);
        }
    }

    static void statselectquestion1() {//method3
        System.out.println("Would you rather go to a rave party, a barbeque, or browse reddit?");
        Scanner userinputstatquestion1 = new Scanner(System.in);
        statselectquestion1 = userinputstatquestion1.nextLine();
        statselectquestion1 = statselectquestion1.toLowerCase();
        if (statquestion1correct()) {
            statselectquestion2();
        } else {
            statselectquestion1();
        }
    }

    static boolean statquestion1correct() {//method4
        if (statselectquestion1.contains("rav") || statselectquestion1.contains("part")
                || statselectquestion1.contains("barb") || statselectquestion1.contains("bbq")
                || statselectquestion1.contains("red")) {
            return (true);
        } else {
            System.out.println("invalid answer try again");
            return (false);
        }
    }

    static void statselectquestion2() {//method5
        System.out.println("What is your Zodiac symbol?");
        Scanner userinputstatquestion2 = new Scanner(System.in);
        statselectquestion2 = userinputstatquestion2.nextLine();
        statselectquestion2 = statselectquestion2.toLowerCase();
        if (statquestion2correct()) {
            statselectquestion3();
        } else {
            statselectquestion2();
        }
    }

    static void statselectquestion3() {
        System.out.println("Play the trumpet");
        Scanner userinputstatquestion3 = new Scanner(System.in);
        statselectquestion3 = userinputstatquestion3.nextLine();
        statselectquestion3 = statselectquestion3.toLowerCase();
        statselection();
    }

    static boolean statquestion2correct() {
        if (statselectquestion2.contains("ari") || statselectquestion2.contains("tau") || statselectquestion2.contains("gem")
                | statselectquestion2.contains("can") || statselectquestion2.contains("leo") || statselectquestion2.contains("vir")
                || statselectquestion2.contains("lib") || statselectquestion2.contains("sco") || statselectquestion2.contains("sag")
                || statselectquestion2.contains("cap") || statselectquestion2.contains("aqu") || statselectquestion2.contains("pis")) {
            return (true);
        } else {
            System.out.println("invalid answer try again");
            return (false);
        }
    }

    static void statselection() {
        if (playerclass.contains("fed")) {
            classiness = classiness + 5;
        }
        if (playerclass.contains("ske")) {
            litness = litness + 5;
        }
        if (playerclass.contains("ty")) {
            savagery = savagery + 5;
        }
        if (statselectquestion1.contains("rav") || statselectquestion1.contains("part")) {
            litness = litness + 3;
        }
        if (statselectquestion1.contains("barb") || statselectquestion1.contains("bbq")) {
            savagery = savagery + 3;
        }
        if (statselectquestion1.contains("red")) {
            classiness = classiness + 3;
        }
        if (statselectquestion2.contains("ari")) {
            savagery = savagery + 1;
            litness = litness + 2;
        }
        if (statselectquestion2.contains("tau")) {
            savagery = savagery + 2;
            classiness = classiness + 1;
        }
        if (statselectquestion2.contains("gem")) {
            trash = trash + 2;
            savagery = savagery + 1;
        }
        if (statselectquestion2.contains("can")) {
            trash = trash + 3;
        }
        if (statselectquestion2.contains("leo")) {
            classiness = classiness + 3;
        }
        if (statselectquestion2.contains("vir")) {
            litness = litness + 1;
            trash = trash + 2;
        }
        if (statselectquestion2.contains("lib")) {
            litness = litness + 3;
        }
        if (statselectquestion2.contains("sco")) {
            savagery = savagery + 3;
        }
        if (statselectquestion2.contains("sag")) {
            savagery = savagery + 1;
            litness = litness + 1;
            classiness = classiness + 1;
        }
        if (statselectquestion2.contains("cap")) {
            trash = trash + 2;
            savagery = savagery + 1;
        }
        if (statselectquestion2.contains("aqu")) {
            trash = trash + 1;
            classiness = classiness + 2;
        }
        if (statselectquestion2.contains("pic")) {
            classiness = classiness + 1;
            trash = trash + 1;
        }
        if (statselectquestion3.contains("oo")) {
            if (playerclass.contains("skeleton")) {
                litness = litness + 5;
                classiness = classiness + 5;
                savagery = savagery + 5;
                trash = trash - 3;
            } else {
                litness = litness + 3;
                classiness = classiness + 3;
                savagery = savagery + 3;
                playerhealth = playerhealth + 100;
            }
        }
        displaystats();
        intro();
    }

    //display stats
    static void displaystats() {
        System.out.println("Your litness is " + litness + "!");
        System.out.println("Your classiness is " + classiness + "!");
        System.out.println("Your savagery is " + savagery + "!");
        System.out.println("Your health is " + playerhealth + "!");
    }

    static void displayhealth() {
        System.out.println("Your current health is " + playerhealth + "!");
    }

    //actual game
    static void intro() {
        System.out.println("You start on your quest! opening the door all seem abandoned, you relax, only to be interupted by a skellington ready to fight!");
        combattutorialskellington();
    }

    static void dungeon1() {
        System.out.println("You walk up the stairs, there is a split path leading out, which do you choose? Left or right?");
        Scanner userinputdungeon1choice1 = new Scanner(System.in);
        dungeonB2choice1 = userinputdungeon1choice1.nextLine();
        dungeonB2choice1 = dungeonB2choice1.toLowerCase();
        if (dungeonB2choice1.contains("l")) {
            System.out.println("You proceed down the dark, wet hallway. You hear shackles in the distance. "
                    + "You find a skellington archer gaurding an inmate!");
            combatarcherskellington1();
        }
        if (dungeonB2choice1.contains("r")) {
            dungeon2();
        }
    }

    static void dungeonprisoner() {
        System.out.println("You defeat the skellington gaurd, and release the prisoner he joins you on your journey and will aid you in battle");
        //prisoners stats
        System.out.println("You meet Timothy, he was a smaller memer as was arrested for treason under King Doges new rule");
        System.out.println("Timothy knows a secret, it may help you sometime");
        JOHNCENAHEALTH = JOHNCENAHEALTH - 300;
        savagery = savagery + 2;
        classiness = classiness + 2;
        litness = litness + 3;
        trash = trash - 1;
        playerhealth = playerhealth + 50;
        prisoner1 = true;
        displaystats();
        System.out.println("You head back with your new friend and proceed to the right path");
        dungeon2();
    }

    static void dungeon2() {
        if (prisoner1) {
            System.out.println("You reach the stairs, both slowly proceed up the steps and reach another floor of dungeons.");
            System.out.println("You were capital offenders locked on the bottom for years. You see skeletons on the left and right, JOHN CENA guarding the stairs up to your escape.");
            dungeonB1choice1();
        } else {
            System.out.println("You hear cries for help downstairs, investigate??");
            Scanner userinputdungeonB1C2 = new Scanner(System.in);
            dungeonB2choice2 = userinputdungeonB1C2.nextLine();
            dungeonB2choice2 = dungeonB2choice2.toLowerCase();
            if (dungeonB2choice2.contains("y")) {
                dungeon1();
            } else {
                prisoner1 = true;
                dungeon2();
            }
        }
    }

    static void dungeonB1choice1() {
        System.out.println("Which way?");
        Scanner userinputdungeonB1 = new Scanner(System.in);
        dungeonB1choice1 = userinputdungeonB1.nextLine();
        dungeonB1choice1 = dungeonB1choice1.toLowerCase();
        if (dungeonB1choice1.contains("lef")) {
            System.out.println("The floor becomes wood and the walls become polished. A large armored skellington with a bow challenges you to a fight.");
            combatarmoredarcherskellington1();
        }
        if (dungeonB1choice1.contains("rig")) {
            System.out.println("The still water rises and the halls become decrepite and you find a skeleton equipped with an axe who stands his post");
            combatwarrior1skellington();
        }
        if (dungeonB1choice1.contains("for")) {
            System.out.println("You challenge JOHN CENA to a fight for your freedom");
            combatJOHNCENA();
        }
    }

    static void dungeonB1prisoner() {
        System.out.println("You defeat the skellington gaurd, and release the prisoner he joins you on your journey and will aid you in battle");
        //prisoners stats
        System.out.println("You meet Melvin a doctor who served for the Pepe Enthusists reTaking Alliance and will heal your team");
        savagery = savagery + 1;
        classiness = classiness + 1;
        litness = litness + 1;
        trash = trash - 1;
        playerhealth = playerhealth + 200;
        prisoner1 = true;
        displaystats();
        System.out.println("You head back with your new friend and proceed to the entrance");
        dungeonB1prisonerdone = true;
        dungeonB1prisonerdone = true;
        dungeonB1choice1();
    }

    static void dungeonB1armory() {
        if (dungeonB1armorydone) {
            dungeonB1choice1();
        } else {
            System.out.println("You find the gaurd's armory you eqiup weapons you find and get prepared for battle");
            savagery = savagery + 3;
            litness = litness + 1;
            trash = trash - 3;
            if (prisoner1) {
                savagery = savagery + 2;
                litness = litness + 1;
                trash = trash - 1;
            }
            if (prisoner2) {
                savagery = savagery + 2;
                litness = litness + 1;
                trash = trash - 1;
            }
            if (prisoner1 & prisoner2) {
                classiness = classiness + 3;
                trash = trash - 1;
            }
            displaystats();
            dungeonB1armorydone = true;
            dungeonB1choice1();
        }
    }

    static void combattutorialskellington() {
        while (playerhealth > 0) {
            currentcombatant = "A Simple Skellington";
            enemyhealth = simpleskellingtonhealth;
            litnessdefense = 3;
            savagerydefense = 3;
            classinessdefense = 3;

            if (enemyhealth > 0 & playerhealth > 0) {
                combatmarker();
                combatchoice();
                combatscenario();
            }
            if (enemyhealth > 0 & playerhealth > 0) {
                System.out.println("The simple skellinton swings and hits you for ten damage!!");
                playerhealth = playerhealth - 10;
                displayhealth();
                combattutorialskellington();
            }
            if (playerhealth <= 0) {
                battlelose();
            }
            if (enemyhealth <= 0) {
                battlewin();
                dungeon1();
            }
        }
    }

    static void combatarcherskellington1() {
        while (playerhealth > 0) {
            currentcombatant = "A Skellington Archer";
            enemyhealth = skellingtonarcher1health;
            litnessdefense = 4;
            savagerydefense = 4;
            classinessdefense = 5;

            if (enemyhealth > 0 & playerhealth > 0) {
                combatmarker();
                combatchoice();
                combatscenario();
            }
            if (enemyhealth > 0 & playerhealth > 0) {
                System.out.println("The skeleton archer shoots and hits you for tweleve damage!!");
                playerhealth = playerhealth - 12;
                displayhealth();
                combatarcherskellington1();
            }

            if (playerhealth <= 0) {
                battlelose();
            }

            if (enemyhealth <= 0) {
                battlewin();
                dungeonprisoner();
                dungeon2();
            }
        }
    }

    static void combatwarrior1skellington() {
        while (playerhealth > 0) {//#while
            if (dungeonB1prisonerdone) {
                dungeonB1choice1();
            } else {
                currentcombatant = "A Skellington Warrior";
                enemyhealth = skellingtonwarrior1health;
                litnessdefense = 4;
                savagerydefense = 6;
                classinessdefense = 4;

                if (enemyhealth > 0 & playerhealth > 0) {
                    combatmarker();
                    combatchoice();
                    combatscenario();
                }

                if (enemyhealth > 0 & playerhealth > 0) {
                    System.out.println("The skeleton warrior swings and hits you for fifteen damage!!");
                    playerhealth = playerhealth - 15;
                    displayhealth();
                    combatwarrior1skellington();
                }
                if (playerhealth <= 0) {
                    battlelose();
                }

                if (enemyhealth <= 0) {
                    battlewin();
                    dungeonB1prisoner();
                }
            }
        }
    }

    static void combatarmoredarcherskellington1() {
        while (playerhealth > 0) {
            currentcombatant = "An Armored Skellington Archer";
            enemyhealth = skellingtonarmoredarcher1health;
            litnessdefense = 6;
            savagerydefense = 6;
            classinessdefense = 7;

            if (enemyhealth > 0 & playerhealth > 0) {
                combatmarker();
                combatchoice();
                combatscenario();
            }

            if (enemyhealth > 0 & playerhealth > 0) {
                System.out.println("The armored skeleton archer shoots and hits you for tweleve damage!!");
                playerhealth = playerhealth - 12;
                displayhealth();
                combatarcherskellington1();
            }
            if (playerhealth <= 0) {
                battlelose();//#fortheloss
            }

            if (enemyhealth <= 0) {
                battlewin();
                dungeonB1armory();
            }
        }
    }

    static void combatJOHNCENA() {
        while (playerhealth > 0) {
            currentcombatant = "JOHN CENA";
            enemyhealth = JOHNCENAHEALTH;
            litnessdefense = 10;
            savagerydefense = 10;
            classinessdefense = 10;

            if (enemyhealth > 0 & playerhealth > 0) {
                CENAmarker();
                combatchoice();
                combatscenario();
            }

            if (trash < 6 & enemyhealth > 0 & playerhealth > 0) {
                System.out.println("JOHN CENA hits you for twenty five damage!!");
                playerhealth = playerhealth - 25;
                displayhealth();
                combatJOHNCENA();
            }
            if (trash >= 6 & enemyhealth > 0 & playerhealth > 0) {
                System.out.println("JOHN CENA hits you for fifty damage!!");
                playerhealth = playerhealth - 50;
                displayhealth();
                combatJOHNCENA();
            }

            if (playerhealth <= 0) {
                CENALOSE();//#forthewin
            }
        }
    }

    //combat system
    static void combatmarker() {
        System.out.println("  ____ ___ __    ______    _  _____");
        System.out.println(" / ___/ _ \\| \\  / | __ )  / \\|_   _|");
        System.out.println("| |  | | | | |\\/| | __ \\ / _ \\ | |  ");
        System.out.println("| |__| |_| | |  | ||__) / ___ \\| | ");
        System.out.println(" \\____\\___/|_|  |_|____/_/   \\_\\_| ");
        System.out.println(currentcombatant + " would like to fight!!");
    }

    static void CENAmarker() {
        System.out.println("             _        _            _       _    _                     _             _            _             _          ");
        System.out.println("            /\\ \\     /\\ \\         / /\\    / /\\ /\\ \\     _           /\\ \\           /\\ \\         /\\ \\     _    / /\\");
        System.out.println("            \\ \\ \\   /  \\ \\       / / /   / / //  \\ \\   /\\_\\        /  \\ \\         /  \\ \\       /  \\ \\   /\\_\\ / /  \\       ");
        System.out.println("            /\\ \\_\\ / /\\ \\ \\     / /_/   / / // /\\ \\ \\_/ / /       / /\\ \\ \\       / /\\ \\ \\     / /\\ \\ \\_/ / // / /\\ \\      ");
        System.out.println("           / /\\/_// / /\\ \\ \\   / /\\ \\__/ / // / /\\ \\___/ /       / / /\\ \\ \\     / / /\\ \\_\\   / / /\\ \\___/ // / /\\ \\ \\");
        System.out.println("  _       / / /  / / /  \\ \\_\\ / /\\ \\___\\/ // / /  \\/____/       / / /  \\ \\_\\   / /_/_ \\/_/  / / /  \\/____// / /  \\ \\ \\    ");
        System.out.println(" /\\ \\    / / /  / / /   / / // / /\\/___/ // / /    / / /       / / /    \\/_/  / /____/\\    / / /    / / // / /___/ /\\ \\   ");
        System.out.println(" \\ \\_\\  / / /  / / /   / / // / /   / / // / /    / / /       / / /          / /\\____\\/   / / /    / / // / /_____/ /\\ \\  ");
        System.out.println(" / / /_/ / /  / / /___/ / // / /   / / // / /    / / /       / / /________  / / /______  / / /    / / // /_________/\\ \\ \\ ");
        System.out.println("/ / /__\\/ /  / / /____\\/ // / /   / / // / /    / / /       / / /_________\\/ / /_______\\/ / /    / / // / /_       __\\ \\_\\");
        System.out.println("\\/_______/   \\/_________/ \\/_/    \\/_/ \\/_/     \\/_/        \\/____________/\\/__________/\\/_/     \\/_/ \\_\\___\\     /____/_/");
    }

    static void combatchoice() {
        System.out.println("Choose your method of attack");
        System.out.println("Break dance battle!!");
        System.out.println("Roast session!!!");
        System.out.println("A civil discussion over politics.");
        Scanner userinputcombatchoice = new Scanner(System.in);
        combatchoice = userinputcombatchoice.nextLine();
        combatchoice = combatchoice.toLowerCase();
    }

    static void combatscenario() {
        if (combatchoice.contains("b") || combatchoice.contains("dan")) {
            damage = litness * 5 - litnessdefense * 6;
            if (litness > litnessdefense) {
                System.out.println("You smack him for " + damage + "damage!");
                enemyhealth = enemyhealth - damage;
            } else {
                System.out.println("Your attack was inferior!");
            }
        }
        if (combatchoice.contains("roa")) {
            damage = savagery * 5 - savagerydefense * 6;
            if (savagery > savagerydefense) {
                System.out.println("You smack him for " + damage + "damage!");
                enemyhealth = enemyhealth - damage;
            } else {
                System.out.println("Your attack was inferior!");
            }
        }
        if (combatchoice.contains("dis") || combatchoice.contains("civ") || combatchoice.contains("pol")) {
            damage = classiness * 5 - classinessdefense * 6;
            if (classiness > classinessdefense) {
                System.out.println("You smack him for " + damage + "damage!");
                enemyhealth = enemyhealth - damage;
            } else {
                System.out.println("Your attack was inferior!");
            }
        }
    }

    static void battlewin() {
        System.out.println("You have defeated " + currentcombatant + ", you triumph to victory!");
        displayhealth();
    }

    static void battlelose() {//#loss
        System.out.println("MM'\"\"\"\"\"`MM MMP\"\"\"\"\"\"\"MM M\"\"\"\"\"`'\"\"\"`YM MM\"\"\"\"\"\"\"\"`M MMP\"\"\"\"\"YMM M\"\"MMMMM\"\"M MM\"\"\"\"\"\"\"\"`M MM\"\"\"\"\"\"\"`MM");
        System.out.println("M' .mmm. `M M' .mmmm  MM M  mm.  mm.  M MM  mmmmmmmM M' .mmm. `M M  MMMMM  M MM  mmmmmmmM MM  mmmm,  M ");
        System.out.println("M  MMMMMMMM M         `M M  MMM  MMM  M M`      MMMM M  MMMMM  M M  MMMMP  M M`      MMMM M'        .M ");
        System.out.println("M  MMM   `M M  MMMMM  MM M  MMM  MMM  M MM  MMMMMMMM M  MMMMM  M M  MMMM' .M MM  MMMMMMMM MM  MMMb. \"M     ");
        System.out.println("M. `MMM' .M M  MMMMM  MM M  MMM  MMM  M MM  MMMMMMMM M. `MMM' .M M  MMP' .MM MM  MMMMMMMM MM  MMMMM  M ");
        System.out.println("MM.     .MM M  MMMMM  MM M  MMM  MMM  M MM        .M MMb     dMM M     .dMMM MM        .M MM  MMMMM  M ");
        System.out.println("MMMMMMMMMMM MMMMMMMMMMMM MMMMMMMMMMMMMM MMMMMMMMMMMM MMMMMMMMMMM MMMMMMMMMMM MMMMMMMMMMMM MMMMMMMMMMMM ");
        System.out.println("Your journey was haulted by " + currentcombatant);
    }

    static void CENALOSE() {//#win
        System.out.println("░░░░░░░▐█▀█▄░░░░░░░░░░▄█▀█▌ ");
        System.out.println("░░░░░░░█▐▓░█▄░░░░░░░▄█▀▄▓▐█ ");
        System.out.println("░░░░░░░█▐▓▓░████▄▄▄█▀▄▓▓▓▌█ ");
        System.out.println("░░░░░▄█▌▀▄▓▓▄▄▄▄▀▀▀▄▓▓▓▓▓▌█ ");
        System.out.println("░░░▄█▀▀▄▓█▓▓▓▓▓▓▓▓▓▓▓▓▀░▓▌█ ");
        System.out.println("░░█▀▄▓▓▓███▓▓▓███▓▓▓▄░░▄▓▐█▌");
        System.out.println("░█▌▓▓▓▀▀▓▓▓▓███▓▓▓▓▓▓▓▄▀▓▓▐█ ");
        System.out.println("▐█▐██▐░▄▓▓▓▓▓▀▄░▀▓▓▓▓▓▓▓▓▓▌█▌ ");
        System.out.println("█▌███▓▓▓▓▓▓▓▓▐░░▄▓▓███▓▓▓▄▀▐█ ");
        System.out.println("█▐█▓▀░░▀▓▓▓▓▓▓▓▓▓██████▓▓▓▓▐█▌ ");
        System.out.println("▓▄▌▀░▀░▐▀█▄▓▓██████████▓▓▓▌█");
        System.out.println("You miss your noscope and have been locked up again. but doge will be defeated. one day.");
    }
}
