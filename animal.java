class animal {

    private String nome;

    public animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("O bixo ta latindo");
    }

    public String getNome() {
        return nome;
    }

    class salsicha extends animal {
        public salsicha(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println(getNome() + "wof wof");
        }
    }

    class bixano extends animal {

        public bixano(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println(getNome() + "MIAAAAAU");
        }
    }

    public class bixos {
        public void main(String[] args) {
            animal meuToto = new salsicha("scooby");
            animal meuBixano = new bixano("xanin");
            meuToto.emitirSom();
            meuBixano.emitirSom();
        }

    }
}