package classesReview.ex1;

public class BookDTO {
    /**
     * 도서 클래스
     * 필드
     * 도서관리번호(id) - Long 타입
     * 도서명(bookTitle)
     * 저자(bookAuthor)
     * 가격(bookPrice)
     * 출판사(bookPublisher)
     * 필드에 대한 getter/setter
     * 생성자 2가지
     * 도서 등록은 매개변수 있는 생성자로만 할 수 있음.(id는 자동으로 하나씩 증가)
     * toString method
     */
// 필드 생성
    private Long id;
    private String bookTitle;
    private String bookAuthor;
    private int bookPrice;
    private String bookPublisher;

    // 필드의 getter/ setter 생성
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    // 기본생성자 BookDTO 만들기
    public BookDTO() {
    }

    // 프로젝트 실행 중 새로운 Book이 저장될 때마다 idValue가 하나 씩 올라야 하지만
    // static으로 주지 않으면 BookDTO 객체를 새로 만들 때마다 초기화가 됨.
    // static으로 선언하면 값을 계속 유지한다는 특징이 있음.
    private static Long idValue = 1L;

    // 필드에 있는 값들을 매개변수로 갖는 BookDTO 생성자 만들기.
    public BookDTO(String bookTitle, String bookAuthor, int bookPrice, String bookPublisher) {
        this.id = idValue++;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    // toString 만들기.
    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';


    }
