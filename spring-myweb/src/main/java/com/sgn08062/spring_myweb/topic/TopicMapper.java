package com.sgn08062.spring_myweb.topic;

import com.sgn08062.spring_myweb.command.TopicVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TopicMapper {
    int topicRegist(TopicVO topicVO);
}
