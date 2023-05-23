public class ConEntrata implements Cloneable{
    private String nome;
    private String cognome;
    private char sesso;
    private int eta;
    public ConEntrata(String nome, String cognome, char sesso, int eta){
        setNome(nome);
        setCognome(cognome);
        this.sesso = sesso; 
        this.eta = eta;
    }
    public ConEntrata clone() {
        try {
            return (ConEntrata) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    public void setNome(String nome){ this.nome = nome; }
    public void setCognome(String cognome){ this.cognome = cognome; }
    public String getNome(){ return nome; }
    public String getCognome(){ return cognome; }
    public char getSesso(){ return sesso; } 
    public int getEta(){ return eta; }
}