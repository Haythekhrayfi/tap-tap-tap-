package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.pattern.FormatInfo;

/* JADX INFO: loaded from: classes.dex */
public class IntegerTokenConverter extends DynamicConverter<Object> implements MonoTypedConverter {
    public static final String CONVERTER_KEY = "i";

    public String convert(int i10) {
        String string = Integer.toString(i10);
        FormatInfo formattingInfo = getFormattingInfo();
        if (formattingInfo == null) {
            return string;
        }
        int min = formattingInfo.getMin();
        StringBuilder sb2 = new StringBuilder();
        for (int length = string.length(); length < min; length++) {
            sb2.append('0');
        }
        sb2.append(string);
        return sb2.toString();
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Null argument forbidden");
        }
        if (obj instanceof Integer) {
            return convert(((Integer) obj).intValue());
        }
        throw new IllegalArgumentException("Cannot convert " + obj + " of type" + obj.getClass().getName());
    }

    @Override // ch.qos.logback.core.rolling.helper.MonoTypedConverter
    public boolean isApplicable(Object obj) {
        return obj instanceof Integer;
    }
}
