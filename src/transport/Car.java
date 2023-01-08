package transport;

import java.time.LocalDate;
import java.time.Month;

public class Car {
    //polya
        private String brand;
        private String model;
        private double engineVolume;
        private String color;
        private int year;
        private String country;
        private String transmission;
        private String bodyType;
        private String registrationNumber;
        private int seatsNumber;
        private boolean tyre;

        //noviy class
    public class Key {
        private boolean remoteStart;
        private boolean keylessAccess;

            public boolean isRemoteStart() {
                return remoteStart;
            }

            public boolean isKeylessAccess() {
                return keylessAccess;
            }

            public Key(boolean remoteStart, boolean keylessAccess) {
                this.remoteStart = remoteStart;
                this.keylessAccess = keylessAccess;
            }
        }

        //constructor

    public Car (String transmission, String bodyType, String registrationNumber, int seatsNumber, boolean tyre) {
        if (transmission != null || !transmission.isEmpty() || bodyType != null || !bodyType.isEmpty() || registrationNumber != null || !registrationNumber.isEmpty()) {
            this.transmission = transmission;
            this.bodyType = bodyType;
            this.registrationNumber = registrationNumber;
        }
        this.seatsNumber = seatsNumber;
        this.tyre = tyre;
    }

    public Car (String brand, String model, String color, String country, double engineVolume, int year) {
            if (brand==null || brand.isEmpty() || model==null || model.isEmpty() || country == null || country.isEmpty()) {
                this.brand = "default";
                this.model = "default";
                this.country = "default";
            } else {
                this.brand = brand;
                this.model = model;
                this.country = country;
            }
            if (color == null || color == "") {
                this.color = "белый";
            } else {
                this.color = color;
            }

            if (engineVolume <= 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
            if (year <=0) {
                this.year = 2000;
            } else {
                this.year = year;}
        }

        //metod

       public void characteristics () {
            System.out.println("Марка автомобиля: " + brand + ". Модель: " + model + ". Объем двигателя: " + engineVolume + " л. Цвет кузова: " + color + ". Год производства: " + year + ". Страна сборки: " + country + ". " );
        }
        public void tyreType () {
        if (LocalDate.now().getMonthValue(from = 1, to = 12)) {

            }

        }
        //getter and setter

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public boolean isTyre() {
        return tyre;
    }

    public void setTyre(boolean tyre) {
        this.tyre = tyre;
    }
}
