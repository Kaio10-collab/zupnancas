package br.com.zup.zupnancas.controller;

import br.com.zup.zupnancas.dto.CategoriaDTO;
import br.com.zup.zupnancas.model.Categoria;
import br.com.zup.zupnancas.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("categorias/")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria cadastrarCategoria(@RequestBody @Valid CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaDTO.converterDTOParaModel();
        return categoriaService.cadastrarCategoria(categoria);
    }

    @GetMapping
    public List<Categoria> visualizarCategorias(){
        return categoriaService.visualizarCategoriasCadastradas();
    }

    @DeleteMapping("{id}/")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarCategoria(@PathVariable int id) {
        categoriaService.deletarCategoria(id);
    }
}
