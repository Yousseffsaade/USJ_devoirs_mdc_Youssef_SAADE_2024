public class DecoratorPatternExample {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage tea = new Tea();
        tea = new Milk(tea);
        System.out.println(tea.getDescription() + " $" + tea.cost());
    }
}