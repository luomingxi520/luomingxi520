package com.sun.content.server.operator.security.adaptor; 
 
import java.util.*; 
import com.sun.content.server.service.security.*; 
import com.sun.content.server.service.security.util.*; 
 
// import external required packages to connect to the directory service 
 
public class SampleExternalProxy 
{  
    // Create a Client facace for serach 
    private ExternalClientObject externalUserMgr; 
 
    // Create an instance of External Directorory server Client Proxy 
    public SampleExternalProxy() throws Exception { 
 
                // User the external package to instanciate the Proxu 
