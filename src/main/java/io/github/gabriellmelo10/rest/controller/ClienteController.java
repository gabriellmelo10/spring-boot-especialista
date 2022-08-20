package io.github.gabriellmelo10.rest.controller;

import io.github.gabriellmelo10.domain.entity.Cliente;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClienteController {

    @RequestMapping(
            value = {"/api/clientes/hello/{nome}", "/api/hello"},
            method = RequestMethod.POST,
            consumes = { "application/json", "application/xml" },
            produces = { "application/json", "application/xml" }
    )
    @ResponseBody
    public String helloCliente(@PathVariable("nome") String nomeCliente, @RequestBody Cliente cliente){
        return String.format("Hello %s ", nomeCliente);
    }

}
