package com.patrickfurbert.stuffandthings.service.togglestate.impl;

import com.patrickfurbert.stuffandthings.service.togglestate.ToggleStateService;
import com.patrickfurbert.stuffandthings.utils.Toggle;
import org.springframework.stereotype.Service;

@Service
public class ToggleStateServiceImpl implements ToggleStateService {
    @Override
    public void toggleState() {
        Toggle.toggleState();
    }
}
