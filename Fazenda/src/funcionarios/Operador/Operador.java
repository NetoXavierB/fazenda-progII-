package funcionarios.Operador;

import funcionarios.Funcionario;
import funcionarios.iTrabalhando;
import javax.swing.JOptionPane;


public class Operador extends Funcionario implements iTrabalhando{
    protected String hab;
    
    
    //-------------------------------------------
    //Sobrescrita - Mesma assinatura, classes diferentes
    @Override
    public void Falar(){ //Método herdado de FUNCIONARIO
        JOptionPane.showMessageDialog(null, "Dirigindo");
    }
    //-------------------------------------------
    
    public Operador(){
    }
    
    public Operador(String hab, String nomeComp, String cpf, String funcao) {
        super(nomeComp, cpf, funcao);
        this.hab = hab;
    }

    public String getHab() {
        return hab;
    }

    public void setHab(String hab) {
        this.hab = hab;
    }

    @Override
    public void trabalhar() {
        JOptionPane.showMessageDialog(null, "Estou Dirigindo!");
    }
    
    
}
