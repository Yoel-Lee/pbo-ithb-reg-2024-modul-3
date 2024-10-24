public class Mahasiswa extends User{
    String NIM;
    String jurusan;

    
    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan) {
        super(nama, alamat, ttl, telepon); 
        this.NIM = NIM;
        this.jurusan = jurusan;
    }
    
    public String getNIM() {
          return NIM;
      }
  
      public void setNIM(String nIM) {
          NIM = nIM;
      }
  
      public String getJurusan() {
          return jurusan;
      }
  
      public void setJurusan(String jurusan) {
          this.jurusan = jurusan;
      }

      @Override
      public void login(){
        System.out.println("Mahasiswa logged in , NIM : "+NIM);
      }


}