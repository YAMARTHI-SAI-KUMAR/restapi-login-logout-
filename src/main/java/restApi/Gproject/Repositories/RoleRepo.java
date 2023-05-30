package restApi.Gproject.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import restApi.Gproject.User.Role;
public interface RoleRepo extends JpaRepository <Role ,Long>{

    Optional<Role> findByName(String name);
    
}
