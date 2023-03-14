public class Main {
    public static void main(String[] args) {

        double ticketCost = 8150;
        double sumForMile = 20;

        System.out.println("Стоимость билета: " + ticketCost);
        System.out.println("Количество начисленных миль: " + (int)(ticketCost / sumForMile));
    }
}