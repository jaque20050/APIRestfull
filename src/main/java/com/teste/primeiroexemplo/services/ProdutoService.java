package com.teste.primeiroexemplo.services;

import java.util.List;
import java.util.Optional;

import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Metodo para retorna uma lista de produto
     * 
     * @return lista de produtos
     */
    public List<Produto> obterTodos() {
        // Colocar regra aqui, caso tenha.
        return produtoRepository.obterTodos();
    }

    /**
     * Metodo que retorna o produto encontrado pelo seu id.
     * 
     * @param id do produto que será localizado.
     * @return Retorna um produto caso seja encontrado.
     */
    public Optional<Produto> obterPorId(Integer id) {
        return produtoRepository.obterPorId(id);
    }

    /**
     * Metodo para adicionar produto na lista
     * 
     * @param produto que será adicionado
     * @return Retorna o produto que foi adicionado na lista
     */
    public Produto adicionar(Produto produto) {
        // Poderia ter alguma regra de negocio para validar o produto
        return produtoRepository.adicionar(produto);
    }

    /**
     * Metodo para deletar o produto por id.
     * 
     * @param id do produto a ser deletado.
     */
    public void deletar(Integer id) {
        // Aqui poderia ter alguma logica de validação
        produtoRepository.deletar(id);
    }

    /**
     * Metodo para atualizar o produto na lista.
     * 
     * @param produto que será atualizado.
     * @param id do produto.
     * @return Retorna o produto, após atualizar a lista.
     */
    public Produto atualizar(Integer id, Produto produto) {

        // Ter alguma validação no ID
        produto.setId(id);

        return produtoRepository.atualizar(produto);
    }
}
