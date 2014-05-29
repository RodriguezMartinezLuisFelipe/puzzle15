import java.util.Vector;

public class Nodo {
  public Estado estado;     
  public int f;           
  public int g;           
  public int h;           
  public int costo;       
  public Nodo padre;   

  public Nodo(Estado s, int costo) {
    this.estado = s;
    this.costo = costo;
  }

  public boolean soniguales(Nodo n) {
    if (estado.soniguales(n.estado)) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return "Estado=" + estado.toString() + ", f=" + f + ", g=" + g + ", h=" + h;
  }

  public boolean tienepadre() {
    if (padre != null) {
      return true;
    } else {
      return false;
    }
  }

  public Vector<Nodo> sucesores () {
	 Vector<Nodo> nodos = new Vector<Nodo>();
	 Vector<Estado> estados = estado.sucesores();
	 for (int i = 0; i < estados.size(); i++) {

		nodos.add(0, new Nodo(estados.elementAt(i), 1));
	 }
	 return nodos;
  }

  public int estimado(Nodo nodofinal) {
	 return estado.estimado(nodofinal.estado);
  }

} 


