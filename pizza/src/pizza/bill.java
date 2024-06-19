package pizza;

class Bill {
    private double totalCost;
    private boolean takeaway;

    public Bill() {
        this.totalCost = 0.0;
        this.takeaway = false;
    }

    public void addPizza(double cost) {
        totalCost += cost;
    }

    public void setTakeaway(boolean takeaway) {
        this.takeaway = takeaway;
    }

    public double calculateTotal() {
        if (takeaway) {
            totalCost += 20.0; // Takeaway charge
        }
        return totalCost;
    }
}
