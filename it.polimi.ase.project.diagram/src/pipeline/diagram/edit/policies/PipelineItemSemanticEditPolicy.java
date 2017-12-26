/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import pipeline.diagram.edit.commands.AnalyzesTaskCreateCommand;
import pipeline.diagram.edit.commands.CleaningTaskCreateCommand;
import pipeline.diagram.edit.commands.CollectionTaskCreateCommand;
import pipeline.diagram.edit.commands.ExportingTaskCreateCommand;
import pipeline.diagram.edit.commands.IntegrationTaskCreateCommand;
import pipeline.diagram.edit.commands.VisualizationTaskCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class PipelineItemSemanticEditPolicy extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PipelineItemSemanticEditPolicy() {
		super(PipelineElementTypes.Pipeline_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.CollectionTask_2025 == req.getElementType()) {
			return getGEFWrapper(new CollectionTaskCreateCommand(req));
		}
		if (PipelineElementTypes.IntegrationTask_2026 == req.getElementType()) {
			return getGEFWrapper(new IntegrationTaskCreateCommand(req));
		}
		if (PipelineElementTypes.CleaningTask_2027 == req.getElementType()) {
			return getGEFWrapper(new CleaningTaskCreateCommand(req));
		}
		if (PipelineElementTypes.AnalyzesTask_2028 == req.getElementType()) {
			return getGEFWrapper(new AnalyzesTaskCreateCommand(req));
		}
		if (PipelineElementTypes.VisualizationTask_2029 == req.getElementType()) {
			return getGEFWrapper(new VisualizationTaskCreateCommand(req));
		}
		if (PipelineElementTypes.ExportingTask_2030 == req.getElementType()) {
			return getGEFWrapper(new ExportingTaskCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}