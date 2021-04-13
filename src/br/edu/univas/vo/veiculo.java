package br.edu.univas.vo;

public class veiculo {
	private String cor;
    private int anoFab;
    private int anoModelo;
    private motor motor;
    private int velocidadeAtual;

    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public int getanofab() {
        return anoFab;
    }

    public void setanofab(int anoFab) {
        this.anoFab = anoFab;
    }

    public int getanomodelo() {
        return anoModelo;
    }

    public void setanomodelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public motor getmotor() {
        return motor;
    }

    public void setmotor(motor motor) {
        this.motor = motor;
    }

    public int getvelocidadeatual() {
        return velocidadeAtual;
    }

    public void setvelocidadeatual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int valor) {
        this.setvelocidadeatual(velocidadeAtual + valor);
    }

    public void frear(int valor) {
        this.setvelocidadeatual(velocidadeAtual - valor);
    }
}
