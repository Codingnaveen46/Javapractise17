package assignmentOnLoops;

import java.util.*;

public class AssignmentLoops {
    public static void main(String[] args) {

        List<Integer> transactions = new ArrayList<>();
        transactions.add(50000);
        transactions.add(-2000);
        transactions.add(3000);
        transactions.add(-15000);
        transactions.add(-200);
        transactions.add(-300);
        transactions.add(4000);
        transactions.add(-3000);

        int creditCount = 0;
        int debitCount = 0;
        int totalCredit = 0;
        int totalDebit = 0;
        int totalBalance = 0;
        int suspiciousTransactions = 0;

        for (int transaction : transactions) {
            if (transaction > 0) {
                creditCount++;
                totalCredit += transaction;
            } else {
                debitCount++;
                totalDebit += transaction;
            }

            totalBalance += transaction;

            if (transaction > 10000 || transaction < -10000) {
                suspiciousTransactions++;
                System.out.println("Suspicious credit/debit Transaction with Amount : " + transaction);
            }

        }
        System.out.println("Total number of credit transactions: " + creditCount);
        System.out.println("Total number of debit transactions: " + debitCount);
        System.out.println("Total amount credited: " + totalCredit);
        System.out.println("Total amount debited: " + totalDebit);
        System.out.println("Total amount remaining: " + totalBalance);
        System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);


    }

}