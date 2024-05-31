package com.vincent.inc.Communication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vincent.inc.Communication.model.email.EmailProvider;
import com.vincent.inc.Communication.service.EmailProviderService;
import com.vincent.inc.viesspringutils.controller.ViesController;

@RestController
@RequestMapping("/email-providers")
public class EmailProviderController extends ViesController<EmailProvider, Integer, EmailProviderService> {

    public EmailProviderController(EmailProviderService service) {
        super(service);
    }
}
