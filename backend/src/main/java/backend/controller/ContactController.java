package backend.controller;

import backend.entity.Contact;
import backend.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
    
    @Autowired
    private ContactRepository repository;

    @PostMapping("/contact")
    public String submitForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        Contact contact = new Contact();

        contact.setName(name);
        contact.setEmail(email);
        contact.setMessage(message);

        repository.save(contact);

        return "Contact Saved Successfully";
    }
}