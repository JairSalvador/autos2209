package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

public class HolaMundo {

    public static void main(String[] args) {

        System.out.println("Hola");
        Persona per1 = new Persona();
        per1.setNombre("Jair Salv");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer("Hamburguesa!!!");

        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre: " + per2.getNombre());
        per2.comer("pizza hawaina!!!");

        Automovil miVocho = new Automovil();
        System.out.println("");
        System.out.println("Primer Automovil");
        miVocho.setMarca("VW");
        System.out.println("Marca: " + miVocho.getMarca());
        miVocho.setSubMarca("Sedan");
        System.out.println("Submarca: " + miVocho.getSubMarca());
        miVocho.setModelo(1970);
        System.out.println("Modelo: " + miVocho.getModelo());
        miVocho.setColor(Color.BLUE);
        System.out.println("Color: " + miVocho.getColor());
        
        Automovil miMustang = new Automovil();
        System.out.println("");
        System.out.println("Segundo Automovil");
        miMustang.setMarca("Ford");
        System.out.println("Marca: " + miMustang.getMarca());
        miMustang.setSubMarca("Mustang");
        System.out.println("Submarca: " + miMustang.getSubMarca());
        miMustang.setModelo(2010);
        System.out.println("Modelo: " + miMustang.getModelo());
        miMustang.setColor(Color.YELLOW);
        System.out.println("Color: " + miMustang.getColor());
        
        Automovil miAcura = new Automovil();
        System.out.println("");
        System.out.println("Tercer Automovil");
        miAcura.setMarca("Acura");
        System.out.println("Marca: " + miAcura.getMarca());
        miAcura.setSubMarca("NSX");
        System.out.println("Submarca: " + miAcura.getSubMarca());
        miAcura.setModelo(2013);
        System.out.println("Modelo: " + miAcura.getModelo());
        miAcura.setColor(Color.GRAY);
        System.out.println("Color: " + miAcura.getColor());
    }

}
