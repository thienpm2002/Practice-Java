package bangcuuchuong;

public class BangCuuChuong {
	private So[] bang = new So[11];

	public void inBang() {
		for (int i = 1; i < bang.length; i++) {
			bang[i] = new So(i);
			bang[i].inTTin();
		}
	}
}
