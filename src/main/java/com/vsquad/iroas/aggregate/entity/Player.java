package com.vsquad.iroas.aggregate.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.Table;

import javax.persistence.*;


@Entity
@Table(appliesTo = "TB_PLAYER", comment = "플레이어")
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAYER_ID")
    @Comment("플레이어 식별자")
    private Long playerId;

    @Column(name = "PLAYER_NICKNAME")
    @Comment("닉네임")
    private String playerNickname;

    @Column(name = "PLAYER_MONEY")
    @Comment("플레이어 소지금")
    private Long playerMoney;

    @Column(name = "PLAYER_ITEMS")
    @Comment("플레이어가 소지한 아이템")
    private String playerItems;
}