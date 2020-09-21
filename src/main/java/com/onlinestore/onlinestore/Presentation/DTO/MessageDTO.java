package com.onlinestore.onlinestore.Presentation.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class MessageDTO {
    private long messageID;
    private String nameSender;
    private String emailSender;
    private String subject;
    private String message;
    private Date dateSent;
}