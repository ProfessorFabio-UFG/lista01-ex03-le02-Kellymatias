

import java.util.ArrayList;

public class CadastroMoradores {
    public static void main(String[] args) {
        ArrayList<Morador> moradores = new ArrayList<>();

        moradores.add(new Morador("Ana", 25, "A101"));
        moradores.add(new Morador("Bruno", 32, "B202"));
        moradores.add(new Morador("Carlos", 28, "C303"));

        System.out.println("Moradores cadastrados:");
        for (Morador m : moradores) {
            System.out.println(m);
        }
    }
}
