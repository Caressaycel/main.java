// Kelas Anak 2: Tulip (Mewarisi dari Tanaman)
class Tulip extends Tanaman {
    private String musim;

    public Tulip() {
        super();
        this.musim = "Musim Semi";
    }

    public Tulip(String nama, String warna, String musim) {
        super(nama, warna);
        this.musim = musim;
    }

    public String getMusim() {
        return musim;
    }

    public void setMusim(String musim) {
        this.musim = musim;
    }

    // Overriding method deskripsi
    @Override
    public void deskripsi() {
        System.out.println(getNama() + " adalah bunga tulip yang tumbuh di musim " + musim + " dengan warna " + getWarna());
    }
}