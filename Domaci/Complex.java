package Nedelja5.Domaci;

public class Complex {
    double real;
    int imag;
    double ComplexAdd;
    double ComplexSubtract;
    double ComplexMultiply;
    double ComplexDivide;

    Complex(double real, int imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal(){
        return real;
    }
    public double getImag(){
        return imag;
    }
    public double getComplexAdd(){
        return(real + imag);
    }
    public double getComplexSubtract(){
        return (real - imag);
    }
    public double getComplexMultiply(){
        return (real * imag);
    }
    public double getComplexDivide(){
        return (real / imag);
    }
    public String toString(){
        return getReal() + "\n" + getImag() + "\n" + getComplexAdd() + "\n" + getComplexSubtract() +
                "\n" + getComplexMultiply() + "\n" + getComplexDivide();
    }
}
