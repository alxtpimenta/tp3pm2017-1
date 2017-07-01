/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author alex
 */
public class CadastroFuncionario extends Cadastro 
{
    private final String _nome;
    private final String _especialidade;
    private final String _email;
    private final int _telefone;
    
    public CadastroFuncionario(String nome, String especialidade, String email, int telefone)
    {
        this._especialidade = especialidade;
        this._nome = nome;
        this._telefone = telefone;
        this._email = email;
    }
    
    public String getNome()
    {
        return this._nome;
    }
    
    public String getEspecialidade()
    {
        return this._especialidade;
    }
    
    public int getTelefone()
    {
        return this._telefone;
    }
    
    public String getEmail()
    {
        return this._email;
    }
}
