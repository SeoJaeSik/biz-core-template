package io.nexgrid.bizcoretemplate.domain.access_statistics;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccessStatisticsRepositoryImpl implements AccessStatisticsRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

}