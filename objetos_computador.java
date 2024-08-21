package curso21_08;

public class objetos_computador {

	public static void main(String[] args) {
    computador computador = new computador();
		
		computador.setMarca("Marca: AMD Ryzen 5");
		computador.setVelocidade("Velocidade da CPU: 3 GHz");
		computador.setCor("Preto");
		computador.setValor(2500);
		
		System.out.println(computador.getMarca());
		System.out.println(computador.getVelocidade());
		System.out.println(computador.getCor());
		System.out.println(computador.getValor());
		System.out.println(computador.ligar());
		System.out.println(computador.desligar());
		System.out.println(computador.reiniciar());


	}

}
