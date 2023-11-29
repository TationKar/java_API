//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map.
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
//4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков
// или добавить еще ноутбук, то программа начинает работать некорректно

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> stock = new HashSet<>();

        Notebook notebook0 = new Notebook();
        notebook0.model = "Acer EX215-22-R8E3";
        notebook0.ram_gb = 8;
        notebook0.hdd_cap_gb = 256;
        notebook0.os = "Linux";
        notebook0.color = "black";
        stock.add(notebook0);

        Notebook notebook1 = new Notebook();
        notebook1.model = "Asus K513EA";
        notebook1.ram_gb = 16;
        notebook1.hdd_cap_gb = 512;
        notebook1.os = "Windows 11";
        stock.add(notebook1);

        Notebook notebook2 = new Notebook();
        notebook2.model = "HUAWEI MateBook";
        notebook2.ram_gb = 16;
        notebook2.hdd_cap_gb = 512;
        notebook2.os = "Windows 11";
        notebook2.color = "black";
        stock.add(notebook2);

        Notebook notebook3 = new Notebook();
        notebook3.model = "Apple MacBook";
        notebook3.ram_gb = 24;
        notebook3.hdd_cap_gb = 1000;
        notebook3.os = "macOS";
        notebook3.color = "black";
        stock.add(notebook3);

        Notebook notebook4 = new Notebook();
        notebook4.model = "DELL Inspiron";
        notebook4.ram_gb = 16;
        notebook4.hdd_cap_gb = 1024;
        notebook4.os = "Windows 10";
        notebook4.color = "grey";
        stock.add(notebook4);

        //System.out.println(stock.toString());

        Notebook srchNtbk = new Notebook();
        Scanner sc = new Scanner(System.in);
        int label = 0;
        System.out.println("Поиск по критериям '1' - модель ноутбука, '2' - объем ОЗУ в ГБ, '3' - объем HDD в ГБ, '4' - ОС, '5' - цвет, '6' - закончить ввод\n");
        do {
            //System.out.println("Введите номер критерия \n1 - модель ноутбука \n2 - объем ОЗУ в ГБ\n3 - объем HDD в ГБ\n4 - ОС\n5 - цвет\n6 - закончить\n");
            System.out.print("Введите цифру от 1 до 6: ");
            label = sc.nextInt();

            switch (label){
                case 1:
                        System.out.print("Введите модель: ");
                        srchNtbk.model = sc.next();
                        break;
                case 2: System.out.print("Введите количество памяти в GB: ");
                        srchNtbk.ram_gb = sc.nextInt();
                        break;
                case 3: System.out.print("Введите объем HDD в GB: ");
                        srchNtbk.hdd_cap_gb = sc.nextInt();
                        break;
                case 4: System.out.print("Введите название ОС: ");
                        srchNtbk.os = sc.next();
                        break;
                case 5: System.out.print("Введите цвет ноутбука: ");
                        srchNtbk.color = sc.next();
                        break;
                default: break;
            }


        } while (label < 6);

        //System.out.println(srchNtbk.toString());
        System.out.println("");
        Boolean mdl = true;
        Boolean rm = true;
        Boolean hd = true;
        Boolean win = true;
        Boolean clr = true;
        Boolean found = false;
        for (Notebook nb:stock){
            if (srchNtbk.model != null) {
                if (srchNtbk.model.equals(nb.model)) mdl = true; else mdl = false;
            }
            if (srchNtbk.ram_gb != 0) {
                if (srchNtbk.ram_gb <= nb.ram_gb) rm = true; else rm = false;
            }
            if (srchNtbk.hdd_cap_gb != 0) {
                if (srchNtbk.hdd_cap_gb <= nb.hdd_cap_gb) hd = true; else hd = false;
            }
            if (srchNtbk.os != null) {
                if (srchNtbk.os.equals(nb.os)) win = true; else win = false;
            }
            if (srchNtbk.color != null) {
                if (srchNtbk.color.equals(nb.color)) clr = true; else clr = false;
            }
            //System.out.println("mdl = " + mdl + " rm = " + rm + " hd = " + hd + " win = " + win + " clr = " + clr);
            if (mdl & rm & hd & win & clr) {
                System.out.println("Подходящая модель: " + nb.toString());
                found = true;
            }

        }
        if (!found) {
            System.out.println("Подходящих моделей нет");
        }
    }
}