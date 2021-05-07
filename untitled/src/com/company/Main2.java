package com.company;

public class Main2 {
    public static void main(String[] args){
        String s = "My name is Nata";
        /* все методы класса стринг возвращают копию строки, не меняя
         исходную строку */
        String s2 = s.concat("  прпр");// объединяет две строки между собой, не меняя исходную строку
        // тоже самое  s2 = s + " прпр"
        System.out.println(s);
        System.out.println(s2);

        System.out.println("    hello world   ".trim());// удаляет все пробелы в начале и в конце строки

       System.out.println(s.replace("is ","are "));

       //split возвращает массив строк, разделенный назначение входное
       String []ss = s.split(" ");
       for (String e: ss) {
           System.out.println(e);
       }
       // объединяет массив либо коллекцию в одну строку
       System.out.println(String.join(",",ss));

       //2 - индекс символа с которого будет начинаться подстрока
        System.out.println(s.substring(2));

        // вырезает строку со 2 по 5 символ
       System.out.println(s.substring(2,5));


    }
}
