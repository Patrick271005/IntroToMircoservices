package ie.atu.lab1a;


public class Calculator {
    private String operation;
    private double total;

    public Calculator(String operation, double total) {
        this.operation = operation;
        this.total=total;
    }
    public String getOperation() {
        return operation;
    }
  public double getTotal() {
        return total;
  }
}
