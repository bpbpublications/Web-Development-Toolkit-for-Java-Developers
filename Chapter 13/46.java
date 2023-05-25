public  class  Account{
        public  long  deposit(long  depositAmount){		
                logger.info("Start  of  deposit  method");
                Transaction  trasaction    =  getContext().getTransaction();
                transaction.begin();		
                try{
                        User  user  =  getContext().getUser();
                        if  (user.getRole().equals("BankAdmin"){		
                                newAmount  =  existingAccount  +  depositAccount;
                                currentAmount  =  newAmount;
                        }
                        transaction.commit();
                }catch(Exception  exception){
                        transaction.rollback();
                }
                logger.info("End  of  deposit  method");
                return  currentAmount;
        }

        public  long  withdraw(long  withdrawalAmount){
                logger.info("Start  of  withdraw  method");
                Transaction  trasaction  =  getContext().getTransaction();
                transaction.begin();		
                try{
                        User  user  =  getContext().getUser();
                        if  (user.getRole().equals("BankAdmin"){
                                if  (withdrawalAmount  <=  currentAmount){
                                        currentAmount  =  currentAmount  –  withdrawalAmount;
                                }
                        }
                        transaction.commit();
                }catch(Exception  exception){
                        transaction.rollback();
                }
                logger.info("End  of  withdraw  method");
                return  currentAmount;
        }	
}