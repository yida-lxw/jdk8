package com.sun.corba.se.spi.activation.LocatorPackage;


/**
 * com/sun/corba/se/spi/activation/LocatorPackage/ServerLocationPerORB.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u212/12974/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
 * Monday, April 1, 2019 11:12:33 PM PDT
 */

public final class ServerLocationPerORB implements org.omg.CORBA.portable.IDLEntity {
    public String hostname = null;
    public com.sun.corba.se.spi.activation.EndPointInfo ports[] = null;

    public ServerLocationPerORB() {
    } // ctor

    public ServerLocationPerORB(String _hostname, com.sun.corba.se.spi.activation.EndPointInfo[] _ports) {
        hostname = _hostname;
        ports = _ports;
    } // ctor

} // class ServerLocationPerORB