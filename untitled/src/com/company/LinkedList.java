package com.company;

public class LinkedList {
    private Node head;// ссылка на первый элемент списка(объект типа Node)

    //  метод add добавляет элемент в конец списка

    public void add (int v){
        if (head == null){
            // создаем первый элемент списка
            Node n = new Node();
            n.value = v;
            head = n;
            return;// досрочный выход из метода void
        }
        Node last =head;
        // доходим до последнего элемента в списке( у которого next !=null {}
        while (last.next != null) {
            last =last.next;
        }
        // создаем последний элемент в списке
        Node n = new Node();
        n.value = v;
        last.next = n;
    }

    public void print(){
        Node elem = head;
        while (elem != null) {
            System.out.println(elem.value);// выводим занчение текущего узла
            elem = elem.next;

        }
    }
}
