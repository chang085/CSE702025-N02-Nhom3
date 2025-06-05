## Hệ thống quản lý đội bóng

### Mục lục

[I. Giới thiệu](#GioiThieu)

[II. Cài đặt](#CaiDat)

[III. Hướng dẫn sử dụng](#HDSD)

- [1. Quản lý thông tin cầu thủ](#QLTTCT)
- [2. Quản lý thông tin huấn luyện viên](#QLTTHLV)

[IV. Tổng kết](#Tongket)

===========================

<a name="GioiThieu"></a>

## I. Giới thiệu

Hệ thống quản lý đội bóng giúp bạn theo dõi và quản lý các thông tin của đội bóng. Từ việc quản lý thông tin cá nhân đến việc theo dõi kết quả trận đấu của các cầu thủ, huấn luyện viên.

<a name="CaiDat"></a>

## II. Cài đặt

Để cài đặt hệ thống, bạn cần làm theo các bước sau:

1. **Tải xuống và cài đặt các phiên bản Java theo yêu cầu đã ghi trong file note (các phiên bản Java như 2020, 2021, 2022 tức jdk 16, 18, 20)** từ trang web chính thức.
2. Lưu ý **đối với phiên bản mới nhất 2023 tức jdk 21 có thể bị lỗi**.
3. **Mở ứng dụng và điền thông tin đăng nhập.**
   - **Tài khoản cho đội ngũ quản lý cầu thủ**:
     - Username: `team5ct`
     - Password: `123`
     - Quyền: Cho phép truy cập mục quản lý cầu thủ.
   - **Tài khoản cho đội ngũ huấn luyện viên**:
     - Username: `team5hlv`
     - Password: `123`
     - Quyền: Cho phép truy cập mục quản lý huấn luyện viên.
   - **Tài khoản tổng**:
     - Username: `team5`
     - Password: `123`
     - Quyền: Cho phép truy cập vào cả hai mục quản lý cầu thủ và quản lý huấn luyện viên.
4. **Theo dõi hướng dẫn trên màn hình để hoàn tất quá trình cài đặt.**

<a name="HDSD"></a>

## III. Hướng dẫn sử dụng

Sau khi đăng nhập thành công, ứng dụng sẽ hiện ra 2 lựa chọn để quản lý cầu thủ hoặc huấn luyện viên

<a name="QLTTCT"></a>

### 1. Quản lý thông tin cầu thủ

#### 1.1. Add

- **Mô tả**: Thêm thông tin của một cầu thủ mới vào danh sách.
- **Thông tin cần nhập**:
  - Tên
  - Quốc tịch
  - Giới tính
  - Ngày tháng năm sinh
  - Ngày gia nhập đội bóng
  - Vị trí thi đấu
  - Số trận đã tham gia
  - Số bàn thắng
  - Lương thỏa thuận
  - Điểm số của 5 trận đấu gần nhất

#### 1.2. Change

- **Mô tả**: Sửa đổi thông tin của cầu thủ mà người dùng đang chọn.

#### 1.3. Delete

- **Mô tả**: Loại bỏ một cầu thủ mà người dùng đang chọn khỏi danh sách hiện tại.

#### 1.4. Save

- **Mô tả**: Lưu dữ liệu vào cơ sở dữ liệu, bao gồm các thay đổi như thêm mới, xóa, sửa thông tin cầu thủ, hoặc cập nhật điểm số cho trận đấu gần nhất.

#### 1.5. Back

- **Mô tả**: Quay lại giao diện trước đó.

#### 1.6. Filter

- **Mô tả**: Tìm kiếm danh sách cầu thủ theo vị trí thi đấu (tiền đạo, tiền vệ, hậu vệ, thủ môn).

#### 1.7. Sort

- **Mô tả**: Xếp lại danh sách cầu thủ theo thứ tự từ cao đến thấp dựa trên số trận tham gia, số bàn thắng hoặc lương.

#### 1.8. Add Latest Match Score

- **Mô tả**: Thêm điểm số cho trận đấu gần nhất của cầu thủ mà người dùng đang chọn.

#### 1.9. Salary and Bonus Details

- **Mô tả**: Hiển thị thông tin chi tiết về lương thực tế và tiền thưởng của cầu thủ mà người dùng đang chọn.

<a name="QLTTHLV"></a>

### 2. Quản lý thông tin huấn luyện viên

#### 1.1. Add

- Thêm thông tin của huấn luyện viên từ 5 trường tương ứng

#### 1.2. Update

- Cập nhật thông tin của huấn luyện viên từ 5 trường tương ứng

#### 1.3. Delete

- Xóa thông tin cho một huấn luyện viên

#### 1.4. Save

- Lưu dữ liệu vào cơ sở dữ liệu

#### 1.5. Load Data

- Load dữ liệu từ file `.csv` có sẵn và hiện dữ liệu lên màn hình ở dạng bảng

#### 1.6. Back

- Quay lại giao diện trước đó

#### 1.7. Salary Details

- Hiện chi tiết lương và thưởng của huấn luyện viên mà người dùng đang chọn

<a name="Tongket"></a>

## IV. Tổng kết

Bài viết trên chúng tôi tổng hợp lại đã ghi đầy đủ hướng dẫn sử dụng ứng dụng quản lý đội bóng, hi vọng nó giúp các bạn một phần nào đó.

Bài viết này có thể còn một số thiếu sót, mong các bạn thông cảm và gửi feedback cho chúng tôi để hoàn thiện thêm.

Liên lạc của nhóm tôi:

- Email : 22010085@st.phenikaa-uni.edu.vn

Xin chân thành cảm ơn!
