package io.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.app.model.GreetResponse;

public interface GreetRepository extends JpaRepository<GreetResponse, Integer> {

}
