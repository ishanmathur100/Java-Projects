
package com.resolvex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TicketController {

    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @GetMapping("/tickets/new")
    public String showCreateTicketForm(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "create-ticket";
    }

    
    @PostMapping("/tickets")
    public String createTicket(
        @ModelAttribute Ticket ticket,
        RedirectAttributes redirectAttributes) {

    if (ticket.getTitle() == null || ticket.getTitle().isBlank()) {
        redirectAttributes.addFlashAttribute(
                "errorMessage", "Ticket title is required!");
        return "redirect:/tickets/new";
    }

    if (ticket.getDescription() == null
            || ticket.getDescription().isBlank()) {
        redirectAttributes.addFlashAttribute(
                "errorMessage", "Ticket description is required!");
        return "redirect:/tickets/new";
    }

    if (!"LOW".equals(ticket.getPriority())
            && !"MEDIUM".equals(ticket.getPriority())
            && !"HIGH".equals(ticket.getPriority())
            && !"CRITICAL".equals(ticket.getPriority())) {
        redirectAttributes.addFlashAttribute(
                "errorMessage", "Please select a valid priority!");
        return "redirect:/tickets/new";
    }

    ticket.setStatus("OPEN");
    ticketRepository.save(ticket);

    redirectAttributes.addFlashAttribute(
            "successMessage",
            "Ticket created successfully!");

    return "redirect:/tickets/new";
    }


    @GetMapping("/tickets")
    public String viewTickets(Model model) {
        model.addAttribute("tickets", ticketRepository.findAll());
        return "tickets";
    }

    @PostMapping("/tickets/update")
    public String updateTicket(
            @RequestParam Long id,
            @RequestParam String status,
            @RequestParam(required = false) String assignedTo) {

        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException(
                                "Ticket not found: " + id));

        ticket.setStatus(status);
        ticket.setAssignedTo(assignedTo);

        ticketRepository.save(ticket);

        return "redirect:/tickets";
    }
}

