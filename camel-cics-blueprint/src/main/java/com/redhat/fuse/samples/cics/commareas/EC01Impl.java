package com.redhat.fuse.samples.cics.commareas;

import java.io.UnsupportedEncodingException;

public class EC01Impl implements EC01 {
    
    private static final String ENCODING_CP1145 = "Cp1145";
    
    private static final String ENCODING_CP285 = "Cp285";
    
    private static final int COMMAREA_SIZE = 18; 
    
    private final byte[] byteCommArea = new byte[COMMAREA_SIZE];

    private final String commArea = "";

    @Override
    public String getData() {
        return this.commArea;
    }

    @Override
    public byte[] getDataBuffer() {
        try {
            System.arraycopy(getBytes(this.commArea, ENCODING_CP1145), 0, byteCommArea, 0, Math.min(byteCommArea.length, this.commArea.length()));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        
        return this.byteCommArea;
    }

    private byte[] getBytes(String source, String encoding) throws java.io.UnsupportedEncodingException {
        if (null != encoding) {
            return source.getBytes(encoding);
        }
        return source.getBytes();
    }

}
