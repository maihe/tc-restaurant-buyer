package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.entities.UserClient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserClient, Long>, CrudRepository<UserClient, Long> {
    List<UserClient> findAllByRole(String role);
}
