package entidad;

public class Ent_Dir {
	public String calle;
	public int nroCalle;
	public String codPos;
	public String entreCalleIzq;
	public String entreCalleDer;
	public String departamento;
	public int deptoPiso;

    /* Definición de Getters y Setters */	
    public String getCalle(){
    	return calle;
    };
    public void setCalle(String unaCalle){
    	calle=unaCalle;
    };

    public int getCalleNro(){
    	return nroCalle;
    };
    public void setCalleNro(int unNroDeCalle){
    	nroCalle = unNroDeCalle;
    };
    
    public String getCodPostal(){
    	return codPos;
    };
    public void setCodPostal(String unCodPostal){
    	codPos = unCodPostal;
    };    

    public String getEntreCalleIzq(){
    	return entreCalleIzq;
    };
    public void setEntreCalleIzq(String unaCalle){
    	entreCalleIzq = unaCalle;
    };

    public String getEntreCalleDer(){
    	return entreCalleDer;
    };
    public void setEntreCalleDer(String unaCalle){
    	entreCalleDer = unaCalle;
    };

    public String getDepto(){
    	return departamento;
    };
    public void setDepto(String unDepto){
    	departamento = unDepto;
    };

    public int getDeptoPiso(){
    	return deptoPiso;
    };
    public void setDeptoPiso(int unNroDePiso){
    	deptoPiso = unNroDePiso;
    };
}