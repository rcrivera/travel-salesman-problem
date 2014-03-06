package AG;



import java.util.ArrayList;





public class ProgramaGenetico {
	
	private Cromosoma[] pob,pobIntermedia;
	private int ProfMaxima;
	private int tamañoPob;
	
	//No son usados de momento, algunos harán falta y otros no
	
	private Cromosoma hijo1,hijo2;
	private double medioAptitud,maximoAptitud,minimoAptitud;
	
	private int numIter;
	private double probCruce;
	private double probMut;
	private double tolerancia; 
	private int longCrom;
	private int numGenes;
	private Cromosoma elMejor;
	private double elitismo;
	private boolean admite_if;
	private int num_pob_elite;
	private ArrayList<Double> listaElMejor;
	private ArrayList<Double> listaMedioAptitud;
	private ArrayList<Double> listaMaximoAptitud;
	private double medioAptitudNeta;
	private double minimoAptitudNeta;
	private double maximoAptitudNeta;
	private int metodoseleccion;
	private int metodomutacion;
	
	public Cromosoma[] getPob() {
		return pob;
	}

	public void setPob(Cromosoma[] pob) {
		this.pob = pob;
	}

	public Cromosoma[] getPobIntermedia() {
		return pobIntermedia;
	}

	public void setPobIntermedia(Cromosoma[] pobIntermedia) {
		this.pobIntermedia = pobIntermedia;
	}

	public Cromosoma getHijo1() {
		return hijo1;
	}

	public void setHijo1(Cromosoma hijo1) {
		this.hijo1 = hijo1;
	}

	public Cromosoma getHijo2() {
		return hijo2;
	}

	public void setHijo2(Cromosoma hijo2) {
		this.hijo2 = hijo2;
	}

	public double getMedioAptitud() {
		return medioAptitud;
	}

	public void setMedioAptitud(double medioAptitud) {
		this.medioAptitud = medioAptitud;
	}

	public double getMaximoAptitud() {
		return maximoAptitud;
	}

	public void setMaximoAptitud(double maximoAptitud) {
		this.maximoAptitud = maximoAptitud;
	}

	public double getMinimoAptitud() {
		return minimoAptitud;
	}

	public void setMinimoAptitud(double minimoAptitud) {
		this.minimoAptitud = minimoAptitud;
	}

	public int getTamañoPob() {
		return tamañoPob;
	}

	public void setTamañoPob(int tamañoPob) {
		this.tamañoPob = tamañoPob;
	}

	public int getNumIter() {
		return numIter;
	}

	public void setNumIter(int numIter) {
		this.numIter = numIter;
	}

	public double getProbCruce() {
		return probCruce;
	}

	public void setProbCruce(double probCruce) {
		this.probCruce = probCruce;
	}

	public double getProbMut() {
		return probMut;
	}

	public void setProbMut(double probMut) {
		this.probMut = probMut;
	}

	public double getTolerancia() {
		return tolerancia;
	}

	public void setTolerancia(double tolerancia) {
		this.tolerancia = tolerancia;
	}

	public int getLongCrom() {
		return longCrom;
	}

	public void setLongCrom(int longCrom) {
		this.longCrom = longCrom;
	}

	public int getNumGenes() {
		return numGenes;
	}

	public void setNumGenes(int numGenes) {
		this.numGenes = numGenes;
	}

	public Cromosoma getElMejor() {
		return elMejor;
	}

	public void setElMejor(Cromosoma elMejor) {
		this.elMejor = elMejor;
	}

	public double getElitismo() {
		return elitismo;
	}

	public void setElitismo(double elitismo) {
		this.elitismo = elitismo;
	}

	public int getNum_pob_elite() {
		return num_pob_elite;
	}

	public void setNum_pob_elite(int num_pob_elite) {
		this.num_pob_elite = num_pob_elite;
	}

	public ArrayList<Double> getListaElMejor() {
		return listaElMejor;
	}

	public void setListaElMejor(ArrayList<Double> listaElMejor) {
		this.listaElMejor = listaElMejor;
	}

	public ArrayList<Double> getListaMedioAptitud() {
		return listaMedioAptitud;
	}

	public void setListaMedioAptitud(ArrayList<Double> listaMedioAptitud) {
		this.listaMedioAptitud = listaMedioAptitud;
	}

	public ArrayList<Double> getListaMaximoAptitud() {
		return listaMaximoAptitud;
	}

	public void setListaMaximoAptitud(ArrayList<Double> listaMaximoAptitud) {
		this.listaMaximoAptitud = listaMaximoAptitud;
	}

	public double getMedioAptitudNeta() {
		return medioAptitudNeta;
	}

	public void setMedioAptitudNeta(double medioAptitudNeta) {
		this.medioAptitudNeta = medioAptitudNeta;
	}

	public double getMinimoAptitudNeta() {
		return minimoAptitudNeta;
	}

	public void setMinimoAptitudNeta(double minimoAptitudNeta) {
		this.minimoAptitudNeta = minimoAptitudNeta;
	}

	public double getMaximoAptitudNeta() {
		return maximoAptitudNeta;
	}

	public void setMaximoAptitudNeta(double maximoAptitudNeta) {
		this.maximoAptitudNeta = maximoAptitudNeta;
	}
	
	public ProgramaGenetico(int profMax,int tamPob,boolean in_admite_if,int in_metodoseleccion,
			int ai_numIter,double ad_prob_cruce,double ad_prob_mut,double elitismo_in,int mutacion)
	{
		ProfMaxima		= profMax;
		tamañoPob		= tamPob;
		pob				= new Cromosoma[tamañoPob];
		pobIntermedia	= new Cromosoma[tamañoPob];
		this.admite_if  = in_admite_if;
		this.metodoseleccion = in_metodoseleccion;
		

		this.numIter 			= ai_numIter;
		this.probCruce 			= ad_prob_cruce;
		this.probMut 			= ad_prob_mut;

		this.maximoAptitud 		= 0;
		this.medioAptitud		= 0;
		this.listaElMejor      	=	new ArrayList<Double>();
    	this.listaMaximoAptitud	=	new ArrayList<Double>();
    	this.listaMedioAptitud	=	new ArrayList<Double>();
    	
    	this.elitismo           = elitismo_in;
    	this.num_pob_elite      = (int) (this.tamañoPob * this.elitismo);
    	this.metodomutacion = mutacion;

		
		
		
		
		
		
		
		
		
		
	}
	


	public  void ejecuta()
	{
		inicializa();
		revisar_adaptacion_minimiza();
		evaluarPoblacion();
		listaElMejor.add(getElMejor().getAptitud());
		listaMaximoAptitud.add(getMaximoAptitud());
		listaMedioAptitud.add(getMedioAptitud());
		escalado();

		while(!terminado())
		{
			/*for(int i=0; i< this.tamañoPob; i=i+2)
			{
				if(!(this.cromosomavalido(pob[i]))){
					System.out.print("No VALIDO ");
				}
			}*/
			IncrementoNumIter();
			//METODO DE SELECCIÓN
			switch(this.metodoseleccion)
			{
			case 0:	
				seleccionRuleta();
				break;
			case 1:
				seleccionTorneo();
				break;
			case 2:
				seleccionRanking();	
				break;
			default:
				seleccionEstocasticoUniversal();
				break;
			}

			reproduccion();
			//MÉTODO DE MUTACIÓN
			muta();


			revisar_adaptacion_minimiza();

			evaluarPoblacion();
			escalado();
			//listaElMejor.add(getElMejor().getAptitud());
			listaElMejor.add(getElMejor().getAptitud());
			listaMaximoAptitud.add(getMaximoAptitud());
			listaMedioAptitud.add(getMedioAptitud());		
		}
	}
	
	// Crea la poblacion de expresiones posibles, que además son validas, puesto que 
	// esta modificado el constructor de Cromosoma para que tenga en cuenta la aridad de la funcion
	// Tiene 3 hijos Hi(izquierdo) Hc (central) y Hd(derecho) 
	// Si binario toma hi y hd, y hc=null
	// Si Ternario toma los tres
	// Unario toma hc y hd=hi=null
	private void inicializa() {
	
		for (int i=0;i<tamañoPob;i++)
		{
			pob[i]=new Cromosoma(ProfMaxima,this.admite_if);			
		}
		for (int i = 0; i < tamañoPob; i++) 
		{
			pob[i] = new Cromosoma(ProfMaxima,this.admite_if);
		    pobIntermedia[i] = new Cromosoma(ProfMaxima,this.admite_if);
			pob[i].setAptitud(pob[i].evalua());	
		}
		elMejor = new Cromosoma(ProfMaxima,this.admite_if);
		hijo1=new Cromosoma(ProfMaxima,this.admite_if);
		hijo2=new Cromosoma(ProfMaxima,this.admite_if);
		elMejor.setAptitud(Double.MAX_VALUE);
	
	}

	private boolean terminado()
	{
		return numIter==0;
	}
	private void IncrementoNumIter() 
	{
		numIter--;
	}

	private void selecciona() {
		// TODO Auto-generated method stub
		
	}

	private void muta() {
		// TODO Auto-generated method stub
		
	}

	public void seleccionTorneo(){
		selecciona_peores();
		int Tmuestra = 3;
		int[] seleccion= new int[tamañoPob - this.getNum_pob_elite()];
		int []Torneo = new int[Tmuestra];
		double aptitudmejorTorneo = Integer.MAX_VALUE;
		int indiceTorneo = -1;
		this.selecciona_peores();
		for(int j=0; j< tamañoPob - this.getNum_pob_elite() ; j++)
		{
			aptitudmejorTorneo = Integer.MAX_VALUE;
			indiceTorneo = -1;
			for(int i=0; i< Tmuestra; i++)	
			{
				Torneo[i]= this.aleatorioPCruce(0,tamañoPob) ;
				//if(pob[Torneo[i]].getAptitud_neta()<aptitudmejorTorneo){
				if(pob[Torneo[i]].getAptitud()<aptitudmejorTorneo){
					//aptitudmejorTorneo = pob[Torneo[i]].getAptitud_neta();
					aptitudmejorTorneo = pob[Torneo[i]].getAptitud();
					indiceTorneo = Torneo[i];
				}
				//System.out.println(indiceTorneo);
			}
			seleccion[j]= indiceTorneo;
		}
		
		for(int i=0; i< tamañoPob - this.getNum_pob_elite(); i++)	
		{
			pobIntermedia[i].copiaCromosoma( pob[seleccion[i]]);
		}
	}
	
	public  void seleccionRanking()
	{
		int[] seleccion= new int[tamañoPob - this.getNum_pob_elite()];
		double prob;
		//Ordenamos en primer lugar
		this.ordena_peores();
		this.selecciona_peores();
		int posSeleccionado;
		double[] selec = this.rankPopulation();
		for(int i=0; i< tamañoPob - this.getNum_pob_elite() ; i++)
		{
			prob = aleatorio(); 
			posSeleccionado = 0;
			while((posSeleccionado < tamañoPob- 1)&&(prob > selec[posSeleccionado]))
			{
				posSeleccionado++;
			}
			seleccion[i]= posSeleccionado;
			//System.out.println("Cojo"+i+ "  "+seleccion[i]);
		}
		
		//System.out.println("-----------------------------------------------------------------------------------------------------------");
		for(int i=0; i< tamañoPob - this.getNum_pob_elite(); i++)		
		{
			pobIntermedia[i].copiaCromosoma( pob[seleccion[i]]);
		}
	}
	public  void seleccionEstocasticoUniversal(){
		//revisar_adaptacion_minimiza();
		int[] seleccion= new int[tamañoPob - this.getNum_pob_elite()];
		double prob;
		this.selecciona_peores();
		int posSeleccionado;
		for(int i=0; i< tamañoPob - this.getNum_pob_elite() ; i++)
		{
			prob = aleatorio();
			prob = (prob+i-1)/(tamañoPob - this.getNum_pob_elite());
			posSeleccionado = 0;
			while((posSeleccionado < tamañoPob -1)&&(prob > pob[posSeleccionado].getPuntuacion_neta_acumulada()))
			//while((posSeleccionado < tamañoPob- 1)&&(prob > pob[posSeleccionado].getPuntuacion_acumulada()))
			{
				posSeleccionado++;
			}
			seleccion[i]= posSeleccionado;
		}
		//System.out.println("-----------------------------------------------------------------------------------------------------------");
		for(int i=0; i< tamañoPob - this.getNum_pob_elite(); i++)
			
		{
			pobIntermedia[i].copiaCromosoma( pob[seleccion[i]]);
			//System.out.println(this.numIter);
			/*if(!(this.cromosomavalido(pobIntermedia[i]))){
				System.out.print("No VALIDO "+i+ "  "+seleccion[i]);
			}*/
			//System.out.println("Cojo"+i+ "  "+seleccion[i]);
			

		}
	}
		private double[] rankPopulation(){
			double Beta_ = 1.5;
			double[] fitnessSegments = new double[this.tamañoPob];
			for(int i=0 ; i<fitnessSegments.length ; i++){
				double probOfIth = (double)i/this.tamañoPob;
				probOfIth = probOfIth*2*(Beta_-1);
				probOfIth = Beta_ - probOfIth;
				probOfIth = (double)probOfIth*((double)1/this.tamañoPob);
				if(i!=0)
					fitnessSegments[i] = fitnessSegments[i-1] + probOfIth;
				else
					fitnessSegments[i] = probOfIth;
			}
			return fitnessSegments;
		}	
		public  void seleccionRuleta()
		{
			//revisar_adaptacion_minimiza();
			int[] seleccion= new int[tamañoPob - this.getNum_pob_elite()];
			double prob;
			this.selecciona_peores();
			int posSeleccionado;
			for(int i=0; i< tamañoPob - this.getNum_pob_elite() ; i++)
			{
				prob = aleatorio(); 
				posSeleccionado = 0;
				while((posSeleccionado < tamañoPob -1)&&(prob > pob[posSeleccionado].getPuntuacion_neta_acumulada()))
				//while((posSeleccionado < tamañoPob- 1)&&(prob > pob[posSeleccionado].getPuntuacion_acumulada()))
				{
					posSeleccionado++;
				}
				seleccion[i]= posSeleccionado;
			}
			//System.out.println("-----------------------------------------------------------------------------------------------------------");
			for(int i=0; i< tamañoPob - this.getNum_pob_elite(); i++)
				
			{
				pobIntermedia[i].copiaCromosoma( pob[seleccion[i]]);
				//System.out.println(this.numIter);
				/*if(!(this.cromosomavalido(pobIntermedia[i]))){
					System.out.print("No VALIDO "+i+ "  "+seleccion[i]);
				}*/
				//System.out.println("Cojo"+i+ "  "+seleccion[i]);
				

			}
		}
		
		private void ordena_peores() {
			ArrayList <Integer> indices_seleccionados = new ArrayList<Integer>();
			int mayor = 0;
			double mayor_aptitud = Integer.MAX_VALUE;
			for(int i =0; i< tamañoPob ; i++)
			{
				mayor_aptitud = Integer.MAX_VALUE;
				mayor = 0;
				for(int j=0; j< tamañoPob ; j++)
				{
					if(pob[j].getAptitud() < mayor_aptitud && indices_seleccionados.contains(j)==false ){
						mayor = j;
						mayor_aptitud = pob[j].getAptitud();
					}
				}
				indices_seleccionados.add(mayor);
			}
			for(int i=0 ; i< tamañoPob; i++){
				//this.pobIntermedia[i + tamañoPob - this.getNum_pob_elite()]= pob[indices_seleccionados.get(i)];
				pobIntermedia[i].copiaCromosoma(pob[indices_seleccionados.get(i)])  ;
			}
			for(int i=0 ; i< tamañoPob  ; i++){
				//this.pobIntermedia[i + tamañoPob - this.getNum_pob_elite()]= pob[indices_seleccionados.get(i)];
				//pobIntermedia[i].copiaCromosoma(pob[i])  ;
				pob[i].copiaCromosoma(pobIntermedia[i])  ;
			}
		}
		private int[] OrdenaVectorEnteros(int[] vector,int longitud) {
			ArrayList <Integer> indices_seleccionados = new ArrayList<Integer>();
			int [] x = new int[longitud];
			int mayor = 0;
			double mayor_aptitud = Integer.MAX_VALUE;
			for(int i =0; i< longitud ; i++)
			{
				mayor_aptitud = Integer.MAX_VALUE;
				mayor = 0;
				for(int j=0; j< longitud ; j++)
				{
					if(vector[j] < mayor_aptitud && indices_seleccionados.contains(j)==false ){
						mayor = j;
						mayor_aptitud = vector[j];
					}
				}
				indices_seleccionados.add(mayor);
			}
			for(int i=0 ; i< longitud ; i++){
				x [i] = vector[indices_seleccionados.get(i)];		
			}	
			return x;
		}
		private void selecciona_peores() {
			ArrayList <Integer> indices_seleccionados = new ArrayList<Integer>();
			int mayor = 0;
			double mayor_aptitud = Integer.MAX_VALUE;
			for(int i =0; i< this.getNum_pob_elite() ; i++)
			{
				mayor_aptitud = Integer.MAX_VALUE;
				mayor = 0;
				for(int j=0; j< tamañoPob ; j++)
				{
					if(pob[j].getAptitud() < mayor_aptitud && indices_seleccionados.contains(j)==false ){
						mayor = j;
						mayor_aptitud = pob[j].getAptitud();
					}
				}
				indices_seleccionados.add(mayor);
			}
			for(int i=0 ; i< this.getNum_pob_elite() ; i++){
				//this.pobIntermedia[i + tamañoPob - this.getNum_pob_elite()]= pob[indices_seleccionados.get(i)];
				pobIntermedia[i + tamañoPob - this.getNum_pob_elite()].copiaCromosoma(pob[indices_seleccionados.get(i)])  ;
			}		
		}
		private double aleatorio() 
		{
			
			return  Math.random();
		}
		private int aleatorioPCruce(int min, int max) {
			// TODO Auto-generated method stub
			return (int)(Math.random()*(max-min))+min;
		}
		
		
		/*public void cruce(Cromosoma padre1,Cromosoma padre2,
				int alturaMax, int iter, int nmax)*/
		public void cruce(Cromosoma padre1,Cromosoma padre2,
				int alturaMax){
			
			Arbol arbol1, arbol2;
			boolean esHi1 = false, esHi2 = false, raiz1 = false, raiz2 = false;
			Arbol nodo1 = null;
			Arbol nodo2 = null;
			Arbol nodo_aux1 = null;
			Arbol pater1 = null;
			Arbol pater2 = null;
			boolean stop = false;
			int nAlt1, nAlt2;
			hijo1.copiaCromosoma(padre1);
			hijo1.copiaCromosoma(padre2);
			arbol1 = padre1.getArbol();
			arbol2 = padre2.getArbol();
			
			while (!stop) {
				nodo1 = arbol1.ArbolAleatorioconProb(); 
				nodo2 = arbol2.ArbolAleatorioconProb();
				nodo_aux1 = nodo1;
				raiz1 = nodo1.isRaiz();
				raiz2 = nodo2.isRaiz();
				esHi1 = nodo1.isEsHi();
				esHi2 = nodo2.isEsHi();
				if (!raiz1) {
					pater1 = nodo1.getPadre();
					nAlt1 = pater1.getProfundidad() + 1;
				} else
					nAlt1 = 0;
				if (!raiz2) {
					pater2 = nodo2.getPadre();
					nAlt2 = pater2.getProfundidad() + 1;
				} else
					nAlt2 = 0;
				nAlt1 = nAlt1 + nodo2.altura();
				nAlt2 = nAlt2 + nodo1.altura();
				
				stop = ((nAlt1 <= alturaMax) && (nAlt2 <= alturaMax));
			}
			if (raiz1)
				arbol1 = new Arbol(nodo2, null);
			else {
				if (esHi1)
					pater1.setHi(nodo2);
				else
					pater1.setHd(nodo2);
			}
			
			if (raiz2)
				arbol2 = new Arbol(nodo_aux1, null);
			else {
				if (esHi2)
					pater2.setHi(nodo_aux1);
				else
					pater2.setHd(nodo_aux1);
			}
			
			arbol1.actualizar(arbol1.getProfundidad());
			arbol2.actualizar(arbol2.getProfundidad());
			hijo1.setArbol(arbol1);
			hijo2.setArbol(arbol2);
			hijo1.evalua();
			hijo2.evalua();
		}
		public  void reproduccion()
		{
			int[] seleccionCruce= new int[tamañoPob - this.getNum_pob_elite()];
			int numSelecCruce=0;
			double prob;

			this.selecciona_peores();

			for(int i=0; i< tamañoPob - this.getNum_pob_elite(); i++)
			{
				prob=aleatorio()*100;
				if(prob < probCruce)
				{
					seleccionCruce[numSelecCruce]= i;
					numSelecCruce++;
				}
			}
			if((numSelecCruce % 2)==1)
				numSelecCruce--;
			
			for(int i=0; i< numSelecCruce; i=i+2)
			{

				cruce(pobIntermedia[seleccionCruce[i]],pobIntermedia[seleccionCruce[i+1]],this.ProfMaxima);
		
				pobIntermedia[seleccionCruce[i]].copiaCromosoma(hijo1);
				pobIntermedia[seleccionCruce[i+1]].copiaCromosoma(hijo2);
			}
		}
		public  void evaluarPoblacion()
		{
		    int posMejo = 0; 
			double puntAcumulada	= 0;
			double aptitudMejor		= Double.MAX_VALUE;
			double aptitudPeor		= Double.MIN_VALUE;
			double aptitudPeorNeta		= Double.MAX_VALUE;
			double sumAptitud		= 0;
			double sumAptitudNeta		= 0;
			double aptitudMejorPob  = Double.MAX_VALUE;
			double aptitudMejorNeta  =Double.MAX_VALUE;
		
			
			for(int i=0; i<tamañoPob; i++)
			{
				sumAptitud = sumAptitud + pob[i].getAptitud();
				if(pob[i].getAptitud()< aptitudMejorPob )
				{
					aptitudMejorPob = pob[i].getAptitud();
				}
				if(pob[i].getAptitud()< aptitudMejor )
				{
					posMejo	=	i;
					aptitudMejor = pob[i].getAptitud();
				}
			}	
			for(int i=0; i<tamañoPob; i++)
			{
				pob[i].setPuntuacion(pob[i].getAptitud()/sumAptitud);
				pob[i].setPuntuacion_acumulada(pob[i].getPuntuacion()+ puntAcumulada);
				puntAcumulada	= puntAcumulada + pob[i].getPuntuacion();
			}

				
			for(int i=0; i<tamañoPob; i++)
			{
				sumAptitudNeta = sumAptitudNeta + pob[i].getAptitud_neta();
				if(pob[i].getAptitud_neta()> aptitudMejorPob )
				{
					aptitudMejorPob = pob[i].getAptitud_neta();
				}
				if(pob[i].getAptitud_neta()> aptitudMejorNeta )
				{
					posMejo	=	i;
					aptitudMejorNeta = pob[i].getAptitud_neta();
					aptitudMejor = pob[i].getAptitud();
				}
				if(pob[i].getAptitud_neta()< aptitudPeor )
				{
					
					aptitudPeor = pob[i].getAptitud();
					aptitudPeorNeta = pob[i].getAptitud_neta();
				}
			}	
			for(int i=0; i<tamañoPob; i++)
			{
				pob[i].setPuntuacion_neta((pob[i].getAptitud_neta()/sumAptitudNeta));
				pob[i].setPuntuacion_neta_acumulada(pob[i].getPuntuacion_neta()+ puntAcumulada);
				puntAcumulada	= puntAcumulada + pob[i].getPuntuacion_neta();
			}
			if(aptitudMejor < elMejor.getAptitud() )
			{
				elMejor.copiaCromosoma(pob[posMejo]);
			}

			setMaximoAptitud(aptitudMejor);
			setMedioAptitud(sumAptitud/ tamañoPob);
			setMinimoAptitud(aptitudPeor);
			setMaximoAptitudNeta(aptitudMejorNeta);
			setMedioAptitudNeta(sumAptitudNeta/ tamañoPob);
			setMinimoAptitudNeta(aptitudPeorNeta);
		}
		 private void revisar_adaptacion_minimiza (){
				
				double Cmax = Integer.MIN_VALUE;
				for(int i=0; i<tamañoPob; i++)
				{
					if (pob[i].getAptitud() > Cmax){
						Cmax = pob[i].getAptitud();
					}
				}
				Cmax = Cmax * 1.05;
				for(int i=0; i<tamañoPob; i++)
				{
					pob[i].setAptitud_neta(Cmax - pob[i].getAptitud());
					pob[i].setPuntuacion_acumulada(Cmax - pob[i].getAptitud());
				}
			}
		 public void escalado() {
				
				double a=aPos();
				double b=b();
				double sumAptitud_neta		= 0;
				double puntAcumulada_neta	= 0;
				for(int i=0; i<tamañoPob;i++)
				{
					
					pob[i].escalado(a, b);
					sumAptitud_neta = sumAptitud_neta + pob[i].getAptitud_neta();
				}
				
				for(int i=0; i<tamañoPob; i++)
				{
					pob[i].setPuntuacion_neta(pob[i].getAptitud_neta()/sumAptitud_neta);
					pob[i].setPuntuacion_neta_acumulada(pob[i].getPuntuacion_neta()+ puntAcumulada_neta);
					puntAcumulada_neta	= puntAcumulada_neta + pob[i].getPuntuacion();
				}
			}

			private double b() {
				double b_resultado= (1- aNeg())*this.medioAptitud;
				return b_resultado;
			}

			private double aPos() {
				
				double P = 6;
				double a_resultado= ((P-1)*medioAptitudNeta)/ (maximoAptitudNeta - medioAptitudNeta); 
				return a_resultado;
			}
			private double aNeg()
			{
				return medioAptitudNeta/(medioAptitudNeta-minimoAptitudNeta);
			}
			
			
			
			
			/*public  void mutacionTerminalSimple()
			{
				boolean mutado=false;
				double prob;
				int punto1,punto2,aux;
				int PuntosInserccion = 4;
				int seleccion;
				int valor = 0;
				for(int i=0; i< tamañoPob - this.getNum_pob_elite(); i++)
				{
					prob= aleatorio()*100;
						if(prob < probMut)
						{	
							int intRand = aleatorioPCruce(0,pobIntermedia[i].getCjtoTerminales().length);
							String TerminalNuevo = pobIntermedia[i].getCjtoTerminales()[intRand];
							int numNodos = pobIntermedia[i].getArbol().getNumNodos();
							
							

						}
					
					
					pobIntermedia[i].setAptitud(pobIntermedia[i].evalua());

				}
				for(int i=0; i< tamañoPob; i++)
				{
					pob[i].copiaCromosoma(pobIntermedia[i]);
				}
				
			}*/

}
