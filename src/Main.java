import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car Lada = new Car("Lada", "Granta", "жёлтый", "Россия",1.7, 2015 );
        Car Audi  = new Car("Audi", "A8 50 L TDI quattro", "чёрный", "Германия",3.0, 2020 );
        Car BMW = new Car("BMW ", "Z8", "чёрный", "Германия",3.0, 2021 );
        Car Kia = new Car("Kia", "Sportage 4-го поколения", "красный", "Южная Корея",2.4, 2018 );
        Car Hyundai  = new Car("Hyundai ", "Avante", "оранжевый", "Южная Корея",1.7, 2016 );

        Lada.characteristics();
        Audi.characteristics();
        BMW.characteristics();
        Kia.characteristics();
        Hyundai.characteristics();


    }
}