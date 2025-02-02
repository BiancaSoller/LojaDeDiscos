package p2_poo;

public class DVD extends Midia{
    private int nFaixas;

    // construtor da classe
    public DVD(){
        
    }
    public DVD(int nFaixas) {
        this.nFaixas = nFaixas;
    }
    
    // get's e set's
    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
    // métodos sobreescritos
    @Override
    public String getTipo(){
        return "DVD";
    }
    @Override
    public String getDetalhes(){
        return "\nFaixas: " + getnFaixas() 
            + "\nCódigo: " + getCodigo()
            + "\nPreço: " + getPreco()
            + "\nNome: " + getNome();
    }
    
    // método da classe
    public void setFaixas(int f){
        this.nFaixas = f;
    }
    
    @Override
    public void printDados(){
        System.out.print("Dados da classe: " + getTipo() + getDetalhes());
    }
    // método sobrecarga
    public void inserirDados(int faixas){
        setnFaixas(faixas);
    }
}
