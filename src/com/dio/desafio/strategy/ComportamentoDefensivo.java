package com.dio.desafio.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("O robô está se movendo defensivamente..");

    }
}
