public class Gerente extends Usuario {
    private Professor professor;

    public Gerente(String email, String nome, String telefone, String senha, Professor professor) {
        super(email, nome, telefone, senha);
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
