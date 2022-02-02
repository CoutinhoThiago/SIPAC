package cucumber.processo;

import cucumber.interessado.Interessado;

public class Processo {
	protected String assuntoDoProcessoCONARQ;
	protected boolean processoEletronico;
	protected String naturezaDoProcesso;
		//protected int naturezaDoProcesso;
		//OSTENSIVO = @value = 1
		//RESTRITO = @value = 5
		//SIGILOSO = @value = 6
	protected String observa��o;
	
	protected Interessado interessado;

	public Processo(String assuntoDoProcessoCONARQ, boolean processoEletronico, String naturezaDoProcesso, String observa��o, Interessado interessado) {
		super();
		this.assuntoDoProcessoCONARQ = assuntoDoProcessoCONARQ;
		this.processoEletronico = processoEletronico;
		this.naturezaDoProcesso = naturezaDoProcesso;
		this.observa��o = observa��o;
		this.interessado = interessado;
	}

	public String getAssuntoDoProcessoCONARQ() {
		return assuntoDoProcessoCONARQ;
	}

	public void setAssuntoDoProcessoCONARQ(String assuntoDoProcessoCONARQ) {
		this.assuntoDoProcessoCONARQ = assuntoDoProcessoCONARQ;
	}

	public boolean isProcessoEletronico() {
		return processoEletronico;
	}

	public void setProcessoEletronico(boolean processoEletronico) {
		this.processoEletronico = processoEletronico;
	}

	public String getNaturezaDoProcesso() {
		return naturezaDoProcesso;
	}

	public void setNaturezaDoProcesso(String naturezaDoProcesso) {
		this.naturezaDoProcesso = naturezaDoProcesso;
	}

	public String getObserva��o() {
		return observa��o;
	}

	public void setObserva��o(String observa��o) {
		this.observa��o = observa��o;
	}

	public Interessado getInteressado() {
		return interessado;
	}

	public void setInteressado(Interessado interessado) {
		this.interessado = interessado;
	}
}
