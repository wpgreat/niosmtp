package me.normanmaurer.niosmtp.impl;

import me.normanmaurer.niosmtp.SMTPResponse;

public class SMTPResponseImpl implements SMTPResponse{

    private int code;
    private String line;

    public SMTPResponseImpl(int code, String line) {
        this.code = code;
        this.line = line;
    }
    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getLastLine() {
        return line;
    }
    
    public String toString() {
        return code + " " + line;
    }

}
