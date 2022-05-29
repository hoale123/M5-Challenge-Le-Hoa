package com.company.CatalogMicroservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "console")
public class Console implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "console_id")
    private long id;
    @NotEmpty(message = "Console model must is required")
    private String model;
    @NotEmpty(message = "Console manufacturer must is required")
    private String manufacturer;
    private String memoryAmount;
    private String processor;
    @NotNull(message = "Console price is required")
    @DecimalMin(value = "1.00", inclusive = true, message = "Price for this item is lower than  $1.0")
    @DecimalMax(value = "999.99", inclusive = true, message = "Price for this item exceeds, $999.99")
    private BigDecimal price;
    @NotNull(message = "Console quantity is required")
    @Min(value = 1, message = "Mim Quantity is 1")
    @Max(value = 50000, message = "Max Quantity is 50,000")
    private long quantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(String memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Console)) return false;
        Console console = (Console) o;
        return getId() == console.getId() &&
                getQuantity() == console.getQuantity() &&
                Objects.equals(getModel(), console.getModel()) &&
                Objects.equals(getManufacturer(), console.getManufacturer()) &&
                Objects.equals(getMemoryAmount(), console.getMemoryAmount()) &&
                Objects.equals(getProcessor(), console.getProcessor()) &&
                Objects.equals(getPrice(), console.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModel(), getManufacturer(), getMemoryAmount(), getProcessor(), getPrice(), getQuantity());
    }
}
