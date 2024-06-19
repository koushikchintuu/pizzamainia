package pizza;

class VegPizza {
    private double basePrice = 300.0;
    private boolean extraCheese = false;
    private boolean extraToppings = false;

    public double calculateCost() {
        double totalCost = basePrice;
        if (extraCheese) {
            totalCost += 100.0;
        }
        if (extraToppings) {
            totalCost += 150.0;
        }
        return totalCost;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }
}