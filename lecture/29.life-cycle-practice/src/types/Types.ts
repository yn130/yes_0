// 여러 파일에서 공통적으로 사용하는 타입을 관리.

// #1. Type 지정
// 단일 투두 아이템 타입
export interface POSTItem {
    id: number; // 유일 ID
    title: string; // 투두 내용
    body: string; // 완료 여부
}