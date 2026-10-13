class Auction {
    String productName;
    double startingPrice;
    double highestBid;
    String winningBidder;

    Auction(String productName, double startingPrice) {
        this.productName = productName.toUpperCase();
        this.startingPrice = startingPrice;
        this.highestBid = startingPrice;
        this.winningBidder = "No Bids";

        System.out.println("Product initialized successfully");
    }

    void placeBid(String bidderName, double amount) {
        bidderName = bidderName.toUpperCase();

        System.out.println("Bidder Name:" + bidderName);
        System.out.printf("Bid Amount:Rs.%.2f%n", amount);

        if (amount > highestBid) {
            highestBid = amount;
            winningBidder = bidderName;
            System.out.println("Bid Status:Bid Accepted");
        } else {
            System.out.println(
                "Bid Status:Bid Rejected-Bid Must Be Higher"
            );
        }
    }

    void placeBid(double amount) {
        placeBid(winningBidder, amount);
    }

    void displaySummary() {
        System.out.println("----AUCTION SUMMARY----");
        System.out.println("Product Name:" + productName);
        System.out.println("Winning Bidder:" + winningBidder);
        System.out.printf("Final Bid Amount:Rs.%.2f%n", highestBid);
    }
}

public class OnlineAuction {
    public static void main(String[] args) {
        Auction auction = new Auction("Laptop", 50000.00);

        auction.placeBid("Ravi", 52000.00);
        auction.placeBid("Priya", 55000.00);
        auction.placeBid("Ravi", 53000.00);

        auction.displaySummary();
    }
}