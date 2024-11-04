package nbc_final.matching_service.consumer;
//
//import lombok.RequiredArgsConstructor;
//import nbc_final.gathering.domain.matching.dto.request.MatchingRequestDto;
//import nbc_final.matching_service.dto.response.MatchingResultDto;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class MatchingConsumer {
//
//    private final KafkaTemplate<String, MatchingResultDto> kafkaTemplate;
//
//    @KafkaListener(topics = "matching_request", groupId = "matching-group")
//    public void consumeMatchingRequest(MatchingRequestDto request) {
//        Optional<MatchingRequestDto> matchedUser = findMatchingUser(request);
//
//        if (matchedUser.isPresent()) {
//            MatchingResultDto result = new MatchingResultDto(request.getUserId(), matchedUser.get().getUserId(), true);
//            kafkaTemplate.send("matching_result", result);
//        } else {
//            // 매칭 실패 처리
//            kafkaTemplate.send("matching_fail", new MatchingResultDto(request.getUserId(), null, false));
//        }
//    }
//
//    private Optional<MatchingRequestDto> findMatchingUser(MatchingRequestDto request) {
//        // 매칭 조건에 따른 필터링 로직 구현
//        // 예: language 및 premium 조건 필터링
//        return Optional.empty(); // 매칭 가능한 유저가 없는 경우
//    }
//
//    @KafkaListener(topics = "matching_fail", groupId = "retry-group")
//    public void handleFailedMatching(MatchingResultDto failedResult) {
//        // 매칭 실패 유저 재시도 로직
//        // 예: 특정 시간 이후 재시도하거나 별도 처리
//    }
//
//    @KafkaListener(topics = "matching_result", groupId = "result-group")
//    public void handleMatchingResult(MatchingResultDto result) {
//        if (result.isSuccess()) {
//            // 매칭 성공 알림 처리
//        } else {
//            // 매칭 실패 알림 처리
//        }
//    }
//
//
//
//
//
//}
