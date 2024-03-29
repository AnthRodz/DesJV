USE [master]
GO
/****** Object:  Database [biblioteca]    Script Date: 07/20/2023 12:10:52 a. m. ******/
CREATE DATABASE [biblioteca]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'biblioteca', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\biblioteca.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'biblioteca_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\biblioteca_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [biblioteca] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [biblioteca].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [biblioteca] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [biblioteca] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [biblioteca] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [biblioteca] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [biblioteca] SET ARITHABORT OFF 
GO
ALTER DATABASE [biblioteca] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [biblioteca] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [biblioteca] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [biblioteca] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [biblioteca] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [biblioteca] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [biblioteca] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [biblioteca] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [biblioteca] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [biblioteca] SET  DISABLE_BROKER 
GO
ALTER DATABASE [biblioteca] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [biblioteca] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [biblioteca] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [biblioteca] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [biblioteca] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [biblioteca] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [biblioteca] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [biblioteca] SET RECOVERY FULL 
GO
ALTER DATABASE [biblioteca] SET  MULTI_USER 
GO
ALTER DATABASE [biblioteca] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [biblioteca] SET DB_CHAINING OFF 
GO
ALTER DATABASE [biblioteca] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [biblioteca] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [biblioteca] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [biblioteca] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'biblioteca', N'ON'
GO
ALTER DATABASE [biblioteca] SET QUERY_STORE = ON
GO
ALTER DATABASE [biblioteca] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [biblioteca]
GO
/****** Object:  Schema [sistemabiblioteca]    Script Date: 07/20/2023 12:10:53 a. m. ******/
CREATE SCHEMA [sistemabiblioteca]
GO
/****** Object:  Table [sistemabiblioteca].[autores]    Script Date: 07/20/2023 12:10:53 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [sistemabiblioteca].[autores](
	[idAutor] [int] IDENTITY(5,1) NOT NULL,
	[nombreAutor] [nvarchar](45) NOT NULL,
 CONSTRAINT [PK_autores_idAutor] PRIMARY KEY CLUSTERED 
(
	[idAutor] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [sistemabiblioteca].[generos]    Script Date: 07/20/2023 12:10:54 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [sistemabiblioteca].[generos](
	[idGenero] [int] IDENTITY(3,1) NOT NULL,
	[nombreGenero] [nvarchar](45) NOT NULL,
 CONSTRAINT [PK_generos_idGenero] PRIMARY KEY CLUSTERED 
(
	[idGenero] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [sistemabiblioteca].[libros]    Script Date: 07/20/2023 12:10:54 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [sistemabiblioteca].[libros](
	[idLibro] [int] IDENTITY(6,1) NOT NULL,
	[titulo] [nvarchar](45) NOT NULL,
	[idAutor] [int] NOT NULL,
	[idGenero] [int] NOT NULL,
	[ISBN] [nvarchar](45) NOT NULL,
	[fechaPublicacion] [date] NOT NULL,
	[editorial] [nvarchar](45) NOT NULL,
	[disponibilidad] [nvarchar](45) NOT NULL,
 CONSTRAINT [PK_libros_idLibro] PRIMARY KEY CLUSTERED 
(
	[idLibro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [sistemabiblioteca].[prestamos]    Script Date: 07/20/2023 12:10:54 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [sistemabiblioteca].[prestamos](
	[idprestamo] [int] IDENTITY(9,1) NOT NULL,
	[idLibro] [int] NOT NULL,
	[idUsuario] [int] NOT NULL,
	[fechaPrestamo] [date] NOT NULL,
	[fechaDevolucion] [date] NOT NULL,
	[estadoDeDevolucion] [smallint] NOT NULL,
 CONSTRAINT [PK_prestamos_idprestamo] PRIMARY KEY CLUSTERED 
(
	[idprestamo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [sistemabiblioteca].[usuario]    Script Date: 07/20/2023 12:10:54 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [sistemabiblioteca].[usuario](
	[idUsuario] [int] IDENTITY(5,1) NOT NULL,
	[nombre] [nvarchar](45) NOT NULL,
	[apellido] [nvarchar](45) NOT NULL,
	[direccion] [nvarchar](75) NOT NULL,
	[telefono] [nvarchar](45) NOT NULL,
	[correoElectronico] [nvarchar](45) NOT NULL,
	[contrasena] [nvarchar](45) NOT NULL,
 CONSTRAINT [PK_usuario_idUsuario] PRIMARY KEY CLUSTERED 
(
	[idUsuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Index [idAutor_idx]    Script Date: 07/20/2023 12:10:54 a. m. ******/
CREATE NONCLUSTERED INDEX [idAutor_idx] ON [sistemabiblioteca].[libros]
(
	[idAutor] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [idGenero_idx]    Script Date: 07/20/2023 12:10:54 a. m. ******/
CREATE NONCLUSTERED INDEX [idGenero_idx] ON [sistemabiblioteca].[libros]
(
	[idGenero] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [idLibro_idx]    Script Date: 07/20/2023 12:10:54 a. m. ******/
CREATE NONCLUSTERED INDEX [idLibro_idx] ON [sistemabiblioteca].[prestamos]
(
	[idLibro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [idUsuario_idx]    Script Date: 07/20/2023 12:10:54 a. m. ******/
CREATE NONCLUSTERED INDEX [idUsuario_idx] ON [sistemabiblioteca].[prestamos]
(
	[idUsuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [sistemabiblioteca].[libros]  WITH CHECK ADD  CONSTRAINT [libros$idAutor] FOREIGN KEY([idAutor])
REFERENCES [sistemabiblioteca].[autores] ([idAutor])
GO
ALTER TABLE [sistemabiblioteca].[libros] CHECK CONSTRAINT [libros$idAutor]
GO
ALTER TABLE [sistemabiblioteca].[libros]  WITH CHECK ADD  CONSTRAINT [libros$idGenero] FOREIGN KEY([idGenero])
REFERENCES [sistemabiblioteca].[generos] ([idGenero])
GO
ALTER TABLE [sistemabiblioteca].[libros] CHECK CONSTRAINT [libros$idGenero]
GO
ALTER TABLE [sistemabiblioteca].[prestamos]  WITH CHECK ADD  CONSTRAINT [prestamos$idLibro] FOREIGN KEY([idLibro])
REFERENCES [sistemabiblioteca].[libros] ([idLibro])
GO
ALTER TABLE [sistemabiblioteca].[prestamos] CHECK CONSTRAINT [prestamos$idLibro]
GO
ALTER TABLE [sistemabiblioteca].[prestamos]  WITH CHECK ADD  CONSTRAINT [prestamos$idUsuario] FOREIGN KEY([idUsuario])
REFERENCES [sistemabiblioteca].[usuario] ([idUsuario])
GO
ALTER TABLE [sistemabiblioteca].[prestamos] CHECK CONSTRAINT [prestamos$idUsuario]
GO
EXEC sys.sp_addextendedproperty @name=N'MS_SSMA_SOURCE', @value=N'sistemabiblioteca.autores' , @level0type=N'SCHEMA',@level0name=N'sistemabiblioteca', @level1type=N'TABLE',@level1name=N'autores'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_SSMA_SOURCE', @value=N'sistemabiblioteca.generos' , @level0type=N'SCHEMA',@level0name=N'sistemabiblioteca', @level1type=N'TABLE',@level1name=N'generos'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_SSMA_SOURCE', @value=N'sistemabiblioteca.libros' , @level0type=N'SCHEMA',@level0name=N'sistemabiblioteca', @level1type=N'TABLE',@level1name=N'libros'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_SSMA_SOURCE', @value=N'sistemabiblioteca.prestamos' , @level0type=N'SCHEMA',@level0name=N'sistemabiblioteca', @level1type=N'TABLE',@level1name=N'prestamos'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_SSMA_SOURCE', @value=N'sistemabiblioteca.usuario' , @level0type=N'SCHEMA',@level0name=N'sistemabiblioteca', @level1type=N'TABLE',@level1name=N'usuario'
GO
USE [master]
GO
ALTER DATABASE [biblioteca] SET  READ_WRITE 
GO
