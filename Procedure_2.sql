CREATE PROCEDURE SP_InserirProduto

AS
INSERT INTO Produto
(Nome,TipoProduto,Valor)
VALUES
('LacosteAdventure','Camiseta',19.90)

EXEC SP_InserirProduto

SELECT * FROM Produto