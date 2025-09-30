package quiz16;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제 1: 은행 대기번호 시스템
 * 고객이 번호표를 뽑으면 순서대로 대기하고, 창구에서 호출하면 순서대로 처리해야 합니다.
 * Queue를 사용해서 대기번호 시스템을 구현하세요.
 * 
 * 요구사항:
 * - takeTicket() - 고객이 번호표를 뽑으면 대기열에 추가
 * - callNextCustomer() - 창구에서 다음 고객을 호출하면 대기열에서 제거
 * - getWaitingCount() - 현재 대기 중인 고객 수 확인
 * - peekNextCustomer() - 다음 처리할 고객 확인 (제거하지 않음)
 */
public class BankQueueSystem {
	private Queue<String> customerQueue = new LinkedList<>();
	private int ticketNumber = 1;
	
	// TODO: 고객이 번호표 뽑기
	// 힌트: customerQueue에 고객명을 offer()로 추가하고, 번호표 문자열 반환
	public String takeTicket(String customerName) {
		// 구현하세요
		// 1. offer(customerName) 사용
		// 2. ticketNumber + "번. " + customerName 형태로 번호표 생성해서 저장함
		// 3. ticketNumber++ 증가
        customerQueue.offer(customerName);
        System.out.println(ticketNumber + "번. " + customerName);
        ticketNumber++;
		return null;
	}
	
	// TODO: 창구에서 다음 고객 호출
	// 힌트: customerQueue에서 poll()로 고객을 제거하고 반환
	public String callNextCustomer() {
		// 구현하세요
		// 1. null 체크 필요 (대기열이 비어있을 수 있음)
        if(!customerQueue.isEmpty()){
            return customerQueue.poll();
        }
		return null;
	}
	
	// TODO: 다음 처리할 고객 확인
	// 힌트: customerQueue에서 peek()로 고객을 확인하되 제거하지 않음
	public String peekNextCustomer() {
		// 1. null 체크 필요 (대기열이 비어있을 수 있음)
        if(!customerQueue.isEmpty()){
            return customerQueue.peek();
        }
		return null;
	}
	
	// TODO: 대기 중인 고객 수
	// 힌트: customerQueue.size() 사용
	public int getWaitingCount() {
		// 1. size() 반환
		return customerQueue.size();
	}
}