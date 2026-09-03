class FoodDelivery {

    public static void main(String[] args) {

        Thread orderPlacement = new Thread(() -> {
            System.out.println("Order Placement Started...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Order Placed Successfully.");
        });

        Thread orderDelivery = new Thread(() -> {
            System.out.println("Order Delivery Started...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Order Delivered Successfully.");
        });

        orderPlacement.start();
        orderDelivery.start();
    }
}
