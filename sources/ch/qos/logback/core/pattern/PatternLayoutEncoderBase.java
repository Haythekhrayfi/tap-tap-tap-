package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Layout;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import defpackage.a;

/* JADX INFO: loaded from: classes.dex */
public class PatternLayoutEncoderBase<E> extends LayoutWrappingEncoder<E> {
    public boolean outputPatternAsHeader = false;
    public String pattern;

    public String getPattern() {
        return this.pattern;
    }

    public boolean isOutputPatternAsHeader() {
        return this.outputPatternAsHeader;
    }

    public boolean isOutputPatternAsPresentationHeader() {
        return this.outputPatternAsHeader;
    }

    @Override // ch.qos.logback.core.encoder.LayoutWrappingEncoder
    public void setLayout(Layout<E> layout) {
        StringBuilder sbA = a.a("one cannot set the layout of ");
        sbA.append(getClass().getName());
        throw new UnsupportedOperationException(sbA.toString());
    }

    public void setOutputPatternAsHeader(boolean z10) {
        this.outputPatternAsHeader = z10;
    }

    public void setOutputPatternAsPresentationHeader(boolean z10) {
        addWarn("[outputPatternAsPresentationHeader] property is deprecated. Please use [outputPatternAsHeader] option instead.");
        this.outputPatternAsHeader = z10;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }
}
