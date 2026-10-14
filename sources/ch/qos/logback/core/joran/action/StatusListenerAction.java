package ch.qos.logback.core.joran.action;

import androidx.activity.result.c;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class StatusListenerAction extends Action {
    public boolean inError = false;
    public Boolean effectivelyAdded = null;
    public StatusListener statusListener = null;

    private boolean isEffectivelyAdded() {
        Boolean bool = this.effectivelyAdded;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        this.inError = false;
        this.effectivelyAdded = null;
        String value = attributes.getValue(Action.CLASS_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            StringBuilder sbA = c.a("Missing class name for statusListener. Near [", str, "] line ");
            sbA.append(getLineNumber(interpretationContext));
            addError(sbA.toString());
            this.inError = true;
            return;
        }
        try {
            this.statusListener = (StatusListener) OptionHelper.instantiateByClassName(value, (Class<?>) StatusListener.class, this.context);
            this.effectivelyAdded = Boolean.valueOf(interpretationContext.getContext().getStatusManager().add(this.statusListener));
            StatusListener statusListener = this.statusListener;
            if (statusListener instanceof ContextAware) {
                ((ContextAware) statusListener).setContext(this.context);
            }
            addInfo("Added status listener of type [" + value + "]");
            interpretationContext.pushObject(this.statusListener);
        } catch (Exception e10) {
            this.inError = true;
            addError("Could not create an StatusListener of type [" + value + "].", e10);
            throw new ActionException(e10);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.inError) {
            return;
        }
        if (isEffectivelyAdded()) {
            StatusListener statusListener = this.statusListener;
            if (statusListener instanceof LifeCycle) {
                ((LifeCycle) statusListener).start();
            }
        }
        if (interpretationContext.peekObject() != this.statusListener) {
            addWarn("The object at the of the stack is not the statusListener pushed earlier.");
        } else {
            interpretationContext.popObject();
        }
    }

    public void finish(InterpretationContext interpretationContext) {
    }
}
