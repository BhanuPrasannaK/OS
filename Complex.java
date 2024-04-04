class Complex
{
    float re;
    float im;

    Complex()
    {
        re=0.0f;
        im=0.0f;
    }

    Complex(float r, float i)
    {
        re=r;
        im=i;
    }

    Complex(float r)
    {
        re=r;
        im=r;
    }

    void setReal(float r)
    {
        re=r;
    }
    void setImg(float i)
    {
        im=i;
    }
    float getReal()
    {
        return re;
    }
    float getImg()
    {
        return im;
    }
    void displayComplex()
    {
        System.out.println("Real Number is "+re+"\n"+"Imaginay number is "+im);
        System.out.println("Complex Number is"+re+"+i"+im);
    }
    void addComplex(Complex c1, Complex c2)
    {
        re=c1.re+c2.re;
        im=c1.im+c2.im;
    }

    void mulComplex(Complex c1, Complex c2)
    {
        re=c1.re*c2.re-c1.im*c2.im;
        im=c1.re*c2.im+c1.im*c2.re;
    }

    public static void main(String args[])
    {
        Complex c1 = new Complex(2.2f,10.1f);
        Complex c2 = new Complex(2.1f,1.2f);
        Complex c3 = new Complex();
        Complex c4 = new Complex();
        c3.addComplex(c1,c2);
        System.out.println("Addition of two complex numbers is : ");
        c3.displayComplex();
        c4.mulComplex(c1,c2);
        System.out.println("Multiplication of two complex numbers is : ");
        c4.displayComplex();
    }
}