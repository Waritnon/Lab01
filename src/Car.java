public class Car {
    int speed;
    void printSpeed() {
        System.out.println("current speed is "+ speed + " Km/hr");
    }
    Car(int _speed){
       this.speed = _speed;
    }
    Car(){
        this(0);
    }
}
