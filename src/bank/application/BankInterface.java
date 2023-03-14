package bank.application;

public interface BankInterface {

    public int checkBalance(String password);

    public String addMoney(int money);

    public String  withdrawMoney(int money, String password);

    public String changesPassword(String oldPassword, String newPassword);

    public double calculateTotalInterest(int years);

    /*
    Future TODO
        We will try to transfer money within same bank
     */
}
