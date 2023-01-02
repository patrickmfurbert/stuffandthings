package com.patrickfurbert.stuffandthings.service.getstate.impl;

import com.patrickfurbert.stuffandthings.constants.States;
import com.patrickfurbert.stuffandthings.data.Info;
import com.patrickfurbert.stuffandthings.service.getstate.GetStateService;
import com.patrickfurbert.stuffandthings.utils.Toggle;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class GetStateServiceImpl implements GetStateService {
    @Override
    public Info getInfo() {
        return Info.builder()
                .toggleState(Toggle.getState() ? States.ON.name() : States.OFF.name())
                .localDateTime(LocalDateTime.now())
                .build();
    }
}
