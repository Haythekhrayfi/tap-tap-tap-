package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;
import v2.b;

/* JADX INFO: loaded from: classes.dex */
public class OptionTokenizer {
    private static final int EXPECTING_STATE = 0;
    private static final int QUOTED_COLLECTING_STATE = 2;
    private static final int RAW_COLLECTING_STATE = 1;
    public final IEscapeUtil escapeUtil;
    public final String pattern;
    public final int patternLength;
    public char quoteChar;
    public int state;
    public final a tokenStream;

    public OptionTokenizer(a aVar) {
        this(aVar, new AsIsEscapeUtil());
    }

    public OptionTokenizer(a aVar, IEscapeUtil iEscapeUtil) {
        this.state = 0;
        this.tokenStream = aVar;
        this.pattern = aVar.f3710a;
        this.patternLength = aVar.f3711b;
        this.escapeUtil = iEscapeUtil;
    }

    public void emitOptionToken(List<b> list, List<String> list2) {
        list.add(new b(1006, list2));
        this.tokenStream.f3713d = a.b.LITERAL_STATE;
    }

    public void escape(String str, StringBuffer stringBuffer) {
        a aVar = this.tokenStream;
        int i10 = aVar.f3714e;
        if (i10 < this.patternLength) {
            String str2 = this.pattern;
            aVar.f3714e = i10 + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i10), this.tokenStream.f3714e);
        }
    }

    public void tokenize(char c10, List<b> list) throws ScanException {
        String strTrim;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (this.tokenStream.f3714e < this.patternLength) {
            int i10 = this.state;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        char c11 = this.quoteChar;
                        if (c10 == c11) {
                            strTrim = stringBuffer.toString();
                            arrayList.add(strTrim);
                            stringBuffer.setLength(0);
                            this.state = 0;
                        } else if (c10 == '\\') {
                            escape(String.valueOf(c11), stringBuffer);
                        } else {
                            stringBuffer.append(c10);
                        }
                    }
                } else if (c10 != ',') {
                    if (c10 == '}') {
                        arrayList.add(stringBuffer.toString().trim());
                        emitOptionToken(list, arrayList);
                        return;
                    }
                    stringBuffer.append(c10);
                } else {
                    strTrim = stringBuffer.toString().trim();
                    arrayList.add(strTrim);
                    stringBuffer.setLength(0);
                    this.state = 0;
                }
            } else if (c10 != '\t' && c10 != '\n' && c10 != '\r' && c10 != ' ') {
                if (c10 == '\"' || c10 == '\'') {
                    this.state = 2;
                    this.quoteChar = c10;
                } else if (c10 == ',') {
                    continue;
                } else if (c10 == '}') {
                    emitOptionToken(list, arrayList);
                    return;
                } else {
                    stringBuffer.append(c10);
                    this.state = 1;
                }
            }
            c10 = this.pattern.charAt(this.tokenStream.f3714e);
            this.tokenStream.f3714e++;
        }
        if (c10 != '}') {
            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
        }
        int i11 = this.state;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
            }
            arrayList.add(stringBuffer.toString().trim());
        }
        emitOptionToken(list, arrayList);
    }
}
