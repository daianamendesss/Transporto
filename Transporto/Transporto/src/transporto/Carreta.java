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
public class Carreta {
    private String cor;
    private String modeloCarreta;
    
    public Carreta(String modeloCarreta){
        this.modeloCarreta = modeloCarreta;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the modeloCarreta
     */
    public String getModeloCarreta() {
        return modeloCarreta;
    }

    /**
     * @param modeloCarreta the modeloCarreta to set
     */
    public void setModeloCarreta(String modeloCarreta) {
        this.modeloCarreta = modeloCarreta;
    }
    
}
