public void someMethod(){
    //Method Start
    try{
        // Some Business Logic Code.
    }catch(Exception exception){
        // Exception handler Code
    }finally{
        // Finally Handler Code for cleaning resources.
    }
    // Method End
}

pointcut method_start_end_pointcut(){
    // This point cut applies, before the 
    // beginning and the end of the method.
}

pointcut catch_and_finally_pointcut(){
    // This point cut applies the aspects,  in the catch 
    // block whenever an exception raises and the finally block.
}