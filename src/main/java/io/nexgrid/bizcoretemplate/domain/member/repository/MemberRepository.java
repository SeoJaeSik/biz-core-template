package io.nexgrid.bizcoretemplate.domain.member.repository;

import io.nexgrid.bizcoretemplate.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
}