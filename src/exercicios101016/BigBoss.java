package exercicios101016;

import java.util.ArrayList;

	public class BigBoss {
		ArrayList<GestaoStand> _stands;
	
		
	public BigBoss()
	{
		
		
		_stands =  new ArrayList<GestaoStand>();
		
		GestaoStand raminhos = new GestaoStand();
		
		_stands.add(raminhos);
			
		lucrosStand(raminhos);
	}
	
	private void lucrosStand(GestaoStand stand)
	{
	 ArrayList tr =	stand.get_transaccoes();
	 
	 double lucro=0, vendas=0 , compras=0;
	 
	 for( int i =0;i < tr.size();i++)
	 {
		Transaccao t = (Transaccao) tr.get(i) ;
		
		
	 }
	 
	}
	
}
