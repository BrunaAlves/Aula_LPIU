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
        this.codigo = "sd";
        this.modelo = "";
        this.nome = "";
    }
    
    public float calcularValorMulta(int quantidadeDiasLocados){
        float valormulta = 0;
        
        if(quantidadeDiasLocados > diasLocacao){
            valormulta = (quantidadeDiasLocados - diasLocacao) * 0.15f;
            return valormulta;
        }
        
        return valormulta;

    }
    
    public float valorTotalAluguel(int quantidadeDiasLocados){
        float valortotal = 0;
        
        valortotal = valorLocacao + calcularValorMulta(quantidadeDiasLocados);
                
        return valortotal;
    }
    
}
