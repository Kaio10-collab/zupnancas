package br.com.zup.zupnancas.repository;

import br.com.zup.zupnancas.Enum.Status;
import br.com.zup.zupnancas.model.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository<Conta,Integer> {
    Iterable<Conta> findByAllStatus(Status status);

}
