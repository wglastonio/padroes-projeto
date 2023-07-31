package one.digitalinnovation.labpadroesprojetospring.service;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;

/**
 * Interface que define o padrão Strategy no domínio do cliente.
 * Podemos ter múltiplas implementações dessa mesma interface.
 */

public interface ClienteService {
    
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
