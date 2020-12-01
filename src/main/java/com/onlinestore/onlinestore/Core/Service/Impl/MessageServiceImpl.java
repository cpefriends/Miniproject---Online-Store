package com.onlinestore.onlinestore.Core.Service.Impl;

import com.onlinestore.onlinestore.Core.Message;
import com.onlinestore.onlinestore.Core.Product;
import com.onlinestore.onlinestore.Core.Service.MessageService;
import com.onlinestore.onlinestore.Infrastructure.Entity.MessageEntity;
import com.onlinestore.onlinestore.Infrastructure.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository  messageRepository;

    @Override
    public List<Message> getAll() {
        List<Message> messageList = new ArrayList<Message>();

        List<MessageEntity> messageEntities;

        return messageList;
    }
}
