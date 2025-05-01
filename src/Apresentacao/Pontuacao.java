//APS - Fernando / Luis / Isabela / Samuel
package Apresentacao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "pontuacao", catalog = "apscc", schema = "dbo")
@NamedQueries(
{
    @NamedQuery(name = "Pontuacao.findAll", query = "SELECT p FROM Pontuacao p"),
    @NamedQuery(name = "Pontuacao.findByIdPontuacao", query = "SELECT p FROM Pontuacao p WHERE p.idPontuacao = :idPontuacao"),
    @NamedQuery(name = "Pontuacao.findByNome", query = "SELECT p FROM Pontuacao p WHERE p.nome = :nome"),
    @NamedQuery(name = "Pontuacao.findByPontuacao", query = "SELECT p FROM Pontuacao p WHERE p.pontuacao = :pontuacao")
})
public class Pontuacao implements Serializable
{

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPontuacao")
    private Integer idPontuacao;
    @Column(name = "nome")
    private String nome;
    @Column(name = "pontuacao")
    private String pontuacao;

    public Pontuacao()
    {
    }

    public Pontuacao(Integer idPontuacao)
    {
        this.idPontuacao = idPontuacao;
    }

    public Integer getIdPontuacao()
    {
        return idPontuacao;
    }

    public void setIdPontuacao(Integer idPontuacao)
    {
        Integer oldIdPontuacao = this.idPontuacao;
        this.idPontuacao = idPontuacao;
        changeSupport.firePropertyChange("idPontuacao", oldIdPontuacao, idPontuacao);
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getPontuacao()
    {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao)
    {
        String oldPontuacao = this.pontuacao;
        this.pontuacao = pontuacao;
        changeSupport.firePropertyChange("pontuacao", oldPontuacao, pontuacao);
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idPontuacao != null ? idPontuacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pontuacao))
        {
            return false;
        }
        Pontuacao other = (Pontuacao) object;
        if ((this.idPontuacao == null && other.idPontuacao != null) || (this.idPontuacao != null && !this.idPontuacao.equals(other.idPontuacao)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Apresentacao.Pontuacao[ idPontuacao=" + idPontuacao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
