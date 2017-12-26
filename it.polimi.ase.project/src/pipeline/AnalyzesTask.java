/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analyzes Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.AnalyzesTask#getAnalyzes <em>Analyzes</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getAnalyzesTask()
 * @model
 * @generated
 */
public interface AnalyzesTask extends Task {
	/**
	 * Returns the value of the '<em><b>Analyzes</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.AnalysisOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyzes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyzes</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getAnalyzesTask_Analyzes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AnalysisOp> getAnalyzes();

} // AnalyzesTask