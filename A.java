public class A {
    private int A1;
    private float A2;

    public A(int A1, float A2){
        this.A1 = A1;
        this.A2 = A2;
    }

    public int getA1() {
        return A1;
    }

    public float getA2() {
        return A2;
    }

    public void MA1(){
        System.out.println("Nome do método: 'MA1'");
    }
    
    public void MA2(){
        System.out.println("Nome do método: 'MA2'");
    }

    public void MA3(){
        System.out.println("Alteração a classe A partir do clone");
    }

    public int getSoma(int a, int b) {
        return a + b;
    }

    public int getSoma_(int a, int b){
        return a + b;
    }
}
