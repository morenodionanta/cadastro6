/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro6.entidade;

class Disciplina {
    private String nome;
    private int semestre;
    private String horario;
    
    public Disciplina() {
        // Construtor vazio
    }

	public Disciplina(String nome, int semestre, String horario) {
		this.nome = nome;
		this.semestre = semestre;
		this.horario = horario;
	}
    
    // Getters e setters aqui

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
    
}
 {
	
}
