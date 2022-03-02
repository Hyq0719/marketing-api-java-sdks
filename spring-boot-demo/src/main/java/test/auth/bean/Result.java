package test.auth.bean;

import java.util.Objects;

/**
 * 业务执行结果
 */
public class Result<T> {
  public static final int CODE_SUCCESS = 0;
  public static final int CODE_FAIL = -1;

  private final int code;
  private final T data;
  private final String cause;

  private Result(int code, T data, String cause) {
    this.code = code;
    this.data = data;
    this.cause = cause == null ? "" : cause;
  }

  public static <T> Result<T> ofSuccessful() {
    return new Result<>(CODE_SUCCESS, null, null);
  }

  public static <T> Result<T> ofSuccessful(T data) {
    return new Result<>(CODE_SUCCESS, data, null);
  }

  public static <T> Result<T> ofFail() {
    return new Result<>(CODE_FAIL, null, null);
  }

  public static <T> Result<T> ofFail(String cause) {
    return new Result<>(CODE_FAIL, null, cause);
  }

  public static <T> Result<T> ofFail(Result<?> result) {
    return new Result<>(result.code, null, result.cause);
  }

  public static <T> Result<T> ofFail(int code, String cause) {
    return new Result<>(code, null, cause);
  }

  /**
   * @return 是否成功
   */
  public boolean successful() {
    return code == CODE_SUCCESS;
  }

  /**
   * @return 结果码
   */
  public int code() {
    return code;
  }

  /**
   * @return 结果数据
   */
  public T data() {
    return data;
  }

  /**
   * 如果失败则获取失败的原因
   *
   * @return
   */
  public String cause() {
    return cause;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result<?> result = (Result<?>) o;
    return code == result.code && Objects.equals(data, result.data) && Objects.equals(cause, result.cause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, cause);
  }

  @Override
  public String toString() {
    return "Result(" + "code=" + code + ", data=" + data + ", cause='" + cause + '\'' + ')';
  }
}
