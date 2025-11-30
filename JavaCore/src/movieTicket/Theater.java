package movieTicket;

import java.util.List;

public class Theater {
	private String address;
	private String name;
	private List<Auditorium> auditoriums;

	public Theater(String address, String name, List<Auditorium> auditoriums) {
		super();
		this.address = address;
		this.name = name;
		this.auditoriums = auditoriums;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Auditorium> getAuditoriums() {
		return auditoriums;
	}

	public void setAuditoriums(List<Auditorium> auditoriums) {
		this.auditoriums = auditoriums;
	}

	public Theater() {
		super();
	}
}
