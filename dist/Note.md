File .jar khi chạy có thể bị lỗi

Nếu bạn mở lên mà báo lỗi Invaild or corupt .jarfile hay đại loại một thông báo nào tương tự vậy, vui lòng kiểm tra lại phiên bản Jdk của bạn bằng cách:

- Bước 1, bấm tổ hợp Win + R
- Bước 2, gõ cmd
- Bước 3, bên trong cmd, vui lòng gõ `java -version`

Nếu phiên bản java của bạn là bản mới trong năm 2023, ví dụ `java version 21.0.1 2023 - 10 - 17`, vui lòng gỡ cài đặt và tải lại các phiên bản Java cũ hơn ở trên trang của Oracle.

Chúng tôi ban đầu cũng gặp vấn đề này trên những phiên bản năm 2023, sau đó chạy thử trên 2 phiên bản khác là `18.0.2.1 2022-08-18` và `16.0.2 2021-07-20` thì đều chạy ổn định.
