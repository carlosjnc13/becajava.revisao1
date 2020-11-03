CREATE PROCEDURE SP_UpdateCliente
	@ClienteId INT, @Cpf varchar(50),@Nome varchar(50),@Endereco varchar(100)
AS
UPDATE Cliente
SET Nome = @Nome, CPF = @Cpf,Endereço = @Endereco
WHERE Id = @ClienteId


EXEC SP_UpdateCliente 2,'12342234','Julio','Av. Brasil n:150'

