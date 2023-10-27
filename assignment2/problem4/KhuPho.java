package problem4;
import java.util.ArrayList;
class KhuPho {
    private int soNha;
    private ArrayList<Nguoi> hoGiaDinh = new ArrayList<>();

    public KhuPho(int soNha) {
        this.soNha = soNha;
    }

    public void themHoGiaDinh(Nguoi nguoi) {
        hoGiaDinh.add(nguoi);
    }

    public String toString() {
        String result = "Số nhà: " + soNha + "\n";
        for (Nguoi nguoi : hoGiaDinh) {
            result += nguoi.toString() + "\n";
        }
        return result;
    }
}