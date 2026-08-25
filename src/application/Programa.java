package application;

import xadrez.PartidaDeXadrez;

public class Programa { 
    public static void main(String[] args) {
        PartidaDeXadrez partida = new PartidaDeXadrez();
        InterfaceUsuario.imprimirTabuleiro(partida.getPecas());
    }
    
}