package core2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	private Map<Long, Account> mapAccount = new HashMap<>();

	public Bank() {
		mapAccount.put(1L, new Account(1, "Thien"));
		mapAccount.put(2L, new Account(2, "An"));
	}

	public boolean register(long id, String name) {
		try {

			if (id <= 0) {
				throw new IllegalArgumentException("Id invalid!");
			}

			if (name.trim().length() == 0) {
				throw new IllegalArgumentException("Name invalid!");
			}

			if (mapAccount.containsKey(id)) {
				throw new AccountExistExpection("Account with id " + id + " exist!");
			}

			mapAccount.put(id, new Account(id, name));

			System.out.println("Register successfully!");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return false;
		}
	}

	public long login(long id) {
		try {
			if (id <= 0) {
				throw new IllegalArgumentException("Id invalid!");
			}

			if (!mapAccount.containsKey(id)) {
				throw new AccountNotFoundExpection("Account with id " + id + " not found!");
			}

			System.out.println("Login successfully!");
			return id;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return -1;
		}
	}

	public void viewBalance(long id) {
		System.out.println("Balance of " + mapAccount.get(id).getName() + " is: " + mapAccount.get(id).getBalance());
	}

	public boolean sendMoney(long id, long money) {
		Account ac = mapAccount.get(id);
		try {
			ac.deposit(money);
			System.out.println("Send money successfully!");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean withDrawMoney(long id, long money) {
		Account ac = mapAccount.get(id);
		try {
			ac.withdraw(money);
			System.out.println("With draw money successfully!");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean transferMoney(long id, long receiveId, long money) {
		Account ac = mapAccount.get(id);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("tranfer.log", true))) {

			if (receiveId <= 0) {
				throw new IllegalArgumentException("Receive id invalid!");
			}

			if (receiveId == id) {
				throw new RuntimeException("Unable to send myself!");
			}

			if (!mapAccount.containsKey(receiveId)) {
				throw new AccountNotFoundExpection("Account with receive id " + receiveId + " not found!");
			}

			Account receiveAc = mapAccount.get(receiveId);

			Account first = id < receiveId ? ac : receiveAc;
			Account second = id < receiveId ? receiveAc : ac;

			synchronized (first) {
				synchronized (second) {
					ac.withdraw(money);
					receiveAc.deposit(money);
				}
			}

			LocalDateTime current = LocalDateTime.now();

			// Log to file
			bw.write(id + ", " + receiveId + ", " + money + ", " + current + "\n");

			System.out.println("Transfer money successfully!");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return false;
		}
	}
}
