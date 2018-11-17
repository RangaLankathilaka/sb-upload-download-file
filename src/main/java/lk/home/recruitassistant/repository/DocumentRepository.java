package lk.home.recruitassistant.repository;


import lk.home.recruitassistant.entity.Document;
import payload.UploadFileResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document,Integer> {
}
