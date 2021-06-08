package clases;

public class clasecubo{
    int alto;
    int ancho;
    int profundo;

    public clasecubo(int alto,int ancho,int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
 
    public clasecubo() {
        
        
        System.out.println("Los valores del cubo");
    }

public int volumencubo(){
    int vol=(this.alto*this.ancho*this.profundo);
    return vol;

}     
   
}