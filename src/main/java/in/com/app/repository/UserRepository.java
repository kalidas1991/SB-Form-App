package in.com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.com.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
