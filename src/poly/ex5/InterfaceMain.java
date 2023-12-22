package poly.ex5;


public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 생성 불가
//        InterfaceAnimal interfaceAnimal1 = new InterfaceAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("소리 테스트 시작");
        animal.sound();
        System.out.println("소리 테스트 종료");
    }
}
