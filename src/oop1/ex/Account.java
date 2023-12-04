package oop1.ex;

public class Account {
    int balance;

    // 입금시 잔액이 증가한다.
    void deposit (int amount){
        balance += amount;
    }

    // 출금시 잔액이 감소한다.
    void withdraw(int amount){
        // 만약 잔액이 부족하면 잔액 부족을 출력해야 한다.
        if(balance >= amount ){
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}