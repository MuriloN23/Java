package heranca;

import java.util.ArrayList;

public class Exercicio1 {
    private ArrayList<Usuario> usuarios;

    public Exercicio1() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void listar() {
        System.out.println("Listando todos os usuários:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }
    }

    public void listar(int x) {
        if (x < 0 || x >= usuarios.size()) {
            System.out.println("Posição inválida.");
            return;
        }

        System.out.println("Listando a partir da posição " + x + ":");
        for (int i = x; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).getNome());
        }
    }


    public void listar(int x, int y) {
        if (x < 0 || x >= usuarios.size() || y < 0 || y >= usuarios.size()) {
            System.out.println("Posições inválidas.");
            return;
        }

        System.out.println("Listando entre as posições " + x + " e " + y + ":");
        for (int i = x; i <= y; i++) {
            System.out.println(usuarios.get(i).getNome());
        }
    }

    public static void main(String[] args) {
    	Exercicio1 lista = new Exercicio1();

        lista.adicionarUsuario(new Usuario("Murilo"));
        lista.adicionarUsuario(new Usuario("Carlos"));
        lista.adicionarUsuario(new Usuario("Novais"));
        lista.adicionarUsuario(new Usuario("Goku"));
        lista.adicionarUsuario(new Usuario("Naruto"));
        lista.adicionarUsuario(new Usuario("Son"));
        lista.adicionarUsuario(new Usuario("Tiago"));
        lista.adicionarUsuario(new Usuario("Degas"));


        lista.listar();
        System.out.println();
        lista.listar(1);
        System.out.println();
        lista.listar(0, 2);
        System.out.println();
        lista.listar(4, 6);
        System.out.println();
        lista.listar(5, 7);
    }
}

class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
