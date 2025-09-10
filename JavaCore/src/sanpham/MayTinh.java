package sanpham;

public class MayTinh extends SanPham {
	private int thue;

	public int getThue() {
		return thue;
	}

	public MayTinh() {
		super();
		// TODO Auto-generated constructor stub
		this.thue = 0;
	}

	public MayTinh(String hang, String ten, double gia, int thue) {
		super(hang, ten, gia);
		// TODO Auto-generated constructor stub
		this.thue = thue;
	}

	public void setThue(int thue) {
		this.thue = thue;
	}

	@Override
	public double tinhthue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
