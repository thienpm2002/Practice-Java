package dongvat;

public class DongVat {
	protected String ten;
	protected int tuoi;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public DongVat() {
		this.ten = "";
		this.tuoi = 0;
	}

	public DongVat(String ten, int tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
	}

	public void keu() {
		System.out.println("Phat ra tieng");
	}

}
