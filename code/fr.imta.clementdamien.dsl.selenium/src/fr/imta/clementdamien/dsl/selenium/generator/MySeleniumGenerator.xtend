package fr.imta.clementdamien.dsl.selenium.generator

import com.google.inject.Inject
import fr.imta.clementdamien.dsl.selenium.mySelenium.Program
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MySeleniumGenerator extends AbstractGenerator {
	
	 @Inject extension IQualifiedNameProvider;
     @Inject extension ProgramGenerator;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.contents.filter(Program)) {
            fsa.generateFile("Test.java", e.compileProgram)
        }
	}
}
