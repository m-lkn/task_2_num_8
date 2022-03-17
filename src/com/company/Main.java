package com.company;

public class Main {

    public static void main(String[] args) {
        // создаём экземпляр нашего класса для списка
        MyList<String> list = new MyList<>();

        // добавляем в него элементы
        String[] strings = {"Один", "Два", "Два", "Два", "Три", "Два", "Один"};
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }

        System.out.println("Содержимое односвязного списка:\n" + list.toString());

        list.removeRepeatsInRow();
        System.out.println();

        System.out.println("Список после удаления подряд повторяющихся элементов:\n" + list.toString());
    }
}
