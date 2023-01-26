package lis.repositories;

import lis.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity,Integer> {
    Optional<UserEntity> findByUsername(String username);
    @Query("select u.role from UserEntity u where u.username = :username")
    String findRoleByUsername(String username);
    Boolean existsByUsername(String username);
}
