package org.knime.ext.jruby

import org.knime.core.node.NodeDialogPane
import org.knime.core.node.NodeFactory
import org.knime.core.node.NodeView
import org.knime.ext.jruby.RubyScriptNodeModel._

/**
 * <code>NodeFactory</code> for the "RubyScript" Node.
 * 
 * @author rss
 *
 */
class RubyScriptNodeFactory extends NodeFactory[RubyScriptNodeModel] {

  private var model: RubyScriptNodeModel = _

  private var dialog: RubyScriptNodeDialog = _

  protected def setModel(inModel: RubyScriptNodeModel): RubyScriptNodeModel = {
    model = inModel
    model
  }

  def getModel(): RubyScriptNodeModel = model

  def getDialog(): RubyScriptNodeDialog = dialog

  /* (non-Javadoc)
   * @see org.knime.core.node.NodeFactory#createNodeModel()
   */
  override def createNodeModel(): RubyScriptNodeModel = {
    setModel(new RubyScriptNodeModel(1, 1, false))
  }

  /* (non-Javadoc)
   * @see org.knime.core.node.NodeFactory#getNrNodeViews()
   */
  override def getNrNodeViews(): Int = 0

  /* (non-Javadoc)
   * @see org.knime.core.node.NodeFactory#createNodeView()
   */
  override def createNodeView(viewIndex: Int,
    nodeModel: RubyScriptNodeModel): NodeView[RubyScriptNodeModel] = null

  /* (non-Javadoc)
   * @see org.knime.core.node.NodeFactory#hasDialog()
   */
  override def hasDialog(): Boolean = true

  /* (non-Javadoc)
   * @see org.knime.core.node.NodeFactory#createNodeDialogPane()
   */
  override def createNodeDialogPane(): NodeDialogPane = {
    dialog = new RubyScriptNodeDialog(this)
    dialog
  }

/*
Original Java:
|**
 * <code>NodeFactory</code> for the "RubyScript" Node.
 * 
 * 
 * @author rss
 *|
package org.knime.ext.jruby;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

public class RubyScriptNodeFactory extends NodeFactory<RubyScriptNodeModel> {

    private RubyScriptNodeModel m_model;
    private RubyScriptNodeDialog m_dialog;

    protected RubyScriptNodeModel setModel(RubyScriptNodeModel model) {
        m_model = model;
        return model;
    }
    
    public RubyScriptNodeModel getModel() {
        return m_model;
    }

    public RubyScriptNodeDialog getDialog() {
        return m_dialog;
    }
    
    |**
     * {@inheritDoc}
     *|
    @Override
    public RubyScriptNodeModel createNodeModel() {
        return setModel(new RubyScriptNodeModel(1, 1, false)); 
    }

    |**
     * {@inheritDoc}
     *|
    @Override
    public final int getNrNodeViews() {
        return 0;
    }

    |**
     * {@inheritDoc}
     *|
    @Override
    public final NodeView<RubyScriptNodeModel> createNodeView(final int viewIndex,
            final RubyScriptNodeModel nodeModel) {
        //return new RubyScriptNodeView(nodeModel);
        return null;
    }

    |**
     * {@inheritDoc}
     *|
    @Override
    public final boolean hasDialog() {
        return true;
    }

    |**
     * {@inheritDoc}
     *|
    @Override
    public final NodeDialogPane createNodeDialogPane() {
        m_dialog = new RubyScriptNodeDialog(this); 
        return m_dialog;
    }
}

*/
}