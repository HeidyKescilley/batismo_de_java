package TiposDeDados;

public class Array {
    public static void main(String[] args) {

        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        ninja = new String[7];

        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Tobirama Senju";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tesunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

        System.out.println(ninja[7]);

        for (int i = 0; i < ninja.length; i++) {
            System.out.println("Ninja " + (i+1) + ": " + ninja[i]);
        }


    }
}
