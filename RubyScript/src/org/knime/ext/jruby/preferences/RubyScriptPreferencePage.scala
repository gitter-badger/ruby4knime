package org.knime.ext.jruby.preferences

import org.eclipse.jface.preference._
import org.eclipse.ui.IWorkbenchPreferencePage
import org.eclipse.ui.IWorkbench
import org.knime.ext.jruby.RubyScriptNodePlugin

class RubyScriptPreferencePage extends FieldEditorPreferencePage with IWorkbenchPreferencePage {

  setPreferenceStore(RubyScriptNodePlugin.getDefault.getPreferenceStore)

  setDescription("Ruby Scripting preferences")

  def createFieldEditors() {
    addField(new BooleanFieldEditor(PreferenceConstants.JRUBY_USE_EXTERNAL_GEMS, "&Use external jRuby gems", getFieldEditorParent))
    addField(new DirectoryFieldEditor(PreferenceConstants.JRUBY_PATH, "&Root path of external jRuby installation:", getFieldEditorParent))
  }

  def init(workbench: IWorkbench) {
  }

/*
Original Java:
package org.knime.ext.jruby.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.knime.ext.jruby.RubyScriptNodePlugin;

|**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 *|

public class RubyScriptPreferencePage extends FieldEditorPreferencePage
        implements IWorkbenchPreferencePage {

    public RubyScriptPreferencePage() {
        super(GRID);
        setPreferenceStore(RubyScriptNodePlugin.getDefault()
                .getPreferenceStore());
        setDescription("Ruby Scripting preferences");

    }

    |**
     * Creates the field editors. Field editors are abstractions of the common
     * GUI blocks needed to manipulate various types of preferences. Each field
     * editor knows how to save and restore itself.
     *|
    public final void createFieldEditors() {
        addField(new BooleanFieldEditor(
                PreferenceConstants.JRUBY_USE_EXTERNAL_GEMS,
                "&Use external jRuby gems", getFieldEditorParent()));

        addField(new DirectoryFieldEditor(PreferenceConstants.JRUBY_PATH,
                "&Root path of external jRuby installation:",
                getFieldEditorParent()));

    }

    |*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     *|
    public void init(final IWorkbench workbench) {
    }

}

*/
}