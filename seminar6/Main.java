package seminar6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Notebook> notebooks = new HashSet<>();

        Notebook apple = new Notebook("MacBook Pro 16 2023", "512", "16", "gray", "macOS");
        Notebook hp = new Notebook("HP 15s-eq2136ur", "256", "8", "gray", "Windows");
        Notebook lenovo = new Notebook("Lenovo IdeaPad 315ITL6", "256", "8", "gray", "DOS");
        Notebook dell = new Notebook("DELL Latitude 3510", "256", "32", "black", "Windows");
        Notebook samsung = new Notebook("Samsung Galaxy book NP750", "256", "8", "gray", "DOS");
        Notebook acer = new Notebook("Acer Nitro 5 AN515-45", "512", "8", "black", "Windows");
        Notebook asus = new Notebook("ASUS X515EA-BQ1461W", "256", "8", "silver", "Windows");

        notebooks.add(apple);
        notebooks.add(hp);
        notebooks.add(lenovo);
        notebooks.add(dell);
        notebooks.add(samsung);
        notebooks.add(acer);
        notebooks.add(asus);

        // System.out.println(notebooks);

        parametersSelect(notebooks, userSelectParameters());

    }

    private static String userSelectParameters() {
        System.out.println("По какому параметру хотите выбрать ноутбук?:");
        System.out.println("1 - объем накопительной памяти");
        System.out.println("2 - объем оперативной памяти");
        System.out.println("3 - цвет корпуса");
        System.out.println("4 - операционная система");
        System.out.println("5 - завершить выбор");
        Scanner scanner = new Scanner(System.in);
        String position = scanner.next();

        

        return position;

    }

    private static void parametersSelect(Set<Notebook> notebooks, String position) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String parameter = userSelectParameters();

            if (parameter.equals("1")){

                System.out.println("Выберите объем накопительной памяти:  256, 512");
            String ssd = scanner.next();
            if (ssd.equals("256")) {
                for (Notebook element : notebooks) {
                    if (element.getSsd().equals(ssd)) {
                        System.out.println(element);
                    }
                }
            } else if (ssd.equals("512")) {
                for (Notebook element : notebooks) {
                    if (element.getSsd().equals(ssd)) {
                        System.out.println(element);
                    }
                }
            }
            continue;
        }

            else if (parameter.equals("2")){

                System.out.println("Выберите объем оперативной памяти:  8, 16, 32");
            String ram = scanner.next();
            if (ram.equals("8")) {
                for (Notebook element : notebooks) {
                    if (element.getRam().equals(ram)) {
                        System.out.println(element);
                    }
                }
            } else if (ram.equals("16")) {
                for (Notebook element : notebooks) {
                    if (element.getRam().equals(ram)) {
                        System.out.println(element);
                    }
                }
            } else if (ram.equals("32")) {
                for (Notebook element : notebooks) {
                    if (element.getRam().equals(ram)) {
                        System.out.println(element);
                    }
                }
            }
            continue;
        }

            else if (parameter.equals("3")){

                System.out.println("Выберите цвет корпуса:  gray, silver, black");
            String color = scanner.next();
            if (color.equals("gray")) {
                for (Notebook element : notebooks) {
                    if (element.getColor().equals(color)) {
                        System.out.println(element);
                    }
                }
            } else if (color.equals("silver")) {
                for (Notebook element : notebooks) {
                    if (element.getColor().equals(color)) {
                        System.out.println(element);
                    }
                }
            } else if (color.equals("black")) {
                for (Notebook element : notebooks) {
                    if (element.getColor().equals(color)) {
                        System.out.println(element);
                    }
                }
            }
            continue;
        }

            else if (parameter.equals("4")) {
                System.out.println("Выберите ОС:  macOS, DOS, Windows");
            String os = scanner.next();
            if (os.equals("macOS")) {
                for (Notebook element : notebooks) {
                    if (element.getOs().equals(os)) {
                        System.out.println(element);
                    }
                }
            } else if (os.equals("DOS")) {
                for (Notebook element : notebooks) {
                    if (element.getOs().equals(os)) {
                        System.out.println(element);
                    }
                }
            } else if (os.equals("Windows")) {
                for (Notebook element : notebooks) {
                    if (element.getOs().equals(os)) {
                        System.out.println(element);
                    }
                }
            }
            continue;
        }

            else if (parameter.equals("5")) {
                break;
            }



        }
    }

}
