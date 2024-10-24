import java.util.List;

public class MahasiswaMagister extends Mahasiswa {
    private List<String> mataKuliah;
    private String judulTesis;

    // Constructor
    public MahasiswaMagister(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan, List<String> mataKuliah, String judulTesis) {
        super(nama, alamat, ttl, telepon, NIM, jurusan);
        this.mataKuliah = mataKuliah;
        this.judulTesis = judulTesis;
    }

    
    public List<String> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(List<String> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public void login() {
        System.out.println("Mahasiswa Magister logged in, NIM: " + getNIM());
    }
}
