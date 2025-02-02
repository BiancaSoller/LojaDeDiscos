package p2_poo;

public class CD extends Midia {
    private int nMusicas;

    // construtores da classe
    public CD(){
        
    }
    public CD(int nMusicas) {
        this.nMusicas = nMusicas;
    }
    
    // get's e set's
    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    public int getnMusicas() {
        return nMusicas;
    }
    
    // método sobreescrito
        @Override
    public String getTipo(){
        return "CD";
    }
    @Override
    public String getDetalhes(){
        return "\nMusicas: " + getnMusicas()
            + "\nCódigo: " + getCodigo()
            + "\nPreço: " + getPreco()
            + "\nNome: " + getNome();
                
    }
    // método da classe
    @Override
    public void printDados(){
        System.out.print("Dados da classe: " + getTipo() + getDetalhes());
    }
    // método sobrecarga
        public void inserirDados(int musicas){
        setnMusicas(musicas);
    }
}
