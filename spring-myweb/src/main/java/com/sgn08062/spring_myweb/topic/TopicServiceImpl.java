package com.sgn08062.spring_myweb.topic;

import com.sgn08062.spring_myweb.command.TopicVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TopicService")
public class TopicServiceImpl implements TopicService{
    @Autowired
    private TopicMapper topicMapper;

    @Override
    public int topicRegist(TopicVO topicVO) {


        topicMapper.topicRegist(topicVO);

        return 0;
    }

    @Override
    public List<TopicVO> topicListAll() {
        return topicMapper.topicListAll();
    }

    @Override
    public List<TopicVO> topicListMe(String topicWriter) {
        return topicMapper.topicListMe(topicWriter);
    }

    @Override
    public TopicVO topicDetail(long topicId) {
        return topicMapper.topicDetail(topicId);
    }

    @Override
    public int topicModify(TopicVO topicVO) {
        return topicMapper.topicModify(topicVO);
    }

    @Override
    public int topicDelete(TopicVO topicVO) {
        return topicMapper.topicDelete(topicVO);
    }
}
