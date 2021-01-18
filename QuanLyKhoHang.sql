﻿create database QuanLyKhoHang
go
use QuanLyKhoHang
go

--tạo bảng Users
create table Users(
	Id int identity(1,1) primary key,
	Name nvarchar(100),
	Username nvarchar(100),
	Password nvarchar(100),
	email varchar(200) ,
	images varchar(max),
	verifyCode int NULL
)
go

--tạo bảng Unit
create table Unit(
	Id int identity(1,1) primary key,
	name nvarchar(100),
	status int default(1)
)
go
Alter proc getunitNameById
@input_id int

AS	
	BEGIN 

	SELECT name from unit where id = @input_id
	END
	
	exec getunitNameById 0
	select @name1
	select * from users
--tạo bảng Suplier
create table Suplier(
	Id int identity(1,1) primary key,
	name nvarchar(100),
	address nvarchar(100),
	phone nvarchar(20),
	email nvarchar(200),
	MoreInfo nvarchar(max),
	ContractDate DateTime,
	characters nvarchar(100),
	status int default(1)
)
go
--tạo bảng category
 create table category(
	Id int identity(1,1) primary key,
	name nvarchar(100),
	characters nvarchar(20),
	status int default(1)
 )	
 go
--tạo bảng Products
create table Products(
	Id nvarchar(100) primary key,
	name nvarchar(100),
	IdUnit int not null,
	IdSuplier int not null,
	IdCate int
)
go

--tạo bảng Customer
create table Customer(
	Id int identity(1,1) primary key,
	name nvarchar(100),
	address nvarchar(100),
	phone nvarchar(100),
	email nvarchar(100),
	MoreInfo nvarchar(max),
	ContractDate DateTime
)
go

--tạo bảng InvoiceImport
create table InvoiceImport(
	Id nvarchar(100) primary key,
	DateInput DateTime
	
)
go
--tạo bảng InvoiceImportDetail
create table InvoiceImportDetail(
	Id nvarchar(100) primary key,
	IdProduct nvarchar(100) not null,
	IdInvoiceImport nvarchar(100) not null,
	Number int,
	InputPrice float default(0),
	OutputPrice float default(0),
	Status nvarchar(100)
)
go

--tạo bảng InvoiceExport
create table InvoiceExport(
	Id nvarchar(100) primary key,
	DateOutput DateTime,
	IdCustomer int not null
)
go
--tạo bảng InvoiceExportDetail
create table InvoiceExportDetail(
	Id nvarchar(100) primary key,
	IdProduct nvarchar(100) not null,
	IdInvoiceImportDetail nvarchar(100) not null,
	IdInvoiceExport nvarchar(100) not null,
	Counts int,
	Status nvarchar(100)
)
go

--tạo khóa ngoại Cateogry và Products
ALTER TABLE Products
ADD CONSTRAINT FK_01 FOREIGN KEY (IdCate) REFERENCES Category(Id);
--tạo khóa ngoại Suplier và Products
ALTER TABLE Products
ADD CONSTRAINT FK_02 FOREIGN KEY (IdSuplier) REFERENCES Suplier(Id);
--tạo khóa ngoại Unit và Products
ALTER TABLE Products
ADD CONSTRAINT FK_03 FOREIGN KEY (IdUnit) REFERENCES Unit(Id);



ALTER TABLE InvoiceImportDetail
ADD CONSTRAINT FK_05 FOREIGN KEY (IdProduct) REFERENCES Products(Id);


--tạo khóa ngoại InvoiceImportDetail và InvoiceImport
ALTER TABLE InvoiceImportDetail
ADD CONSTRAINT FK_06 FOREIGN KEY (IdInvoiceImport) REFERENCES InvoiceImport(Id);

--tạo khóa ngoại InvoiceExport và Customer
ALTER TABLE InvoiceExport
ADD CONSTRAINT FK_07 FOREIGN KEY (IdCustomer) REFERENCES Customer(Id);

--tạo khóa ngoại InvoiceExportDetail và products
ALTER TABLE InvoiceExportDetail
ADD CONSTRAINT FK_08 FOREIGN KEY (idProduct) REFERENCES products(Id);
--tạo khóa ngoại InvoiceExportDetail và InvoiceImportDetail
ALTER TABLE InvoiceExportDetail
ADD CONSTRAINT FK_09 FOREIGN KEY (IdInvoiceImportDetail) REFERENCES InvoiceImportDetail(Id);
--tạo khóa ngoại InvoiceExportDetail và invoiceExport
ALTER TABLE InvoiceExportDetail
ADD CONSTRAINT FK_10 FOREIGN KEY (idinvoiceExport) REFERENCES invoiceExport(Id)
GO
/*
  *  Tạo thủ tục
  PRocedure ADD new unit
	*	@param 1 : out put param
	*	@param 2: param name(String) input
 */

 -- Thủ tục thêm mới Unit
create procedure sp_add_new_unit
 (

	@output int output,
		@name varchar(100)

 )
 AS
	BEGIN 
		IF NOT EXISTS(SELECT * FROM Unit WHERE name =@name)
			BEGIN
				INSERT INTO Unit(name) VALUES (@name)
				SET @output = 0
			END
		ELSE
			BEGIN
				SET @output =1
			END
	END
	GO
/* Test Procedure sp_add_new_unit
	declare  @a int 
	exec sp_add_new_unit  @a output ,'Kg'
	Select @a	
	*/

	/*
	*	PRocedure update unit
	*	@param 1 : out put param
	*	@param 2: param id (Integer) input
	*	@param 3: param name(String) input
	*/
	create procedure sp_update_unit
 (

	@output int output,
	@id int,
	@name nvarchar(100)

 )
 AS
	BEGIN 
		IF  EXISTS(SELECT * FROM Unit WHERE id= @id)
			BEGIN
				UPDATE  Unit
				SET name=@name  
				WHERE id = @id
				SET @output = @@ROWCOUNT
			END
		ELSE
			BEGIN
				SET @output =0
			END
	END
	GO
	/* Test PROCEDURE sp_update_unit
	*	declare  @output int 
	*	exec sp_update_unit @output output ,2,'aaa'
	*	Select @output
	*/


	
	/*
	*	PRocedure delete unit
	*	@param 1 : out put param
	*	@param 2: param id (Integer) input
	*	@param 3: param newstatus (Integer) input

	*/
	create procedure sp_delete_unit
 (
	@output int output,
	@id int
 )
 AS
	BEGIN 
		IF  EXISTS(SELECT * FROM Unit  WHERE id= @id)
			BEGIN
		
				UPDATE  Unit
				SET status = IIF(status = 0, 1, 0) 
				WHERE id = @id
				SET @output = @@ROWCOUNT
			END
		ELSE
			BEGIN
				SET @output = 0
			END
	END
	GO
	
		-- PROCEDURE DELETE SUPLIER
create procedure sp_delete_suplier
 (
	@output int output,
	@id int
 )
 AS
	BEGIN 
		IF  EXISTS(SELECT * FROM suplier  WHERE id= @id)
			BEGIN	
				UPDATE  Suplier
				SET status = IIF(status = 0, 1, 0) 
				WHERE id = @id
				SET @output = @@ROWCOUNT
			END
		ELSE
			BEGIN
				SET @output = 0
			END
	END
	GO
		-- PROCEDURE DELETE Category
create procedure sp_delete_category
 (
	@output int output,
	@id int
 )
 AS
	BEGIN 
		IF  EXISTS(SELECT * FROM Category  WHERE id= @id)
			BEGIN	
				UPDATE  Category
				SET status = IIF(status = 0, 1, 0) 
				WHERE id = @id
				SET @output = @@ROWCOUNT
			END
		ELSE
			BEGIN
				SET @output = 0
			END
	END
	GO
	-- GET TOTAl row in product table
	create procedure sp_count_products (
	@output int output
	)

 AS			
		BEGIN
		SET @output	=(select count(*)FROM  Products	)
			
		END
		GO
	/* Procedure insert to invoiceImportDetail with transaction
	*	@Param @errOutput error output 0 = not error 1 = errors 
	*	@param @dateImport: Date import data to database
	*	@param @idProduct: Id Product need import
	*	@param @number: number of products import
	*	@param @inputPrice: input price of product
	*	@param @outPrice: out price of product
	*	@param @status: status of product
	*/
alter procedure sp_add_invoice_import_Detail(
	@errOutput int output,	
	@dateImport datetime,
	@idProduct nvarchar(100),
	@idImportInput varchar(20),
	@number int,
	@inputPrice float,
	@outputPrice float
	
)

	AS
	declare	 @idInvoiceImport varchar(20),
			 @newIdInvoiceImport varchar(20),
			 @countInvoiceImport int,
			 @idInvoiceimportDetail varchar(100),
			 @countInvoiceImportDetail int
		BEGIN TRANSACTION
			BEGIN TRY
			-- get count from imvoiceimport table
			set @countInvoiceImport = ((SELECT count(id) from invoiceimport)+1)	
			-- set id for new record insert to invoiceimport table
			SET @newIdInvoiceImport = 'I'+ REPLICATE('0',6 - LEN(CAST(@countInvoiceImport as varchar(20)))) +CAST(@countInvoiceImport as varchar(20))
			
			

			SET @idInvoiceImport =IIF(LEN(@idImportInput)>3,@idImportInput,@newIdInvoiceImport)
			-- get count from imvoiceimportDetail table
			set @countInvoiceImportDetail= ((SELECT count(id) from InvoiceImportDetail)+1)		
			-- set id for new record insert to invoiceimportDetail table
			SET @idInvoiceimportDetail = 'ID'+ REPLICATE('0',6 - LEN(CAST(@countInvoiceImportDetail as varchar(20))))+CAST(@countInvoiceImportDetail as varchar(20))
				IF NOT EXISTS(SELECT id from InvoiceImport where id = @idInvoiceImport)
					BEGIN
						INSERT INTO InvoiceImport (id,DateInput)VALUES(@idInvoiceImport,@dateImport)
					END
				

				INSERT INTO InvoiceImportDetail(Id,IdProduct,IdInvoiceImport,Number,InputPrice,OutputPrice,Status)
							VALUES(@idinvoiceimportDetail,@idProduct,@idInvoiceImport,@number,@inputPrice,@outputPrice,'1')
				SET @errOutput =0;
				COMMIT TRANSACTION
			END TRY
			BEGIN CATCH
			SET @errOutput =1;
			ROLLBACK TRANSACTION
			 RETURN ERROR_MESSAGE()
			END CATCH
			GO
			
/*	 Test sql insert into 2 table InvoiceImportDetail va InvoiceImport

	select * from Products
declare @output1 int	
exec sp_add_invoice_import_Detail @output1 output,'02/10/2021','SP002',200,20000,80000,'1'
select @output1
select * from InvoiceImportDetail
select * from InvoiceImport
*/
-- THủ tục lấy về ngày đầu tiên trong bảng Invoice import
CREATE PROCEDURE sp_get_firt_date_Invoice_Import 
AS
	BEGIN
		SELECT convert (datetime,(SELECT  TOP 1  DateInput from InvoiceImport ORDER BY  DateInput)) 
	
	END
	GO
	-- lấy ngày này sang năm 

	/*
	*	Procedure sp_create_temp_get_all_reports_invoiceimportdetail lấy về toàn bộ thông tin nhập hàng
	*/

create PROCEDURE sp_create_temp_get_all_reports_invoiceimportdetail

AS
	BEGIN		
		IF OBJECT_ID('tempdb..##reports_invoiceimportdetail','U') IS NOT NULL
		BEGIN
			DROP TABLE ##reports_invoiceimportdetail
		END
			BEGIN
			SELECT iid.Id as 'IdInvoiceimportDetail',iid.IdProduct as'ProductId', p.name as 'Productname' ,iid.InputPrice,iid.Number,iid.OutputPrice,id.Id as'IdInvoiceimport',id.DateInput INTO ##reports_invoiceimportdetail			
				from InvoiceImportDetail iid
				join Products p
				ON iid.IdProduct =p.Id
				JoIN InvoiceImport id
				ON iid.IdInvoiceImport = id.Id
				
			END		
	END
	GO
	/*
	*	Test Procedure sp_create_temp_reports_invoiceimportdetail
	*	exec sp_create_temp_get_all_reports_invoiceimportdetail
	*	select * from ##reports_invoiceimportdetail
	*/

	

/*		declare @today datetime
	set @today=   GETDATE()
	select @today
	SELECT CAST(getdate() AS date);
	*/

	/*
	*	Procedure sp_create_temp_reports_invoiceimportdetail lấy về toàn bộ thông tin nhập hàng
	*/
ALTER  PROCEDURE sp_create_temp_get_reports_invoiceimportdetail_nearest_week

	AS
		declare @today date,
				@thesamedaylastweek date
		BEGIN
			SET @today =  CAST(getdate() AS date);
			SET @thesamedaylastweek = DATEADD(day ,-7,@today )
			BEGIN
				IF OBJECT_ID('tempdb..##reports_invoiceimportdetail_nearest_week','U') IS NOT NULL
						BEGIN
							DROP TABLE ##reports_invoiceimportdetail_nearest_week
						END
						IF OBJECT_ID('tempdb..##reports_invoiceimportdetail','U') IS  NULL
						BEGIN
							exec sp_create_temp_get_all_reports_invoiceimportdetail
						END
						SELECT * INTO ##reports_invoiceimportdetail_nearest_week			
							from ##reports_invoiceimportdetail
							where DateInput >=@thesamedaylastweek AND DateInput <=@today
							
			

			END
END
GO

/*
*	Procedure get all record in a year
*/

alter  PROCEDURE sp_create_temp_get_reports_invoiceimportdetail_by_year(
 @year  datetime
)
	AS
		
		BEGIN
			SELECT   year(@year) as 'year',SUM(b.Number*b.InputPrice) as 'totalImport'
			FROM InvoiceImportDetail b
			JOIN     InvoiceImport a
			ON a.Id = b.IdInvoiceImport
			WHERE     YEAR(a.DateInput) = year(@year)
			

		END
/*
*	Procedure get records invoiceimportdetail from firstyear to current year
*/

create PROCEDURE sp_get_total_imports_from_atmost_5year_to_now
AS
	declare  @firstyear  datetime, @currentyear datetime ,@startyear datetime ;
	BEGIN
		IF OBJECT_ID('tempdb..##reports_invoiceimportdetail','U') IS  NULL
			BEGIN
				exec sp_create_temp_get_all_reports_invoiceimportdetail
			END
		set @firstyear =( SELECT  TOP 1 CONVERT(varchar(10),DateInput,101)  from InvoiceImport ORDER BY DateInput ASC)	
		set @currentyear = dateadd(year,0,getdate());
		set @startyear = IIF(year(@currentyear) -year(@firstyear)>5,dateadd(year,-5,getdate()), @firstyear );
		SELECT year(DateInput) as 'year', sum(Number*InputPrice) as 'total'
			FROM ##reports_invoiceimportdetail			
			WHERE ( year(DateInput)<= year(@currentyear) AND year(DateInput)>=year(@startyear))
			GROUP by year(DateInput)
		
	
	END
/*	select * from ##reports_invoiceimportdetail
	exec  sp_create_get_total_import_from_atmost_5year_to_now
	select * from InvoiceImport
	
	*/	
	ALTER PROCEDURE sp_get_total_imports_from_nearest_week
AS
	declare  @firstday  datetime, @currentday datetime  ;
	BEGIN
		IF OBJECT_ID('tempdb..##reports_invoiceimportdetail','U') IS  NULL
			BEGIN
				exec sp_create_temp_get_all_reports_invoiceimportdetail
			END
		
		set @currentday = dateadd(day,0,getdate());
		set @firstday = dateadd(day,-7,@currentday);
		select @currentday
		select @firstday
		SELECT CAST(DateInput AS date) , sum(Number*InputPrice) as 'total'
			FROM ##reports_invoiceimportdetail			
			WHERE ( DateInput <= @currentday AND DateInput >= @firstday)
			GROUP by  CAST(DateInput AS date);
		
	
	END
	declare @date date
	set @date = '02/12/2021'
	select @date
		SELECT  TOP 1 IIF(  CAST(DateInput AS date) = CAST(@date AS date) ,CAST(DateInput AS date) ,CAST(@date AS date)   ) 	,  CASE WHEN Number > 0 THEN 0 ELSE 1 END  
		FROM ##reports_invoiceimportdetail		
		GROUP by CAST(DateInput AS date)    ,  CASE WHEN Number > 0 THEN 0 ELSE 0 END 
	
		declare @date datetime
	set @date = '01/12/2021'
	select @date
		SELECT  DateInput   , sum(Number*InputPrice)
		FROM ##reports_invoiceimportdetail	
			where DateInput >= @date 
			GROUP by DateInput
		
	select dateinput,number from ##reports_invoiceimportdetail	GROUP by DateInput, number
			
		exec sp_get_total_imports_from_nearest_week
	select * from ##reports_invoiceimportdetail	
		declare @date datetime
	set @date = '01/10/2021'
	select @date
	SELECT DateInput from  ##reports_invoiceimportdetail  where DateInput = @date 
		
		
/*
	declare @firstdate datetime ='01/10/2021',@seconddate datetime ='01/15/2121'
	SELECT  p.name as 'productname' ,iid.Id as 'invoiceimportId',iid.InputPrice,iid.Number,iid.OutputPrice,id.DateInput 		
				from InvoiceImportDetail iid
				join Products p
				ON iid.IdProduct =p.Id
				JoIN InvoiceImport id
				ON iid.IdInvoiceImport = id.Id
				AND id.DateInput >= @firstdate AND id.DateInput <= @seconddate;
	
	
	

select * from InvoiceImport
	-- TEST thu tuc get data by day
select p.name,(iid.Number* iid.InputPrice) as 'chi phis',id.DateInput
from InvoiceImportDetail iid
join Products p
ON iid.IdProduct =p.Id
JoIN InvoiceImport id
ON iid.IdInvoiceImport = id.Id

select *
from InvoiceImportDetail iid
join Products p
ON iid.IdProduct =p.Id
JoIN InvoiceImport id
ON iid.IdInvoiceImport = id.Id



SELECT  TOP 1  * from InvoiceImport ORDER BY DateInput ASC
*/
	--SELECT THe first year in database


	declare  @firstyear  datetime
	set @firstyear =( SELECT  TOP 1 CONVERT(varchar(10),DateInput,101)  from InvoiceImport ORDER BY DateInput ASC)	
 
 SELECT   year(@firstyear) as 'year',SUM(b.Number*b.InputPrice) as 'totalImport'

FROM InvoiceImportDetail b
JOIN     InvoiceImport a
ON a.Id = b.IdInvoiceImport
WHERE     YEAR(a.DateInput) = year(@firstyear)
GROUP BY  MONTH(a.DateInput)
select * from InvoiceImport a where year(a.DateInput) ='2021'
select * from InvoiceImportDetail