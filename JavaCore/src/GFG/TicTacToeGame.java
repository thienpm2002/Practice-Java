package GFG;

import java.util.Scanner;

public class TicTacToeGame {

	static boolean play(String[] board) {
		String result = null;
		for (int i = 0; i < 9; i++) {
			switch (i) {
			case 0:
				result = board[0] + board[1] + board[2];
				if (result.equals("XXX") || result.equals("OOO"))
					return true;
				break;
			case 1:
				result = board[3] + board[4] + board[5];
				if (result.equals("XXX") || result.equals("OOO"))
					return true;
				break;
			case 2:
				result = board[6] + board[7] + board[8];
				if (result.equals("XXX") || result.equals("OOO"))
					return true;
				break;
			case 3:
				result = board[0] + board[3] + board[6];
				if (result.equals("XXX") || result.equals("OOO"))
					return true;
				break;
			case 4:
				result = board[1] + board[4] + board[7];
				if (result.equals("XXX") || result.equals("OOO"))
					return true;
				break;
			case 5:
				result = board[2] + board[5] + board[8];
				if (result.equals("XXX") || result.equals("OOO"))
					return true;
				break;
			case 6:
				result = board[0] + board[4] + board[8];
				if (result.equals("XXX") || result.equals("OOO"))
					return true;
				break;
			case 7:
				result = board[2] + board[4] + board[6];
				if (result.equals("XXX") || result.equals("OOO"))
					return true;
				break;
			case 8:
				result = board[1] + board[4] + board[8];
				if (result.equals("XXX") || result.equals("OOO"))
					return true;
				break;
			}
		}
		return false;
	}

	static void print(String[] board) {
		for (String x : board) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] board = new String[9];
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}
		int input;
		int i = 1;
		System.out.println("---------------------- Tic-Tac-Toe Game ----------------------");
		while (i <= 9) {
			if (i % 2 == 0) {
				System.out.println("O chon vi tri: ");
				input = s.nextInt();
				board[--input] = "O";
			} else {
				System.out.println("X chon vi tri: ");
				input = s.nextInt();
				board[--input] = "X";
			}

			// Logic game
			if (play(board)) {
				System.out.println(board[input] + " win!");
				return;
			}

			i++;
		}
		System.out.println("Draw!");
		s.close();
	}
}
