package br.com.zup.zupnancas.controller;

import br.com.zup.zupnancas.service.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("creditos/")
public class Creditocontroller {

    @Autowired
    private CreditoService creditoService;


}
