package dev.douglinhas.CadastroDeTimes;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro_de_times")
public class TimeModel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
   private String divisão;
   private String estado;
   private int fundação;

   public TimeModel() {
   }

    public TimeModel(String nome, String divisão, String estado, int fundação) {
        this.nome = nome;
        this.divisão = divisão;
        this.estado = estado;
        this.fundação = fundação;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDivisão() {
        return divisão;
    }

    public void setDivisão(String divisão) {
        this.divisão = divisão;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFundação() {
        return fundação;
    }

    public void setFundação(int fundação) {
        this.fundação = fundação;
    }
}
