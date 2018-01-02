/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.PredefinedCleaningOperationCreateCommand;
import pipeline.diagram.edit.commands.UserDefinedCleaningOperationCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class CleaningTaskCleaningTaskCleaningOperationsCompartmentItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CleaningTaskCleaningTaskCleaningOperationsCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.CleaningTask_2027);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.UserDefinedCleaningOperation_3063 == req.getElementType()) {
			return getGEFWrapper(new UserDefinedCleaningOperationCreateCommand(req));
		}
		if (PipelineElementTypes.PredefinedCleaningOperation_3064 == req.getElementType()) {
			return getGEFWrapper(new PredefinedCleaningOperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
