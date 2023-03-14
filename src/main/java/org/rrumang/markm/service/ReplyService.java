package org.rrumang.markm.service;

import org.rrumang.markm.dto.PageRequestDTO;
import org.rrumang.markm.dto.PageResponseDTO;
import org.rrumang.markm.dto.ReplyDTO;

public interface ReplyService {

    long register(ReplyDTO replyDTO);

    ReplyDTO read(long rno);

    void modify(ReplyDTO replyDTO);

    void remove(long rno);

    PageResponseDTO<ReplyDTO> getListOfBoard(long bno, PageRequestDTO pageRequestDTO);
}
