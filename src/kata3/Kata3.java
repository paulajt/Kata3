
package kata3;


public class Kata3 {
 
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        histogram.increment ("gmail.com");
        histogram.increment ("ulpgc.com");
        histogram.increment ("ulpgc.com");
        histogram.increment ("ulpgc.com");
        histogram.increment ("ullcom");
        histogram.increment ("ullcom");
        histogram.increment ("hotmail.com");
        new HistogramDisplay(histogram).execute();
    }
    
}
