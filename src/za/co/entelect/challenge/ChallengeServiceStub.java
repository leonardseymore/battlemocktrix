
/**
 * ChallengeServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package za.co.entelect.challenge;

        

        /*
        *  ChallengeServiceStub java implementation
        */


public class ChallengeServiceStub extends org.apache.axis2.client.Stub {
  protected org.apache.axis2.description.AxisOperation[] _operations;

  //hashmaps to keep the fault mapping
  private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
  private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
  private java.util.HashMap faultMessageMap = new java.util.HashMap();

  private static int counter = 0;

  private static synchronized java.lang.String getUniqueSuffix() {
    // reset the counter if it is greater than 99999
    if (counter > 99999) {
      counter = 0;
    }
    counter = counter + 1;
    return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
  }


  private void populateAxisService() throws org.apache.axis2.AxisFault {

    //creating the Service with a unique name
    _service = new org.apache.axis2.description.AxisService("ChallengeService" + getUniqueSuffix());
    addAnonymousOperations();

    //creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[3];

    __operation = new org.apache.axis2.description.OutInAxisOperation();


    __operation.setName(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "getStatus"));
    _service.addOperation(__operation);


    _operations[0] = __operation;


    __operation = new org.apache.axis2.description.OutInAxisOperation();


    __operation.setName(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "setAction"));
    _service.addOperation(__operation);


    _operations[1] = __operation;


    __operation = new org.apache.axis2.description.OutInAxisOperation();


    __operation.setName(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "login"));
    _service.addOperation(__operation);


    _operations[2] = __operation;


  }

  //populates the faults
  private void populateFaults() {

    faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "EndOfGameException"), "setAction"), "za.co.entelect.challenge.EndOfGameExceptionException");
    faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "EndOfGameException"), "setAction"), "za.co.entelect.challenge.EndOfGameExceptionException");
    faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "EndOfGameException"), "setAction"), "za.co.entelect.challenge.EndOfGameException");

    faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "NoBlameException"), "login"), "za.co.entelect.challenge.NoBlameExceptionException");
    faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "NoBlameException"), "login"), "za.co.entelect.challenge.NoBlameExceptionException");
    faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "NoBlameException"), "login"), "za.co.entelect.challenge.NoBlameException");

    faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "EndOfGameException"), "login"), "za.co.entelect.challenge.EndOfGameExceptionException");
    faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "EndOfGameException"), "login"), "za.co.entelect.challenge.EndOfGameExceptionException");
    faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://challenge.entelect.co.za/", "EndOfGameException"), "login"), "za.co.entelect.challenge.EndOfGameException");


  }

  /**
   * Constructor that takes in a configContext
   */

  public ChallengeServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                              java.lang.String targetEndpoint)
    throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }


  /**
   * Constructor that takes in a configContext  and useseperate listner
   */
  public ChallengeServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                              java.lang.String targetEndpoint, boolean useSeparateListener)
    throws org.apache.axis2.AxisFault {
    //To populate AxisService
    populateAxisService();
    populateFaults();

    _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);


    _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
      targetEndpoint));
    _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);


  }

  /**
   * Default Constructor
   */
  public ChallengeServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

    this(configurationContext, "http://localhost:9090/ChallengePort");

  }

  /**
   * Default Constructor
   */
  public ChallengeServiceStub() throws org.apache.axis2.AxisFault {

    this("http://localhost:9090/ChallengePort");

  }

  /**
   * Constructor taking the target endpoint
   */
  public ChallengeServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }


  /**
   * Auto generated method signature
   *
   * @param getStatus36
   * @see za.co.entelect.challenge.ChallengeService#getStatus
   */


  public za.co.entelect.challenge.GetStatusResponse getStatus(

    za.co.entelect.challenge.GetStatus getStatus36)


    throws java.rmi.RemoteException

  {
    org.apache.axis2.context.MessageContext _messageContext = null;
    try {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
      _operationClient.getOptions().setAction("http://challenge.entelect.co.za/Challenge/getStatus");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


      addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;


      env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
        getStatus36,
        optimizeContent(new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
          "getStatus")), new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
        "getStatus"));

      //adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      //execute the operation client
      _operationClient.execute(true);


      org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
        org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


      java.lang.Object object = fromOM(
        _returnEnv.getBody().getFirstElement(),
        za.co.entelect.challenge.GetStatusResponse.class,
        getEnvelopeNamespaces(_returnEnv));


      return (za.co.entelect.challenge.GetStatusResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getStatus"))) {
          //make the fault by reflection
          try {
            java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getStatus"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            //message class
            java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getStatus"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
              new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});


            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations
   *
   * @param getStatus36
   * @see za.co.entelect.challenge.ChallengeService#startgetStatus
   */
  public void startgetStatus(

    za.co.entelect.challenge.GetStatus getStatus36,

    final za.co.entelect.challenge.ChallengeServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
    _operationClient.getOptions().setAction("http://challenge.entelect.co.za/Challenge/getStatus");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


    addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


    //Style is Doc.


    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
      getStatus36,
      optimizeContent(new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
        "getStatus")), new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
      "getStatus"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);


    _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
      public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
        try {
          org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

          java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
            za.co.entelect.challenge.GetStatusResponse.class,
            getEnvelopeNamespaces(resultEnv));
          callback.receiveResultgetStatus(
            (za.co.entelect.challenge.GetStatusResponse) object);

        } catch (org.apache.axis2.AxisFault e) {
          callback.receiveErrorgetStatus(e);
        }
      }

      public void onError(java.lang.Exception error) {
        if (error instanceof org.apache.axis2.AxisFault) {
          org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
          org.apache.axiom.om.OMElement faultElt = f.getDetail();
          if (faultElt != null) {
            if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getStatus"))) {
              //make the fault by reflection
              try {
                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getStatus"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getStatus"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                  new java.lang.Class[]{messageClass});
                m.invoke(ex, new java.lang.Object[]{messageObject});


                callback.receiveErrorgetStatus(new java.rmi.RemoteException(ex.getMessage(), ex));
              } catch (java.lang.ClassCastException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorgetStatus(f);
              } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorgetStatus(f);
              } catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorgetStatus(f);
              } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorgetStatus(f);
              } catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorgetStatus(f);
              } catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorgetStatus(f);
              } catch (org.apache.axis2.AxisFault e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorgetStatus(f);
              }
            } else {
              callback.receiveErrorgetStatus(f);
            }
          } else {
            callback.receiveErrorgetStatus(f);
          }
        } else {
          callback.receiveErrorgetStatus(error);
        }
      }

      public void onFault(org.apache.axis2.context.MessageContext faultContext) {
        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
        onError(fault);
      }

      public void onComplete() {
        try {
          _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        } catch (org.apache.axis2.AxisFault axisFault) {
          callback.receiveErrorgetStatus(axisFault);
        }
      }
    });


    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[0].setMessageReceiver(
        _callbackReceiver);
    }

    //execute the operation client
    _operationClient.execute(false);

  }

  /**
   * Auto generated method signature
   *
   * @param setAction38
   * @throws za.co.entelect.challenge.EndOfGameExceptionException
   *          :
   * @see za.co.entelect.challenge.ChallengeService#setAction
   */


  public za.co.entelect.challenge.SetActionResponse setAction(

    za.co.entelect.challenge.SetAction setAction38)


    throws java.rmi.RemoteException


    , za.co.entelect.challenge.EndOfGameExceptionException {
    org.apache.axis2.context.MessageContext _messageContext = null;
    try {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("http://challenge.entelect.co.za/Challenge/setAction");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


      addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;


      env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
        setAction38,
        optimizeContent(new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
          "setAction")), new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
        "setAction"));

      //adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      //execute the operation client
      _operationClient.execute(true);


      org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
        org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


      java.lang.Object object = fromOM(
        _returnEnv.getBody().getFirstElement(),
        za.co.entelect.challenge.SetActionResponse.class,
        getEnvelopeNamespaces(_returnEnv));


      return (za.co.entelect.challenge.SetActionResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setAction"))) {
          //make the fault by reflection
          try {
            java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setAction"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            //message class
            java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setAction"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
              new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});

            if (ex instanceof za.co.entelect.challenge.EndOfGameExceptionException) {
              throw (za.co.entelect.challenge.EndOfGameExceptionException) ex;
            }


            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations
   *
   * @param setAction38
   * @see za.co.entelect.challenge.ChallengeService#startsetAction
   */
  public void startsetAction(

    za.co.entelect.challenge.SetAction setAction38,

    final za.co.entelect.challenge.ChallengeServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
    _operationClient.getOptions().setAction("http://challenge.entelect.co.za/Challenge/setAction");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


    addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


    //Style is Doc.


    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
      setAction38,
      optimizeContent(new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
        "setAction")), new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
      "setAction"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);


    _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
      public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
        try {
          org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

          java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
            za.co.entelect.challenge.SetActionResponse.class,
            getEnvelopeNamespaces(resultEnv));
          callback.receiveResultsetAction(
            (za.co.entelect.challenge.SetActionResponse) object);

        } catch (org.apache.axis2.AxisFault e) {
          callback.receiveErrorsetAction(e);
        }
      }

      public void onError(java.lang.Exception error) {
        if (error instanceof org.apache.axis2.AxisFault) {
          org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
          org.apache.axiom.om.OMElement faultElt = f.getDetail();
          if (faultElt != null) {
            if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setAction"))) {
              //make the fault by reflection
              try {
                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setAction"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "setAction"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                  new java.lang.Class[]{messageClass});
                m.invoke(ex, new java.lang.Object[]{messageObject});

                if (ex instanceof za.co.entelect.challenge.EndOfGameExceptionException) {
                  callback.receiveErrorsetAction((za.co.entelect.challenge.EndOfGameExceptionException) ex);
                  return;
                }


                callback.receiveErrorsetAction(new java.rmi.RemoteException(ex.getMessage(), ex));
              } catch (java.lang.ClassCastException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorsetAction(f);
              } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorsetAction(f);
              } catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorsetAction(f);
              } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorsetAction(f);
              } catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorsetAction(f);
              } catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorsetAction(f);
              } catch (org.apache.axis2.AxisFault e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorsetAction(f);
              }
            } else {
              callback.receiveErrorsetAction(f);
            }
          } else {
            callback.receiveErrorsetAction(f);
          }
        } else {
          callback.receiveErrorsetAction(error);
        }
      }

      public void onFault(org.apache.axis2.context.MessageContext faultContext) {
        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
        onError(fault);
      }

      public void onComplete() {
        try {
          _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        } catch (org.apache.axis2.AxisFault axisFault) {
          callback.receiveErrorsetAction(axisFault);
        }
      }
    });


    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[1].setMessageReceiver(
        _callbackReceiver);
    }

    //execute the operation client
    _operationClient.execute(false);

  }

  /**
   * Auto generated method signature
   *
   * @param login40
   * @throws za.co.entelect.challenge.NoBlameExceptionException
   *          :
   * @throws za.co.entelect.challenge.EndOfGameExceptionException
   *          :
   * @see za.co.entelect.challenge.ChallengeService#login
   */


  public za.co.entelect.challenge.LoginResponse login(

    za.co.entelect.challenge.Login login40)


    throws java.rmi.RemoteException


    , za.co.entelect.challenge.NoBlameExceptionException
    , za.co.entelect.challenge.EndOfGameExceptionException {
    org.apache.axis2.context.MessageContext _messageContext = null;
    try {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
      _operationClient.getOptions().setAction("http://challenge.entelect.co.za/Challenge/login");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


      addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;


      env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
        login40,
        optimizeContent(new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
          "login")), new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
        "login"));

      //adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      //execute the operation client
      _operationClient.execute(true);


      org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
        org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


      java.lang.Object object = fromOM(
        _returnEnv.getBody().getFirstElement(),
        za.co.entelect.challenge.LoginResponse.class,
        getEnvelopeNamespaces(_returnEnv));


      return (za.co.entelect.challenge.LoginResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"))) {
          //make the fault by reflection
          try {
            java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            //message class
            java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
              new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});

            if (ex instanceof za.co.entelect.challenge.NoBlameExceptionException) {
              throw (za.co.entelect.challenge.NoBlameExceptionException) ex;
            }

            if (ex instanceof za.co.entelect.challenge.EndOfGameExceptionException) {
              throw (za.co.entelect.challenge.EndOfGameExceptionException) ex;
            }


            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations
   *
   * @param login40
   * @see za.co.entelect.challenge.ChallengeService#startlogin
   */
  public void startlogin(

    za.co.entelect.challenge.Login login40,

    final za.co.entelect.challenge.ChallengeServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
    _operationClient.getOptions().setAction("http://challenge.entelect.co.za/Challenge/login");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


    addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


    //Style is Doc.


    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
      login40,
      optimizeContent(new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
        "login")), new javax.xml.namespace.QName("http://challenge.entelect.co.za/",
      "login"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);


    _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
      public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
        try {
          org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

          java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
            za.co.entelect.challenge.LoginResponse.class,
            getEnvelopeNamespaces(resultEnv));
          callback.receiveResultlogin(
            (za.co.entelect.challenge.LoginResponse) object);

        } catch (org.apache.axis2.AxisFault e) {
          callback.receiveErrorlogin(e);
        }
      }

      public void onError(java.lang.Exception error) {
        if (error instanceof org.apache.axis2.AxisFault) {
          org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
          org.apache.axiom.om.OMElement faultElt = f.getDetail();
          if (faultElt != null) {
            if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"))) {
              //make the fault by reflection
              try {
                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                  new java.lang.Class[]{messageClass});
                m.invoke(ex, new java.lang.Object[]{messageObject});

                if (ex instanceof za.co.entelect.challenge.NoBlameExceptionException) {
                  callback.receiveErrorlogin((za.co.entelect.challenge.NoBlameExceptionException) ex);
                  return;
                }

                if (ex instanceof za.co.entelect.challenge.EndOfGameExceptionException) {
                  callback.receiveErrorlogin((za.co.entelect.challenge.EndOfGameExceptionException) ex);
                  return;
                }


                callback.receiveErrorlogin(new java.rmi.RemoteException(ex.getMessage(), ex));
              } catch (java.lang.ClassCastException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorlogin(f);
              } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorlogin(f);
              } catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorlogin(f);
              } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorlogin(f);
              } catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorlogin(f);
              } catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorlogin(f);
              } catch (org.apache.axis2.AxisFault e) {
                // we cannot intantiate the class - throw the original Axis fault
                callback.receiveErrorlogin(f);
              }
            } else {
              callback.receiveErrorlogin(f);
            }
          } else {
            callback.receiveErrorlogin(f);
          }
        } else {
          callback.receiveErrorlogin(error);
        }
      }

      public void onFault(org.apache.axis2.context.MessageContext faultContext) {
        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
        onError(fault);
      }

      public void onComplete() {
        try {
          _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        } catch (org.apache.axis2.AxisFault axisFault) {
          callback.receiveErrorlogin(axisFault);
        }
      }
    });


    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[2].setMessageReceiver(
        _callbackReceiver);
    }

    //execute the operation client
    _operationClient.execute(false);

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


  private javax.xml.namespace.QName[] opNameArray = null;

  private boolean optimizeContent(javax.xml.namespace.QName opName) {


    if (opNameArray == null) {
      return false;
    }
    for (int i = 0; i < opNameArray.length; i++) {
      if (opName.equals(opNameArray[i])) {
        return true;
      }
    }
    return false;
  }
  //http://localhost:9090/ChallengePort

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


}
   