package one.digitalinnovation.labpadroesprojetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.labpadroesprojetospring.model.Endereco;

/**
 * Cliente HTTP, criado via OpenFeing, para o consumo da API do ViaCEP.
 */

 @FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping(value = "/{cep}/json")
    Endereco consultarCep(@PathVariable("cep") String Cep);
}
