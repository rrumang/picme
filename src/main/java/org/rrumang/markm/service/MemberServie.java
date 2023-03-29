package org.rrumang.markm.service;

import org.rrumang.markm.security.dto.MemberJoinDTO;

public interface MemberServie {

    static class MidExistException extends Exception {}

    void join(MemberJoinDTO memberJoinDTO) throws MidExistException ;
}
