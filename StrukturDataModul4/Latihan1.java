package LatihanPraktikum.StrukturDataModul4;

import java.util.HashMap;
import java.util.Scanner;

public class Latihan1 {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Latihan1 (String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Latihan1>  mhs = new HashMap<>();
        String input;
        Latihan1 data;

        mhs.put("1", new Latihan1("Putri", "3H", "Struktur data", 2020000));
        mhs.put("2", new Latihan1("Agus", "3A", "Matematika", 2020012));
        mhs.put("3", new Latihan1("Arro", "3O", "Pemrograman", 2020017));

        System.out.println("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ", Kelas : " +
                    data.kelas + ", Mata Kuliah praktikum : " + data.matkulPraktikum +
                    ", Nim : " + data.nim);
        }
    }
}
