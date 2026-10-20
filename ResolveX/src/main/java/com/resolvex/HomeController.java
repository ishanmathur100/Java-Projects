package com.resolvex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final TicketRepository ticketRepository;

    public HomeController(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute(
            "totalTickets",
            ticketRepository.count()
        );

        model.addAttribute(
            "openTickets",
            ticketRepository.findAll().stream()
                .filter(ticket -> "OPEN".equals(ticket.getStatus()))
                .count()
        );

        model.addAttribute(
            "resolvedTickets",
            ticketRepository.findAll().stream()
                .filter(ticket -> "RESOLVED".equals(ticket.getStatus()))
                .count()
        );

        model.addAttribute(
            "highPriorityTickets",
            ticketRepository.findAll().stream()
                 .filter(ticket -> "HIGH".equals(ticket.getPriority())
                 || "CRITICAL".equals(ticket.getPriority()))
                 .count()
        );

        return "index";
    }
}
