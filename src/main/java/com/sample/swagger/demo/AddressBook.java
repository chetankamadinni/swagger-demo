package com.sample.swagger.demo;

import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api")
public class AddressBook {

    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Contact getContact(@PathVariable String id){
        return contacts.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Contact> getAllContacts(){
        return new ArrayList<Contact>(contacts.values());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Contact addContact(@RequestBody Contact contact){
        contacts.put(contact.getId(), contact);
        return contact;
    }
}
