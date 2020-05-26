package com.eatza.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eatza.notification.model.Notification;

/**
 * 
 * @author Vitthal Baburao
 *
 */
public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
