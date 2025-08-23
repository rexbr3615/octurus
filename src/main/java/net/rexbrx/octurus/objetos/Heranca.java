package net.rexbrx.octurus.objetos;

public class Heranca {
    public static void main(String[] args) {
        Texugo texu = new Texugo();
        texu.nome = "Lucas"; // herdado da classe Animal
        texu.comer();      // herdado da classe Animal
        texu.morder();      // método da classe texu
    }
}
