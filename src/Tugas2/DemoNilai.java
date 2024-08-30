package Tugas2;
public class DemoNilai {
    public static void main(String[] args){
        Nilai siswa1 = new Nilai();
        siswa1.NIM = 1238734;
        siswa1.nama = "Andi";
        siswa1.NilaiAbsen = 92;
        siswa1.NilaiTugas = 84;
        siswa1.NilaiUTS = 75;
        siswa1.NilaiUAS = 67;

        Nilai siswa2 = new Nilai();
        siswa2.NIM = 847359;
        siswa2.nama = "Diluc Ragvindr";
        siswa2.NilaiAbsen = 72;
        siswa2.NilaiTugas = 94;
        siswa2.NilaiUTS = 95;
        siswa2.NilaiUAS = 77;
        
        //Output Nilai
        siswa1.CetakNilai();
        siswa2.CetakNilai();
    }
}