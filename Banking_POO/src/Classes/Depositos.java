package Classes;

public class Depositos{
    private int numConta;
    private String senha;
    private double saldo;
    private String historico;
            
    public Depositos(){}
    public Depositos(int numConta, String senha, double saldo, String historico){
        this.numConta = numConta;
        this.senha = senha;
        this.saldo = saldo;
        this.historico = historico;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "Deposito{" + "numConta=" + numConta + ", senha=" + senha + ", valor=" + saldo + ", historico=" + historico + '}';
    }
    
    
}
