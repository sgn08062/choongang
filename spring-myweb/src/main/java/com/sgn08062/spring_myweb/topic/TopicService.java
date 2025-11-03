package com.sgn08062.spring_myweb.topic;

import com.sgn08062.spring_myweb.command.TopicVO;

import java.util.List;

public interface TopicService {
    int topicRegist(TopicVO topicVO);
    List<TopicVO> topicListAll();
    List<TopicVO> topicListMe(String topicWriter);
    TopicVO topicDetail(long topicId);
    int topicModify(TopicVO topicVO);
    int topicDelete(TopicVO topicVO);
}
