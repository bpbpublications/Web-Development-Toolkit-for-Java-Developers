argument.required=The,    '{0}'  argument  is  required.
public  static  void  main(final  String[]  args)  {
        MessageSource  resources  =  new  ClassPathXmlApplicationContext("beans.xml");
        String  message  =  resources.getMessage("argument.required",
                new  Object  []  {"userDao"},  "Required",  Locale.UK);
        System.out.println(message);
}
