package pack;


import pack.a.User;


public class PackageMain3 {
    public static void main(String[] args) {
        // 다른 패키지에 클래스 이름이 같다면 하나만 import할 수 있다.
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
