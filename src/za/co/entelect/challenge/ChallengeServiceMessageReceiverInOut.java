
/**
 * ChallengeServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package za.co.entelect.challenge;

/**
 * ChallengeServiceMessageReceiverInOut message receiver
 */

public class ChallengeServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {


  public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
    throws org.apache.axis2.AxisFault {

    try {

      // get the implementation class for the Web Service
      Object obj = getTheImplementationObject(msgContext);

      ChallengeServiceSkeleton skel = (ChallengeServiceSkeleton) obj;
      //Out Envelop
      org.apache.axiom.soap.SOAPEnvelope envelope = null;
      //Find the axisOperation that has been set by the Dispatch phase.
      org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
      if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
      }

      java.lang.String methodName;
      if ((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {


        if ("getStatus".equals(methodName)) {

          za.co.entelect.challenge.GetStatusResponse getStatusResponse1 = null;
          za.co.entelect.challenge.GetStatus wrappedParam =
            (za.co.entelect.challenge.GetStatus) fromOM(
              msgContext.getEnvelope().getBody().getFirstElement(),
              za.co.entelect.challenge.GetStatus.class,
              getEnvelopeNamespaces(msgContext.getEnvelope()));

          getStatusResponse1 =


            skel.getStatus(wrappedParam)
          ;

          envelope = toEnvelope(getSOAPFactory(msgContext), getStatusResponse1, false, new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
            "getStatus"));
        } else if ("setAction".equals(methodName)) {

          za.co.entelect.challenge.SetActionResponse setActionResponse3 = null;
          za.co.entelect.challenge.SetAction wrappedParam =
            (za.co.entelect.challenge.SetAction) fromOM(
              msgContext.getEnvelope().getBody().getFirstElement(),
              za.co.entelect.challenge.SetAction.class,
              getEnvelopeNamespaces(msgContext.getEnvelope()));

          setActionResponse3 =


            skel.setAction(wrappedParam)
          ;

          envelope = toEnvelope(getSOAPFactory(msgContext), setActionResponse3, false, new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
            "setAction"));
        } else if ("login".equals(methodName)) {

          za.co.entelect.challenge.LoginResponse loginResponse5 = null;
          za.co.entelect.challenge.Login wrappedParam =
            (za.co.entelect.challenge.Login) fromOM(
              msgContext.getEnvelope().getBody().getFirstElement(),
              za.co.entelect.challenge.Login.class,
              getEnvelopeNamespaces(msgContext.getEnvelope()));

          loginResponse5 =


            skel.login(wrappedParam)
          ;

          envelope = toEnvelope(getSOAPFactory(msgContext), loginResponse5, false, new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
            "login"));

        } else {
          throw new java.lang.RuntimeException("method not found");
        }


        newMsgContext.setEnvelope(envelope);
      }
    } catch (NoBlameExceptionException e) {

      msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME, "NoBlameException");
      org.apache.axis2.AxisFault f = createAxisFault(e);
      if (e.getFaultMessage() != null) {
        f.setDetail(toOM(e.getFaultMessage(), false));
      }
      throw f;
    } catch (EndOfGameExceptionException e) {

      msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME, "EndOfGameException");
      org.apache.axis2.AxisFault f = createAxisFault(e);
      if (e.getFaultMessage() != null) {
        f.setDetail(toOM(e.getFaultMessage(), false));
      }
      throw f;
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  //

  private static final javax.xml.bind.JAXBContext wsContext;

  static {
    javax.xml.bind.JAXBContext jc;
    jc = null;
    try {
      jc = javax.xml.bind.JAXBContext.newInstance(
        za.co.entelect.challenge.GetStatus.class,
        za.co.entelect.challenge.GetStatusResponse.class,
        za.co.entelect.challenge.SetAction.class,
        za.co.entelect.challenge.SetActionResponse.class,
        za.co.entelect.challenge.EndOfGameException.class,
        za.co.entelect.challenge.Login.class,
        za.co.entelect.challenge.LoginResponse.class,
        za.co.entelect.challenge.NoBlameException.class
      );
    } catch (javax.xml.bind.JAXBException ex) {
      System.err.println("Unable to create JAXBContext: " + ex.getMessage());
      ex.printStackTrace(System.err);
      Runtime.getRuntime().exit(-1);
    } finally {
      wsContext = jc;
    }
  }


  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.GetStatus param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.GetStatus.class,
        param,
        marshaller,
        methodQName.getNamespaceURI(),
        methodQName.getLocalPart());
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
        null);
      return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.GetStatus param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.GetStatus.class,
        param,
        marshaller,
        "http://challenge.entelect.co.za/",
        "getStatus");
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://challenge.entelect.co.za/", null);
      return factory.createOMElement(source, "getStatus", namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, za.co.entelect.challenge.GetStatus param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
    return envelope;
  }


  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.GetStatusResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.GetStatusResponse.class,
        param,
        marshaller,
        methodQName.getNamespaceURI(),
        methodQName.getLocalPart());
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
        null);
      return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.GetStatusResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.GetStatusResponse.class,
        param,
        marshaller,
        "http://challenge.entelect.co.za/",
        "getStatusResponse");
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://challenge.entelect.co.za/", null);
      return factory.createOMElement(source, "getStatusResponse", namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, za.co.entelect.challenge.GetStatusResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
    return envelope;
  }


  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.SetAction param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.SetAction.class,
        param,
        marshaller,
        methodQName.getNamespaceURI(),
        methodQName.getLocalPart());
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
        null);
      return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.SetAction param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.SetAction.class,
        param,
        marshaller,
        "http://challenge.entelect.co.za/",
        "setAction");
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://challenge.entelect.co.za/", null);
      return factory.createOMElement(source, "setAction", namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, za.co.entelect.challenge.SetAction param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
    return envelope;
  }


  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.SetActionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.SetActionResponse.class,
        param,
        marshaller,
        methodQName.getNamespaceURI(),
        methodQName.getLocalPart());
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
        null);
      return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.SetActionResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.SetActionResponse.class,
        param,
        marshaller,
        "http://challenge.entelect.co.za/",
        "setActionResponse");
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://challenge.entelect.co.za/", null);
      return factory.createOMElement(source, "setActionResponse", namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, za.co.entelect.challenge.SetActionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
    return envelope;
  }


  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.EndOfGameException param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.EndOfGameException.class,
        param,
        marshaller,
        methodQName.getNamespaceURI(),
        methodQName.getLocalPart());
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
        null);
      return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.EndOfGameException param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.EndOfGameException.class,
        param,
        marshaller,
        "http://challenge.entelect.co.za/",
        "EndOfGameException");
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://challenge.entelect.co.za/", null);
      return factory.createOMElement(source, "EndOfGameException", namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, za.co.entelect.challenge.EndOfGameException param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
    return envelope;
  }


  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.Login param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.Login.class,
        param,
        marshaller,
        methodQName.getNamespaceURI(),
        methodQName.getLocalPart());
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
        null);
      return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.Login param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.Login.class,
        param,
        marshaller,
        "http://challenge.entelect.co.za/",
        "login");
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://challenge.entelect.co.za/", null);
      return factory.createOMElement(source, "login", namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, za.co.entelect.challenge.Login param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
    return envelope;
  }


  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.LoginResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.LoginResponse.class,
        param,
        marshaller,
        methodQName.getNamespaceURI(),
        methodQName.getLocalPart());
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
        null);
      return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.LoginResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.LoginResponse.class,
        param,
        marshaller,
        "http://challenge.entelect.co.za/",
        "loginResponse");
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://challenge.entelect.co.za/", null);
      return factory.createOMElement(source, "loginResponse", namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, za.co.entelect.challenge.LoginResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
    return envelope;
  }


  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.NoBlameException param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.NoBlameException.class,
        param,
        marshaller,
        methodQName.getNamespaceURI(),
        methodQName.getLocalPart());
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
        null);
      return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.om.OMElement toOM(za.co.entelect.challenge.NoBlameException param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

      org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

      JaxbRIDataSource source = new JaxbRIDataSource(za.co.entelect.challenge.NoBlameException.class,
        param,
        marshaller,
        "http://challenge.entelect.co.za/",
        "NoBlameException");
      org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://challenge.entelect.co.za/", null);
      return factory.createOMElement(source, "NoBlameException", namespace);
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, za.co.entelect.challenge.NoBlameException param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
    throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
    return envelope;
  }


  /**
   * get the default envelope
   */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  private java.lang.Object fromOM(
    org.apache.axiom.om.OMElement param,
    java.lang.Class type,
    java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {
    try {
      javax.xml.bind.JAXBContext context = wsContext;
      javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();

      return unmarshaller.unmarshal(param.getXMLStreamReaderWithoutCaching(), type).getValue();
    } catch (javax.xml.bind.JAXBException bex) {
      throw org.apache.axis2.AxisFault.makeFault(bex);
    }
  }

  class JaxbRIDataSource implements org.apache.axiom.om.OMDataSource {
    /**
     * Bound object for output.
     */
    private final Object outObject;

    /**
     * Bound class for output.
     */
    private final Class outClazz;

    /**
     * Marshaller.
     */
    private final javax.xml.bind.Marshaller marshaller;

    /**
     * Namespace
     */
    private String nsuri;

    /**
     * Local name
     */
    private String name;

    /**
     * Constructor from object and marshaller.
     *
     * @param obj
     * @param marshaller
     */
    public JaxbRIDataSource(Class clazz, Object obj, javax.xml.bind.Marshaller marshaller, String nsuri, String name) {
      this.outClazz = clazz;
      this.outObject = obj;
      this.marshaller = marshaller;
      this.nsuri = nsuri;
      this.name = name;
    }

    public void serialize(java.io.OutputStream output, org.apache.axiom.om.OMOutputFormat format) throws javax.xml.stream.XMLStreamException {
      try {
        marshaller.marshal(new javax.xml.bind.JAXBElement(
          new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), output);
      } catch (javax.xml.bind.JAXBException e) {
        throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
      }
    }

    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat format) throws javax.xml.stream.XMLStreamException {
      try {
        marshaller.marshal(new javax.xml.bind.JAXBElement(
          new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), writer);
      } catch (javax.xml.bind.JAXBException e) {
        throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
      }
    }

    public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
      try {
        marshaller.marshal(new javax.xml.bind.JAXBElement(
          new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), xmlWriter);
      } catch (javax.xml.bind.JAXBException e) {
        throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
      }
    }

    public javax.xml.stream.XMLStreamReader getReader() throws javax.xml.stream.XMLStreamException {
      try {
        javax.xml.bind.JAXBContext context = wsContext;
        org.apache.axiom.om.impl.builder.SAXOMBuilder builder = new org.apache.axiom.om.impl.builder.SAXOMBuilder();
        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(new javax.xml.bind.JAXBElement(
          new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), builder);

        return builder.getRootElement().getXMLStreamReader();
      } catch (javax.xml.bind.JAXBException e) {
        throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
      }
    }
  }


  /**
   * A utility method that copies the namepaces from the SOAPEnvelope
   */
  private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
    java.util.Map returnMap = new java.util.HashMap();
    java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
    while (namespaceIterator.hasNext()) {
      org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
      returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
    }
    return returnMap;
  }

  private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
    org.apache.axis2.AxisFault f;
    Throwable cause = e.getCause();
    if (cause != null) {
      f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
    } else {
      f = new org.apache.axis2.AxisFault(e.getMessage());
    }

    return f;
  }

}//end of class
    