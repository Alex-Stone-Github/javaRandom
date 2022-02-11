class main {
    public static void main(String[] args) {
        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);
        int randomNum = (int)Math.round(Math.random() * (high - low) + low);
        System.out.print("Here is your random number, Good Sir. ");
        System.out.println(randomNum);
    }
}
