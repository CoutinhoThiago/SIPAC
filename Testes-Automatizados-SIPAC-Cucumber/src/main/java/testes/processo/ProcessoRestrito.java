package testes.processo;

import testes.interessado.Interessado;

public class ProcessoRestrito extends Processo {
	private String hipoteseLegal;
	
	public ProcessoRestrito(String assuntoDoProcessoCONARQ, boolean processoEletronico, String naturezaDoProcesso, 
			String observa��o, Interessado interessado, String hipoteseLegal) {
		super(assuntoDoProcessoCONARQ, processoEletronico, naturezaDoProcesso, observa��o, interessado);
		this.hipoteseLegal = hipoteseLegal;
	}
}
