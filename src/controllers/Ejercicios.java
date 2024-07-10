package controllers;

import java.util.HashMap;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        HashMap<Character, Integer> conteoCaracteres = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char charFromStr1 = str1.charAt(i);
            char charFromStr2 = str2.charAt(i);

            conteoCaracteres.put(charFromStr1, conteoCaracteres.getOrDefault(charFromStr1, 0) + 1);
            conteoCaracteres.put(charFromStr2, conteoCaracteres.getOrDefault(charFromStr2, 0) - 1);
        }


        for (int count : conteoCaracteres.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
       HashMap<Integer, Integer> mapa = new HashMap<>();
        for (int i =0 ; i< nums.length; i++){
            int com= objetivo - nums[i];
            if (mapa.containsKey(com)){
                return new int []{mapa.get(com), i};
            }
            mapa.put(nums[i], i);
        }
        return null;
    }
}
