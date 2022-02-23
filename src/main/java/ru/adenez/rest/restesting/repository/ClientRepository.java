package ru.adenez.rest.restesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.adenez.rest.restesting.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
