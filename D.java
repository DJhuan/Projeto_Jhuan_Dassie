public class D {
    private char D1;
    private double D2;

    public D(char D1, double D2){
        this.D1 = D1;
        this.D2 = D2;
    }

    private void MD1(String mensagem){
        System.out.println("Mensagem importante: " + mensagem);
    }

    public void MD2(){
        MD1("Estes são os dados deste objeto: ");
        System.out.println("D1: " + D1 + " D2: " + D2);
    }
    
    public void MD4(){
        System.out.println("Nome do método: 'MD4'");
    }
}
