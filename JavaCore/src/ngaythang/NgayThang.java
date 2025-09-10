package ngaythang;

public class NgayThang {

	static void laySoNgay(int thang, int nam) {
		if (thang == 2 && nam % 4 == 0) {
			System.out.println("Thang " + thang + " nam" + nam + " co " + "29 ngay");
		} else if (thang == 2 && nam % 4 != 0) {
			System.out.println("Thang " + thang + " nam " + nam + " co " + "28 ngay");
		} else if (thang % 2 == 1 || thang == 8) {
			System.out.println("Thang " + thang + " nam " + nam + " co " + "31 ngay");
		} else {
			System.out.println(" Thang " + thang + " nam " + nam + " co " + "30 ngay");
		}
	}
}
