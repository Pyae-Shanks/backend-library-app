package com.abc_psk.spring_boot_library.dao;

import com.abc_psk.spring_boot_library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
