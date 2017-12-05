package fr.imta.clementdamien.dsl.selenium.generator

import com.google.inject.Inject
import fr.imta.clementdamien.dsl.selenium.mySelenium.Projection

class ProjectionGenerator {
	
	@Inject extension SelectorGenerator;

	def compile(Projection projection) {
		if (projection.getProjectionAction() == "html") {
			return '''«projection.selector.compile»'''
		} 
		return '''«projection.selector.compile».getAttribute("«projection.projectionAction»")'''
	}
}
