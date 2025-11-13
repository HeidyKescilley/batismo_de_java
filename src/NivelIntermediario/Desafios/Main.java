package NivelIntermediario.Desafios;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.age = 17;
        sasuke.habilidadeEspecial = "Susano";
        sasuke.mission = "Matar o Itcahi";
        sasuke.difficultLevel = "Rank S";
        sasuke.missionStatus = "em andamento";
        sasuke.mostrarInformacoes();

        Uchiha itachi = new Uchiha();
        itachi.name = "Itachi Uchiha";
        itachi.age = 22;
        itachi.habilidadeEspecial = "Amaterasu";
        itachi.mission = "Proteger meu irmão";
        itachi.difficultLevel = "Rank ?";
        itachi.missionStatus = "em andamento";
        itachi.mostrarInformacoes();

        Ninja naruto = new Ninja();
        naruto.name = "Naruto Usumaki";
        naruto.age = 16;
        naruto.mission = "Virar prefeito";
        naruto.difficultLevel = "Rank S";
        naruto.missionStatus = "em andamento";
        naruto.mostrarInformacoes();

    }
}
