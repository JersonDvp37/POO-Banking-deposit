package Classes;

public class ContaBancaria {
    private int numConta;
    private String tipoConta;
    private int idCliente;
    private String historico;
    
    public ContaBancaria(int numConta, String tipoConta, int idClienet, String historico){
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.idCliente = idCliente;
        this.historico = historico;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "numConta=" + numConta + ", tipoConta=" + tipoConta + ", idCliente=" + idCliente + ", historico=" + historico + '}';
    }
      
    
}
