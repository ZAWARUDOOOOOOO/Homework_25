package hv.bd.shop;

import hv.bd.shop.dao.entity.Author;
import hv.bd.shop.dao.entity.Book;
import hv.bd.shop.dao.entityservices.AuthorService;
import hv.bd.shop.dao.entityservices.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@SpringBootApplication
public class ShopApplication {

    private static final Logger log = LoggerFactory.getLogger(ShopApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ShopApplication.class, args);

        AuthorService authorService = context.getBean(AuthorService.class);
        BookService bookService = context.getBean(BookService.class);
//        Author authorNVG = new Author();
//        authorNVG.setAuthorName("Nikolay Vasilyevich Gogol");
//        Book bookDS = new Book();
//        bookDS.setBookName("Dead Souls");
//        bookDS.setAuthorid(authorNVG);
//        bookDS.setCost(500.31);
//        bookDS.setReleaseYear(1842);
//        bookDS.setPagesNumber(313);
//        authorService.createAuthor(authorNVG);
//        bookService.createBook(bookDS);

//        for(Author author: authorService.getAuthors()){ //Тут вывод только имен авторов и названий книг
//            log.info("Author: {}; Books: {}", author.getAuthorName(),
//                    bookService.getAllBooksByAuthorsName(author.getAuthorName())
//                            .stream()
//                            .map(b->b.getBookName())
//                            .collect(Collectors.toSet()));
//        }
        for (Author author : authorService.getAuthors()) {
            log.info("Author: {}\nBooks: {}", author, bookService.getAllBooksByAuthorsName(author.getAuthorName()));
        }
    }

}
