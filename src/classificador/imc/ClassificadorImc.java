/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classificador.imc;

import java.util.Scanner; // Lê dados do teclado/arquivo (entrada do usuário)
//import java.util.ArrayList; // Lista dinâmica que cresce automaticamente
//import java.util.HashMap; // Mapa chave→valor, acesso rápido por chave
//import java.util.Map; // Interface base para mapas como HashMap e TreeMap
//import java.util.Date; // Representa uma data e hora específicas
//import java.text.SimpleDateFormat; // Formata e analisa datas no formato desejado
//import java.util.Random; // Gera números pseudoaleatórios
//import java.util.Arrays; // Utilitários para trabalhar com arrays (ordenar, buscar, comparar)
//import java.util.Collections; // Operações prontas para coleções (ordenar, embaralhar, máximo/mínimo)
//import java.math.BigDecimal; // Números decimais com precisão exata (evita erros de ponto flutuante)
//import java.io.IOException; // Exceção para erros de entrada e saída (leitura/escrita de arquivos)

/**
 *
 * @author matheus
 */
public class ClassificadorImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
    
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

  
        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

    
        double imc = peso / (altura * altura);

        System.out.printf("%nSeu IMC e: %.2f%n", imc);

                
        if (imc < 18.5) {

            System.out.println("Classificacao: Abaixo do peso(Magreza)");

        } else if (imc < 25) {

            System.out.println("Classificacao: Peso normal(Saudavel)");

        } else if (imc < 30) {

            System.out.println("Classificacao: Sobrepeso((acima do peso ideal - Barrigudinho)");

        } else if (imc < 40) {

            System.out.println("Classificacao: Obesidade I(Gordin)");

        } else if (imc > 40) {

            System.out.println("Classificacao: Obesidade II (Gordo)");

        } else {

            System.out.println("Classificacao: Obesidade grave(Gordaço)");
        }

   
        String mensagem = (imc >= 18.5 && imc < 25)
                ? "dentro ou abaixo"
                : "acima";

        System.out.println("O IMC esta " + mensagem + " da faixa ideal.");

       
        System.out.println("\n===== FAIXA ETARIA =====");
        System.out.println("1 - Crianca/Adolescente");
        System.out.println("2 - Adulto");
        System.out.println("3 - Idoso");

        System.out.print("Escolha uma opcao: ");
        int opcao = scanner.nextInt();

        // Switch
        switch (opcao) {

            case 1:
                System.out.println(
                        "Recomendacao: para criancas e adolescentes, " + "a avaliação do IMC deve considerar idade e desenvolvimento.");
                break;

            case 2:
                System.out.println(
                        "Recomendacao: mantenha uma alimentacao equilibrada " + "e pratique atividades fisicas regularmente.");
                break;

            case 3:
                System.out.println(
                        "Recomendacao: mantenha habitos saudaveis " + "e acompanhamento adequado.");
                break;

            default:
                System.out.println("Opcao invalida.");
                break;
        }

        scanner.close();
    
    }
    
}
