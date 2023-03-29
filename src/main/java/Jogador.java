import org.example.*;

public class Jogador implements Cloneable{
    private int id;
    private String nome;
    private Classe classe;
    private String nivel;

    public Jogador(int id, String nome, Classe classe, String nivel){
        this.id = id;
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Classe getClasse(){
        return classe;
    }

    public void setClasse(Classe classe){
        this.classe = classe;
    }

    public String getNivel(){
        return nivel;
    }

    public void setNivel(String nivel){
        this.nivel = nivel;
    }

    @Override
    public Jogador clone() throws CloneNotSupportedException{
        Jogador jogadorClone = (Jogador) super.clone();
        jogadorClone.classe = (Classe) jogadorClone.classe.clone();
        return jogadorClone;
    }

    @Override
    public String toString(){
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", classe=" + classe +
                ", nivel='" + nivel + '\'' +
                '}';
    }
}
