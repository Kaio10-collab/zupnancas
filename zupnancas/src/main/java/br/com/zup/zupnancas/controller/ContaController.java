package br.com.zup.zupnancas.controller;

import br.com.zup.zupnancas.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contas/")
public class ContaController {

    @Autowired
    ContaService contaService;


}
