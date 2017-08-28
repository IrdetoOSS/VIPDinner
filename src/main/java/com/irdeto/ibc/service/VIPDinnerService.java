package com.irdeto.ibc.service;

import com.irdeto.ibc.model.Item;
import com.irdeto.ibc.reository.ItemRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VIPDinnerService {

  private final ItemRepository itemRepository;

  @Autowired
  public VIPDinnerService(final ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  public Item save(final Item item) {
    return itemRepository.save(item);
  }

  public List<Item> saveAll(final List<Item> items) {
    return itemRepository.save(items);
  }

  public List<Item> findAll() {
    return itemRepository.findAll();
  }
}
