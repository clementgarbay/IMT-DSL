package fr.imta.clementdamien.dsl.selenium.generator


import fr.imta.clementdamien.dsl.selenium.generator.*;
import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import com.google.inject.Inject


class ProjectionGenerator {
	
	@Inject extension SelectorGenerator;

	def compile(Projection projection) 
		'''«projection.selector.compile».getAttribute("«projection.projectionAction»")'''
		
}