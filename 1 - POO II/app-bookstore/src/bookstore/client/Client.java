package bookstore.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Client {
    private String name;
    private String rg;
    private long cpf;
    private String birthDate;

    public Client(String name, String rg, long cpf, String birthDate) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public long age() {
        Date today = new Date();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(this.birthDate, formatter);

        return ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Client{" +
                "name=" + name +
                ", rg=" + rg +
                ", cpf=" + cpf +
                ", birthDate=" + birthDate +
                '}';
    }
}
