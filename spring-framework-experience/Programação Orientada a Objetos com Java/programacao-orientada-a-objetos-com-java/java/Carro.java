public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int velocidade;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = 0;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void acelerar() {
        if (this.ligado) {
            this.velocidade += 10;
        }
    }

    public void frear() {
        if (this.ligado) {
            this.velocidade -= 10;
        }
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public boolean isLigado() {
        return this.ligado;
    }
}
