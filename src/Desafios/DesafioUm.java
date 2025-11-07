package Desafios;

public class DesafioUm {
    public static void main(String[] args) {
        String nameNinja1 = "Narutin";
        short ageNinja1 = 17;
        String missionNinja1 = "Take the old man to the village.";
        Boolean ConclusionStatus1 = false;
        char MissionRank1 = 'A';

        String nameNinja2 = "Tenten";
        short ageNinja2 = 14;
        String missionNinja2 = "Defend the village against Pain.";
        Boolean ConclusionStatus2 = false;
        char MissionRank2 = 'S';

        String nameNinja3 = "Konohamaru";
        short ageNinja3 = 13;
        String missionNinja3 = "Rescue the cat from a tree.";
        Boolean ConclusionStatus3 = false;
        char MissionRank3 = 'C';

        if (MissionRank1 == 'C' || MissionRank1 == 'D') {
            ConclusionStatus1 = true;
            //System.out.println("Mission accomplished: " + missionNinja1);
      ;  } if (ageNinja1 >= 15) {
            ConclusionStatus1 = true;
            //System.out.println("Mission accomplished: " + missionNinja1);
        } else {
            //System.out.println("Não vai dar não...");
        }

        if (MissionRank2 == 'C' || MissionRank2 == 'D') {
            ConclusionStatus2 = true;
            //System.out.println("Mission accomplished: " + missionNinja2);
            ;  } if (ageNinja2 >= 15) {
            ConclusionStatus2 = true;
            //System.out.println("Mission accomplished: " + missionNinja2);
        } else {
            //System.out.println("Não vai dar não...");
        }

        if (MissionRank3 == 'C' || MissionRank3 == 'D') {
            ConclusionStatus3 = true;
            //System.out.println("Mission accomplished: " + missionNinja3);
            ;  } if (ageNinja3 >= 15) {
            ConclusionStatus3 = true;
            //System.out.println("Mission accomplished: " + missionNinja3);
        } else {
            //System.out.println("Não vai dar não...");
        }

        System.out.println("Ninja 1: " + nameNinja1 + "\nAge: " + ageNinja1 + " yo" + "\nMission: " + missionNinja1 + " rank " + MissionRank1 + "\nMission accomplished: " + ConclusionStatus1 + "\n\n");
        System.out.println("Ninja 2: " + nameNinja2 + "\nAge: " + ageNinja2 + " yo" + "\nMission: " + missionNinja2 + " rank " + MissionRank2 + "\nMission accomplished: " + ConclusionStatus2 + "\n\n");
        System.out.println("Ninja 3: " + nameNinja3 + "\nAge: " + ageNinja3 + " yo" + "\nMission: " + missionNinja3 + " rank " + MissionRank3 + "\nMission accomplished: " + ConclusionStatus3 + "\n\n");
    }
}
