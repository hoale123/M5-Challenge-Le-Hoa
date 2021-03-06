package com.company.Invoicemircoservice.util.feign;

import com.company.Invoicemircoservice.viewModel.ConsoleViewModel;
import com.company.Invoicemircoservice.viewModel.GameViewModel;
import com.company.Invoicemircoservice.viewModel.TShirtViewModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@FeignClient(name = "catalog-application")

public interface InvoiceClient {
    @GetMapping("/game/{id}")
    public GameViewModel getGameInfo(@PathVariable("id") long gameId);
    @GetMapping("/console/{id}")
    public ConsoleViewModel getConsole(@PathVariable("id") long consoleId);
    @GetMapping("/tshirt/{id}")
    public TShirtViewModel getTShirt(@PathVariable("id") int tShirtId);
    @PostMapping("/tshirt")
    public TShirtViewModel createTShirt(@RequestBody @Valid TShirtViewModel tShirtViewModel);
    @PostMapping("/console")
    public ConsoleViewModel createConsole(@RequestBody @Valid ConsoleViewModel consoleViewModel);
}
