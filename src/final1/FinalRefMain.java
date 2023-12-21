package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        // 참조형 변수 data에 final 붙음
        // 이 경우 참조형 변수에 들어있는 참조값을 다른 값으로 변경하지 못한다.
        final Data data = new Data();
//        data = new Data(); // 변경 불가, compile error

        // 참조 대상의 값은 변경 가능
        data.value=10;
        System.out.println(data.value);
        data.value=20;
        System.out.println(data.value);

    }
}
