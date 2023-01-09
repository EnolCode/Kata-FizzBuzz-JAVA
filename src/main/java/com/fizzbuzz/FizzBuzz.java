package com.fizzbuzz;

// import java.lang.reflect.Method;

public class FizzBuzz {
    private Integer number;
    
    public FizzBuzz(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public static void main(String[] args) 
    {
        int num;
        System.out.println("Secuencia de numeros");
        System.out.println("Del 1 al 100");
        System.out.print("Serie: ");

        for (num=1;num<=100;num++)
        {
            System.out.print(num+",");
        }
    }

    public String fizz(){
        if(this.number % 3 == 0){
            return "fizz";
        }
        return String.valueOf(this.number);
    }


    public String buzz(){
        if(this.number % 5 == 0){
            return "buzz";
        }
        return String.valueOf(this.number);
    }

    public String fizzBuzz(){
        if(this.number % 5 == 0 && this.number % 3 == 0){
            return "fizzBuzz";
        }
        return String.valueOf(this.number);
    }

    public String Fizz(){
        if(this.number % 3 == 0 && String.valueOf(this.number).indexOf("3") != -1){
            return "Fizz";
        }
        return String.valueOf(this.number);
    }

    public String Buzz(){
        if(this.number % 5 == 0 && String.valueOf(this.number).indexOf("5") != -1){
            return "Buzz";
        }
        return String.valueOf(this.number);
    }
    // // class = tipo
    
    // // atributos o properties
    // String bla;
    // int numberInterger = 2; // Tipo=> primitivo int
    // Integer integer = 2; // es una class que se convierte a un objeto, Tipo=> objeto Integer
    // Float numbF = 2.0f;

    // // constructor => Tiene que tener siempre uno como minimo, los contructores se llaman igual que la clase(){}
    // public FizzBuzz(String bla) {
    //     this.bla = bla;
    // }

    // public FizzBuzz() {
    // }

    // // Getters y Setter
    
    // public String getBla() {
    //     return bla;
    // }

    // public void setBla(String bla) {
    //     this.bla = bla;
    // }

    // public int getNumberInterger() {
    //     return numberInterger;
    // }

    // public void setNumberInterger(int numberInterger) { // Aqui se pone void porque no se retorna nada solo se asigna, todos los set son void
    //     this.numberInterger = numberInterger;
    // }

    // public Integer getInteger() {
    //     return integer;
    // }

    // public void setInteger(Integer integer) {
    //     this.integer = integer;
    // }

    // public Float getNumbF() {
    //     return numbF;
    // }

    // public void setNumbF(Float numbF) {
    //     this.numbF = numbF;
    // }

    //  // metodos
    // public int check(){ // Siempre hay que tipar metodos y variables, TODOO tiene que estar tipiado
    //     int result = numberInterger + 2;

    //     int resultTwo = integer + 2; 

    //     return (result + resultTwo);
    // }

}
