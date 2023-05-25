public  class  Account{
        public  long  deposit(long  depositAmount){		
                User  user  =  getContext().getUser();
                if  (user.getRole().equals("BankAdmin"){		
                        newAmount  =  existingAccount  +  depositAccount;
                        currentAmount  =  newAmount;
                }
                return  currentAmount;
        }

        public  long  withdraw(long  withdrawalAmount){
                User  user  =  getContext().getUser();
                if  (user.getRole().equals("BankAdmin"){
                        if  (withdrawalAmount  <=  currentAmount){
                                currentAmount  =  currentAmount  –  withdrawalAmount;
                        }
                }
                return  currentAmount;
        }	
}
