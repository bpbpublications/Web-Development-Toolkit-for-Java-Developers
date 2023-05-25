import javax.jwx.WebMethod;
import javax.jwx.WebParam;
import javax.jwx.WebService;

@WebService()
public class CalculatorWS{

	    @WebMethod
	    public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
	        int k = i + j;
	        return k;
      }

}