/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author alunoces
 */
public class Carro {
    private String codigo;
    private String nome;
    private String marca;
    private String modelo;
    private float preco;
    private float valorLocacao;
    private int diasLocacao;
    
    public Carro() {
        marca ="Fiat";
        modelo ="Sedan";
        diasLocacao = 10;
           
    }

    public Carro(String codigo, String nome, String marca, String modelo, float preco, float valorLocacao, int diasLocacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.valorLocacao = valorLocacao;
        this.diasLocacao = diasLocacao;
    }
    
    public float calcularValorMulta(int dias)
    {
        if(dias > getDiasLocacao()){
            return (dias-getDiasLocacao()) * 0.15f*getValorLocacao();
        }
        
        return 0;

    }
    
    public float valorTotalAluguel(int dias){
        return getDiasLocacao()*getValorLocacao() + calcularValorMulta(dias);
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the valorLocacao
     */
    public float getValorLocacao() {
        return valorLocacao;
    }

    /**
     * @param valorLocacao the valorLocacao to set
     */
    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    /**
     * @return the diasLocacao
     */
    public int getDiasLocacao() {
        return diasLocacao;
    }

    /**
     * @param diasLocacao the diasLocacao to set
     */
    public void setDiasLocacao(int diasLocacao) {
        this.diasLocacao = diasLocacao;
    }
    
    
}
