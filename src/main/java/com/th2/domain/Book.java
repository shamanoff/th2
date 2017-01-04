package com.th2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Long id;
    private String bookName;
    private String bookAuthor;
    private String imgUrl;

}
