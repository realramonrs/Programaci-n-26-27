package gestorMatrices;

public class FacturaInternacional extends Factura {

	private String codPais;
	private float arancel;
	
	public FacturaInternacional(String id, float importe, String cliente, String codPais, float arancel) {
		super(id, importe, cliente);
		this.codPais = codPais;
		this.arancel = arancel;
	}
	
	
	
	
}
