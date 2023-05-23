package com.examples.self.learning.design.patterns.structural.facade;

public class BuyCryptoFacade {
    public void buyCryptoCurrency(double amount, String currency){
        DatabaseService dbService = new DatabaseService();
        User user = dbService.getUser(UIService.getLoggedInUserId());
        if(user.getBalance() < amount){
            System.out.println("Insufficient balance...");
            return;
        }
        CryptoFactory.getCryptoService(currency).buyCurrency(user, amount);
    }

    static class User {
        public double getBalance() {
            return 0.1;
        }
    }
    static class DatabaseService {
        public User getUser(String user){
            return new User();
        }
    }

    static class UIService {
        public static String getLoggedInUserId(){
            return "DUMMY";
        }
    }

    static class CryptoFactory {
        static BTCCryptoService getCryptoService(String currency){
            return (user, amount) -> {
                System.out.println("DUMMY");
            };
        }

        static void buyCurrency(User user, double amount){
            System.out.println("DUMMY");
        }
    }

    interface BTCCryptoService{
        void buyCurrency(User user, double amount);
    }
}
