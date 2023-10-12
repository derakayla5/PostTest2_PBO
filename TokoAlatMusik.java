
package tokoalatmusik;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import entitas.AlatMusik;

public final class TokoAlatMusik {
    
    public final static void main(String[] args) {
        ArrayList<AlatMusik> daftarAlatMusik = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        
        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("Selamat Datang di Toko Alat Musik Hobbies");
            System.out.println("-----------------------------------------");
            System.out.println("Pilih Menu:");
            System.out.println("1. Tambah Alat Musik");
            System.out.println("2. Lihat Daftar Alat Musik");
            System.out.println("3. Update Alat Musik");
            System.out.println("4. Hapus Alat Musik");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            String pilihan = scanner.nextLine();

            
            
            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan Nama Alat Musik: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Harga Alat Musik: ");
                    double harga = Double.parseDouble(scanner.nextLine());

                
                AlatMusik alatMusik = new AlatMusik(nama, harga);
                
                    daftarAlatMusik.add(alatMusik);
                    System.out.println("Alat Musik berhasil ditambahkan!");
                    break;

                case "2":
                    if (daftarAlatMusik.isEmpty()) {
                        System.out.println("Daftar Alat Musik Tidak Tersedia");
                    } else {
                        System.out.println("Daftar Alat Musik:");
                        for (AlatMusik am : daftarAlatMusik) {
                            System.out.println(am);
                        }
                    }
                    break;

                case "3":
                    System.out.print("Masukkan Nama Alat Musik yang akan diupdate: ");
                    String namaUpdate = scanner.nextLine();
                    boolean ditemukanUpdate = false;

                    for (int i = 0; i < daftarAlatMusik.size(); i++) {
                        AlatMusik am = daftarAlatMusik.get(i);
                        if (am.getNama().equalsIgnoreCase(namaUpdate)) {
                            System.out.print("Masukkan Nama Baru: ");
                            String namaBaru = scanner.nextLine();

                            System.out.print("Masukkan Harga Baru: ");
                            double hargaBaru = Double.parseDouble(scanner.nextLine());

                            am.setNama(namaBaru);
                            am.setHarga(hargaBaru);

                            System.out.println("Alat Musik berhasil diupdate!");
                            ditemukanUpdate = true;
                            break;
                        }
                    }

                    if (!ditemukanUpdate) {
                        System.out.println("Alat Musik tidak ditemukan.");
                    }
                    break;


                case "4":
                    System.out.print("Masukkan nama Alat Musik yang ingin dihapus: ");
                    String namaAlatMusikHapus = scanner.nextLine();

                    Iterator<AlatMusik> iterator = daftarAlatMusik.iterator();
                    while (iterator.hasNext()) {
                        AlatMusik objekAlatMusik = iterator.next();
                        if (objekAlatMusik.getNama().equalsIgnoreCase(namaAlatMusikHapus)) {
                            iterator.remove();
                        }
                    }
                    break;

                case "5":
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
