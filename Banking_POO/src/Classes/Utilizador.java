package Classes;

public class Utilizador extends Pessoa{
    private String utilizador;
    private String senha;
    private String historico;
    
    public Utilizador(){}
    public Utilizador(String nome, int idade, String sexo, String utilizador, String senha, String historico){
        super(nome, idade, sexo);
        this.utilizador = utilizador;
        this.senha = senha;
        this.historico = historico;
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade); 
    }

    @Override
    public int getIdade() {
        return super.getIdade(); 
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); 
    }

    @Override
    public String getNome() {
        return super.getNome(); 
    }
 
    public String getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(String utilizador) {
        this.utilizador = utilizador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    

}
