import java.util.List;
public class MahasiswaSarjana extends Mahasiswa {
    private List<String> mataKuliah;



public MahasiswaSarjana(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan,
List<String> mataKuliah) {
    super(nama, alamat, ttl, telepon, NIM, jurusan);
    this.mataKuliah = mataKuliah;
}

public List<String> getMataKuliah() {
    return mataKuliah;
}

public void setMataKuliah(List<String> mataKuliah) {
    this.mataKuliah = mataKuliah;
}


@Override
public void login(){
    System.out.println("Mahasiswa sarjana logged in , NIM : "+ getNIM());
}
}
