
package AG;

import java.util.ArrayList;

public class Cromosoma implements Comparable {
	
	private Arbol arbol;
	private int hmax;
	private double aptitud;
	private double evaluacion;
	private double puntuacion;
	private double puntuacion_acumulada;
	private double aptitud_neta;
	private double puntuacion_neta;
	private double puntuacion_neta_acumulada;
	private boolean admite_if;
	private final String[] cjtoTerminales={"A0","A1","D0","D1","D2","D3"};
	private final String[] cjtoFunciones={"AND","OR","NOT","IF"};
	

	public Arbol getArbol() {
		return arbol;
	}

	public double getPuntuacion_acumulada() {
		return puntuacion_acumulada;
	}

	public boolean isAdmite_if() {
		return admite_if;
	}

	public void setAdmite_if(boolean admiteIf) {
		admite_if = admiteIf;
	}

	public void setPuntuacion_acumulada(double puntuacionAcumulada) {
		puntuacion_acumulada = puntuacionAcumulada;
	}


	public double getAptitud_neta() {
		return aptitud_neta;
	}


	public void setAptitud_neta(double aptitudNeta) {
		aptitud_neta = aptitudNeta;
	}


	public double getPuntuacion_neta() {
		return puntuacion_neta;
	}


	public void setPuntuacion_neta(double puntuacionNeta) {
		puntuacion_neta = puntuacionNeta;
	}


	public double getPuntuacion_neta_acumulada() {
		return puntuacion_neta_acumulada;
	}


	public void setPuntuacion_neta_acumulada(double puntuacionNetaAcumulada) {
		puntuacion_neta_acumulada = puntuacionNetaAcumulada;
	}


	public String[] getCjtoTerminales() {
		return cjtoTerminales;
	}


	public String[] getCjtoFunciones() {
		return cjtoFunciones;
	}

	public void setArbol(Arbol arbol) {
		this.arbol = arbol;
	}


	public int getHmax() {
		return hmax;
	}


	public void setHmax(int hmax) {
		this.hmax = hmax;
	}


	public double getAptitud() {
		return aptitud;
	}


	public void setAptitud(double aptitud) {
		this.aptitud = aptitud;
	}


	public double getEvaluacion() {
		return evaluacion;
	}


	public void setEvaluacion(double evaluacion) {
		this.evaluacion = evaluacion;
	}


	public double getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}


	public double getPunt_acu() {
		return puntuacion_acumulada;
	}


	public void setPunt_acu(double punt_acu) {
		this.puntuacion_acumulada = puntuacion_acumulada;
	}


	
	/* Constructora que crea los individuos aleatoriamente */
	public Cromosoma(int hmax,boolean if_valido)
	{
	      /*Guardamos la altura máxima permitida*/
	      this.hmax = hmax;
	      this.admite_if = if_valido;
	      /*Hemos de crear un árbol de altura máxima hmax*/
	      arbol = new Arbol(cjtoFunciones, cjtoTerminales, hmax, 0, null, true, true,this.isAdmite_if(),0);

	      /*Ahora hay que rellenar el campo aptitud. Para ello llamamos
	      a la funcion adaptacion. Cuando creamos los individuos,
	      vamos por la iteracion 0*/
	      evalua();
	}

	
	public Cromosoma(Cromosoma cr)
	{
	      this.hmax = cr.getHmax();
	      this.admite_if = cr.isAdmite_if();
	      this.aptitud = cr.getAptitud();
	      this.aptitud_neta = cr.getAptitud_neta();
	      this.setArbol(cr.getArbol())  ;
	      this.evaluacion = cr.getEvaluacion();
	      this.puntuacion = cr.getPuntuacion();
	      this.puntuacion_acumulada = cr.getPunt_acu();
	      this.puntuacion_neta = cr.getPuntuacion_neta();
	      this.puntuacion_neta_acumulada = cr.getPuntuacion_acumulada();
		
	}
	public void copiaCromosoma(Cromosoma cr)
	{
	      this.hmax = cr.getHmax();
	      this.admite_if = cr.isAdmite_if();
	      this.aptitud = cr.getAptitud();
	      this.aptitud_neta = cr.getAptitud_neta();
	      this.setArbol(cr.getArbol())  ;
	      this.evaluacion = cr.getEvaluacion();
	      this.puntuacion = cr.getPuntuacion();
	      this.puntuacion_acumulada = cr.getPunt_acu();
	      this.puntuacion_neta = cr.getPuntuacion_neta();
	      this.puntuacion_neta_acumulada = cr.getPuntuacion_acumulada();
		}

	
	
		
		


public void cruce(Cromosoma padre2, Cromosoma hijo1, Cromosoma hijo2,
			int alturaMax, int iter, int nmax) {
		
		Arbol arbol1, arbol2;
		boolean esHi1 = false, esHi2 = false, raiz1 = false, raiz2 = false;
		Arbol nodo1 = null;
		Arbol nodo2 = null;
		Arbol nodo_aux1 = null;
		Arbol pater1 = null;
		Arbol pater2 = null;
		boolean stop = false;
		int nAlt1, nAlt2;
		hijo1 = new Cromosoma(this);
		hijo2 = new Cromosoma(padre2);
		arbol1 = this.getArbol();
		arbol2 = padre2.getArbol();
		
		while (!stop) {
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


	

	public int evalua() 
	{
		
			ArrayList<String> expresion=getArbol().dameExpresion();
			for(int i=0;i<expresion.size();i++)
			{
				System.out.print(expresion.get(i)+ " ");
			}
			System.out.println();
			int NumErrores = 0;
			for(int a1=0;a1<2;a1++){
				for(int a0=0;a0<2;a0++){
					for(int d3=0;d3<2;d3++){
						for(int d2=0;d2<2;d2++){
							for(int d1=0;d1<2;d1++){
								for(int d0=0;d0<2;d0++){
									
									ArrayList<String> aux ;
									aux = SustituyeParametros(expresion,a1,a0,d3,d2,d1,d0);									
									int EntradaControl = a1 * 2 + a0;
									int SalidaDeseable; //1 True y  0 False
									switch(EntradaControl){
									case 0:	
										SalidaDeseable = d0;
										break;
									case 1:
										SalidaDeseable = d1;										
										break;
									case 2:
										SalidaDeseable = d2;										
										break;
									default:
										SalidaDeseable = d3;										
										break;
									}
									if (evalua2(aux)!= SalidaDeseable){
										NumErrores ++;
									}
									
								}	
							}	
						}	
					}	
				}	
			}
			
			return NumErrores;
			
		
		
	}
	public int evalua2(ArrayList<String> aux) {
		boolean resultado = false;
		// TODO Auto-generated method stub
		ArrayList<String> pila = new ArrayList<String> ();
		int indice = 0;

		for(int i = 0; i< aux.size();i++){	
			String dato = aux.get(i);
			if(dato!= ")"){
				pila.add(dato);
			}
			else{
				ArrayList<String> reducir = new ArrayList<String> ();
				String aux_resul = pila.get(pila.size() - 1);
				while(aux_resul != "("){
					pila.remove(pila.size() - 1);
					reducir.add(aux_resul);		
					aux_resul = pila.get(pila.size() - 1);
				}
				pila.remove(pila.size() - 1);
				aux_resul = reducir(reducir);
				pila.add(aux_resul);
			}
			
		}
		if (pila.get(0) == "true"){
			return 1;
		}
		else{
			return 0;
		}
	}


	private String reducir(ArrayList<String> reducir) {
		String resultado= "";
		if(reducir.size() == 1){ //Es un terminal
			return reducir.get(0);
		}
		if(reducir.size() == 2){// Es una funcion NOT
			if(reducir.get(0) == "true"){
				return "false";
			}
			else{
				return "true";
			}
		}
		if(reducir.size() == 3){// Es una funcion AND o OR
			String argumento1 = reducir.get(0);
			String argumento2 = reducir.get(1);
			if(reducir.get(2) == "AND"){
				if (argumento1  == "true" && argumento2 == "true"){
					resultado = "true";
				}
				else{
					resultado = "false";
				}				
			}
			else{
				if (argumento1 == "false" && argumento2 == "false"){
					resultado = "false";
				}
				else{
					resultado = "true";
				}					
			}
		}
		if(reducir.size() == 4){// Es una funcion IF
			String argumento1 = reducir.get(2);
			String argumento2 = reducir.get(1);	
			String argumento3 = reducir.get(0);
			
			if(argumento1 == "false"){
				resultado = argumento3;
			}
			else{
				resultado = argumento2;			
			}
		}
	
		return resultado;
	}


	public ArrayList<String> SustituyeParametros(ArrayList<String> entrada,int a1,int a0,int d3,int d2,int d1,int d0){
		String dato;
		ArrayList<String> salida = new ArrayList<String> ();
		for(int i = 0; i< entrada.size();i++){
			salida.add(entrada.get(i));
		}
		for(int i = 0; i< salida.size();i++){
			dato = salida.get(i);
			String nueva_cadena;
			if(dato == "A1"){			
				if(a1==1){
					nueva_cadena = "true";
				}	
				else{
					nueva_cadena = "false";
				}
				salida.set(i, nueva_cadena);				
			}
			if(dato == "A0"){
				if(a0==1){
					nueva_cadena = "true";
				}	
				else{
					nueva_cadena = "false";
				}
				salida.set(i, nueva_cadena);					
			}
			if(dato == "D3"){
				if(d3==1){
					nueva_cadena = "true";
				}	
				else{
					nueva_cadena = "false";
				}
				salida.set(i, nueva_cadena);					
			}
			if(dato == "D2"){
				if(d2==1){
					nueva_cadena = "true";
				}	
				else{
					nueva_cadena = "false";
				}
				salida.set(i, nueva_cadena);					
			}
			if(dato == "D1"){
				if(d1==1){
					nueva_cadena = "true";
				}	
				else{
					nueva_cadena = "false";
				}
				salida.set(i, nueva_cadena);					
			}
			if(dato == "D0"){
				if(d0==1){
					nueva_cadena = "true";
				}	
				else{
					nueva_cadena = "false";
				}
				salida.set(i, nueva_cadena);					
			}	
		}
		return salida;
	}
	public void escalado(double a, double b) {
		
		setAptitud_neta((a*aptitud) +b);
		
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
