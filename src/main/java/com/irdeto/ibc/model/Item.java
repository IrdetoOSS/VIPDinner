package com.irdeto.ibc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Item {

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  private String dish;

  private float price;

  @OneToMany(cascade = ALL)
  private List<Description> descriptions;

  Item() {
  }

  public Item(final String dish, final float price, final List<Description> descriptions) {
    this.dish = dish;
    this.price = price;
    this.descriptions = descriptions;
  }

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getDish() {
    return dish;
  }

  public void setDish(final String dish) {
    this.dish = dish;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(final float price) {
    this.price = price;
  }

  public List<Description> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(final List<Description> descriptions) {
    this.descriptions = descriptions;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final Item item = (Item) o;

    if (Float.compare(item.price, price) != 0) {
      return false;
    }
    if (id != null ? !id.equals(item.id) : item.id != null) {
      return false;
    }
    if (dish != null ? !dish.equals(item.dish) : item.dish != null) {
      return false;
    }
    return descriptions != null ? descriptions.equals(item.descriptions) : item.descriptions == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (dish != null ? dish.hashCode() : 0);
    result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
    result = 31 * result + (descriptions != null ? descriptions.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Item{" +
        "id='" + id + '\'' +
        ", dish='" + dish + '\'' +
        ", price=" + price +
        ", descriptions=" + descriptions +
        '}';
  }
}
