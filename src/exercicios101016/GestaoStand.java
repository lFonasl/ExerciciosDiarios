package exercicios101016;

import java.util.ArrayList;

public class GestaoStand {

	ArrayList _transaccoes;
	ArrayList _automoveis;
	ArrayList _clientes;
	
	public GestaoStand()
	{
		
		_transaccoes = new ArrayList<>();
		_automoveis = new ArrayList<>();
		_clientes = new ArrayList<>();
		
		Automovel newAuto = criarCarro();
		_automoveis.add(newAuto);
		
		Cliente c = new Cliente("Fabio Vieira","Seixal","926456252",152451245);
		Cliente d = new Cliente("Ricardo Oliveira","Almada","962167675",148721549);
		_clientes.add(c);
		_clientes.add(d);
		
		
		Transaccao crenault = new Transaccao(Transaccao.COMPRA,newAuto,c, 0);	
		
		_transaccoes.add(crenault);
		
		Transaccao vrenault = new Transaccao(Transaccao.VENDA,newAuto ,d, 2700);
		
		_transaccoes.add(vrenault);
	}
	
	public Automovel criarCarro()
	{ 
		Automovel a = new Automovel(2500,1600,"Renault","Megane",120000,2002);
		Automovel b = new Automovel(1500,2000,"Mercedes","190d",220000,1986);
		return a;
	}
	
	public ArrayList get_transaccoes() {
		return _transaccoes;
	}

	public Cliente criarCliente()
	{
		Cliente c = new Cliente("Fabio Vieira","Seixal","926456252",152451245);
		Cliente d = new Cliente("Ricardo Oliveira","Almada","962167675",148721549);
		return c;
	}
	
	
	public Transaccao comprarCarro(Automovel carro,Cliente c)
	{
		return null;
	}
	
	public Transaccao venderCarro(Automovel carro,Cliente c)
	{
		return null;
	}
	
	
	
	
	
}
