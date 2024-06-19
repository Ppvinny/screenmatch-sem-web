package br.com.alura.Screenmatch.service;

public interface IconverteDados {
   <T> T obterDados(String json, Class <T> classe);
}
