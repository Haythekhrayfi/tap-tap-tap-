package ch.qos.logback.classic.joran.action;

import ch.qos.logback.core.joran.action.IncludeAction;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import defpackage.a;
import java.io.InputStream;
import java.net.URL;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class FindIncludeAction extends IncludeAction {
    private static final int EVENT_OFFSET = 1;

    public FindIncludeAction() {
        setEventOffset(1);
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
    }

    @Override // ch.qos.logback.core.joran.action.IncludeAction
    public SaxEventRecorder createRecorder(InputStream inputStream, URL url) {
        return new SaxEventRecorder(getContext());
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
        if (interpretationContext.isEmpty() || !(interpretationContext.peekObject() instanceof ConditionalIncludeAction.a)) {
            return;
        }
        URL url = ((ConditionalIncludeAction.a) interpretationContext.popObject()).f3683a;
        if (url == null) {
            addInfo("No paths found from includes");
            return;
        }
        StringBuilder sbA = a.a("Path found [");
        sbA.append(url.toString());
        sbA.append("]");
        addInfo(sbA.toString());
        try {
            processInclude(interpretationContext, url);
        } catch (JoranException e10) {
            StringBuilder sbA2 = a.a("Failed to process include [");
            sbA2.append(url.toString());
            sbA2.append("]");
            addError(sbA2.toString(), e10);
        }
    }
}
