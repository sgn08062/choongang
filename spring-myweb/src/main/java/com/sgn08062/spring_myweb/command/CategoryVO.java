package com.sgn08062.spring_myweb.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CategoryVO {
    private int categoryId;
    private String groupId;
    private int categoryLv;
    private String categoryNm;
    private int categoryDetailLv;
    private String categoryDetailNm;
    private int categoryParentLv;
    private int categoryDetailParentLv;
}
