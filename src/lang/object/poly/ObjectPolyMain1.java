package lang.object.poly;

public class ObjectPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj){
//        obj.move();
//        obj.sound(); Object에 move와 sound가 없다. 그럼에도 구현해주고 싶다면 다운캐스팅 한다.

        if (obj instanceof Dog dog){
            dog.sound();
        }
    }
}
