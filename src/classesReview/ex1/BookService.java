package classesReview.ex1;

import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();

    public void save() {
        // 각 앞으로 작성할 필드값을 변수로 잡아주기.
        System.out.print("도서명: ");
        String bookTitle = scanner.next();
        System.out.print("저자: ");
        String bookAuthor = scanner.next();
        System.out.print("가격: ");
        int bookPrice = scanner.nextInt();
        System.out.print("출판사: ");
        String bookPublisher = scanner.next();
        // BookDTO 클래스를 (bookTitle, bookAuthor, bookPrice, bookPublisher)라는 매개변수를 갖는
        // bookDTO라는 이름의 객체 생성
        BookDTO bookDTO = new BookDTO(bookTitle, bookAuthor, bookPrice, bookPublisher);
        // bookRepository에 있는 save() 메서드에 bookDTO 값을 호출 및 전달하는 내용을 result라는 이름으로 boolean 변수로 받겠다.
        boolean result = bookRepository.save(bookDTO);
        if (result) {
            // result가 참일 시
            System.out.println("등록 성공");
        } else {
            // result가 거짓일 시 (but 등록 과정에선 보통 거짓이나 오류가 발생할 일이 없음)
            System.out.println("등록 실패");
        }

    }
    /**
     * 도서등록 메서드
     * name: save
     * parameter: x
     * return: x
     * 실행내용
     *      스캐너로 도서명, 저자, 가격, 출판사정보를 입력받고
     *      BookDTO 객체에 담아서 Repository로 전달하여 저장이 되도록 함
     *      등록 여부를 출력한다.(등록성공 or 등록실패)
     */

    /**
     * 도서목록 메서드
     * name: findAll
     * parameter: x
     * return: x
     * 실행내용
     *      Repository로 부터 목록을 리턴 받아서 목록에 있는 모든 정보를 출력
     */

    /**
     * 도서조회 메서드
     * name: findById
     * parameter: x
     * return: x
     * 실행내용
     *      id를 입력받고 Repository로 부터 id에 해당 하는 도서 정보를 출력
     *      없으면 없다고 출력
     */

    /**
     * 도서조회 메서드
     * name: findByTitle
     * parameter: x
     * return: x
     * 실행내용
     *      도서제목을 입력받고 Repository로 부터 해당 하는 도서 정보를 출력(제목이 정확히 일치하는 것만)
     *      없으면 없다고 출력
     */
}
