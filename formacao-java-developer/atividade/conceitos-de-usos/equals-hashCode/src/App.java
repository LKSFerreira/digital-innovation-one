import models.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Conceito de uso de equals e hashCode


        // Primeira bateria de testes
        System.out.println("Quando os atributos tem o mesmo valor");
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");

        Carro carro2 = new Carro();
        carro2.setMarca("Fiat");

        System.out.println(carro1.equals(carro2)); // true

        System.out.println(carro1.hashCode()); // 2189429
        System.out.println(carro2.hashCode()); // 2189429
        System.out.println("------------");
        
        // Segunda bateria de testes
        System.out.println("Quando os atributos tem valores diferentes");
        Carro carro3 = new Carro();
        carro3.setMarca("Fiat");
        
        Carro carro4 = new Carro();
        carro4.setMarca("Ford");
        
        System.out.println(carro3.equals(carro4)); // false
        
        System.out.println(carro3.hashCode()); // 2189429
        System.out.println(carro4.hashCode()); // 2195706
        System.out.println("------------");
        
        // Terceira bateria de testes
        System.out.println("Quando ambos atributos são nulo");
        Carro carro5 = new Carro();
        carro5.setMarca(null);
        
        Carro carro6 = new Carro();
        carro6.setMarca(null);
        
        System.out.println(carro5.equals(carro6)); // true
        System.out.println("------------");

        // Quarta bateria de testes
        System.out.println("Quando um atributo é nulo e outro é vazio");
        Carro carro7 = new Carro();
        carro7.setMarca(null);

        Carro carro8 = new Carro();
        carro8.setMarca("");

        System.out.println(carro7.equals(carro8)); // false
        System.out.println("------------");

    }
}
