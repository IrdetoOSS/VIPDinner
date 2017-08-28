package com.irdeto.ibc.controller;

import com.irdeto.ibc.model.Item;
import com.irdeto.ibc.service.VIPDinnerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
public class VIPDinnerController {

  private final VIPDinnerService vipDinnerService;

  @Autowired
  public VIPDinnerController(final VIPDinnerService vipDinnerService) {
    this.vipDinnerService = vipDinnerService;
  }

  @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
  public Item create(final @RequestBody Item item) {
    return vipDinnerService.save(item);
  }

  @GetMapping(value = "/", produces = APPLICATION_JSON_UTF8_VALUE)
  public List<Item> finAll() {
    return vipDinnerService.findAll();
  }
}
