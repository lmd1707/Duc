import java.util.HashSet;
import java.util.Set;
public class Hashset {
    public static void main(String[] args) {
        Set<String> danhSachSinhVien= new HashSet<String>();
        danhSachSinhVien.add("An");
        danhSachSinhVien.add("Binh");
        danhSachSinhVien.add("An");

        System.out.println(" Danh sach sinh vien");
        for (String s : danhSachSinhVien) {
            System.out.println(s);
        }

        String sv = "Binh";
        if (danhSachSinhVien.contains(sv)) {
            System.out.println(sv + " co trong danh sach sinh vien");
        } else {
            System.out.println(sv + " khong co ten tron danh sach sinh vien");
        }



    }
}
