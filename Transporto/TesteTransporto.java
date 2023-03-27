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
public class TesteTransporto {
    public static void main(String[] args){
        Carreta carreta1 = new Carreta("Scania");
        Caminhoneiro c1 = new Caminhoneiro("Luiz Silvério","785.741.569-98", "321654874", 147.800);
        Viagem viagem1 = new Viagem(6,60,"Paraguaçu");
        Cliente cliente1 = new Cliente("Daiana", c1, viagem1,carreta1);
      
        viagem1.calcularViagem();
        cliente1.visualizarViagem();
        
       
    }
}
