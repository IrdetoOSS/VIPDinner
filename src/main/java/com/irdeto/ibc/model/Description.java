package com.irdeto.ibc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Description {

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  private String language;

  private String text;

  Description() {
  }

  public Description(final String language, final String text) {
    this.language = language;
    this.text = text;
  }

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(final String language) {
    this.language = language;
  }

  public String getText() {
    return text;
  }

  public void setText(final String text) {
    this.text = text;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final Description that = (Description) o;

    if (id != null ? !id.equals(that.id) : that.id != null) {
      return false;
    }
    if (language != null ? !language.equals(that.language) : that.language != null) {
      return false;
    }
    return text != null ? text.equals(that.text) : that.text == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (language != null ? language.hashCode() : 0);
    result = 31 * result + (text != null ? text.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Description{" +
        "id='" + id + '\'' +
        ", language='" + language + '\'' +
        ", text='" + text + '\'' +
        '}';
  }
}
