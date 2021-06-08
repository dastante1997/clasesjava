
package clasecuadrilatero;
public class irregulares {
    
    int lado1;
    int lado2;  

    public irregulares(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public irregulares(int lado1) {
        this.lado1 = this.lado2=lado1;
    }
    
    //PERIMETRO Y AREA
    public int cperim(){
    int perimetro = 2*(lado1+lado2);
    return perimetro;
    }
    public int carea(){
    int area=(lado1*lado2);
    return area;
    }

}
