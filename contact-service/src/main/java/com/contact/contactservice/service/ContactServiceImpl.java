package com.contact.contactservice.service;

import com.contact.contactservice.entity.Contact;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{
    //static data of contact
    List<Contact> list = List.of(
            new Contact(100L,"a@email","name1",1L),
            new Contact(200L,"b@email","name2",1L),
            new Contact(300L,"c@email","name3",2L),
            new Contact(400L,"d@email","name4",2L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
