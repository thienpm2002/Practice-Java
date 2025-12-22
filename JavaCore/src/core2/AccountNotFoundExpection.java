package core2;

public class AccountNotFoundExpection extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountNotFoundExpection(String message) {
		super(message);
	}

}
