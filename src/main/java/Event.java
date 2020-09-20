public class Event extends Task {
    private String dateAndTime;

    public Event(String description, String dateAndTime) {
        super(description);
        this.dateAndTime = dateAndTime;
    }

    public void setDone() {
        this.done = true;
        System.out.println("Nice! I've marked this task as done:");
        System.out.println("[D][✓] " + this.description + " (at: " + getDateAndTime() + ")");
    }

    public void print(int index) {
        System.out.println("Got it. I've added this task:");
        System.out.println(getSymbol() + "[✗] " + getDescription() + " (at: " + getDateAndTime() +")");
        System.out.println("Now you have " + (index + 1) + " tasks in the list");
    }

    public void setSymbol() {
        symbol = "[E]";
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String getDateAndTime() {
        return dateAndTime;
    }
}