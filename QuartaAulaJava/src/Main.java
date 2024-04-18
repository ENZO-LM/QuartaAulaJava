import javax.swing.*;

/*
public class Main {
    static void escreverOi(){
        JOptionPane.showMessageDialog(null, "Oi");
    }

    public static void main(String[] args) {
        escreverOi();
    }
}*/
/*

public class Main {
    static void escrever(String t){
        JOptionPane.showMessageDialog(null, t);
    }

    public static void main(String[] args) {
        escrever("Oi gente");
    }
}*/
/*
public class Main {
    static void escrever(String t){
        JOptionPane.showMessageDialog(null, t);
    }

    static float media(int a, int b){
        float soma = (float) a+b;
        return soma/2;
    }

    public static void main(String[] args) {
        escrever("Oi gente");
        System.out.println(media(3, 8));
    }

}*/

import java.util.ArrayList;

public class Main {

    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) {

        for(int i=0; i<3; i++){

            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa: "+(i+1));
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
            Pessoa p = new Pessoa(nome, idade);
            pessoas.add(p);
        }
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println();
        }
    }
}





