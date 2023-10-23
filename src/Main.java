

public class Main {
    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("Antonio");
        Pessoa pessoa2 = new Pessoa("Teodoro", pessoa1);
        Pessoa pessoa3 = new Pessoa("Francisco", pessoa2);
        Pessoa pessoa4 = new Pessoa("Fabio", pessoa3);
        Pessoa pessoa5 = new Pessoa("Yuri", pessoa4);


        var aux = pessoa5.getPai();

        for (int i = 0; i < 4; i++) {
            if (aux.getNome() == "Antonio") {
                System.out.println("O nome do seu tataravô  é : " + aux.getNome());
                break;
            } else {
                System.out.println(aux.getNome());
                aux = aux.getPai();

            }

        }



    }
}