package ch.qos.logback.core.pattern;

import defpackage.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class CompositeConverter<E> extends DynamicConverter<E> {
    public Converter<E> childConverter;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(E e10) {
        StringBuilder sb2 = new StringBuilder();
        for (Converter<E> converter = this.childConverter; converter != null; converter = converter.next) {
            converter.write(sb2, e10);
        }
        return transform(e10, sb2.toString());
    }

    public Converter<E> getChildConverter() {
        return this.childConverter;
    }

    public void setChildConverter(Converter<E> converter) {
        this.childConverter = converter;
    }

    public String toString() {
        StringBuilder sbA = a.a("CompositeConverter<");
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo != null) {
            sbA.append(formatInfo);
        }
        if (this.childConverter != null) {
            sbA.append(", children: ");
            sbA.append(this.childConverter);
        }
        sbA.append(">");
        return sbA.toString();
    }

    public abstract String transform(E e10, String str);
}
