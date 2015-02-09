
package org.mule.demo.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mule.demo.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContactResponse_QNAME = new QName("http://example.mule.mulesoft.com/", "contactResponse");
    private final static QName _Contact_QNAME = new QName("http://example.mule.mulesoft.com/", "contact");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mule.demo.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactResponse }
     * 
     */
    public ContactResponse createContactResponse() {
        return new ContactResponse();
    }

    /**
     * Create an instance of {@link Contact_Type }
     * 
     */
    public Contact_Type createContact_Type() {
        return new Contact_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.mule.mulesoft.com/", name = "contactResponse")
    public JAXBElement<ContactResponse> createContactResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_ContactResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contact_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.mule.mulesoft.com/", name = "contact")
    public JAXBElement<Contact_Type> createContact(Contact_Type value) {
        return new JAXBElement<Contact_Type>(_Contact_QNAME, Contact_Type.class, null, value);
    }

}
