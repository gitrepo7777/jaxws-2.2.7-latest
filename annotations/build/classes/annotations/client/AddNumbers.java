
package annotations.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AddNumbers", targetNamespace = "http://duke.example.org")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AddNumbers {


    /**
     * 
     * @param num2
     * @param num1
     * @return
     *     returns int
     * @throws AddNumbersException_Exception
     */
    @WebMethod(action = "urn:addNumbers")
    @WebResult(partName = "return")
    @Action(input = "urn:addNumbers", output = "http://duke.example.org/AddNumbers/addResponse", fault = {
        @FaultAction(className = AddNumbersException_Exception.class, value = "http://duke.example.org/AddNumbers/add/Fault/AddNumbersException")
    })
    public int add(
        @WebParam(name = "num1", partName = "num1")
        int num1,
        @WebParam(name = "num2", partName = "num2")
        int num2)
        throws AddNumbersException_Exception
    ;

}
