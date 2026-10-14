package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.pattern.util.AlmostAsIsEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import com.developer.filepicker.model.DialogConfigs;
import defpackage.a;
import g6.c;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FileNamePattern extends ContextAwareBase {
    public static final Map<String, String> CONVERTER_MAP;
    public Converter<Object> headTokenConverter;
    public String pattern;

    static {
        HashMap map = new HashMap();
        CONVERTER_MAP = map;
        map.put(IntegerTokenConverter.CONVERTER_KEY, IntegerTokenConverter.class.getName());
        map.put("d", DateTokenConverter.class.getName());
    }

    public FileNamePattern(String str, Context context) {
        setPattern(FileFilterUtil.slashify(str));
        setContext(context);
        parse();
        ConverterUtil.startConverters(this.headTokenConverter);
    }

    public String convert(Object obj) {
        StringBuilder sb2 = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            sb2.append(next.convert(obj));
        }
        return sb2.toString();
    }

    public String convertInt(int i10) {
        return convert(Integer.valueOf(i10));
    }

    public String convertMultipleArguments(Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof MonoTypedConverter) {
                MonoTypedConverter monoTypedConverter = (MonoTypedConverter) next;
                for (Object obj : objArr) {
                    if (monoTypedConverter.isApplicable(obj)) {
                        sb2.append(next.convert(obj));
                    }
                }
            } else {
                sb2.append(next.convert(objArr));
            }
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.pattern;
        String str2 = ((FileNamePattern) obj).pattern;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public String escapeRightParantesis(String str) {
        return this.pattern.replace(")", "\\)");
    }

    public IntegerTokenConverter getIntegerTokenConverter() {
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof IntegerTokenConverter) {
                return (IntegerTokenConverter) next;
            }
        }
        return null;
    }

    public String getPattern() {
        return this.pattern;
    }

    public DateTokenConverter<Object> getPrimaryDateTokenConverter() {
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof DateTokenConverter) {
                DateTokenConverter<Object> dateTokenConverter = (DateTokenConverter) next;
                if (dateTokenConverter.isPrimary()) {
                    return dateTokenConverter;
                }
            }
        }
        return null;
    }

    public boolean hasIntegerTokenCOnverter() {
        return getIntegerTokenConverter() != null;
    }

    public int hashCode() {
        String str = this.pattern;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public void parse() {
        try {
            Parser parser = new Parser(escapeRightParantesis(this.pattern), new AlmostAsIsEscapeUtil());
            parser.setContext(this.context);
            this.headTokenConverter = parser.compile(parser.parse(), CONVERTER_MAP);
        } catch (ScanException e10) {
            StringBuilder sbA = a.a("Failed to parse pattern \"");
            sbA.append(this.pattern);
            sbA.append("\".");
            addError(sbA.toString(), e10);
        }
    }

    public void setPattern(String str) {
        if (str != null) {
            this.pattern = str.trim().replace("//", DialogConfigs.DIRECTORY_SEPERATOR);
        }
    }

    public String toRegex() {
        return toRegex(false, false);
    }

    public String toRegex(boolean z10, boolean z11) {
        String regex;
        String strD;
        StringBuilder sb2 = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof LiteralConverter) {
                strD = next.convert(null);
            } else {
                if (next instanceof IntegerTokenConverter) {
                    regex = z11 ? "(\\d+)" : "\\d+";
                } else {
                    if (next instanceof DateTokenConverter) {
                        DateTokenConverter dateTokenConverter = (DateTokenConverter) next;
                        if (z10 && dateTokenConverter.isPrimary()) {
                            StringBuilder sbA = a.a("(");
                            sbA.append(dateTokenConverter.toRegex());
                            sbA.append(")");
                            regex = sbA.toString();
                        } else {
                            regex = dateTokenConverter.toRegex();
                        }
                    }
                }
                strD = c.d(regex);
            }
            sb2.append(strD);
        }
        return sb2.toString();
    }

    public String toRegexForFixedDate(Date date) {
        String regex;
        String strConvert;
        StringBuilder sb2 = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof LiteralConverter) {
                strConvert = next.convert(null);
            } else {
                if (next instanceof IntegerTokenConverter) {
                    regex = "(\\d+)";
                } else {
                    if (next instanceof DateTokenConverter) {
                        DateTokenConverter dateTokenConverter = (DateTokenConverter) next;
                        if (dateTokenConverter.isPrimary()) {
                            strConvert = next.convert(date);
                        } else {
                            regex = dateTokenConverter.toRegex();
                        }
                    }
                }
                strConvert = c.d(regex);
            }
            sb2.append(strConvert);
        }
        return sb2.toString();
    }

    public String toString() {
        return this.pattern;
    }
}
