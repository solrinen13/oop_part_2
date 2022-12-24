package Transport;

public class Car {
    private final   String brand;
    private final  String model;
    private final  double engineVolume;
    private   String color;
    private final  int year;
    private final  String country;

    private  String transmission;
    private final String bodyType;
    private final int registrationNumber;
    private int numberSeats;
    private boolean summerTiresCheck;


    public Car(String brand,String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType,int registrationNumber,int numberSeats, boolean summerTiresCheck){

         if (brand != null && !brand.equals("")){
        this.brand = brand;
        }else {
            this.brand = "default";
        }
         if (model != null && !model.equals("")){
            this.model = model;
        }else {
            this.model = "default";
        }
         if (country != null && !country.equals("")) {
            this.country = country;
        }else {
            this.country = "default";
        }
         if (engineVolume >= 0) {
             this.engineVolume = engineVolume;
         }else{
             this.engineVolume = 1.5;
         }
         if (color != null && !color.equals("")) {
             this.color = color;
         }else{
             this.color = "белого";
         }
         if (year >= 0) {
             this.year = year;
         }else {
             this.year = 2000;
         }

        this.bodyType = bodyType;

         if ( transmission !=null && !color.equals("")){
             this.transmission = transmission;
         }else{
             System.out.println("Данные о трансмиссии не загружены");
         }
        if (registrationNumber >= 0) {
            this.registrationNumber = registrationNumber;
        }else {
            this.registrationNumber = 001;
        }
        if (numberSeats >= 0) {
            this.numberSeats = numberSeats;
        }else {
            System.out.println("Данные о местах не загружены");
        }

        this.summerTiresCheck = summerTiresCheck;


    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public boolean isSummerTiresCheck() {
        return summerTiresCheck;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public void setSummerTiresCheck(boolean summerTiresCheck) {
        this.summerTiresCheck = summerTiresCheck;
    }

    @Override
    public String toString() {
        return  brand + " " + model + " " +
                year + " года выпуска, " +
                "сборка произведена в " + country
                +", кузов " + color + " цвета, объем двигателя - " +
                engineVolume +" л. Из прочего стоит выделить что машина имеет " +transmission +" трансмиссию, "+
                bodyType+ " тип кузова, "+registrationNumber+ " номер регистрации и "+numberSeats+ " места.";
    }
}
