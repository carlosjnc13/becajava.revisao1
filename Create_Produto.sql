USE [Loja]
GO

/****** Object:  Table [dbo].[Produto]    Script Date: 31/10/2020 14:24:34 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Produto](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Nome] [varchar](50) NOT NULL,
	[TipoProduto] [varchar](50) NOT NULL,
	[Valor] [numeric](9, 2) NOT NULL,
	[PedidoId] [int] NULL,
	[EstoqueId] [int] NULL,
 CONSTRAINT [PK_Produto] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Produto]  WITH CHECK ADD  CONSTRAINT [FK_Produto_Estoque] FOREIGN KEY([EstoqueId])
REFERENCES [dbo].[Estoque] ([Id])
GO

ALTER TABLE [dbo].[Produto] CHECK CONSTRAINT [FK_Produto_Estoque]
GO

ALTER TABLE [dbo].[Produto]  WITH CHECK ADD  CONSTRAINT [FK_Produto_Pedido] FOREIGN KEY([PedidoId])
REFERENCES [dbo].[Pedido] ([Id])
GO

ALTER TABLE [dbo].[Produto] CHECK CONSTRAINT [FK_Produto_Pedido]
GO


