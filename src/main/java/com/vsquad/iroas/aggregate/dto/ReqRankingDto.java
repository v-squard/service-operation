package com.vsquad.iroas.aggregate.dto;

import com.vsquad.iroas.aggregate.entity.Ranking;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReqRankingDto {

    @Schema(description = "플레이어")
    private Long playerId;

    @Schema(description = "커스텀 모드 유즈맵")
    private String creatorMapId;

    @Schema(description = "게임 시작 시간")
    private LocalDateTime playStartTime;

    @Schema(description = "게임 깬 시간")
    private LocalDateTime playClearTime;

    @Schema(description = "클리어 여부")
    private Boolean clearYn;
}