//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
//Работу сдать как обычно ссылкой на гит репозиторий
//Частые ошибки:
//1. Заставляете пользователя вводить все существующие критерии фильтрации
//2. Невозможно использовать более одного критерия фильтрации одновременно
//3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
//4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или добавить еще ноутбук, то программа начинает работать некорректно

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Notebook> stock = new HashMap<>();

        Notebook notebook0 = new Notebook();
        notebook0.model = "Acer EX215-22-R8E3";
        notebook0.ram_gb = 8;
        notebook0.hdd_cap_gb = 256;
        notebook0.os = "Linux";
        notebook0.color = "black";
        stock.put(notebook0.model, notebook0);

        Notebook notebook1 = new Notebook();
        notebook1.model = "Asus K513EA";
        notebook1.ram_gb = 16;
        notebook1.hdd_cap_gb = 512;
        notebook1.os = "Windows 11";
        stock.put(notebook1.model, notebook1);

        Notebook notebook2 = new Notebook();
        notebook2.model = "HUAWEI MateBook";
        notebook2.ram_gb = 16;
        notebook2.hdd_cap_gb = 512;
        notebook2.os = "Windows 11";
        notebook2.color = "black";
        stock.put(notebook2.model, notebook2);

        Notebook notebook3 = new Notebook();
        notebook3.model = "Apple MacBook";
        notebook3.ram_gb = 24;
        notebook3.hdd_cap_gb = 1000;
        notebook3.os = "macOS";
        notebook3.color = "black";
        stock.put(notebook3.model, notebook3);

        Notebook notebook4 = new Notebook();
        notebook4.model = "DELL Inspiron";
        notebook4.ram_gb = 16;
        notebook4.hdd_cap_gb = 1024;
        notebook4.os = "Windows 10";
        notebook4.color = "grey";
        stock.put(notebook4.model, notebook4);
    }
}