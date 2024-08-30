package Bank;

public class BankBeraksi {
    public static void main(String[] args) {

        System.out.println("Selamat Datang di Bank ABC");
        
        Bank uang = new Bank(100000);
        uang.getSaldo();

        uang.simpanUang(500000);  
        uang.getSaldo();

        uang.ambilUang(150000);
        uang.getSaldo();
    }
}
