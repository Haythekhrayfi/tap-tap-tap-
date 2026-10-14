package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.PropertyDefiner;
import ch.qos.logback.core.util.OptionHelper;
import defpackage.a;
import org.xml.sax.Attributes;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class DefinePropertyAction extends Action {
    public PropertyDefiner definer;
    public boolean inError;
    public String propertyName;
    public ActionUtil.Scope scope;
    public String scopeStr;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        StringBuilder sb2;
        String str2;
        this.scopeStr = null;
        this.scope = null;
        this.propertyName = null;
        this.definer = null;
        this.inError = false;
        this.propertyName = attributes.getValue("name");
        String value = attributes.getValue(Action.SCOPE_ATTRIBUTE);
        this.scopeStr = value;
        this.scope = ActionUtil.stringToScope(value);
        if (OptionHelper.isEmpty(this.propertyName)) {
            sb2 = new StringBuilder();
            str2 = "Missing property name for property definer. Near [";
        } else {
            String value2 = attributes.getValue(Action.CLASS_ATTRIBUTE);
            if (!OptionHelper.isEmpty(value2)) {
                try {
                    addInfo("About to instantiate property definer of type [" + value2 + "]");
                    PropertyDefiner propertyDefiner = (PropertyDefiner) OptionHelper.instantiateByClassName(value2, (Class<?>) PropertyDefiner.class, this.context);
                    this.definer = propertyDefiner;
                    propertyDefiner.setContext(this.context);
                    PropertyDefiner propertyDefiner2 = this.definer;
                    if (propertyDefiner2 instanceof LifeCycle) {
                        ((LifeCycle) propertyDefiner2).start();
                    }
                    interpretationContext.pushObject(this.definer);
                    return;
                } catch (Exception e10) {
                    this.inError = true;
                    addError("Could not create an PropertyDefiner of type [" + value2 + "].", e10);
                    throw new ActionException(e10);
                }
            }
            sb2 = new StringBuilder();
            str2 = "Missing class name for property definer. Near [";
        }
        e.a(sb2, str2, str, "] line ");
        sb2.append(getLineNumber(interpretationContext));
        addError(sb2.toString());
        this.inError = true;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.inError) {
            return;
        }
        if (interpretationContext.peekObject() != this.definer) {
            StringBuilder sbA = a.a("The object at the of the stack is not the property definer for property named [");
            sbA.append(this.propertyName);
            sbA.append("] pushed earlier.");
            addWarn(sbA.toString());
            return;
        }
        StringBuilder sbA2 = a.a("Popping property definer for property named [");
        sbA2.append(this.propertyName);
        sbA2.append("] from the object stack");
        addInfo(sbA2.toString());
        interpretationContext.popObject();
        String propertyValue = this.definer.getPropertyValue();
        if (propertyValue != null) {
            ActionUtil.setProperty(interpretationContext, this.propertyName, propertyValue, this.scope);
        }
    }
}
