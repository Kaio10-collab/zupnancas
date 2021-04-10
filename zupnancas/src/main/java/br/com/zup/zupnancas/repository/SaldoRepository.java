package br.com.zup.zupnancas.repository;

import br.com.zup.zupnancas.model.Saldo;
import org.springframework.data.repository.CrudRepository;

public interface SaldoRepository extends CrudRepository<Saldo, String> {

    Iterable<Saldo> findById(int id);

}