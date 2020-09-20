package com.onlinestore.onlinestore.Infrastructure.Repository;

import com.onlinestore.onlinestore.Infrastructure.Entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
    List<MessageEntity> findAll();
}
