create database Trading2024
go
use Trading2024
go
create table Categories
(
 ID [int] primary key,
 [name] nvarchar(30) ,
 describe nvarchar(50),
)
go
insert into Categories values(1,N'Làm sao bạn có được chỗ ngồi?',N'Bằng cách trúng vé số')
insert into Categories values(2,N'Các mạng máy tính ',N'Có cấu trúc đa tầng')
insert into Categories values(3,N'Ðơn vị tốc độ truyền dữ liệu',N'Bps (bit per second)')
insert into Categories values(4,N'Galaxy',N'Hiện đại, chụp ảnh 10GPixel...')
insert into Categories values(5,N'Kết nối mạng sử dụng',N'Bộ định tuyến')
insert into Categories values(6,N'Samsung',N'Thông minh, nhỏ gọn')
insert into Categories values(7,N'Tại sao dèn trong phòng tắt?',N'Vì họ dang xem 1 video')
insert into Categories values(8,N'Iphone',N'Giá thành cao, sang trọng')
insert into Categories values(9,N'Xiaomi',N'Công nghệ, giá rẻ')
insert into Categories values(10,N'Huawei',N'Hiện đại, hợp lý')
go
select * from Categories