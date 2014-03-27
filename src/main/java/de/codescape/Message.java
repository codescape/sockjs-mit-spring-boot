package de.codescape;

import lombok.Data;

import java.util.Date;

@Data
public class Message {

    private Date date;
    private String name;
    private String message;

}
