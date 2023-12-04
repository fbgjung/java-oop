package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 참조값을 가지게 한다 -> NullPointerException 발생하지 않음
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
