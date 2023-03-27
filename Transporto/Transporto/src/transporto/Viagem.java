/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporto;

/**
 *
 * @author 15385404608
 */
public class Viagem {
    private String destino;
    private double valorKm;
    private double valorViagem;
    private double distancia;
    
    public Viagem(double valorKm, double distancia, String destino){
        this.destino = destino;
        this.valorKm = valorKm;
        this.distancia = distancia;
       
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the valorKm
     */
    public double getValorKm() {
        return valorKm;
    }

    /**
     * @param valorKm the valorKm to set
     */
    public void setValorKm(double valorKm) {
        this.valorKm = valorKm;
    }

    /**
     * @return the valorViagem
     */
    public double getValorViagem() {
        return valorViagem;
    }

    /**
     * @param valorViagem the valorViagem to set
     */
    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public void calcularViagem(){
        this.setValorViagem(this.getValorKm()* this.getDistancia());
    }
}

