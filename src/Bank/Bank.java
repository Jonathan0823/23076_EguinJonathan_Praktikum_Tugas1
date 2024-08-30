package Bank;

public class Bank {
    int saldo;

    public Bank(int uang){
        saldo = uang;
    }

    void simpanUang(int a){
        System.out.println("\nSimpan Uang:Rp. "+a);
        saldo = saldo + a;
    }
    
    void ambilUang(int a){
        System.out.println("\nAmbil Uang:Rp. "+a);
        saldo = saldo - a;
    }
    
    void getSaldo(){
        System.out.println("Saldo saat ini:Rp. "+saldo);
    }

}
