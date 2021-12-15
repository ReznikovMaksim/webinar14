package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            Map<String,Human> humanMap = JsonSerializer.getHumans();
            List<Human> humans = new ArrayList<>();
//            for (Map.Entry<String,Human> h : humanMap.entrySet()) {
//                humans.add(h.getValue());
//            }
//            System.out.println(humans);
//            humans.sort(Comparator.comparing(Human::getPet));
//            //Collections.sort(humans,Comparator.comparing(Human::getNameOfPet));
//            System.out.println(humans);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        showActions();
//        Scanner sc = new Scanner(System.in);
//        int answer = sc.nextInt();
//        Database d = new Database();
//        switch (answer){
//            case 1:
//                d.open();
//                break;
//            case 2:
//                d.closeConnection();
//                break;
//            case 3:
//                d.check();
//                break;
//            case 4:
//                d.getOneElementByIndex();
//                break;
//        }
    }
//    public static void showActions(){
//
//    }
}
