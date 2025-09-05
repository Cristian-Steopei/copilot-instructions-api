package com.instructions.copilot.copilotInstructionsAPI.repository;

import com.instructions.copilot.copilotInstructionsAPI.model.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {
}

