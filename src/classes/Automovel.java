/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alunoces
 */
public class Automovel {
    private String placa;
    private String modelo;
    private Date datafabricacao;
    private String motorizacao;
    private float valorbasico;
    private String categoria;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Automovel(String placa, String modelo, Date datafabricacao, String motorizacao, float valorbasico, String categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.datafabricacao = datafabricacao;
        this.motorizacao = motorizacao;
        this.valorbasico = valorbasico;
        this.categoria = categoria;
    }

    public Automovel() {
    }
    
    public float calcularImposto(float aliquota){
        
        return valorbasico*(aliquota/100) + 0.03f;
    }
    
    public float valorTotalVeiculo(float aliquota){
        return valorbasico+(valorbasico*0.05f) + calcularImposto(aliquota);
    }
    
    @Override
    public String toString(){
        String str = "";
        
        str += "Placa: " + placa + "\n";
        str += "Modelo: " + modelo + "\n";
        str += "Data de Fabricação: " + sdf.format(datafabricacao) + "\n";
        str += "Motorização: " + motorizacao + "\n";
        str += "Valor básico: " + valorbasico + "\n";
        str += "Categoria: " + categoria + "\n";
       
        return str;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(Date datafabricacao) {
        this.datafabricacao = datafabricacao;
    }

    public String getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(String motorizacao) {
        this.motorizacao = motorizacao;
    }

    public float getValorbasico() {
        return valorbasico;
    }

    public void setValorbasico(float valorbasico) {
        this.valorbasico = valorbasico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
