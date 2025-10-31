package com.sgn08062.spring_myweb.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@Data // Getter, Setter, ToString을 한번에
public class TopicVO {
    private long topicId;
    private LocalDate topicRegdate;
    private String topicWriter;
    private String topicName;
    private String topicContent;
}
