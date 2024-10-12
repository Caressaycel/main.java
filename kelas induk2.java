// Kelas Induk 2: Habitat
class Habitat {
    private String lokasi;

    // Constructor Overloading
    public Habitat() {
        this.lokasi = "Tidak Diketahui";
    }

    public Habitat(String lokasi) {
        this.lokasi = lokasi;
    }

    // Getter dan Setter
    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    // Method fly
    public void tempatTumbuh() {
        System.out.println("Tanaman tumbuh di lokasi: " + lokasi);
    }
}