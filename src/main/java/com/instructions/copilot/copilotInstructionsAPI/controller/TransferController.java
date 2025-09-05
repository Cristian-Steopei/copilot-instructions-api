package com.instructions.copilot.copilotInstructionsAPI.controller;

import com.instructions.copilot.copilotInstructionsAPI.model.Transfer;
import com.instructions.copilot.copilotInstructionsAPI.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfers")
public class TransferController {

    private final TransferService transferService;

    @Autowired
    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping
    public ResponseEntity<Transfer> addTransfer(@RequestBody Transfer transfer) {
        try {
            Transfer createdTransfer = transferService.addTransfer(transfer);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdTransfer);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

