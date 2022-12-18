public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    Car(String brand,String model, double engineVolume, String color, int year, String country){
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
    }

    @Override
    public String toString() {
        return  brand + " " + model + " " +
                year + " года выпуска, " +
                "сборка произведена в " + country
                +", кузов " + color + " цвета, объем двигателя - " +
                engineVolume +" л.";
    }
}
