public class Principal {

    
    public static void main(String[] args) {
        
        metodo m = new metodo();
        Cls_Cliente cl = new Cls_Cliente(m);
        m.setEdad(18);
        m.setNombre("Jorge");
        m.setApellido("Polo");
        System.out.println(""+m.nombre+" "+m.apellido+" Edad: "+m.edad);
        cl.busca();
        cl.compra();
        cl.paga();
        cl.Recibe();
        
        
    }
    
}
