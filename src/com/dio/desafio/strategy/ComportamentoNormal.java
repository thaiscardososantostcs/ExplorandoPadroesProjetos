package com.dio.desafio.strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("O robô está se movendo normalmente..");

    }
}
