package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long>, CrudRepository<User, Long> {
    List<User> findAllByRole(String role);
}
