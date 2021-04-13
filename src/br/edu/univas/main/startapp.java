package br.edu.univas.main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import br.edu.univas.vo.moto;
import br.edu.univas.vo.carro;
import br.edu.univas.vo.veiculo;
import br.edu.univas.vo.motor;
import br.edu.univas.vo.competidor;

public class startapp {
	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        Random r = new Random();
	        ArrayList<competidor> competidores = new ArrayList<>();
	        System.out.println("CADASTRO>");
	        for (int i = 0; i < 5; i++) {
	            competidor c = new competidor();
	            System.out.println("Digite o apelido do competidor: ");
	            String ap = sc.nextLine();
	            System.out.println("Digite 1 para Carro e 2 para Moto: ");
	            int op = sc.nextInt();
	            sc.nextLine();
	            if (op == 1) {
	                carro carro = new carro();
	                c.setVeiculo(carro);
	                c.setApelido(ap);
	                competidores.add(c);
	            } else if (op == 2) {
	                moto moto = new moto();
	                c.setVeiculo(moto);
	                c.setApelido(ap);
	                competidores.add(c);
	            }
	        }
	        for (int j = 0; j < 10; j++) {
	            for (int w = 0; w < 5; w++) {
	                competidor c = competidores.get(w);
	                veiculo v = c.getveiculo();
	                v.acelerar(r.nextInt((20 - 5) + 1) + 5);
	            }
	        }
	        sc.close();
	        competidor comp = competidores.get(0);
	        veiculo veic = comp.getveiculo();
	        int maior = veic.getvelocidadeatual();
	        int indice = 0;
	        for (int z = 1; z < 5; z++) {
	            competidor c = competidores.get(z);
	            veiculo v = c.getveiculo();
	            if (maior < v.getvelocidadeatual()) {
	                maior = v.getvelocidadeatual();
	                indice = z;
	            }
	        }
	        
	        competidor campeao = competidores.get(indice);
	        System.out.println("Competidor mais rápido: " + campeao.getApelido());
	        System.out.println("Velocidade: " + maior);

	    }
}
