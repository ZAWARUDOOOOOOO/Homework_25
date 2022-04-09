package hv.bd.shop.dao.repository;

import hv.bd.shop.dao.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
