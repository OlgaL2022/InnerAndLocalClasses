package main.java.localClassExample;

public class SendMoney {

    public void sendByCard(double amount, Long cardNumber,Integer cvc, String expiryDate) {

        class SwedBankData {
            double amount;
            Long cardNumber;
            Integer cvc;
            String expiryDate;
            String secretKey;
        }

        SwedBankData transactionData = new SwedBankData();
        transactionData.amount = amount;
        transactionData.cardNumber = cardNumber;
        transactionData.cvc = cvc;
        transactionData.expiryDate = expiryDate;
        transactionData.secretKey = "jtg34t8xc";

        // SwedBankData response = swedBankLib.processTransaction(transactionData);
    }
}
