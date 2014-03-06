package AG;

import GUI.GUIPrincipal;

public class TestMuta {
	
	public static void main(String args[]) {
        
		TestMuta tm=new TestMuta(6,45,6);
		tm.inicializa();
		tm.mutaFuncionales();
		
		for(int i=0 ;i<6;i++)
			tm.pob[i].evalua();
		int j=2;
		j++;
    }
	
	private int tamañoPob;
	private Cromosoma[] pob;
	private int probMut;
	private int ProfMaxima;
	
 	public TestMuta(int tP,int Probm,int pm)
 	{
 		
 		tamañoPob=tP;
 		pob				= new Cromosoma[tamañoPob];
 		probMut= Probm;
 		ProfMaxima=pm;
 		}
 	
 	private void inicializa() {
 		
		for (int i=0;i<tamañoPob;i++)
		{
			pob[i]=new Cromosoma(ProfMaxima,true);			
		}	
	}
	
private void mutaFuncionales() {
		
		String[] cjtoFunciones={"AND","OR","NOT","IF"};
		for(int i=0;i<tamañoPob;i++)
		{
			Cromosoma c=pob[i];
			double numAle=Math.random()*100;
			if(numAle<probMut)
			{
				int numAle2	=	(int) (Math.random()*2);
				Arbol nodo = getFuncionAleatorio(c);
				
				if(nodo!=null&&(nodo.getNombre().equals("AND")||nodo.getNombre().equals("OR")))
				{
					nodo.setNombre(cjtoFunciones[numAle2]);
				}
				
			}
		}
	}

	private Arbol getFuncionAleatorio(Cromosoma c) {
		
		
		if(c.getArbol().getNumNodos()==1)
			return null;
		int numAle2	=	(int) (Math.random()*c.getArbol().getNumNodos());
		IntHolder i= new IntHolder();
		i.pos=0;
		Arbol a=c.getArbol().preordenMut(c.getArbol(), i, numAle2);
		while(a==null&&!a.getNombre().equals("AND")&&!a.getNombre().equals("OR")&&
				!a.getNombre().equals("IF")&&!a.getNombre().equals("NOT"))
		{
			numAle2	=	(int) (Math.random()*c.getArbol().getNumNodos());
			a=c.getArbol().preordenMut(c.getArbol(), i, numAle2);
		}
		return a;
		
		
	}

}
