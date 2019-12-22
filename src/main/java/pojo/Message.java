package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:26
 * @Description: 消息类
 */
@Data
public class Message {
    private Integer id;
    private Integer userId;
    private Integer shopId;
    private String messageContent;
    private Date createTime;
    private Date updateTime;
}
