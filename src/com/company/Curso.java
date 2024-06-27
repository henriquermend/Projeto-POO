import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String nome;
    private String descricao;
    private String tempo;
    private int quantidadeDeAlunos;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Curso(String id, String nome, String descricao, String tempo, int quantidadeDeAlunos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tempo = tempo;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.alunos = new ArrayList<Aluno>();
        this.professores = new ArrayList<Professor>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }
}
