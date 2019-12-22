package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:28
 * @Description: 评论类
 */
@Data
public class Comments {
    private Integer id;
    private Integer userId;
    private Integer goodsId;
    private String content;
    private Date createTime;
    private Date updateTime;
}
