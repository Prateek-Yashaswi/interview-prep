package streams.model;

import java.time.Month;
import java.time.Year;
import java.util.UUID;

@SuppressWarnings("unused")
public class Transaction {

    private UUID id;
    private Year year;
    private Month month;

    public Transaction(Year year, Month month) {
        this.id = UUID.randomUUID();
        this.year = year;
        this.month = month;
    }

    public UUID getId() {
        return id;
    }

    public Year getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", year=" + year +
                ", month='" + month + '\'' +
                '}';
    }
}
