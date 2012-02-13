package br.com.levymoreira.util;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import br.com.levymoreira.bean.LoginBean;

@SuppressWarnings("serial")
public class LifeCycleListener implements PhaseListener {

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

    public void beforePhase(PhaseEvent event) {   
    	FacesContext faces = event.getFacesContext();
    	@SuppressWarnings("deprecation")
		LoginBean bean = (LoginBean) faces.getApplication().getVariableResolver().resolveVariable(faces, "loginBean"); 
    	if (bean.isLogged()){
        	System.out.println("logado!");
        }else{
        	System.out.println("nao logado!");
        	//como redirecionar para pagina de log
        	//NomeDoBeanNoFacesConfig bean = (NomeDoBeanNoFacesConfig) faces.getApplication().getVariableResolver().resolveVariable(faces, "nomeDoBeanNoFacesConfig");  
        }
       System.out.println("START PHASE " + event.getPhaseId());	
    }

    public void afterPhase(PhaseEvent event) {
        System.out.println("END PHASE " + event.getPhaseId());
    }

}
