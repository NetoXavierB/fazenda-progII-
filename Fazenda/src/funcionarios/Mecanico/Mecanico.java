/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios.Mecanico;

import funcionarios.Funcionario;
import funcionarios.iTrabalhando;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Mecanico extends Funcionario implements iTrabalhando{
    
    //-------------------------------------------
    //Sobrescrita - Mesma assinatura, classes diferentes
    @Override
    public void Falar(){//Método herdado de FUNCIONARIO
        JOptionPane.showMessageDialog(null, "Concertando");
    }
    //-------------------------------------------

    @Override
    public void trabalhar() {
        JOptionPane.showMessageDialog(null, "Estou trabalhando!");
    }
    
}
