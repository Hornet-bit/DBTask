package by.epamtc.task3.main;

import by.epamtc.task3.main.controller.Controller;
import by.epamtc.task3.main.model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {

        String filename = "appliances_db.txt";

        String name = "Speakers";
        String parametr = "2";


        BufferedReader reader = new BufferedReader(new FileReader(filename));

        ArrayList<Object> list = new ArrayList<>();


        while (true) {
            String line = reader.readLine();

            if (line == null) {
                break;
            }

            if (line.contains(name) && line.contains(parametr)) {

                int countOfParams = Controller.countOfParams(line);

                String array[] = Controller.stringParser(line, countOfParams);


                switch (name) {

                    case "Oven":

                        String powerConsumption = array[0];
                        String weight = array[1];
                        String capacity = array[2];
                        String depth = array[3];
                        String height = array[4];
                        String width = array[5];

                        Oven oven = new Oven(powerConsumption, weight, capacity, depth, height, width);
                        list.add(oven);
                        break;

                    case "Laptop":
                        Laptop laptop = new Laptop(array[0], array[1], array[2], array[3], array[4], array[5]);
                        list.add(laptop);
                        break;

                    case "Refrigerator":
                        Refrigerator refrigerator = new Refrigerator(array[0], array[1], array[2], array[3], array[4], array[5]);
                        list.add(refrigerator);
                        break;

                    case "VacuumCleaner":
                        VacuumCleaner vacuumCleaner = new VacuumCleaner(array[0], array[1], array[2], array[3], array[4], array[5]);
                        list.add(vacuumCleaner);
                        break;

                    case "TabletPC":
                        TabletPC tabletPC = new TabletPC(array[0], array[1], array[2], array[3], array[4]);
                        list.add(tabletPC);
                        break;

                    case "Speakers":
                        Speakers speakers = new Speakers(array[0], array[1], array[2], array[3]);
                        list.add(speakers);
                        break;

                }

            }


        }
        System.out.println(list.toString());

    }
}
