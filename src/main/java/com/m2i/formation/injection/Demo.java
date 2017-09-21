package com.m2i.formation.injection;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	private static final Logger l = Logger.getLogger(Demo.class);

	public void creatScrumTeam() {
		ScrumTeam scrumTeam = null;
		try {
			l.info("Debut de l'application");
			// Chargement du Conteneur Spring
			ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("tp3-beans.xml");
			// Récupération du Bean ScrumTeam
			scrumTeam = (ScrumTeam) appContext.getBean("scrumTeam");
			l.info("developper : " + scrumTeam.getDevelopper().getFirstName());
			l.info("scrumMaster : " + scrumTeam.getScrumMaster().getFirstName());
			l.info("productOwner : " + scrumTeam.getProductOwner().getFirstName());
			// l.info("Fin de l'application");
		} catch (Exception e) {
			l.error("Exception dans la methode creatScrumTeam : " + e);
		} finally {
			l.info("Fin de l'application");
		}
	}
}
