package com.onlinestore.onlinestore.Infrastructure.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MESSAGES")

public class MessageEntity {

    @Id
    @Column(name = "MESSAGE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderID;

    @Column(name = "NAME")
    private String nameSender;

    @Column(name = "EMAIL")
    private String emailSender;

    @Column(name = "SUBJECT")
    private String subject;

    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "DATE_SENT")
    private Date dateSent;

}
