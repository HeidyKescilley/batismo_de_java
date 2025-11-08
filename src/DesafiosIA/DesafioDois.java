package DesafiosIA;

import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char wantContinue = 'y';
        short membersCount = 0;

        System.out.println("Let's assemble our crew! What is your name, captain?");
        String captainName = input.nextLine();

        while (wantContinue == 'y') {
            System.out.println("Captain, what's the name of the new crewmate?");
            String newMember = input.nextLine();
            System.out.println("What's the member's role?\n1 - Swordsman\n2 - Navigator\n3 - Cook\n4 - Sniper");
            int newMemberRole = input.nextInt();
            input.nextLine();

            switch (newMemberRole) {
                case 1:
                    System.out.println(newMember + ", the Swordsman, has joined the crew!");
                    break;
                case 2:
                    System.out.println(newMember + ", the Navigator, has joined the crew!");
                    break;
                case 3:
                    System.out.println(newMember + ", the Cook, has joined the crew!");
                    break;
                case 4:
                    System.out.println(newMember + ", the Sniper, has joined the crew!");
                    break;
                default:
                    System.out.println("A new crewmate has joined!");
            }

            membersCount++;

            System.out.println("Captain " + captainName + " do you want to assemble a new crew? (y/n)");
            String response = input.nextLine();

            switch (response) {
                case "y":
                    System.out.println("We already " + membersCount + " members!");
                    break;
                case "n":
                    wantContinue = 'n';
                    System.out.println("The Straw Hat Crew now has " + membersCount + " members");
                    break;
                default:
                    System.out.println("Invalid option, try again!");
            }
        }


    }
}
