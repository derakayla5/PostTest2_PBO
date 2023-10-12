package entitas;

import java.text.DecimalFormat;

public class AlatMusik {
    private String nama;
    private double harga;  // Menghapus "final" dari harga

    public AlatMusik(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {  // Mengizinkan perubahan harga
        this.harga = harga;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedHarga = decimalFormat.format(harga);

        return "Nama: " + nama + ", Harga: Rp " + formattedHarga;
    }

}
