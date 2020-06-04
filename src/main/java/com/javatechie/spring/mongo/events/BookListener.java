package com.javatechie.spring.mongo.events;


import com.javatechie.spring.mongo.api.model.Book;
import com.javatechie.spring.mongo.api.resource.SequenceGeneratorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;


@Component
public class BookListener extends AbstractMongoEventListener<Book> {

    private SequenceGeneratorService sequenceGenerator;

    @Autowired
    public BookListener(SequenceGeneratorService sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }
 public BookListener(){}
    @Override
    public void onBeforeConvert(BeforeConvertEvent<Book> event) {
    	System.err.println("inside listener method");
        if (event.getSource().getId() < 1) {
            event.getSource().setId(sequenceGenerator.generateSequence(Book.SEQUENCE_NAME));
        }
    }


}