package es.unex.cum.edi.practica;

import java.util.Random;

public class TableroParejas extends Tablero {

	public TableroParejas() {
		super();
	}

	public TableroParejas(int numFilas, int numColumnas) {
		numFilas = 6;
		numColumnas = 6;
	}

	@Override
	public void inicializar() {
		// TODO Auto-generated method stub

		for (int i = 0; i < numFilas; i++) {
			for (int j = 0; j < numColumnas; j++) {
				tablero[i][j] = new CeldaPareja(i, j);
			}
		}
	}

	@Override
	public void repartir() {
		// TODO Auto-generated method stub

		Random r = new Random();
		int aleatorio = ((numFilas * numColumnas) / 2);

		while (aleatorio > 0) {

			int cont = 0;

			while (cont < 2) {

				int numeroF = r.nextInt(numFilas);
				int numeroC = r.nextInt(numColumnas);
				CeldaPareja cp = (CeldaPareja) tablero[numeroF][numeroC];

				if (cp.getValor() == -1) {

					cp.setValor(aleatorio);
					cp.setEstado(0);
					cp.setImageReverso(" # ");
					cp.setImagenFrontal(Integer.toString(aleatorio));

					cont++;
				}
			}

			aleatorio = aleatorio - 1;

		}

	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub

		for (int i = 0; i < numFilas; i++) {
			System.out.println();
			for (int j = 0; j < numColumnas; j++) {
			
				CeldaPareja cp = (CeldaPareja) tablero[i][j];
				System.out.print(cp.getImageReverso()+" ");
				
			}
		}

	}

}
