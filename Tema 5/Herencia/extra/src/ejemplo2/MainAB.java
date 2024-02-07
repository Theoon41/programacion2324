package ejemplo2;

public class MainAB {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        //a.saluda();
        b.saluda();

        for (deparcaciones d: deparcaciones.values()){
            System.out.println(d);
        }
    }
}
