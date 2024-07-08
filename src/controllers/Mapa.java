package controllers;

import java.util.HashMap;

public class Mapa {
    public Mapa() {
        HashMap<String, Integer> mapita = new HashMap<>(); 
        mapita.put("Manzana" , 20);
        mapita.put("Pera" , 25);
        mapita.put("Mandarina" , 20);
        mapita.put("Mandarina" , 20);

        System.out.println();
        System.out.println(mapita);
        mapita.remove("Pera");
        System.out.println(mapita);

        System.out.println();
        System.out.println("Existe Mandarina" + mapita.containsKey("Mandarina"));
        System.out.println("Existe Pera-> " + mapita.containsKey("Pera"));

        System.out.println();
        int valorManzana = mapita.get("Manzana");
        System.out.println("El valor de la manzana es: " + valorManzana);
        
        System.out.println();
        System.out.println(mapita.size());
        System.out.println("Está vacio ? " + mapita.isEmpty());

        System.out.println();
        System.out.println("\n Claves del mapa");
        for(String clave : mapita.keySet()){
            System.out.println("- " +clave);
        }
        
        System.out.println("\n Valores del mapa");
        for(Integer value : mapita.values()){
            System.out.println("- " + value);
        }
        mapita.replace(null, null);
        

        System.out.println();
        System.out.println(mapita);
        mapita.replaceAll((k,v) -> v*2);
        System.out.println(mapita);

        System.out.println();
        mapita.clear();
        System.out.println(mapita);
    }   
}
