package funcionarios;

public class Funcionario {
    
    protected String nomeComp;
    protected String cpf;
    protected String funcao;

    //-------------------------------------------
    //SOPBRECARGA - Mesma classe, assinaturas diferentes
    public Funcionario() {} //Construtor - Mesmo nome da classe, pode ou não ter paramentros.
    
    public Funcionario(String nomeComp, String cpf, String funcao) {
        this.nomeComp = nomeComp;
        this.cpf = cpf;
        this.funcao = funcao;
    }
    //-------------------------------------------
    
    
    //Sobrescrita - Mesma assinatura, classes diferentes
    public void Falar(){
        
    }
    //-------------------------------------------
    
    public String getNomeComp() {
        return nomeComp;
    }

    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    


    
    
}
