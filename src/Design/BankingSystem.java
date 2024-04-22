package Design;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BankingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> accountMap = new HashMap<>();
		Map<String, Integer> transMap = new HashMap<>();
		Map<String, TransferModel> loanMap = new HashMap<>();
		int transferNo = 1;
		while (true) {
			String n = sc.nextLine();

			switch (n) {
			case "create":
				String name = sc.nextLine();
				createAccount(accountMap, transMap, name);
				break;
			case "deposit":
				name = sc.nextLine();
				int amount = sc.nextInt();
				deposit(accountMap, transMap, name, amount);
				break;
			case "pay":
				name = sc.nextLine();
				amount = sc.nextInt();
				pay(accountMap, transMap, name, amount);
				break;
			case "top":
				int num = sc.nextInt();
				getTopActivity(transMap, num);
				break;
			case "transfer":
				String source = sc.nextLine();
				String destination = sc.nextLine();
				int money = sc.nextInt();
				String transferId = "transfer" + transferNo++;
				transfer(transferId, source, destination, money, loanMap, accountMap, transMap);
				break;
			case "acceptTransfer":
				String beneficionaryAcc = sc.nextLine();
				String transferRef = sc.nextLine();
				acceptTransfer(beneficionaryAcc, transferRef, loanMap, accountMap, transMap);
				break;
			}
		}
	}

	private static void createAccount(Map<String, Integer> accountMap, Map<String, Integer> transMap, String name) {

		if (!accountMap.containsKey(name)) {
			accountMap.put(name, 0);
			transMap.put(name, 0);
			System.out.println("Account created sucessfully!! for user :: " + name);

		} else {
			System.out.println("Account :: " + name + " already exits!!");
		}
	}

	private static void deposit(Map<String, Integer> accountMap, Map<String, Integer> transMap, String name,
			int amount) {
		if (!accountMap.containsKey(name)) {
			System.out.println("User :: " + name + " not exists");
		} else {
			int prevAmount = accountMap.get(name);
			int transAmount = transMap.get(name);
			accountMap.put(name, prevAmount + amount);
			transMap.put(name, transAmount + amount);
			System.out.println("Amount :: " + amount + " deposited successfully for user : " + name);
			System.out.println("Available balance :: " + accountMap.get(name));
		}

	}

	private static void pay(Map<String, Integer> accountMap, Map<String, Integer> transMap, String name, int amount) {
		int prevAmount = accountMap.get(name);
		if (!accountMap.containsKey(name)) {
			System.out.println("User :: " + name + " not exists");
		} else if (prevAmount < amount) {
			System.out.println("you need " + (amount - prevAmount) + " more to pay" + amount);
		} else {
			int transAmount = transMap.get(name);
			accountMap.put(name, prevAmount - amount);
			transMap.put(name, transAmount + amount);
			System.out.println("Amount :: " + amount + " paid successfully for user : " + name);
			System.out.println("Available balance :: " + accountMap.get(name));
		}

	}

	private static void getTopActivity(Map<String, Integer> transMap, int num) {
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int result = transMap.get(o2) - transMap.get(o1);
				return result == 0 ? o1.compareTo(o2) : result;
			}
		};
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(c);
		tm.putAll(transMap);

		tm.entrySet().stream().limit(num).forEach(a -> System.out.println(a.getKey() + " " + a.getValue()));

	}

	private static void transfer(String transferId, String source, String destination, int money,
			Map<String, TransferModel> loanMap, Map<String, Integer> accountMap, Map<String, Integer> transMap) {

		TransferModel t = new TransferModel();
		t.setSource(source);
		t.setDestination(destination);
		t.setTransTime(System.currentTimeMillis());
		t.setAmountToTransfer(money);
		t.setApproved(false);

		if (accountMap.get(source) < money) {
			System.out.println("you need " + (money - accountMap.get(source)) + "more  to transfer" + money);
			return;
		}
		accountMap.put(source, accountMap.get(source) - money);
		transMap.put(source, transMap.get(source) + money);
		System.out.println(
				"ticket " + transferId + " initiated from " + source + " to " + destination + " for " + money + " rs");
		loanMap.put(transferId, t);

	}

	private static void acceptTransfer(String beneficionaryAcc, String transferRef, Map<String, TransferModel> loanMap,
			Map<String, Integer> accountMap, Map<String, Integer> transMap) {
		if (!loanMap.containsKey(transferRef)) {
			System.out.println("no such transfer request");
			return;
		}
		TransferModel transferModel = loanMap.get(transferRef);

		if (!transferModel.isApproved() && System.currentTimeMillis() - transferModel.getTransTime() <= 10) {
			transferModel.setApproved(true);
			accountMap.put(transferModel.getDestination(),
					accountMap.get(transferModel.getDestination()) + transferModel.getAmountToTransfer());
			transMap.put(transferModel.getDestination(),
					transMap.get(transferModel.getDestination()) + transferModel.getAmountToTransfer());
			System.out.println(beneficionaryAcc + " received " + transferModel.getAmountToTransfer() + " rs from "
					+ transferModel.getSource());
		} else {
			accountMap.put(transferModel.getSource(),
					accountMap.get(transferModel.getSource()) + transferModel.getAmountToTransfer());
			transMap.put(transferModel.getSource(),
					transMap.get(transferModel.getSource()) + transferModel.getAmountToTransfer());
			System.out.println("request expired");
			return;

		}
	}
}

class TransferModel {
	String source;
	String destination;
	long transTime;
	int amountToTransfer;
	boolean isApproved;

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public long getTransTime() {
		return transTime;
	}

	public void setTransTime(long transTime) {
		this.transTime = transTime;
	}

	public int getAmountToTransfer() {
		return amountToTransfer;
	}

	public void setAmountToTransfer(int amountToTransfer) {
		this.amountToTransfer = amountToTransfer;
	}

	@Override
	public String toString() {
		return "TransferModel [source=" + source + ", destination=" + destination + ", transTime=" + transTime
				+ ", amountToTransfer=" + amountToTransfer + ", isApproved=" + isApproved + "]";
	}

}
