public class Ponto_2D {
  private double x,y; 

  public Ponto_2D(double x, double y){
	  this.x = x;
	  this.y = y;
  }
  public void inicializaPonto2D(double _x,double _y){
	  x = _x;
    y = _y;
  }

  public double getX(){
	  return x;
  }
  public double getY(){
	  return y;
  }
  public boolean eIgual(Ponto_2D outroPonto2D){
	  if ((x == outroPonto2D.x) && (y == outroPonto2D.y))
	     return true;
	  else
	      return false;
  }

  public Ponto_2D origem(){
	 Ponto_2D temporario = new Ponto_2D(0,0); 
	 temporario.inicializaPonto2D(0,0);
	 return temporario;
  } 

  public Ponto_2D clona()
  {
     Ponto_2D temporario = new Ponto_2D(0,0); 
   	 temporario.inicializaPonto2D(x,y); 
	 return temporario; 
  }  

  public String toString()
  {
	 String resultado = "("+x+","+y+")";
	 return resultado;
  } 

} 

