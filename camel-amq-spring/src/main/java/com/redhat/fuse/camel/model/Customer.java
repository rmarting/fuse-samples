package com.redhat.fuse.camel.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

    private String ID;

    private String FIRSTNAME;

    private String LASTNAME;

    private String STREET;

    private String CITY;

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public void setFIRSTNAME(String fIRSTNAME) {
        FIRSTNAME = fIRSTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String lASTNAME) {
        LASTNAME = lASTNAME;
    }

    public String getSTREET() {
        return STREET;
    }

    public void setSTREET(String sTREET) {
        STREET = sTREET;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String cITY) {
        CITY = cITY;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Customer [ID=");
        builder.append(ID);
        builder.append(", FIRSTNAME=");
        builder.append(FIRSTNAME);
        builder.append(", LASTNAME=");
        builder.append(LASTNAME);
        builder.append(", STREET=");
        builder.append(STREET);
        builder.append(", CITY=");
        builder.append(CITY);
        builder.append("]");
        return builder.toString();
    }

   

}
