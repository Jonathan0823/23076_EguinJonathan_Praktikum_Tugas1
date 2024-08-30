
public class UangRun {
    public static void main(String[] args) {

        System.out.println("Selamat Datang di Bank ABC");
        
        TambahUang uang = new TambahUang();
        uang.getSaldo();

        System.out.println("\nSimpan Uang: Rp.500000");
        uang.simpanUang(500000);  
        uang.getSaldo();

        System.out.println("\nAmbil Uang: Rp.150000");
        uang.ambilUang(150000);
        uang.getSaldo();
    }
}
