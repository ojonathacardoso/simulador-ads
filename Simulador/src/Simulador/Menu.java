
package Simulador;

import java.util.Scanner;

public class Menu {
    
    // [1] Simulação por participação (%) dos setores usando dados padrão
    // [2] Simulação por participação (%) dos setores usando dados manuais
    // [3] Simulação por quantidade de chamados com geração aleatória
    // [4] Simulação por quantidade de chamados com geração na ordem
    
    int menu = 0;    
    Scanner scanner = new Scanner(System.in);
    
    public int exibirMenu(){
        
        int opcao;
        
        do {
            System.out.println("[1] Simular por participacao (%) dos setores");
            System.out.println("[2] Simular por quantidade de chamados");
            System.out.println("[0] Sair");
            System.out.print("Informe a opção desejada: ");
            opcao = scanner.nextInt();            
        } while (opcao < 0 || opcao > 2);
        
        if(opcao == 1) {
            
            System.out.println("------------------------------");
            
            do {
                System.out.println("[1] Simulação usando dados padrão");
                System.out.println("[2] Simulação usando dados manuais");
                System.out.println("[0] Sair");
                System.out.print("Informe a opção desejada: ");
                opcao = scanner.nextInt();            
            } while (opcao < 0 || opcao > 2);

            if(opcao == 1 || opcao == 2) {
                
                System.out.println("------------------------------");
                
                if(opcao == 1) {
                    menu = 1;
                }
                else if(opcao == 2) {
                    menu = 2;
                }
            }
        }
        else if(opcao == 2) {
            
            System.out.println("------------------------------");
            
            do {
                System.out.println("[1] Simulação aleatória");
                System.out.println("[2] Simulação na ordem");
                System.out.print("Informe a opção desejada: ");
                System.out.println("[0] Sair");
                opcao = scanner.nextInt();            
            } while (opcao < 0 || opcao > 2);
            
            System.out.println("------------------------------");
                
            if(opcao == 1) {
                menu = 3;
            }
            else if(opcao == 2) {
                menu = 4;
            }
        }
        
        return menu;
    }
    
}