public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingsPrice=150;
    private int bagPrice=20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingAdded=false;
    private boolean isTakeAway=false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }

    public void addExtraChese(){
        isExtraCheeseAdded=true;
//        System.out.println("Extra cheese added");
        this.price+=extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingAdded=true;
//        System.out.println("Extra Toppings Added");
        this.price+=extraToppingsPrice;
    }
    public void takeAway(){
        isTakeAway=true;
//        System.out.println("TakeAway Order");
        this.price+=bagPrice;
    }

    public void getBill(){
        System.out.println(this.price);
    }

    public void getPizzaPrice(){
        String bill="";
        System.out.println("Your Bill is: ");
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra cheese Added: "+extraCheesePrice+ "\n";
        }
        if(isExtraToppingAdded){
            bill+="Extra topping Added: "+extraToppingsPrice+ "\n";
        }
        if(isTakeAway){
            bill+="Take Away: "+bagPrice+ "\n";
        }
        bill+="Total Bill: "+this.price+"\n";
        System.out.println(bill);
    }
}
