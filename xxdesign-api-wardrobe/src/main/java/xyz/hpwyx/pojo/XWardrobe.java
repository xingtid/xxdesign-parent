package xyz.hpwyx.pojo;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class XWardrobe {
    private Integer wId;

    @NonNull
    private String wName;

    private String wBroud;

    private Date wDate;

    private String wImg;

    private String wImg2;

    private String wImg3;

    private String wStyle;

    private String wSeason;

    private Float wPrice;

    private Integer wUserid;

    private String wMark;

    private Date wCreateTime;

    private String wExx;

    private String wExe;
}