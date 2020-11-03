CREATE PROCEDURE SP_Updatefornecedor_Endereco
	@FornecedorId INT,@Endereco varchar(100)
AS
UPDATE Fornecedor
SET Endereco = @Endereco
WHERE Id = @FornecedorId

EXEC SP_Updatefornecedor_Endereco 1,'Rua das dores, n:100'