public class Personagem {
    private String nome;
    private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    private int energia;

    public Personagem(String nome, int vida, int energia, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.nivel = nivel;
    }

    private int nivel;

}