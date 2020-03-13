package br.com.julia.repositorio;

import br.com.julia.dominio.Coluna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColunaRepositorio extends JpaRepository<Coluna,Long> {
}
