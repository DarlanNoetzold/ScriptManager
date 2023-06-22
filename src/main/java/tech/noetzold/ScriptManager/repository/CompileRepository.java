package tech.noetzold.ScriptManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.noetzold.ScriptManager.model.CompileRequest;

public interface CompileRepository extends JpaRepository<CompileRequest, Long> {
}
