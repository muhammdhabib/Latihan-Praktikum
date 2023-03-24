package LatihanPraktikum.StrukturDataModul2;

import java.util.ArrayList;

public class Latihan1 {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();

        Hewan.add(0, "Sapi");
        Hewan.add(1, "Kelinci");
        Hewan.add(2, "Kambing");
        Hewan.add(3, "Unta");
        Hewan.add(4, "Domba");

        System.out.println("Hewan : " + Hewan);

        int startIndex = 1;
        int endIndex = 4;
        System.out.println("Hewan yang dihapus : ");
        System.out.println(Hewan.subList(startIndex, endIndex));

        Hewan.remove("Kelinci");
        Hewan.remove("Kambing");
        Hewan.remove("Unta");
        System.out.println("Hewan yang masih Hidup : ");
        System.out.println(Hewan);
    }
}
