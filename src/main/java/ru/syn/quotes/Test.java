package ru.syn.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import ru.syn.quotes.repositories.QuoteRepository;

//@Component
//public class Test {
//
//    @SpringBootApplication
//    public class QuotesApplication implements CommandLineRunner {
//
//        @Autowired
//        static QuoteRepository repo;
//
//        public static void main(String[] args) {
//            SpringApplication.run(QuotesApplication.class, args);
//
//        }
//    }
//
//
//        @Override
//        public void run(String... args) throws Exception {
//            var text = repo.findByQuoteIdEquals(144);
//            System.out.println(text);
//
//
//        }
//
//}
