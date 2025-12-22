package core2;

public class AccountExistExpection extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountExistExpection(String message) {
		super(message);
	}

}
