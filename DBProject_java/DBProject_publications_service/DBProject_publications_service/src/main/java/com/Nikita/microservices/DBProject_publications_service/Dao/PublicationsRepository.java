package com.Nikita.microservices.DBProject_publications_service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nikita.microservices.DBProject_publications_service.Model.Publications;


public interface PublicationsRepository extends JpaRepository<Publications, String>{

}


