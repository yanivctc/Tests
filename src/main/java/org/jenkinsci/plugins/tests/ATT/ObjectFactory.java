//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.22 at 05:24:40 PM IDT 
//


package org.jenkinsci.plugins.tests.ATT;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jenkinsci.plugins.Tests package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jenkinsci.plugins.Tests
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ATTRepository }
     * 
     */
    public ATTRepository createATTRepository() {
        return new ATTRepository();
    }

    /**
     * Create an instance of {@link ATTRepository.TestSuite }
     * 
     */
    public ATTRepository.TestSuite createATTRepositoryTestSuite() {
        return new ATTRepository.TestSuite();
    }

    /**
     * Create an instance of {@link ATTRepository.Setup }
     * 
     */
    public ATTRepository.Setup createATTRepositorySetup() {
        return new ATTRepository.Setup();
    }

    /**
     * Create an instance of {@link ATTRepository.TestSuite.Test }
     * 
     */
    public ATTRepository.TestSuite.Test createATTRepositoryTestSuiteTest() {
        return new ATTRepository.TestSuite.Test();
    }

    /**
     * Create an instance of {@link ATTRepository.Setup.Unit }
     * 
     */
    public ATTRepository.Setup.Unit createATTRepositorySetupUnit() {
        return new ATTRepository.Setup.Unit();
    }

}
