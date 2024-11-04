package nbc_final.matching_service.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nbc_final.matching_service.enums.MatchingStatus;
import nbc_final.matching_service.enums.InterestType;

@Table(name = "matchings")
@Entity
@Getter
@NoArgsConstructor(access =  AccessLevel.PROTECTED)
public class Matching extends TimeStamped{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matching_id")
    private Long id;
    private Long userId1;
    private Long userId2;
    private InterestType interestType;
    private String location;
    private MatchingStatus matchingStatus;

    public static Matching createMatching(Long userId1, Long userId2, InterestType interestType, String location, MatchingStatus status) {
        Matching matching = new Matching();
        matching.userId1 = userId1;
        matching.userId2 = userId2;
        matching.interestType = interestType;
        matching.location = location;
        matching.matchingStatus = status;
        return matching;
    }

}
