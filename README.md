# PostTest2_PBO



**Penjelasan Tema :**
Didalam Tema ini terdapat 2 Package yaitu Package Toko Alat Musik berisi Toko Alat Musik dan Package Entitas yang berisi AlatMusik.

**1.	Properties**

nama: Sebuah string yang mewakili nama alat musik.
harga: Sebuah angka desimal (double) yang mewakili harga alat musik.


<img width="170" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/51d42913-9b6e-4e73-b66d-c46f16e40ba7">








**2.	Konstruktor**

public AlatMusik(String nama, double harga): Konstruktor ini digunakan untuk membuat objek AlatMusik. Saat objek AlatMusik dibuat, nama dan harga alat musik harus disediakan.

<img width="298" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/5ca0025b-ace3-4443-b375-18c08397bd7f">





**3.	Method :**

getNama(): Metode ini mengembalikan nilai dari properti nama.
setNama(String nama): Metode ini memungkinkan perubahan nilai properti nama.
getHarga(): Metode ini mengembalikan nilai dari properti harga.
setHarga(double harga): Metode ini memungkinkan perubahan nilai properti harga.
toString(): Metode ini mengganti perilaku standar dari metode toString() yang diwarisi dari kelas Object. Metode ini mengembalikan representasi string dari objek AlatMusik, termasuk nama dan harga yang diformat sebagai mata uang dengan pemisah ribuan.


<img width="444" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/b9692cd2-fe8e-45c4-8799-7ab9f6fc260c">






**Kelas TokoAlatMusik (package tokoalatmusik):**

**public final static void main(String[] args):** 

metode utama (main) yang akan dijalankan saat program dimulai. Metode ini adalah titik awal eksekusi program.

**ArrayList<AlatMusik> daftarAlatMusik:**

objek ArrayList yang digunakan untuk menyimpan daftar alat musik (objek AlatMusik) yang akan dikelola dalam aplikasi.


<img width="375" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/235bd11a-631c-4095-a71e-8a0b0348f440">


**Scanner scanner:** 

objek Scanner yang digunakan untuk menerima input dari pengguna.

<img width="310" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/2f09285f-6332-4a3e-b1d5-517571822637">




**Loop while (true):** 

Program memiliki loop while (true) yang berjalan terus menerus hingga pengguna memilih untuk keluar (pilihan "5"). Ini merupakan bagian utama yang menjalankan program secara interaktif.


<img width="434" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/d760700f-aa6e-45c4-a835-e2c7be968eb0">






**Menu Interaktif:**

Program menampilkan menu interaktif dengan lima pilihan kepada pengguna, yaitu :
Pilihan 1: 
Tambah Alat Musik: Program memungkinkan pengguna untuk memasukkan nama dan harga alat musik, dan kemudian membuat objek AlatMusik yang ditambahkan ke daftar alat musik.
Pilihan 2: 
Lihat Daftar Alat Musik: Program menampilkan daftar alat musik yang telah ditambahkan oleh pengguna.
Pilihan 3:
 Update Alat Musik: Program memungkinkan pengguna untuk memperbarui nama dan harga alat musik yang sudah ada dalam daftar alat musik.
Pilihan 4: 
Hapus Alat Musik: Program memungkinkan pengguna untuk menghapus alat musik dari daftar berdasarkan nama alat musik yang dipilih.
Pilihan 5: 
Keluar: Program menampilkan pesan terima kasih dan mengakhiri eksekusi.

**Switch-Case**:

Program menggunakan struktur switch-case untuk menangani pilihan-pilihan yang dimasukkan oleh pengguna.

<img width="429" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/a9075e83-2178-403b-8419-3cd26948c267">



**Default Case:** 

Jika pengguna memasukkan pilihan yang tidak valid, program mencetak pesan bahwa pilihan tidak valid dan meminta pengguna untuk memilih lagi.

<img width="440" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/47d930dc-3f0b-4b52-8a7f-397746fb523a">




**Kelas AlatMusik (package entitas):**

**private String nama:**

Ini adalah properti untuk menyimpan nama alat musik.

<img width="176" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/ca769b2a-d2bf-45ee-a338-b09e978da504">


**private double harga:**

Ini adalah properti untuk menyimpan harga alat musik.

<img width="190" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/09648c61-a944-4f08-8f6b-65a34d382c24">



**public AlatMusik(String nama, double harga):**

Ini adalah konstruktor untuk kelas AlatMusik. Konstruktor ini digunakan untuk membuat objek AlatMusik dengan nama dan harga yang disediakan saat objek dibuat.\


<img width="282" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/e6677824-7b37-42ab-91f5-73528838f232">


**public String getNama():**

Ini adalah metode untuk mengambil nilai dari properti nama.

<img width="176" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/0aa34ffc-0133-4b4b-af9a-c39490301e15">


**public void setNama(String nama):**

Ini adalah metode yang memungkinkan perubahan nilai dari properti nama.

<img width="229" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/3e6012b2-9d07-43d0-b138-cebc8ccd632d">


**public double getHarga():** 

Ini adalah metode untuk mengambil nilai dari properti harga.

<img width="187" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/10712dfc-c1d1-499e-ba95-b247f904b4a0">



**public void setHarga(double harga):**

Ini adalah metode yang memungkinkan perubahan nilai dari properti harga.

<img width="233" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/2fd935e8-766f-4563-bbc5-50fb6ffcce7e">



**@Override public String toString():**

Ini adalah metode yang mengganti perilaku standar metode toString() yang diwarisi dari kelas Object. Metode ini mengembalikan representasi string dari objek AlatMusik, termasuk nama dan harga yang diformat sebagai mata uang dengan pemisah ribuan.


<img width="434" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/948f0267-cef2-4967-bedb-3a3ae4c76c2d">







**OUTPUT**

**Menambah Alat Musik**





<img width="286" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/ce0e5ea9-6862-474d-9bf5-6d52a0ba9685">

**Melihat Daftar Alat Musik**





<img width="233" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/0b0f9fcc-dd89-44ea-b604-2b4a8c9b9021">

**Mengupdate Alat Musik**





<img width="290" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/b8ab3c20-fe6f-475d-9312-54716af9cb30">

**Menghapus Alat Musik**




<img width="327" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/4d13683f-eba3-4e7e-aad0-8bbd47249fca">



**Menu Keluar**




<img width="247" alt="image" src="https://github.com/derakayla5/PostTest2_PBO/assets/127472591/aaa135a5-f032-4d59-884e-77e908bb10ca">







