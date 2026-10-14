package ch.qos.logback.core.joran.event;

import androidx.activity.k;
import defpackage.a;
import org.xml.sax.Locator;

/* JADX INFO: loaded from: classes.dex */
public class BodyEvent extends SaxEvent {
    private String text;

    public BodyEvent(String str, Locator locator) {
        super(null, null, null, locator);
        this.text = str;
    }

    public void append(String str) {
        this.text = k.a(new StringBuilder(), this.text, str);
    }

    public String getText() {
        String str = this.text;
        return str != null ? str.trim() : str;
    }

    public String toString() {
        StringBuilder sbA = a.a("BodyEvent(");
        sbA.append(getText());
        sbA.append(")");
        sbA.append(this.locator.getLineNumber());
        sbA.append(",");
        sbA.append(this.locator.getColumnNumber());
        return sbA.toString();
    }
}
