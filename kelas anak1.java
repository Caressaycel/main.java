// Kelas Anak 1: Mawar (Mewarisi dari Tanaman)
class Mawar extends Tanaman {
    private String jenisMawar;

    public Mawar() {
        super();
        this.jenisMawar = "Mawar biasa";
    }

    public Mawar(String nama, String warna, String jenisMawar) {
        super(nama, warna);
        this.jenisMawar = jenisMawar;
    }

    public String getJenisMawar() {
        return jenisMawar;
    }

    public void setJenisMawar(String jenisMawar) {
        this.jenisMawar = jenisMawar;
    }

    // Overriding method deskripsi
    @Override
    public void deskripsi() {
        System.out.println(getNama() + " adalah bunga mawar dengan jenis " + jenisMawar + " berwarna " + getWarna());
    }
}