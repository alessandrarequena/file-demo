package com.example.filedemo;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/publico/download/")
class FileDemoRestController {

    @GetMapping("/certidao-consulta-consolidada/{cnpj}")
//    @ApiOperation(value = "Gera link para download da certidão consolidada de pessoa jurídica (APF), " +
//            "conforme parâmetros do request. Responde com um link para download.")
    public String geraCertidaoConsultaConsolidada(@PathVariable String cnpj){
        return "Testado";
    }

}
