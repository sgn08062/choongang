package com.sgn08062.spring_myweb.topic;

import com.sgn08062.spring_myweb.command.TopicVO;
import com.sgn08062.spring_myweb.util.Criteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TopicMapper {
    int topicRegist(TopicVO topicVO);
    List<TopicVO> topicListAll(Criteria cri);
    int getTotal(Criteria cri);
    int getTotalMe(String topicWriter);
    List<TopicVO> topicListMe(@Param("topicWriter")String topicWriter,
                              @Param("cri") Criteria cri);
    TopicVO topicDetail(long topicId);
    int topicModify(TopicVO topicVO);
    int topicDelete(TopicVO topicVO);

}
