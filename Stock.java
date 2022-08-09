package Ex8_2;

class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    Stock(String s, String n) {
        symbol = s;
        name = n;
    }

    void setpreviousClosingPrice(double p) {
        previousClosingPrice = p;

    }

    double getpreviousClosingPrice() {
        return previousClosingPrice;
    }

    void setcurrentPrice(double c) {
        currentPrice = c;
    }
    double getcurrentPrice() {

        return currentPrice;
    }

    double getChangePercent() {
//       this.previousClosingPrice = 4.5;
        double changePercent;
        changePercent = (currentPrice - previousClosingPrice) / previousClosingPrice;
//       currentPrice = previousClosingPrice - ((3.33/100)* (previousClosingPrice));
        return changePercent * 100;
    }
}
