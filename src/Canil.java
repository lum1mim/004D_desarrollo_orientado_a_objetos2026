public class Canil {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        System.out.println("*****beinvenido al canil!!******");

        Perro perro_del_profe = new Perro();
        perro_del_profe.edad = 6;
        perro_del_profe.nombre = "gimli";
        perro_del_profe.peso = 40;
        perro_del_profe.esta_vacunado = false;

        Perro mi_perro = new Perro();
        mi_perro.nombre = "kailan";
        mi_perro.edad = 1;
        mi_perro.peso = 10;
        mi_perro.esta_vacunado = true;

        if (mi_perro.edad > 2) {
            System.out.println("tiene mas de dos años");}
        else{System.out.println("no tiene mas de dos años");}

        if (mi_perro.peso > 20) {System.out.println("perro pesado");}
        else {System.out.println("perro no pesado");}

        System.out.println("gracias por su visita!!");


    }
}
