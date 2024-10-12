// Kelas Induk 1: Tanaman
class Tanaman {
    private String nama;
    private String warna;

    // Constructor Overloading
    public Tanaman() {
        this.nama = "Tanaman";
        this.warna = "Tidak Diketahui";
    }

    public Tanaman(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method yang akan di-overload
    public void deskripsi() {
        System.out.println("Ini adalah tanaman bernama " + nama);
    }

    public void deskripsi(String tambahan) {
        System.out.println("Tanaman ini memiliki tambahan informasi: " + tambahan);
    }
}