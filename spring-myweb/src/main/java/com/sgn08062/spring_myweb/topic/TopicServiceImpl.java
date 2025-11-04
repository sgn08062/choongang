package com.sgn08062.spring_myweb.topic;

import com.sgn08062.spring_myweb.command.TopicVO;
import com.sgn08062.spring_myweb.util.Criteria;
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
    public List<TopicVO> topicListAll(Criteria cri) {
        return topicMapper.topicListAll(cri);
    }

    @Override
    public int getTotal(Criteria cri) {
        return topicMapper.getTotal(cri);
    }

    @Override
    public int getTotalMe(String topicWriter) {
        return topicMapper.getTotalMe(topicWriter);
    }

    @Override
    public List<TopicVO> topicListMe(String topicWriter, Criteria cri) {
        return topicMapper.topicListMe(topicWriter, cri);
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
