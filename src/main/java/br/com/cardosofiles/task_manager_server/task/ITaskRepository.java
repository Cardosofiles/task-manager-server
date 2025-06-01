package br.com.cardosofiles.task_manager_server.task;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Interface for task repository
 * 
 * @author Cardoso Files
 * @version 1.0.0
 * @since 1.0.0
 * @see TaskModel
 */

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findByIdUser(UUID idUser);
}
