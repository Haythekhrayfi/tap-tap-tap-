package ch.qos.logback.core.joran.event;

import ch.qos.logback.core.joran.spi.ElementPath;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public class StartEvent extends SaxEvent {
    public final Attributes attributes;
    public final ElementPath elementPath;

    public StartEvent(ElementPath elementPath, String str, String str2, String str3, Attributes attributes, Locator locator) {
        super(str, str2, str3, locator);
        this.attributes = new AttributesImpl(attributes);
        this.elementPath = elementPath;
    }

    public Attributes getAttributes() {
        return this.attributes;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StartEvent(");
        sb2.append(getQName());
        if (this.attributes != null) {
            for (int i10 = 0; i10 < this.attributes.getLength(); i10++) {
                if (i10 > 0) {
                    sb2.append(' ');
                }
                sb2.append(this.attributes.getLocalName(i10));
                sb2.append("=\"");
                sb2.append(this.attributes.getValue(i10));
                sb2.append("\"");
            }
        }
        sb2.append(")  [");
        sb2.append(this.locator.getLineNumber());
        sb2.append(",");
        sb2.append(this.locator.getColumnNumber());
        sb2.append("]");
        return sb2.toString();
    }
}
