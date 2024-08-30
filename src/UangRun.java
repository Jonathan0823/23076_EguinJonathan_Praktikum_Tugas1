
public class UangRun {
    public static void main(String[] args) {

        System.out.println("Selamat Datang di Bank ABC");
        
        TambahUang uang = new TambahUang();
        uang.getSaldo();

        uang.simpanUang(500000);  
        uang.getSaldo();

        uang.ambilUang(150000);
        uang.getSaldo();
    }
}
