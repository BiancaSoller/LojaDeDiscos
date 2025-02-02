package p2_poo;

public class Principal {

    public static void main(String[] args) {
        // instanciando as classes
        CD cd = new CD();
        DVD dvd = new DVD();
        
        
        cd.setNome("As melhores do Roberto Carlos");
        cd.setnMusicas(10);
        cd.setCodigo(479);
        cd.setPreco(20.00);
        cd.printDados();
        System.out.println("\n");
        
        dvd.setNome("A paixão de Cristo 3 em 1");
        dvd.setnFaixas(3);
        dvd.setCodigo(381);
        dvd.setPreco(15.00);
        dvd.printDados();
        System.out.println("");
    }
    
}
