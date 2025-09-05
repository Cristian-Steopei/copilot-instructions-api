package com.instructions.copilot.copilotInstructionsAPI.service;

import com.instructions.copilot.copilotInstructionsAPI.model.Transfer;
import com.instructions.copilot.copilotInstructionsAPI.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {

    private final TransferRepository transferRepository;

    @Autowired
    public TransferServiceImpl(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    @Override
    public Transfer addTransfer(Transfer transfer) {
        // Basic validation
        if (transfer == null) {
            throw new IllegalArgumentException("Transfer must not be null");
        }
        if (transfer.getName() == null || transfer.getName().isBlank()) {
            throw new IllegalArgumentException("Transfer name must not be empty");
        }
        if (transfer.getFrom() == null || transfer.getFrom().isBlank()) {
            throw new IllegalArgumentException("Transfer 'from' must not be empty");
        }
        if (transfer.getTo() == null || transfer.getTo().isBlank()) {
            throw new IllegalArgumentException("Transfer 'to' must not be empty");
        }
        if (transfer.getAmount() == null || transfer.getAmount().isBlank()) {
            throw new IllegalArgumentException("Transfer amount must not be empty");
        }

        return transferRepository.save(transfer);
    }
}

