import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car ("Лада","Гранта",1.7,"желтого",2015,"России",
                "front","sports",231,2,true);
        Car audiA8 = new Car ("Ауди","A8",3.0,"черного",2020,"Германии",
                "fool","sports",2123,4,true);
        Car bmw_Z8 = new Car("BMW", "Z8",3.0,"черного",2021,"Германии","auto",
                "sports",342,4,false);
        Car kiaSportageFour = new Car("Кия","Спортайдж 4-поколения",2.4,"красного",2018,"Южной корее",
                "auto","cuv",122,6,false);
        Car hyundayAvante = new Car("Хендай", "Авант", 1.6, "оранжевого", 2016, "Южной Кореи"
        ,"front","sedan",421,4,true);
        System.out.println(ladaGranta);
      /*  System.out.println(audiA8);
        System.out.println(bmw_Z8);
        System.out.println(kiaSportageFour);
        System.out.println(hyundayAvante);*/
       Car.swapRubber(ladaGranta.getSummerTiresCheck());

    }
}
