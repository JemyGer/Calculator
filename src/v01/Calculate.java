/*
 * CalculatorV01
 * @ C. Dincer
 * implementierung von Grundrechen-Operatoren
 * Addition, Subtraktion, Multiplikation und Division
 * Ausgabe durch Konsole*/

package v01;

class Calculate {
    static void main(String[] args) {
        /*Addition*/
       Addition myObj = new Addition(); // erstellt ein neues objekt
       System.out.println("Das Ergebnis ist: " + myObj.sum);   // gibt das objekt aus das zugewiesen wurde

        /*Subtraction*/
        Subtraction myObj2 = new Subtraction();
        System.out.println("Das Ergebnis ist: " + myObj2.sum);

        /*Multiplication*/
        Multiplication myObj3 = new Multiplication();
        System.out.println("Das Ergebnis ist: " + myObj3.sum);
    }
}
