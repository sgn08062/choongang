package com.sgn08062.spring_myweb.topic;

import com.sgn08062.spring_myweb.command.TopicVO;
import com.sgn08062.spring_myweb.util.Criteria;

import java.util.List;

public interface TopicService {
    int topicRegist(TopicVO topicVO);
    List<TopicVO> topicListAll(Criteria cri);
    int getTotal(Criteria cri);
    int getTotalMe(String topicWriter);
    List<TopicVO> topicListMe(String topicWriter, Criteria cri);
    TopicVO topicDetail(long topicId);
    int topicModify(TopicVO topicVO);
    int topicDelete(TopicVO topicVO);
}
