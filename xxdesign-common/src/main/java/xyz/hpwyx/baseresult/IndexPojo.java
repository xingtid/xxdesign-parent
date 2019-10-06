package xyz.hpwyx.baseresult;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author tid
 * @create 2019-09-19 10:24 上午
 * 主页
 **/
@Getter
@Setter
public class IndexPojo {
    private Integer s_id;
    private String s_img;
    private String s_title;
    private String i_parent;  //类型
    private String s_content;
    private Integer s_get_click;
    private Date s_time;
}
