public  class  Account{
        public  long  deposit(long  depositAmount){	
                newAmount  =  existingAccount  +  depositAccount;
                currentAmount  =  newAmount;
                return  currentAmount;
        }
        public  long  withdraw(long  withdrawalAmount){
                if  (withdrawalAmount  <=  currentAmount){
                        currentAmount  =  currentAmount  –  withdrawalAmount;
                }
                return  currentAmount;
        }	
}