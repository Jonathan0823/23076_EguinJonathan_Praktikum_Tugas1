
public class TambahUang {
    int saldo=100000;

    void simpanUang(int a){
        saldo = saldo + a;
    }
    
    void ambilUang(int a){
        saldo = saldo - a;
    }
    
    void getSaldo(){
        System.out.println("Saldo saat ini:Rp. "+saldo);
    }

}
