package nbc_final.gathering.domain.matching.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nbc_final.matching_service.entity.Matching;
import nbc_final.matching_service.enums.InterestType;
import nbc_final.matching_service.enums.MatchingStatus;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MatchingResponseDto {
    private Long userId1;
    private Long userId2;
    private MatchingStatus matchingStatus;
//    private String matchingResult;

//    public static MatchingResponseDto of(Matching matching) {
//        return new MatchingResponseDto(
//                matching.getUserId1(),
//                matching.getUserId2(),
//                matching.getMatchingStatus(),
//                matching.getLocation(),
//                matching.getInterestType()
//        );
//    }


}
