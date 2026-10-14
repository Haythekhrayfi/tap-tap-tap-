package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.CachingDateFormatter;
import ch.qos.logback.core.util.OptionHelper;
import defpackage.a;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class TimestampAction extends Action {
    public static String CONTEXT_BIRTH = "contextBirth";
    public static String DATE_PATTERN_ATTRIBUTE = "datePattern";
    public static String TIME_REFERENCE_ATTRIBUTE = "timeReference";
    public boolean inError = false;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        long jCurrentTimeMillis;
        String value = attributes.getValue(Action.KEY_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            addError("Attribute named [key] cannot be empty");
            this.inError = true;
        }
        String value2 = attributes.getValue(DATE_PATTERN_ATTRIBUTE);
        if (OptionHelper.isEmpty(value2)) {
            StringBuilder sbA = a.a("Attribute named [");
            sbA.append(DATE_PATTERN_ATTRIBUTE);
            sbA.append("] cannot be empty");
            addError(sbA.toString());
            this.inError = true;
        }
        if (CONTEXT_BIRTH.equalsIgnoreCase(attributes.getValue(TIME_REFERENCE_ATTRIBUTE))) {
            addInfo("Using context birth as time reference.");
            jCurrentTimeMillis = this.context.getBirthTime();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            addInfo("Using current interpretation time, i.e. now, as time reference.");
        }
        if (this.inError) {
            return;
        }
        ActionUtil.Scope scopeStringToScope = ActionUtil.stringToScope(attributes.getValue(Action.SCOPE_ATTRIBUTE));
        String str2 = new CachingDateFormatter(value2).format(jCurrentTimeMillis);
        StringBuilder sbA2 = q2.a.a("Adding property to the context with key=\"", value, "\" and value=\"", str2, "\" to the ");
        sbA2.append(scopeStringToScope);
        sbA2.append(" scope");
        addInfo(sbA2.toString());
        ActionUtil.setProperty(interpretationContext, value, str2, scopeStringToScope);
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
    }
}
