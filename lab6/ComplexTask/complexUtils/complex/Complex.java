package complexUtils.complex;

public class Complex<T extends Number> {
    private T real;
    private T imaginary;

    public Complex(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public T getReal() {
        return real;
    }

    public T getImaginary() {
        return imaginary;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public void setImaginary(T imaginary) {
        this.imaginary = imaginary;
    }

    public Complex<Double> add(Complex<? extends Number> other) {
        double newReal = this.real.doubleValue() + other.real.doubleValue();
        double newImaginary = this.imaginary.doubleValue() + other.imaginary.doubleValue();

        
        return new Complex<Double>(newReal, newImaginary); 
    }

    public Complex<Double> subtract(Complex<? extends Number> other) {
        double newReal = this.real.doubleValue() - other.real.doubleValue();
        double newImaginary = this.imaginary.doubleValue() - other.imaginary.doubleValue();

        
        return new Complex<Double>(newReal, newImaginary);
    }

    public Complex<Double> multiply(Complex<? extends Number> other) {
        double newReal = this.real.doubleValue() * other.real.doubleValue();
        double newImaginary = this.imaginary.doubleValue() * other.imaginary.doubleValue();

        
        return new Complex<Double>(newReal, newImaginary);
    }

    public Complex<Double> divide(Complex<? extends Number> other) {
        double newReal = this.real.doubleValue() / other.real.doubleValue();
        double newImaginary = this.imaginary.doubleValue() / other.imaginary.doubleValue();

        
        return new Complex<Double>(newReal, newImaginary);
    }
}
