import java.util.*;
import java.util.Scanner;

public class RPG_game
{
    public static void main (String [] args){
        //SYstem Objects

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        //Game Variable

        String [] enemies = {"Skeleton", "Zombie","Warrior","Assassin", "Giant Rat"};
        int maxEnemyHealth = 70;
        int enemyAttackDamage = 25;

        //Player Variables
        
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50;

        boolean running = true;

        System.out.println("You are in the Dungeon");

        GAME:

        while(running){
            System.out.println("--------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[(rand.nextInt(enemies.length))];
            System.out.println("\t Your HP: " + health);
            System.out.println("\t The " + enemy + " Has appeared  enemy has HP: " + enemyHealth);
            System.out.println("\n\t What would you like to do? ");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Drink Health Potion");
            System.out.println("\t3. Run!");

            String input = in.nextLine();
            if(input.equals("1")){
                int damageDealt = rand.nextInt(attackDamage);
                int damageTaken = rand.nextInt(enemyAttackDamage);

                enemyHealth -= damageDealt;
                health -= damageTaken;

                System.out.println("\t>. You strike the" + enemy + " for " + damageDealt + " damage.");
                System.out.println("\t>. You recieved " + damageTaken + " Damage");

                if(health < 1){
                    System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                    break;
                }
            }
            else if(input.equals ("2")){
                if(numHealthPotions > 0){
                    health += healthPotionHealAmount;
                    numHealthPotions--;
                    System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount
                        + "\n\t> You now have " + health + " HP."
                        + "\n\t> You have " + numHealthPotions + "Health Potions Left .\n");
                }
                else{
                    System.out.println("\t> You have no health potions left! Defeat more enemies for a chance to get a new health potions!");
                }
            }
            else if(input.equals("3")){
                System.out.println("\t You run away form the " + enemy + "!");
                continue GAME;
            }
            else{
                System.out.println("\t Invalid Command!");
            }

            if(health < 1){
                System.out.println("You limp out of the dungeon, weak form battle");
                break;
            }
            System.out.println("-------------------------------------------");
            System.out.println(" # " + enemy + "was defeated! # ");
            System.out.println(" # You have " + health + " left. # ");
            if(rand.nextInt(100) < healthPotionDropChance){
                numHealthPotions++;
                System.out.println("# The " + enemy + " dropped a health potion #");
                System.out.println("# You now have " + numHealthPotions + " health potions #");
            }
            System.out.println("-------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting?");
            System.out.println("2. Exit Dungeon");

            String input2 = in.nextLine();

            while(!input2.equals("1") && !input2.equals("2")){
                System.out.println("Invalid Command!");
                input = in.nextLine();
            }
            if(input2.equals("1")){
                System.out.println("You continued your adventure");
            }
            else if(input2.equals("2")){
                System.out.println("You exit your dungeon successfully!!");
                break;
            }
        }
        System.out.println("----------------------------");
        System.out.println("Thank you for playng !!!!");
        System.out.println("----------------------------");
    }

}

