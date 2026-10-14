package ch.qos.logback.core.joran.event;

import defpackage.a;
import org.xml.sax.Locator;

/* JADX INFO: loaded from: classes.dex */
public class EndEvent extends SaxEvent {
    public EndEvent(String str, String str2, String str3, Locator locator) {
        super(str, str2, str3, locator);
    }

    public String toString() {
        StringBuilder sbA = a.a("  EndEvent(");
        sbA.append(getQName());
        sbA.append(")  [");
        sbA.append(this.locator.getLineNumber());
        sbA.append(",");
        sbA.append(this.locator.getColumnNumber());
        sbA.append("]");
        return sbA.toString();
    }
}
