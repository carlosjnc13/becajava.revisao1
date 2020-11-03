CREATE PROCEDURE SP_InserirProdutos_Estoque
 @Qtd INT, @ProdutoId INT

 AS
 INSERT INTO Estoque
 (QntProduto,ProdutoId)
 VALUES
 (@Qtd,@ProdutoId)

 EXEC SP_InserirProdutos_Estoque 345, 3

 SELECT*FROM Estoque