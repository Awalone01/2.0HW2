package ru.skypro;

public class ServiceStation {
    public void check(Transopt transopt) {
        if (transopt != null) {
            System.out.println("Обслуживаем " +  transopt.getModelName());
            for (int i = 0; i < transopt.getWheelsCount(); i++) {
                System.out.println("Необходимо заменить колесо");
//                car.updateTyre();
            }
//            transopt.checkEngine();
//            transopt.checkTrailer();
        }

//        else if (truck != null) {
//            System.out.println("Обслуживаем " + truck.getModelName());
//            for (int i = 0; i < truck.getWheelsCount(); i++) {
//                truck.updateTyre();
//            }
//            truck.checkEngine();
//
//        } else if (bicycle != null) {
//            System.out.println("Обслуживаем " + bicycle.getModelName());
//            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
//                bicycle.updateTyre();
//            }
//        }
    }
}
