package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.entities.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserClient, Long> {
    List<UserClient> findAllByRole(String role);
}
