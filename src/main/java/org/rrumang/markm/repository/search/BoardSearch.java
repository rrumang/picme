package org.rrumang.markm.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.rrumang.markm.domain.Board;
import org.rrumang.markm.dto.BoardListAllDTO;
import org.rrumang.markm.dto.BoardListReplyCountDTO;

public interface BoardSearch {

    Page<Board> searchAll(String[] types, String keyword, Pageable pageable);

    Page<BoardListReplyCountDTO> searchWithReplyCount(String[] types, String keyword, Pageable pageable);

    Page<BoardListAllDTO> searchWithAll(String[] types, String keyword, Pageable pageable);
}
