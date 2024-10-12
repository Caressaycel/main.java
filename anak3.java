
// Kelas Anak 3: Teratai (Mewarisi dari Habitat)
class Teratai extends Habitat {
    private String airTawar;

    public Teratai() {
        super();
        this.airTawar = "Ya";
    }

    public Teratai(String lokasi, String airTawar) {
        super(lokasi);
        this.airTawar = airTawar;
    }

    public String getAirTawar() {
        return airTawar;
    }

    public void setAirTawar(String airTawar) {
        this.airTawar = airTawar;
    }

    // Overriding method tempatTumbuh
    @Override
    public void tempatTumbuh() {
        System.out.println("Teratai tumbuh di lokasi " + getLokasi() + " dengan kondisi air tawar: " + airTawar);
    }
}