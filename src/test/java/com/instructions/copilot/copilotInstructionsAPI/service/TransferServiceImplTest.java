package com.instructions.copilot.copilotInstructionsAPI.service;

import com.instructions.copilot.copilotInstructionsAPI.model.Transfer;
import com.instructions.copilot.copilotInstructionsAPI.repository.TransferRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TransferServiceImplTest {

    @Mock
    private TransferRepository transferRepository;

    @InjectMocks
    private TransferServiceImpl transferService;

    @BeforeEach
    void setUp() {
        // Mockito will inject mocks
    }

    @Test
    void addTransferShouldSaveAndReturnTransferWhenValid() {
        Transfer toSave = new Transfer();
        toSave.setName("Player A");
        toSave.setFrom("Team X");
        toSave.setTo("Team Y");
        toSave.setAmount("$10m");

        Transfer saved = new Transfer(1L, "Player A", "Team X", "Team Y", "$10m");
        when(transferRepository.save(any(Transfer.class))).thenReturn(saved);

        Transfer result = transferService.addTransfer(toSave);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("Player A", result.getName());

        ArgumentCaptor<Transfer> captor = ArgumentCaptor.forClass(Transfer.class);
        verify(transferRepository, times(1)).save(captor.capture());
        Transfer captured = captor.getValue();
        assertEquals("Player A", captured.getName());
    }

    @Test
    void addTransferShouldThrowWhenNameMissing() {
        Transfer invalid = new Transfer();
        invalid.setFrom("Team X");
        invalid.setTo("Team Y");
        invalid.setAmount("$5m");

        assertThrows(IllegalArgumentException.class, () -> transferService.addTransfer(invalid));
        verifyNoInteractions(transferRepository);
    }
}
