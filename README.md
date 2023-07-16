# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data hewan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa jenis dan Id hewan, dan memberikan output berupa informasi detail dari Id tersebut seperti tahun didata, jenis makanan, status populasi, dan data keberapa.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `hewan`, `hewanDetail`, dan `hewanBeraksi` adalah contoh dari class.

```bash
public class hewan {
    ...
}

public class hewanDetail extends hewan {
    ...
}

public class hewanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
mhlk[i] = new hewanDetail(jenis, idhwn);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `npm` adalah contoh atribut.

```bash
String jenis;
String idhwn;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `hewan` dan `hewanDetail`.

```bash
public hewan(String jenis, String idhwn) {    
        this.jenis = jenis;
        this.idhwn = idhwn;
    }

public hewanDetail(String jenis, String idhwn) {
        super(jenis, idhwn);
    } 
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJenis` dan `setIdhwn` adalah contoh method mutator.

```bash
public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setIdhwn(String idhwn) {    
        this.idhwn = idhwn;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJenis`, `getIdhwn`, `getTahun`, `getMakan`, `getStatus`, dan `getDatake` adalah contoh method accessor.

```bash
public String getJenis() {
        return jenis;
    }

    public String getIdhwn() {
        return idhwn;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `jenis` dan `Idhwn` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String jenis;
protected String idhwn;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `hewanDetail` mewarisi `hewan` dengan sintaks `extends`.

```bash
public class hewanDetail extends hewan{
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilanInfo(String)` di `hewan` merupakan overloading method `tampilanInfo` dan `tampilanInfo` di `hewanDetail` merupakan override dari method `tampilanInfo` di `hewan`.

```bash
public String tampilanInfo(String tipe){
        return tampilanInfo() + "\nTipe: "+tipe;
    }

@Override
    public String tampilanInfo(){
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getMakan`, `getStatus`.

```bash
public String getMakan(){
        String kodeMkn = (getIdhwn().substring(2, 3));
        //seleksi
        switch(kodeMkn){
            case "1":
                return "Karnivora";
            case "2":
                return "Herbivora";
            default:
                return "Omnivora";
        }
    }
    
    public String getStatus(){
        String kodeStatus = (getIdhwn().substring(3, 5));
        switch(kodeStatus){
            case "11":
                return "Terancam Punah";
            case "22":
                return "aman";
            default:
                return "tidak diketahui";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<mhlk.length; i++) {
    ...
}
for(hewanDetail data: mhlk){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Jenis hewan "+(i+1)+": ");
                String jenis = scanner.nextLine();
System.out.print("Masukkan Id hewan    "+(i+1)+": ");
                String idhwn = scanner.nextLine();

System.out.println("========================");
System.out.println("Data Hewan: ");
System.out.println(data.tampilanInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `hewanDetail[] mhlk = new hewanDetail[2];` adalah contoh penggunaan array.

```bash
hewanDetail[] mhlk = new hewanDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    catch (NumberFormatException e){
            System.out.println("error pada nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("error pada format jumlah: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("error umum: "+e.getMessage());
        }
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Sya'ban Firmansyah
NPM : 2110010280
