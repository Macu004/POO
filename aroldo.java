public class aroldo extends main {
    public aroldo(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("meu cachorro late oia");
    }

    public static void main(String[] args) {
        aroldo aroldo = new aroldo("aroldo", 3, "pug");
        aroldo.emitirSom();
    }
}