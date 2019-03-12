package fr.adaming.managedBeans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import fr.adaming.entities.Administrator;
import fr.adaming.service.IAdminService;

@ManagedBean(name = "adMB")
@RequestScoped

public class AdminManagedBean {

	// uml en java
	@EJB
	private IAdminService adService;

	private Administrator admin;

	// CONSTRUCTEUR VIDE
	public AdminManagedBean() {
		this.admin = new Administrator();
	}

	// getters & setters
	public Administrator getAdmin() {
		return admin;
	}

	public void setAdmin(Administrator admin) {
		this.admin = admin;
	}

	// methode métier
	public String connect() {
		Administrator adOut = adService.isExist(admin);

		if (adOut != null) {
			FacesContext.getCurrentInstance().getExternalContext().getSession(false);

			return "homeAdmin";
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Please enter correct Mail or Password"));
			return "login";
		}
	}

}
