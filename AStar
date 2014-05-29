import java.util.Vector;

public abstract class AStar {	

  public Nodo nodoinicial;  
  public Nodo nodofinal;     
  public Nodo n;            
  public Nodo tempNodo;    

  public Vector<Nodo> ABIERTO;       
  public Vector<Nodo> CLOSED;     
  public Vector<Nodo> M;          

  private long iniciatiempo;   
  private long fintiempo;     

  private int low;          
  private int lowIndex;    

  private int number;       
  
  public void solve() {

    iniciatiempo = System.currentTimeMillis();

    nodoinicial.f = nodoinicial.h = nodoinicial.estimado(nodofinal);
    nodoinicial.g = 0;
    
    ABIERTO = new Vector<Nodo>();
    CLOSED = new Vector<Nodo>();
    M = new Vector<Nodo>();

    ABIERTO.add(0, nodoinicial);

    while (true) {

      if (ABIERTO.size() == 0) {
		  System.out.println("No se pudo resolver el problema:");
		  System.out.println("No hay nodos abiertos.");
		  return;
      }

      lowIndex = 0;
      low = ABIERTO.elementAt(0).f; 
      for (int i = 0; i < ABIERTO.size(); i++) {
		  number = ABIERTO.elementAt(i).f;
		  if (number < low) {
			 lowIndex = i;
			 low = number;
		  }
      }

      n = ABIERTO.elementAt(lowIndex);
      ABIERTO.removeElement(n);

      if (n.soniguales(nodofinal)) {
		  fintiempo = System.currentTimeMillis();
		  Imprimeestadisticas(n);
		  return;
      }

      M = n.sucesores();

      for (int i = 0; i < M.size(); i++) {
		  Nodo s = M.elementAt(i);
		  s.g = n.g + s.costo;
		  s.h = s.estimado(nodofinal);
		  s.f = s.g + s.h;
      }

      for (int i = 0; i < M.size(); i++) {
		  tempNodo = (Nodo)M.elementAt(i);
		  tempNodo.padre = n;
      }

      for (int i = 0; i < M.size(); i++) {

		  
		  boolean onCERRADO = isOnVector(M.elementAt(i), CLOSED); 
		  
		
		  if (!(onCERRADO)) 
			 ABIERTO.add(0, M.elementAt(i));
      }

      CLOSED.add(0, n);
    }
  }
  public boolean isOnVector(Nodo n, Vector v) {
    for (int i = 0; i < v.size(); i++) {
      if (n.soniguales(v.elementAt(i))) { //if (n.soniguales((Nodo)v.elementAt(i))) {
		  return true;
      }
    }
    return false;
  }
  public void Imprimeestadisticas(Nodo n) {
    System.out.println("Costo de la solucion: " + n.f);
    System.out.println("Numero de nodos cerrados: " + CLOSED.size());
    System.out.println("Numero de nodos aun abiertos: " + ABIERTO.size());
    System.out.println("Tiempo ms): " + (fintiempo - iniciatiempo));

    System.out.println("\n camino de la solucion :\n");
    Imprime(n);
  }    

  public void Imprime(Nodo n) {
    if (n.padre != null) {
      Imprime(n.padre);
      System.out.println(n.toString());
    }
    else System.out.println(n.toString());
  }

}

