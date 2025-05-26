package Classes;

public class Sessao {
    private static String utilizador;
    
    public static void setUtilizador(String nome ){
        utilizador = nome;
    }
    
    public static String getUtilizador(){
        return utilizador;
    }
    
    public static void Limpar(){
        utilizador = null;
    }
    
    
}
