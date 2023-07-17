// RuntimeException 클래스로부터 상속을 받아서 기본적인 예외처리 클래스의 조건을 갖춘다
public class InfoErrorException extends RuntimeException{
    private String errorMsg;

    public InfoErrorException(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String getMessage() {
        return errorMsg;
    }
}
