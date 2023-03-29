package org.rrumang.markm.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.rrumang.markm.domain.Member;
import org.rrumang.markm.domain.MemberRole;
import org.rrumang.markm.repository.MemberRepository;
import org.rrumang.markm.security.dto.MemberJoinDTO;

@Log4j2
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberServie {

    private final ModelMapper modelMapper;

    private final MemberRepository memberRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void join(MemberJoinDTO memberJoinDTO) throws MidExistException {

        String mid = memberJoinDTO.getMid();

        boolean exist = memberRepository.existsById(mid);

        if (exist) {
            throw new MidExistException();
        }

        Member member = modelMapper.map(memberJoinDTO, Member.class);
        member.changePassword(passwordEncoder.encode(memberJoinDTO.getMpw()));
        member.addRole(MemberRole.USER);

        log.info("member : " + member);
        log.info(member.getRoleSet());

        memberRepository.save(member);

    }
}
