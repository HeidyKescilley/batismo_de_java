package NivelIntermediario.DesafiosIa.DesafioDois;

public class Main {
    public static void main(String[] args) {

        IHashira[] hashiraList = new IHashira[2];

        hashiraList[0] = new GiyuTomioka();
        hashiraList[1] = new RengokuKyojuro();

        for (int i = 0; i < hashiraList.length; i++) {
            hashiraList[i].performBreathingTechnique();
        }

    }
}
