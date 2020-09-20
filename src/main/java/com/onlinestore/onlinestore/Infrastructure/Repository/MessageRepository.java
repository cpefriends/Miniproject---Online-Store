package com.onlinestore.onlinestore.Infrastructure.Repository;

import com.onlinestore.onlinestore.Infrastructure.Entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
    List<MessageEntity> findAll();
}
