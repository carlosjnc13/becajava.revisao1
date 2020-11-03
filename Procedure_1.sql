CREATE PROCEDURE SP_deletarProduto
	@id INT
AS
DELETE  FROM Produto WHERE Id = @id

EXEC SP_deletarProduto 2

SELECT * FROM Produto

