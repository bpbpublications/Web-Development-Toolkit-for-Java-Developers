package src;
import java.util.ListResourceBundle;
public class StateList extends ListResourceBundle
{  
       public Object[][] getContents() 
         {  
          return contents;  
         }  
       static final Object[][] contents = {
{ "state.gujarat", "Ahmedabad" },  
{ "state.maharastra", "Pune" }, 
{ "state.HimachalPradesh", "Shimla" }, 
{ "state.bihar", "Arwal" }, 
{ "state.goa", "Panji" }, 
{ "state.kerala", "Calicut" }, 
        };  
}

