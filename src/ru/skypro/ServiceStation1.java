package ru.skypro;

public class ServiceStation1 implements ServiceStation3 {
    @Override
    public void check(Transopt transopt) {
        if (transopt != null) {
            System.out.println("Обслуживаем " + transopt.getModelName());
            for (int i = 0; i < transopt.getWheelsCount(); i++) {
                transopt.updateTyre();
            }
            transopt.checkEngine();
            transopt.checkTrailer();
        }
        }
    }
