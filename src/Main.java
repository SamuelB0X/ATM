public class Main {
    public static void main(String[] args) {
        System.out.println("Dinero total en el sistema: $" + ATM.totalMoney);
        System.out.println("Número total de cajeros: " + ATM.numATMs);

        ATM fristATM = new ATM(1000, "Bancolombia");
        ATM secondATM = new ATM(500, "Daviplata");
        fristATM.withdrawMonte(350);
        secondATM.withdrawMonte(200);
        fristATM.depositMoney(800);
        secondATM.depositMoney(1200);
        fristATM.checkBalance();
        secondATM.checkBalance();

        System.out.println("Dinero total en el sistema: $" + ATM.totalMoney);
        System.out.println("Número total de cajeros: " + ATM.numATMs);
        ATM.averageMoney();


    }
}
