package com.hui.bi.esdao;

import com.hui.bi.model.dto.post.PostEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 帖子 ES 操作
 * @author 86176
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {
    /**
     * ES查找帖子
     * @param userId 用户
     */
    List<PostEsDTO> findByUserId(Long userId);
}