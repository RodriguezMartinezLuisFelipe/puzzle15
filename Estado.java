import java.util.Vector;

public class Estado {

  public int[] valor; 


  public Estado(int[] v) {
    valor = v;
  }

  public boolean soniguales(Estado estado) {
	 Estado s = (Estado)estado;
    boolean bandera = true;
    for (int i = 0; i < 9; i++) if (valor[i] != s.valor[i]) bandera = false;
    return bandera;
  }

  public String toString() {
    String s = "(";
    for (int i = 0; i < 9; i++)
      s = s + valor[i] + ",";    
    return s + "\b)";
  }


  public Vector sucesores() {
	 Vector m = new Vector();


	 return m;
  }

  public int estimado(Estado goal) {


	 return 0;
  }

}


