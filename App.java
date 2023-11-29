class App{
  public static void main(String[] args){
   
   Account adhithyaAccount = new Account();
   adhithyaAccount.balance = 500;
   System.out.println(adhithyaAccount.balance);
  System.out.println(Account.bankName);


  Account.bankName = "EFGH";

  Account shaAccount = new Account();
  shaAccount.balance = 1000;
  System.out.println(shaAccount.balance);
  System.out.println(Account.bankName);
  
  }

}