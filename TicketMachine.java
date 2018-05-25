/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //Exercise 2.15ls

    private int status;
    private int score;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    public TicketMachine()
    {
        price = 10000;
        balance = 0;
        total = 0;
    }

    public void setPrice(/*int ticketCost*/){
        price = 1000;//all tickets will begin with the state of 1000.
    }

    /**
     * Remove all money from machine.
     */
    public void empty(/* none needed. */)//mutates the state of total.
    {
        total = 0;
    }

    /**
     * Set the new price of a ticket.
     */
    public void setPrice2(int price2)//mutates the state of price.
    {
        price = price2;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    //missing return statement
    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getAmount()
    {
        return balance;
    }

    /**
     * Return the total amount of money if additional money 
     * is inserted to the balance.
     */
    public int getTotal()
    {
        return total;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount)
    {
        balance += amount;
    }

    /**
     * Increase score by the given number of points.
     */
    public void increase(int points)
    {
        score += points;
    }

    /**
     * Reduce price by the given amount.
     */
    public void discount(int amount)
    { 
        price-= amount;
    }

    /**
     * Print the message to insert the correct amount of money.
     */
    public void prompt()
    { 
        System.out.println("Please insert the correct amount of money.");
    }//2.36 Print out line: # price cents.
    //2.37 Prints the same at 2.36.
    // Neither option has the price variable. They have a price string.  
    // String does not represent price's state and cannot be mutated.

    /**
     * Print the price of the ticket.
     */
    public void showPrice()
    { 
        System.out.println("The price of a ticket is " + price + " cents.");
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
}
