import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Mahasiswa mhs1 = new Mahasiswa("Yoel", "rajawali", "03-12-04", "082214665243", "1123008", "IF");
        mhs1.login();

        System.out.println();
        MahasiswaSarjana mhsS1 = new MahasiswaSarjana("Budi", "Jl. Merdeka", "01-01-2000", "08123456789", "123456",
                "Informatika", Arrays.asList("Matematika", "Fisika"));
        mhsS1.login();
        System.out.println("matkul yang diambil " + mhsS1.getNama() + " adalah : " + mhsS1.getMataKuliah());

        System.out.println();
        MahasiswaMagister mhsM1 = new MahasiswaMagister("Ani", "Jl. Gatot", "02-02-1995", "08198765432", "654321",
                "Manajemen", Arrays.asList("Ekonomi", "Statistika"), "Analisis Ekonomi Digital");
        mhsM1.login();
        System.out.println("Judul Tesis: " + mhsM1.getJudulTesis());

        System.out.println();
        MahasiswaDoktor mhsD1 = new MahasiswaDoktor("Dewi", "Jl. Anggrek", "03-03-1985", "08111222333", "789012",
                "Fisika Terapan", "Studi Kuantum", 85.0, 90.0, 92.5);
        mhsD1.login();
        System.out.println("Nama Doktok : " + mhsD1.getNama());
        System.out.println("Judul Disertasi: " + mhsD1.getJudulDisertasi());
        System.out.println("Nilai Sidang 1: " + mhsD1.getNilaiSidang1());
        System.out.println("Nilai Sidang 2: " + mhsD1.getNilaiSidang2());
        System.out.println("Nilai Sidang 3: " + mhsD1.getNilaiSidang3());

        Dosen dosen = new Dosen("Dosen Agus", "Jl. An", "04-04-1980", "08123456789", "D123", "IF",
                Arrays.asList("Pemrograman", "Struktur Data"));
        dosen.login();
        System.out.println("Departemen: " + dosen.getDepartemen());
        System.out.println("Mata kuliah diajar: " + dosen.getMataKuliahDiajar());

        Karyawan karyawan = new Karyawan("Bu Siti", "Jl. Karyawan", "05-05-1975", "08198765432", "K456", 5000000,
                Arrays.asList("01-01-2024", "02-01-2024"));
        karyawan.login();
        System.out.println("Salary: " + karyawan.getSalary());
        System.out.println("Presensi Staff: " + karyawan.getPresensiStaff());

        DosenTetap dosenTetap = new DosenTetap("Pak Budi", "Jl. Pendidikan", "01-01-1980", "08123456789", "T123",
                "Matematika", Arrays.asList("Aljabar Linear", "Kalkulus"), 10000000);
        System.out.println("nama dosen tetap " + dosenTetap.getNama());
        System.out.println("Mata kuliah diajar: " + dosenTetap.getMataKuliahDiajar());
        System.out.println("Salary: " + dosenTetap.getSalary());

        DosenHonorer dosenHonorer = new DosenHonorer("Bu Lina", "Jl. Pendidikan", "02-02-1985", "08198765432", "H456",
                "Fisika", Arrays.asList("Mekanika", "Fisika Dasar"), 200000);
        dosenHonorer.login();
        System.out.println("Departemen: " + dosenHonorer.getDepartemen());
        System.out.println("Mata kuliah diajar: " + dosenHonorer.getMataKuliahDiajar());
        System.out.println("Honor per SKS: " + dosenHonorer.getHonorPerSks());

        System.out.println();
        System.out.println();
        System.out.println();

        Presensi presensiMahasiswa = new Presensi(new Date(), Status.HADIR);
        System.out.println("Tanggal: " + presensiMahasiswa.getTanggal());
        System.out.println("Status: " + presensiMahasiswa.getStatusString());

        PresensiStaff presensiStaff = new PresensiStaff(new Date(), Status.HADIR, "08:00");
        System.out.println("Tanggal: " + presensiStaff.getTanggal());
        System.out.println("Status: " + presensiStaff.getStatusString());

        System.out.println();
        System.out.println();

        MataKuliah matkul = new MataKuliah("IF101", 3, "Pemrograman Dasar");

        List<Presensi> presensiList = new ArrayList<>();
        presensiList.add(new Presensi(new Date(), Status.HADIR));
        presensiList.add(new Presensi(new Date(), Status.ALPHA));

        MatkulAmbil matkulAmbil = new MatkulAmbil(matkul, presensiList, 80, 90, 85);
        matkulAmbil.printInfo();

    }

}