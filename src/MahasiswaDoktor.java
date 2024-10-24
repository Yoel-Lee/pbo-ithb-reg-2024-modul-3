public class MahasiswaDoktor extends Mahasiswa {
    private String judulDisertasi;
    private double nilaiSidang1;
    private double nilaiSidang2;
    private double nilaiSidang3;

    
    
    public MahasiswaDoktor(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan, String judulDisertasi, double nilaiSidang1, double nilaiSidang2, double nilaiSidang3) {
        super(nama, alamat, ttl, telepon, NIM, jurusan);
        this.judulDisertasi = judulDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }
    
    
    public String getJudulDisertasi() {
        return judulDisertasi;
    }


    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }


    public double getNilaiSidang1() {
        return nilaiSidang1;
    }


    public void setNilaiSidang1(double nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }


    public double getNilaiSidang2() {
        return nilaiSidang2;
    }


    public void setNilaiSidang2(double nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }


    public double getNilaiSidang3() {
        return nilaiSidang3;
    }


    public void setNilaiSidang3(double nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

        public void login(){
            System.out.println("Mahasiswa Doktor Logged in , NIM : "+getNIM());
        }
    

    
}