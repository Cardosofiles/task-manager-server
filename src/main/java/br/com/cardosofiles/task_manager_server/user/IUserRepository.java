package br.com.cardosofiles.task_manager_server.user;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface for user repository
 * 
 * @author Cardoso Files
 * @version 1.0.0
 * @since 1.0.0
 * @see UserModel
 */
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}
