// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Instansiasi objek Mawar (Anak 1)
        Mawar mawar = new Mawar("Mawar Merah", "Merah", "Mawar Hibrida");
        mawar.deskripsi();  // Overriding method deskripsi
        mawar.setWarna("Putih");
        System.out.println("Warna bunga setelah diubah: " + mawar.getWarna());

        // Instansiasi objek Tulip (Anak 2)
        Tulip tulip = new Tulip("Tulip Holland", "Kuning", "Musim Semi");
        tulip.deskripsi();  // Overriding method deskripsi
        tulip.deskripsi("Bunga ini sangat indah");  // Overloading method deskripsi

        // Instansiasi objek Teratai (Anak 3)
        Teratai teratai = new Teratai("Kolam Taman", "Ya");
        teratai.tempatTumbuh();  // Overriding method tempatTumbuh
    }
}