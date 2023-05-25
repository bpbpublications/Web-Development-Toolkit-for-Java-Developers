public  void  someBusinessOperation(BusinessData  data){
        //Method  Start  ->  Possible  aspect  code  here  like  logging.
        try{
                //  Original  Business  Logic  here.
        }catch(Exception  exception){
                //  Exception  ->  Aspect  code  here  when  some  exception  is  raised.	
        }finally{
                //  Finally  ->  Even  possible  to  have  aspect  code  at  this  point  too.
        }
        //  Method  End  ->  Aspect  code  here  in  the  end  of  a  method.
}
