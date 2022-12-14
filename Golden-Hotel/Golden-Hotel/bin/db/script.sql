USE [master]
GO
/****** Object:  Database [Hotel02]    Script Date: 11/30/2022 5:12:58 AM ******/
CREATE DATABASE [Hotel02]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Hotel02', FILENAME = N'D:\New folder\MSSQL15.MSSQLSERVER\MSSQL\DATA\Hotel02.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Hotel02_log', FILENAME = N'D:\New folder\MSSQL15.MSSQLSERVER\MSSQL\DATA\Hotel02_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [Hotel02] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Hotel02].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Hotel02] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Hotel02] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Hotel02] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Hotel02] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Hotel02] SET ARITHABORT OFF 
GO
ALTER DATABASE [Hotel02] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Hotel02] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Hotel02] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Hotel02] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Hotel02] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Hotel02] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Hotel02] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Hotel02] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Hotel02] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Hotel02] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Hotel02] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Hotel02] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Hotel02] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Hotel02] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Hotel02] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Hotel02] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Hotel02] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Hotel02] SET RECOVERY FULL 
GO
ALTER DATABASE [Hotel02] SET  MULTI_USER 
GO
ALTER DATABASE [Hotel02] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Hotel02] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Hotel02] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Hotel02] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Hotel02] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Hotel02] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'Hotel02', N'ON'
GO
ALTER DATABASE [Hotel02] SET QUERY_STORE = OFF
GO
USE [Hotel02]
GO
/****** Object:  Table [dbo].[Authorities]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Authorities](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[employeeid] [int] NULL,
	[roleid] [char](4) NULL,
 CONSTRAINT [PK__Authorit__3214EC272804FFED] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Booking]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Booking](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[GuestID] [int] NULL,
	[Date] [date] NULL,
	[Time] [nvarchar](10) NULL,
	[ArrivalDate] [date] NULL,
	[DepartureDate] [date] NULL,
	[EstCheckin] [datetime] NULL,
	[EstCheckOut] [datetime] NULL,
	[Description] [nvarchar](300) NULL,
	[RoomID] [nchar](5) NULL,
	[Employeeid] [int] NULL,
 CONSTRAINT [PK__Booking__3214EC27D6FC9F8B] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employee](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[FullName] [nvarchar](50) NULL,
	[avatar] [nvarchar](50) NULL,
	[DOB] [date] NULL,
	[Gender] [int] NULL,
	[PhoneNo] [char](15) NULL,
	[Email] [nvarchar](30) NULL,
	[Password] [nvarchar](30) NULL,
	[Salary] [float] NULL,
	[Type] [int] NULL,
	[Status] [int] NULL,
	[address] [nvarchar](250) NULL,
	[Description] [nvarchar](300) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Gallery]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Gallery](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Thumbnail] [nvarchar](50) NULL,
	[roomtype] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Guest]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Guest](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[FirstName] [nvarchar](15) NULL,
	[LastName] [nvarchar](15) NULL,
	[DOB] [date] NULL,
	[Gender] [int] NULL,
	[PhoneNo] [nvarchar](15) NULL,
	[Email] [nvarchar](50) NULL,
	[PID] [char](15) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Invoice]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Invoice](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[BookingID] [int] NULL,
	[GuestID] [int] NULL,
	[Service] [char](100) NULL,
	[isLate] [int] NULL,
	[Date] [date] NULL,
	[CreditcardNo] [nchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role](
	[id] [char](4) NOT NULL,
	[Name] [nvarchar](50) NULL,
 CONSTRAINT [PK__Role__3214EC272A0960D3] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Room]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Room](
	[ID] [nchar](5) NOT NULL,
	[Roomtype] [int] NULL,
	[Status] [int] NULL,
	[photo] [nvarchar](50) NULL,
	[Name] [nchar](10) NULL,
 CONSTRAINT [PK__Room__3214EC27F817FBA2] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[RoomType]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RoomType](
	[Type] [int] IDENTITY(1,1) NOT NULL,
	[price] [float] NULL,
	[Name] [nvarchar](100) NULL,
	[RoomDesc] [nvarchar](300) NULL,
PRIMARY KEY CLUSTERED 
(
	[Type] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Services]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Services](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Title] [char](30) NULL,
	[Type] [int] NULL,
	[Quantity] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ServicesType]    Script Date: 11/30/2022 5:12:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ServicesType](
	[Type] [int] IDENTITY(1,1) NOT NULL,
	[price] [float] NULL,
	[description] [char](300) NULL,
PRIMARY KEY CLUSTERED 
(
	[Type] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Authorities] ON 

INSERT [dbo].[Authorities] ([ID], [employeeid], [roleid]) VALUES (41, 12, N'DIRE')
INSERT [dbo].[Authorities] ([ID], [employeeid], [roleid]) VALUES (46, 14, N'STAF')
INSERT [dbo].[Authorities] ([ID], [employeeid], [roleid]) VALUES (50, 16, N'STAF')
INSERT [dbo].[Authorities] ([ID], [employeeid], [roleid]) VALUES (55, 17, N'STAF')
INSERT [dbo].[Authorities] ([ID], [employeeid], [roleid]) VALUES (63, 19, N'STAF')
INSERT [dbo].[Authorities] ([ID], [employeeid], [roleid]) VALUES (64, 11, N'DIRE')
INSERT [dbo].[Authorities] ([ID], [employeeid], [roleid]) VALUES (65, 11, N'STAF')
SET IDENTITY_INSERT [dbo].[Authorities] OFF
GO
SET IDENTITY_INSERT [dbo].[Booking] ON 

INSERT [dbo].[Booking] ([ID], [GuestID], [Date], [Time], [ArrivalDate], [DepartureDate], [EstCheckin], [EstCheckOut], [Description], [RoomID], [Employeeid]) VALUES (22, 2, NULL, NULL, CAST(N'2022-11-28' AS Date), CAST(N'2022-11-30' AS Date), NULL, NULL, NULL, N'10012', 11)
INSERT [dbo].[Booking] ([ID], [GuestID], [Date], [Time], [ArrivalDate], [DepartureDate], [EstCheckin], [EstCheckOut], [Description], [RoomID], [Employeeid]) VALUES (23, 3, NULL, NULL, CAST(N'2022-11-28' AS Date), CAST(N'2022-11-30' AS Date), NULL, NULL, NULL, N'10015', 12)
INSERT [dbo].[Booking] ([ID], [GuestID], [Date], [Time], [ArrivalDate], [DepartureDate], [EstCheckin], [EstCheckOut], [Description], [RoomID], [Employeeid]) VALUES (24, 4, NULL, NULL, CAST(N'2022-11-28' AS Date), CAST(N'2022-11-30' AS Date), NULL, NULL, NULL, N'10018', 14)
SET IDENTITY_INSERT [dbo].[Booking] OFF
GO
SET IDENTITY_INSERT [dbo].[Employee] ON 

INSERT [dbo].[Employee] ([ID], [FullName], [avatar], [DOB], [Gender], [PhoneNo], [Email], [Password], [Salary], [Type], [Status], [address], [Description]) VALUES (11, N'Nguyen Quoc huan', N'80caf4a5.jpg', CAST(N'2002-12-08' AS Date), 1, N'0974517115     ', N'huan2002@gmail.com', N'414022', 70000, 1, 1, N'Ho Chi Minh', N'helllo')
INSERT [dbo].[Employee] ([ID], [FullName], [avatar], [DOB], [Gender], [PhoneNo], [Email], [Password], [Salary], [Type], [Status], [address], [Description]) VALUES (12, N'Nguyen Thu Hai', NULL, CAST(N'2002-05-09' AS Date), 0, N'0974517115     ', N'hai2002@gmail.com', N'123', 70000, 1, 1, NULL, NULL)
INSERT [dbo].[Employee] ([ID], [FullName], [avatar], [DOB], [Gender], [PhoneNo], [Email], [Password], [Salary], [Type], [Status], [address], [Description]) VALUES (14, N'Duong Hoang Kim Khanh', N'no_avatar.png', CAST(N'2022-11-30' AS Date), 0, N'0987678932     ', N'khanh@gmail.com', N'123', 700000, 0, 1, N'Ho Chi Minh', N'khanhga')
INSERT [dbo].[Employee] ([ID], [FullName], [avatar], [DOB], [Gender], [PhoneNo], [Email], [Password], [Salary], [Type], [Status], [address], [Description]) VALUES (16, N'Nguyen Thi Yen', N'no_avatar.png', CAST(N'2022-11-30' AS Date), 1, N'845787777      ', N'yen@gmail.com', N'123', 70000, 0, 1, N'Thu Duc, Ho Chi Minh', N'Hellll')
INSERT [dbo].[Employee] ([ID], [FullName], [avatar], [DOB], [Gender], [PhoneNo], [Email], [Password], [Salary], [Type], [Status], [address], [Description]) VALUES (17, N'Nguyễn Văn Anh', N'no_avatar.png', CAST(N'2022-11-30' AS Date), 0, N'846578945      ', N'anh@gmail.com', N'123', 70000, 0, 0, N'Hương khê Hà Tĩnh', N'HEllo mọi người')
INSERT [dbo].[Employee] ([ID], [FullName], [avatar], [DOB], [Gender], [PhoneNo], [Email], [Password], [Salary], [Type], [Status], [address], [Description]) VALUES (19, N'Nguyễn Quốc Huy', N'no_avatar.png', CAST(N'2022-11-03' AS Date), 0, N'0987675874     ', N'nqhuan2002@gmail.com', N'143530', 700000, 0, 1, N'Ho Chi Minh', NULL)
SET IDENTITY_INSERT [dbo].[Employee] OFF
GO
SET IDENTITY_INSERT [dbo].[Gallery] ON 

INSERT [dbo].[Gallery] ([ID], [Thumbnail], [roomtype]) VALUES (1, N'deluxe', 3)
INSERT [dbo].[Gallery] ([ID], [Thumbnail], [roomtype]) VALUES (2, N'deluxe2', 3)
INSERT [dbo].[Gallery] ([ID], [Thumbnail], [roomtype]) VALUES (3, N'deluxe3', 3)
INSERT [dbo].[Gallery] ([ID], [Thumbnail], [roomtype]) VALUES (4, N'standard', 1)
INSERT [dbo].[Gallery] ([ID], [Thumbnail], [roomtype]) VALUES (5, N'standard2', 1)
INSERT [dbo].[Gallery] ([ID], [Thumbnail], [roomtype]) VALUES (6, N'standard3', 1)
INSERT [dbo].[Gallery] ([ID], [Thumbnail], [roomtype]) VALUES (7, N'superior', 2)
INSERT [dbo].[Gallery] ([ID], [Thumbnail], [roomtype]) VALUES (8, N'superior2', 2)
INSERT [dbo].[Gallery] ([ID], [Thumbnail], [roomtype]) VALUES (9, N'superior3', 2)
SET IDENTITY_INSERT [dbo].[Gallery] OFF
GO
SET IDENTITY_INSERT [dbo].[Guest] ON 

INSERT [dbo].[Guest] ([ID], [FirstName], [LastName], [DOB], [Gender], [PhoneNo], [Email], [PID]) VALUES (2, N'Nguyen', N'Huan', CAST(N'2002-12-08' AS Date), 1, N'097567546', N'nghuan@gmail.com', N'029879764531   ')
INSERT [dbo].[Guest] ([ID], [FirstName], [LastName], [DOB], [Gender], [PhoneNo], [Email], [PID]) VALUES (3, N'Hoang', N'Anh', CAST(N'2002-11-02' AS Date), 1, N'098765432', N'anh@gmail.com', N'04688563981    ')
INSERT [dbo].[Guest] ([ID], [FirstName], [LastName], [DOB], [Gender], [PhoneNo], [Email], [PID]) VALUES (4, N'Tran', N'Anh ', CAST(N'1992-11-08' AS Date), 1, N'098765432', N'anh@gmail.com', N'046785637241   ')
INSERT [dbo].[Guest] ([ID], [FirstName], [LastName], [DOB], [Gender], [PhoneNo], [Email], [PID]) VALUES (5, N'Hoang Anh ', N'Cao', CAST(N'1999-01-02' AS Date), 1, N'098765432', N'cao@gmail.com', N'066785637241   ')
INSERT [dbo].[Guest] ([ID], [FirstName], [LastName], [DOB], [Gender], [PhoneNo], [Email], [PID]) VALUES (6, N'Cao', N'Duyen', CAST(N'1987-09-02' AS Date), 0, N'089765854', N'duyen@gmail.com', N'041785678241   ')
SET IDENTITY_INSERT [dbo].[Guest] OFF
GO
INSERT [dbo].[Role] ([id], [Name]) VALUES (N'DIRE', N'Director')
INSERT [dbo].[Role] ([id], [Name]) VALUES (N'STAF', N'Staff           ')
GO
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'0    ', 1, 0, NULL, N'P100      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10011', 1, 0, NULL, N'P101      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10012', 2, 1, NULL, N'P102      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10013', 1, 2, NULL, N'P103      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10014', 3, 3, NULL, N'P104      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10015', 4, 4, NULL, N'P105      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10016', 1, 5, NULL, N'P106      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10017', 2, 0, NULL, N'P107      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10018', 3, 1, NULL, N'P108      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10021', 4, 0, NULL, N'P201      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10022', 4, 0, NULL, N'P202      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10023', 1, 0, NULL, N'P203      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10024', 1, 0, NULL, N'P204      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10025', 1, 0, NULL, N'P205      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10026', 1, 0, NULL, N'P206      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10027', 3, 0, NULL, N'P207      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10028', 4, 0, NULL, N'P208      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10029', 4, 0, NULL, N'P209      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10031', 4, 0, NULL, N'P301      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10032', 1, 0, NULL, N'P302      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10033', 2, 0, NULL, N'P303      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10034', 4, 0, NULL, N'P304      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10035', 3, 0, NULL, N'P305      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10036', 1, 0, NULL, N'P306      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10037', 2, 0, NULL, N'P307      ')
INSERT [dbo].[Room] ([ID], [Roomtype], [Status], [photo], [Name]) VALUES (N'10038', 3, 0, NULL, N'P308      ')
GO
SET IDENTITY_INSERT [dbo].[RoomType] ON 

INSERT [dbo].[RoomType] ([Type], [price], [Name], [RoomDesc]) VALUES (1, 3500, N'Room Standard', N'Standard rooms, are modern decorated that can accommodate up to 2 persons, totally soundproofed and equipped with high tech comforts such as high speed internet access, USB ports , smart TV and room cleaning touch system.')
INSERT [dbo].[RoomType] ([Type], [price], [Name], [RoomDesc]) VALUES (2, 4000, N'Room Superior', N'A superior room is a room in a hotel that is more comfortable or has better amenities than other rooms. It is $245 for a standard room and $275 for a superior room. Superior rooms have a beautiful view over the hills. The superior rooms are larger than the standard rooms.')
INSERT [dbo].[RoomType] ([Type], [price], [Name], [RoomDesc]) VALUES (3, 5000, N'Room Deluxe', N'Deluxe Room considerately and comfortably sized at 22 square meters. The rooms are designed to respond to your basic sleep requirements. City view and natural sunlight in light oak rooms. Travelers will take pleasure in the serene atmosphere.')
INSERT [dbo].[RoomType] ([Type], [price], [Name], [RoomDesc]) VALUES (4, 4500, N'Room Suite', N'A suite is a much larger accommodation. It usually has an attached bathroom, a living area, and most times, includes a dining area as well. Think of it as a furnished apartment-like stay that can be anywhere between 400 sq')
SET IDENTITY_INSERT [dbo].[RoomType] OFF
GO
ALTER TABLE [dbo].[Authorities]  WITH CHECK ADD  CONSTRAINT [FK__Authoriti__emplo__59FA5E80] FOREIGN KEY([employeeid])
REFERENCES [dbo].[Employee] ([ID])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Authorities] CHECK CONSTRAINT [FK__Authoriti__emplo__59FA5E80]
GO
ALTER TABLE [dbo].[Authorities]  WITH CHECK ADD  CONSTRAINT [FK_Authorities_Role] FOREIGN KEY([roleid])
REFERENCES [dbo].[Role] ([id])
GO
ALTER TABLE [dbo].[Authorities] CHECK CONSTRAINT [FK_Authorities_Role]
GO
ALTER TABLE [dbo].[Booking]  WITH CHECK ADD FOREIGN KEY([Employeeid])
REFERENCES [dbo].[Employee] ([ID])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Booking]  WITH CHECK ADD  CONSTRAINT [FK_Booking_Employee] FOREIGN KEY([Employeeid])
REFERENCES [dbo].[Employee] ([ID])
GO
ALTER TABLE [dbo].[Booking] CHECK CONSTRAINT [FK_Booking_Employee]
GO
ALTER TABLE [dbo].[Booking]  WITH CHECK ADD  CONSTRAINT [FK_Booking_Guest] FOREIGN KEY([GuestID])
REFERENCES [dbo].[Guest] ([ID])
GO
ALTER TABLE [dbo].[Booking] CHECK CONSTRAINT [FK_Booking_Guest]
GO
ALTER TABLE [dbo].[Booking]  WITH CHECK ADD  CONSTRAINT [FK_Booking_Room] FOREIGN KEY([RoomID])
REFERENCES [dbo].[Room] ([ID])
GO
ALTER TABLE [dbo].[Booking] CHECK CONSTRAINT [FK_Booking_Room]
GO
ALTER TABLE [dbo].[Gallery]  WITH CHECK ADD FOREIGN KEY([roomtype])
REFERENCES [dbo].[RoomType] ([Type])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Invoice]  WITH CHECK ADD  CONSTRAINT [FK__Invoice__Booking__412EB0B6] FOREIGN KEY([BookingID])
REFERENCES [dbo].[Booking] ([ID])
GO
ALTER TABLE [dbo].[Invoice] CHECK CONSTRAINT [FK__Invoice__Booking__412EB0B6]
GO
ALTER TABLE [dbo].[Invoice]  WITH CHECK ADD FOREIGN KEY([GuestID])
REFERENCES [dbo].[Guest] ([ID])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Room]  WITH CHECK ADD  CONSTRAINT [FK__Room__Roomtype__3E52440B] FOREIGN KEY([Roomtype])
REFERENCES [dbo].[RoomType] ([Type])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Room] CHECK CONSTRAINT [FK__Room__Roomtype__3E52440B]
GO
USE [master]
GO
ALTER DATABASE [Hotel02] SET  READ_WRITE 
GO
