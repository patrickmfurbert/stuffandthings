package com.patrickfurbert.stuffandthings.data;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Info {
    String toggleState;
    LocalDateTime localDateTime;

}
