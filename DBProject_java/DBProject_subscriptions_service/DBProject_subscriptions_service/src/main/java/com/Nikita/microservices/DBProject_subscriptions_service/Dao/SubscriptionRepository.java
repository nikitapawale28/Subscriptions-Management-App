package com.Nikita.microservices.DBProject_subscriptions_service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nikita.microservices.DBProject_subscriptions_service.Model.Subscription;



public interface SubscriptionRepository extends JpaRepository<Subscription, String>{

}
