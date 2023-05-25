
package calculate.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import calc.util.NumberFormater;


@WebService(serviceName = "JSimpCalcWebService")
public class HelloService {

    @WebMethod(operationName = "addition")
    public String addition(@WebParam(name = "parameter1") double parameter1, @WebParam(name = "parameter2") double parameter2) {
         return NumberFormater.format((parameter1+parameter2),0,6);
    }

    @WebMethod(operationName = "subtraction")
    public String subtraction(@WebParam(name = "parameter1") double parameter1, @WebParam(name = "parameter2") double parameter2) {
         return NumberFormater.format((parameter1-parameter2),0,6);
    }

    @WebMethod(operationName = "multiplication")
    public String multiplication(@WebParam(name = "parameter1") double parameter1, @WebParam(name = "parameter2") double parameter2) {
         return NumberFormater.format((parameter1*parameter2),0,6);
    }

    @WebMethod(operationName = "division")
    public String division(@WebParam(name = "parameter1") double parameter1, @WebParam(name = "parameter2") double parameter2) {
         return NumberFormater.format((parameter1/parameter2),0,6);
    }

   @WebMethod(operationName = "power")
    public String power(@WebParam(name = "parameter1") double parameter1, @WebParam(name = "parameter2") double parameter2) {
         return NumberFormater.format(Math.pow(parameter1-parameter2),0,6);
    }

  @WebMethod(operationName = "maximum")
    public String maximum(@WebParam(name = "parameter1") double parameter1, @WebParam(name = "parameter2") double parameter2) {
         return NumberFormater.format(Math.max(parameter1-parameter2),0,6);
    }

  @WebMethod(operationName = "minimum")
    public String minimum(@WebParam(name = "parameter1") double parameter1, @WebParam(name = "parameter2") double parameter2) {
         return NumberFormater.format(Math.min(parameter1-parameter2),0,6);
    }
}