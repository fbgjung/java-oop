package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // data 변수에는 아직 가리키는 객체가 없다
        System.out.println("1. data = " + data);  // null
        data  = new Data();
        System.out.println("2. data = " + data); // 참조값
        data = null;
        System.out.println("3. data = " + data); // null
    }
}