package fazenda;

import funcionarios.Funcionario;
import funcionarios.Mecanico.Mecanico;
import funcionarios.Operador.Operador;
import implementos.Colhedeira.Colhedeira;
import implementos.Plantadeira.Plantadeira;
import implementos.Trator.Trator;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import silo.Milho.SiloMilho;
import silo.Soja.SiloSoja;
import silo.Trigo.SiloTrigo;


public class Fazenda {
    ArrayList<Funcionario> funcionarios;
    ArrayList<Trator> trator;
    ArrayList<Colhedeira> colhedeira;
    ArrayList<Plantadeira> plantadeira;
    ArrayList<SiloSoja> siloSoja;
    ArrayList<SiloTrigo> siloTrigo;
    ArrayList<SiloMilho> siloMilho;
    ArrayList<Operador> operador;
    ArrayList<Mecanico> mecanico;
    
    public static void main(String[] args) {
        
        int resp = 0; //Variável para receber a resposta do usuário sobre o menu.
        //Instanciando um objeto
        Fazenda fzd = new Fazenda(); 
        fzd.funcionarios = new ArrayList<>(); 
        fzd.trator = new ArrayList<>(); 
        fzd.colhedeira = new ArrayList<>(); 
        fzd.plantadeira = new ArrayList<>(); 
        fzd.siloMilho = new ArrayList<>(); 
        fzd.siloSoja = new ArrayList<>(); 
        fzd.siloTrigo = new ArrayList<>(); 
        fzd.operador = new ArrayList<>(); 
        fzd.mecanico = new ArrayList<>();
        Random gerador = new Random();
        
        
        
        //MENU PRINCIPAL
        do{
            resp = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n"
               + "1 - Cadastrar Funcionário\n"
               + "2 - Exibir Funcionários\n"
               + "3 - Cadastrar Maquinário | Implemento\n"
               + "4 - Exibir Maquinário | Implemento\n"
               + "5 - Silo\n"
               + "6 - Excluir\n"
               + "8 - Sair"));
            
            switch(resp){
                case 1: 
                    fzd.cadastrarFuncionario();
                    break;
                    
                    
                case 3:// - - - - - - - - - CADASTRAR MAQUINÁRIO - - - - - - - -
                    resp = Integer.parseInt(JOptionPane.showInputDialog("Tipo: \n"
                        + "1 - Trator\n"
                        + "2 - Colhedeira\n"
                        + "3 - Plantadeira\n"
                        + "4 - Voltar"));
                    switch(resp){
                        case 1:
                            fzd.cadastrarTrator(fzd.gerarCodigo()); //CADASTRANDO TRATOR
                            break;
                            
                        case 2:
                            fzd.cadastrarColhedeira(fzd.gerarCodigo()); //CADASTRANDO COLHEDEIRA
                            break;
                            
                        case 3:
                            fzd.cadastrarPlantadeira(fzd.gerarCodigo()); //CADASTRANDO PLANTADEIRA
                            break;
                        default:
                            break;
                    }
                    break;
                    
                    
                case 2:// - - - - - - - - - EXIBIR FUNCIONÁRIO - - - - - - - -
                    fzd.exibirFuncionario();
                    break;
                    
                    
                case 4:// - - - - - - - - - EXIBIR MAQUINÁRIO - - - - - - - -
                    resp = Integer.parseInt(JOptionPane.showInputDialog("Tipo: \n"
                        + "1 - Trator\n"
                        + "2 - Colhedeira\n"
                        + "3 - Plantadeira"));
                    switch(resp){
                        case 1:
                            fzd.exibirTrator();
                            break;
                        case 2:
                            fzd.exibirColhedeira();
                            break;
                        case 3:
                            fzd.exibirPlantadeira();
                            break;
                    }
                    break;
                    
                
                case 6:// - - - - - - - - - EXCLUIR - - - - - - - -
                    resp = Integer.parseInt(JOptionPane.showInputDialog("Excluir: \n"
                        + "1 - Funcionário\n"
                        + "2 - Colhedeira\n"
                        + "3 - Trator\n"
                        + "4 - Plantadeira\n"
                        + "5 - Voltar"));
                    switch(resp){
                        case 1:
                            fzd.excluirFuncionario();
                            break;
                        case 2:
                            fzd.excluirColhedeira();
                            break;
                        case 3:
                            fzd.excluirTrator();
                            break;
                        case 4:
                            fzd.excluirPlantadeira();
                            break;
                        case 5:
                            break;
                    }
                    break;
                    
                    
                case 5:// - - - - - - - - - SILO - - - - - - - -
                    resp = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n"
                        + "1 - Silo soja\n"
                        + "2 - Silo trigo\n"
                        + "3 - Silo milho\n"
                        + "4 - Voltar"));
                    switch(resp){
                        case 1:
                            resp = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n"
                                + "1 - Inserir Nota \n"
                                + "2 - Excluir Nota\n"
                                + "3 - Relatório\n"
                                + "4 - Cancelar"));
                            switch(resp){
                                case 1:
                                    fzd.inserirNotaSoja();
                                    break;
                                case 2:
                                    fzd.excluirNotaSoja();
                                    break;
                                case 3:
                                    fzd.exibirNotaSoja();
                                    break;
                                case 4:
                                    break;
                            }
                            break;
                            
                                                        
                        case 2:
                            resp = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n"
                                + "1 - Inserir Nota \n"
                                + "2 - Excluir Nota\n"
                                + "3 - Relatório\n"
                                + "4 - Cancelar"));
                            switch(resp){
                                case 1:
                                    fzd.inserirNotaTrigo();
                                    break;
                                case 2:
                                    fzd.excluirNotaTrigo();
                                    break;
                                case 3:
                                    fzd.exibirNotaTrigo();
                                    break;
                                case 4:
                                    break;
                            }
                            break;
                            
                            
                        case 3: 
                            resp = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n"
                                + "1 - Inserir Nota \n"
                                + "2 - Excluir Nota\n"
                                + "3 - Relatório\n"
                                + "4 - Cancelar"));
                            switch(resp){
                                case 1:
                                    fzd.inserirNotaMilho();
                                    break;
                                case 2:
                                    fzd.excluirNotaMilho();
                                    break;
                                case 3:
                                    fzd.exibirNotaMilho();
                                    break;
                                case 4:
                                    break;
                            }
                            break;
                            
                        case 4:
                            break;
                    }
                    break;
                                 
            }
            
        }while(resp !=8);
        
    }
    
    //FUNCIONÁRIO
    private void cadastrarFuncionario(){
        Funcionario cadFuncio = null;
        //Coletando dados
        int resp;
        String nome, cpf, funcao;
        
        resp = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de funcionário: \n"
             + "1 - Operador\n"
             + "2 - Mecanico\n"));
        
        switch(resp){
            case 1:
                cadFuncio = new Operador();
                break;
            case 2:
                cadFuncio = new Mecanico();
                break;
        }
        nome = JOptionPane.showInputDialog("Nome do fucionário:");
        cpf = JOptionPane.showInputDialog("CPF do funcionário:");
        funcao = JOptionPane.showInputDialog("Função:");
        cadFuncio.setCpf(cpf);
        cadFuncio.setFuncao(funcao);
        cadFuncio.setNomeComp(nome);
        funcionarios.add(cadFuncio);
        JOptionPane.showMessageDialog(null,"Funcionário cadastrado!");
        
    }
    private void exibirFuncionario(){
        String mensagem = "Funcionários:";
        for(Funcionario a: funcionarios ){
            mensagem += "\n" 
                    + "Nome: " + a.getNomeComp()
                    +"\nCPF: "+a.getCpf()
                    +"\nFunção: " + a.getFuncao()
                    + "\n- - - - - - - - - - - -";
        }
        
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    private void excluirFuncionario(){
        String nome = JOptionPane.showInputDialog("Informe o nome: ");
        boolean removido = false;
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario a = funcionarios.get(i);
            if (a.getNomeComp().equals(nome)) {
                funcionarios.remove(i);
                removido = true;
            }
        }
        if (removido) {
            JOptionPane.showMessageDialog(null,"Funcionário removido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro! Verifique se o nome está correto.");
        }
    }
    
    //TRATOR
    private void cadastrarTrator(int codTrator){
        Trator tor = new Trator();
        String marca = JOptionPane.showInputDialog("Marca:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        
        try{
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
            tor.setAno(ano);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *ANO* somente com números!!");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
            tor.setAno(ano);
        }try{
            int cv = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de CV:"));
            tor.setCv(cv);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *Quantidade de CV* somente com números!!");
            int cv = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de CV:"));
            tor.setCv(cv);
        }
        
        tor.setCodigo(codTrator);
        tor.setMarca(marca);
        tor.setModelo(modelo);
//        tor.setAno(ano);
//        tor.setCv(cv);
        trator.add(tor);
        JOptionPane.showMessageDialog(null,"Trator cadastrado!");
        
    }
    private void exibirTrator(){
        String mensagem = "Trator(es):";
        for(Trator a: trator){
            mensagem += "\n"
                    + "Código: " + a.getCodigo()
                    + "\nMarca: " + a.getMarca()
                    + "\nModelo: " + a.getModelo()
                    + "\nAno: " + a.getAno()
                    + "\nCV: " + a.getCv()
                    + "\n- - - - - - - - - - - -";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    private void excluirTrator(){
        //String codigo = JOptionPane.showInputDialog("Informe o código: ");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do trator: "));
        boolean removido = false;
        for (int i = 0; i < trator.size(); i++) {
            Trator a = trator.get(i);
            if (a.getCodigo() == codigo){
                trator.remove(i);
                removido = true;
            }
        }
        if (removido) {
            JOptionPane.showMessageDialog(null,"Trator removido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro! Verifique se o código está correto.");
        }
    }
    
    //COLHEDEIRA
    private void cadastrarColhedeira(int codColhedeira){
        Colhedeira co = new Colhedeira();
        String marca = JOptionPane.showInputDialog("Marca:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        try{
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
            co.setAno(ano);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *ANO* somente com números!!");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
            co.setAno(ano);
        }try{
            int capPla = Integer.parseInt(JOptionPane.showInputDialog("Cap. máxima da plataforma(pes):"));
            co.setCapPlataforma(capPla);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!"
                    + "\nPreencha o campo *Cap.máxima da plataforma* somente com números!!");
            int capPla = Integer.parseInt(JOptionPane.showInputDialog("Cap. máxima da plataforma(pes):"));
            co.setCapPlataforma(capPla);
        }
        co.setCodigo(codColhedeira);
        co.setMarca(marca);
        co.setModelo(modelo);
        colhedeira.add(co);
        JOptionPane.showMessageDialog(null,"Colhedeira cadastrada!");
    }
    private void exibirColhedeira(){
        String mensagem = "Colhedeira(s):";
        for(Colhedeira a: colhedeira){
            mensagem += "\n"
                    + "Código: " + a.getCodigo()
                    + "\nMarca: " + a.getMarca()
                    + "\nModelo: " + a.getModelo()
                    + "\nAno: " + a.getAno()
                    + "\nPes máximo: " + a.getCapPlataforma()
                    + "\n- - - - - - - - - - - -";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    private void excluirColhedeira(){
        //String codigo = JOptionPane.showInputDialog("Informe o código: ");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código da colhedeira: "));
        boolean removido = false;
        for (int i = 0; i < colhedeira.size(); i++) {
            Colhedeira a = colhedeira.get(i);
            if (a.getCodigo()== codigo){
                colhedeira.remove(i);
                removido = true;
            }
        }
        if (removido) {
            JOptionPane.showMessageDialog(null,"Colhedeira removido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro! Verifique se o código está correto.");
        }
    }
    
    //Plantadeira
    private void cadastrarPlantadeira(int codPlantadeira){
        Plantadeira pan = new Plantadeira();
        String marca = JOptionPane.showInputDialog("Marca:");
        String tipo = JOptionPane.showInputDialog("Tipo:");
        try{
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
            pan.setAno(ano);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *ANO* somente com números!!");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
            pan.setAno(ano);
        }try{
            int qtdLinhas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de linhas:"));
            pan.setLinhas(qtdLinhas);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *Quantidade de linhas* somente com números!!");
            int qtdLinhas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de linhas:"));
            pan.setLinhas(qtdLinhas);
        }
        pan.setCodigo(codPlantadeira);
        pan.setMarca(marca);
        pan.setTipo(tipo);
        plantadeira.add(pan);
        JOptionPane.showMessageDialog(null,"Plantadeira cadastrada!");
    }
    private void exibirPlantadeira(){
        String mensagem = "Plantadeira(s):";
        for(Plantadeira a: plantadeira){
            mensagem += "\n"
                    + "Código: " + a.getCodigo()
                    + "\nTipo: " + a.getTipo()
                    + "\nMarca: " + a.getMarca()
                    + "\nAno: " + a.getAno()
                    + "\nQuantidade de linhas: " + a.getLinhas()
                    + "\n- - - - - - - - - - - -";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    private void excluirPlantadeira(){
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código da colhedeira: "));
        boolean removido = false;
        for (int i = 0; i < plantadeira.size(); i++) {
            Plantadeira a = plantadeira.get(i);
            if (a.getCodigo()== codigo){
                colhedeira.remove(i);
                removido = true;
            }
        }
        if (removido) {
            JOptionPane.showMessageDialog(null,"Plantadeira removido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro! Verifique se o código está correto.");
        }
    }
    
    //GERADOR DE CÓDIGO RANDOM
    private int gerarCodigo(){
        int i;
        Random gerador = new Random();
        i = gerador.nextInt(100);
        return i;
    }
    
    //Soja
    private void inserirNotaSoja(){
        SiloSoja sSoja = new SiloSoja();
        try{
            int numNota = Integer.parseInt(JOptionPane.showInputDialog("Número da nota:"));
            sSoja.setNumNota(numNota);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *Número da nota* somente com números!!");
            int numNota = Integer.parseInt(JOptionPane.showInputDialog("Número da nota:"));
            sSoja.setNumNota(numNota);
        }try{
            int qntdSacas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de sacas:"));
            sSoja.setQtdSacas(qntdSacas);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *Quantida de sacas* somente com números!!");
            int qntdSacas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de sacas:"));
            sSoja.setQtdSacas(qntdSacas);
        }
        String nomeNota = JOptionPane.showInputDialog("Nome proprietário:");
        String dataNota = JOptionPane.showInputDialog("Data da nota:");
        sSoja.setDataNota(dataNota);
        sSoja.setNomeNota(nomeNota);
        siloSoja.add(sSoja);
        JOptionPane.showMessageDialog(null, "Nota cadastrada!");
    }
    private void exibirNotaSoja(){
        SiloSoja sSoja = new SiloSoja();
        String mensagem = "Silo Soja";
        for(SiloSoja a: siloSoja){
            mensagem += "\n"
                    + "Número da nota: " + a.getNumNota()
                    + "\nProprietário: " + a.getNomeNota()
                    + "\nSacos: " + a.getQtdSacas()
                    + "\nData: " + a.getDataNota()
                    + "\n- - - - - - - - - - - -";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    private void excluirNotaSoja(){
        int numNota = Integer.parseInt(JOptionPane.showInputDialog("Número da nota: "));
        boolean removido = false;
        for (int i = 0; i < siloSoja.size(); i++) {
            SiloSoja a = siloSoja.get(i);
            if (a.getNumNota() == numNota){
                siloSoja.remove(i);
                removido = true;
            }
        }
        if (removido) {
            JOptionPane.showMessageDialog(null,"Nota removida!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro! Verifique se o número está correto.");
        }
    }
    
    //Milho
    private void inserirNotaMilho(){
         SiloMilho milho = new SiloMilho();
         
        try{
            int numNota = Integer.parseInt(JOptionPane.showInputDialog("Número da nota:"));
            milho.setNumNota(numNota);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *Número da nota* somente com números!!");
            int numNota = Integer.parseInt(JOptionPane.showInputDialog("Número da nota:"));
            milho.setNumNota(numNota);
        }try{
            int qntdSacas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de sacas:"));
            milho.setQtdSacas(qntdSacas);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *Quantida de sacas* somente com números!!");
            int qntdSacas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de sacas:"));
            milho.setQtdSacas(qntdSacas);
        }
        String nomeNota = JOptionPane.showInputDialog("Nome proprietário:");
        String dataNota = JOptionPane.showInputDialog("Data da nota:");
        milho.setDataNota(dataNota);
        milho.setNomeNota(nomeNota);
        siloMilho.add(milho);
        JOptionPane.showMessageDialog(null, "Nota cadastrada!");
    }
    private void exibirNotaMilho(){
        SiloMilho milho = new SiloMilho();
        String mensagem = "Silo Milho";
        for(SiloMilho a: siloMilho){
            mensagem += "\n"
                    + "Número da nota: " + a.getNumNota()
                    + "\nProprietário: " + a.getNomeNota()
                    + "\nSacos: " + a.getQtdSacas()
                    + "\nData: " + a.getDataNota()
                    + "\n- - - - - - - - - - - -";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    private void excluirNotaMilho(){
        int numNota = Integer.parseInt(JOptionPane.showInputDialog("Número da nota: "));
        boolean removido = false;
        for (int i = 0; i < siloMilho.size(); i++) {
            SiloMilho a = siloMilho.get(i);
            if (a.getNumNota() == numNota){
                siloMilho.remove(i);
                removido = true;
            }
        }
        if (removido) {
            JOptionPane.showMessageDialog(null,"Nota removida!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro! Verifique se o número está correto.");
        }
    }
    
    //Trigo
    private void inserirNotaTrigo(){
        SiloTrigo trigo = new SiloTrigo();
        
        try{
            int numNota = Integer.parseInt(JOptionPane.showInputDialog("Número da nota:"));
            trigo.setNumNota(numNota);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *Número da nota* somente com números!!");
            int numNota = Integer.parseInt(JOptionPane.showInputDialog("Número da nota:"));
            trigo.setNumNota(numNota);
        }try{
            int qntdSacas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de sacas:"));
            trigo.setQtdSacas(qntdSacas);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ERRO!!!\nPreencha o campo *Quantida de sacas* somente com números!!");
            int qntdSacas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de sacas:"));
            trigo.setQtdSacas(qntdSacas);
        }
        String nomeNota = JOptionPane.showInputDialog("Nome proprietário:");
        String dataNota = JOptionPane.showInputDialog("Data da nota:");
        trigo.setDataNota(dataNota);
        trigo.setNomeNota(nomeNota);
        siloTrigo.add(trigo);
        JOptionPane.showMessageDialog(null, "Nota cadastrada!");
    }
    private void exibirNotaTrigo(){
        SiloTrigo trigo = new SiloTrigo();
        String mensagem = "Silo Trigo";
        for(SiloTrigo a: siloTrigo){
            mensagem += "\n"
                    + "Número da nota: " + a.getNumNota()
                    + "\nProprietário: " + a.getNomeNota()
                    + "\nSacos: " + a.getQtdSacas()
                    + "\nData: " + a.getDataNota()
                    + "\n- - - - - - - - - - - -";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    private void excluirNotaTrigo(){
        int numNota = Integer.parseInt(JOptionPane.showInputDialog("Número da nota: "));
        boolean removido = false;
        for (int i = 0; i < siloTrigo.size(); i++) {
            SiloTrigo a = siloTrigo.get(i);
            if (a.getNumNota() == numNota){
                siloTrigo.remove(i);
                removido = true;
            }
        }
        if (removido) {
            JOptionPane.showMessageDialog(null,"Nota removida!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro! Verifique se o número está correto.");
        }
    }
    
}

