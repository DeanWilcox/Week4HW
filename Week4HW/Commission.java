//Dean Wilcox 26 November 2023
    // Commission class extending Hourly
public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Constructor
    public Commission(String name, String address, String phoneNumber, String socialSecurityNumber, double hourlyPayRate, double commissionRate) {
        super(name, address, phoneNumber, socialSecurityNumber, hourlyPayRate);
        this.commissionRate = commissionRate;
    }

    // Additional method to add sales
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Override the pay method
    @Override
    public double pay() {
        // Call the pay method of the parent class to compute pay for hours worked
        double hourlyPay = super.pay();

        // Calculate commission on sales
        double commission = totalSales * commissionRate;

        // Reset total sales to 0
        totalSales = 0;

        // Return the total pay (hourly pay + commission)
        return hourlyPay + commission;
    }

    // Override the toString method
    @Override
    public String toString() {
        // Call the toString method of the parent class
        String parentString = super.toString();

        // Add total sales information
        return parentString + "\nTotal Sales: $" + totalSales;
    }
}
