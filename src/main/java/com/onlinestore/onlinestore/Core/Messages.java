package com.onlinestore.onlinestore.Core;

import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Messages {
    private long messageID;
    private String nameSender;
    private String emailSender;
    private String subject;
    private String message;
    private Date dateSent;
}
