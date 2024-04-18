public class Pessoa {


    private int idade;
    private String nome;

    public Pessoa(String n, int i ){
        this.nome = n;
        this.idade = i;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public void fazerAniversario(){

        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void dizerOla(){
        System.out.println("Olá");
    }
}
