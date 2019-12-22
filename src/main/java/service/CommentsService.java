package service;

import pojo.Comments;

import java.util.List;

public interface CommentsService {

    //添加评论
    Integer insertComments(Comments comments);

    //根据评论id删除评论
    Integer deleteComments(Integer commentsId);

    //修改评论
    Integer updateComments(Comments comments);

    //根据评论id查看评论
    Comments selectCommentsByCommentsId(Integer commentsId);

    //根据商品id查看该商品的所有评论
    List<Comments> selectCommentsByGoodsId(Integer goodsId);

    //根据用户id查看该用户的所有评论
    List<Comments> selectCommentsByUserId(Integer userId);
}
