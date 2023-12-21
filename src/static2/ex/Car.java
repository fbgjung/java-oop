package static2.ex;

public class Car {
    private String name; // 인스턴스 마다 다르다, 인스턴스 변수를 사용해야 함
    private static int totalCars;

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: " + totalCars);
    }
}