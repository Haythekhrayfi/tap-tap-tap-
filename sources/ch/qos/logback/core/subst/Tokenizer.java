package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Tokenizer {
    public final String pattern;
    public final int patternLength;
    public b state = b.LITERAL_STATE;
    public int pointer = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3740a;

        static {
            int[] iArr = new int[b.values().length];
            f3740a = iArr;
            try {
                iArr[b.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3740a[b.START_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3740a[b.DEFAULT_VAL_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    public Tokenizer(String str) {
        this.pattern = str;
        this.patternLength = str.length();
    }

    private void addLiteralToken(List<Token> list, StringBuilder sb2) {
        if (sb2.length() == 0) {
            return;
        }
        list.add(new Token(Token.Type.LITERAL, sb2.toString()));
    }

    private void handleDefaultValueState(char c10, List<Token> list, StringBuilder sb2) {
        b bVar;
        Token token;
        if (c10 != '$') {
            if (c10 != '-') {
                sb2.append(CoreConstants.COLON_CHAR);
                if (c10 != '{') {
                    sb2.append(c10);
                } else {
                    addLiteralToken(list, sb2);
                    sb2.setLength(0);
                    token = Token.CURLY_LEFT_TOKEN;
                }
                bVar = b.LITERAL_STATE;
            } else {
                token = Token.DEFAULT_SEP_TOKEN;
            }
            list.add(token);
            bVar = b.LITERAL_STATE;
        } else {
            sb2.append(CoreConstants.COLON_CHAR);
            addLiteralToken(list, sb2);
            sb2.setLength(0);
            bVar = b.START_STATE;
        }
        this.state = bVar;
    }

    private void handleLiteralState(char c10, List<Token> list, StringBuilder sb2) {
        b bVar;
        Token token;
        if (c10 == '$') {
            addLiteralToken(list, sb2);
            sb2.setLength(0);
            bVar = b.START_STATE;
        } else {
            if (c10 != ':') {
                if (c10 == '{') {
                    addLiteralToken(list, sb2);
                    token = Token.CURLY_LEFT_TOKEN;
                } else if (c10 != '}') {
                    sb2.append(c10);
                    return;
                } else {
                    addLiteralToken(list, sb2);
                    token = Token.CURLY_RIGHT_TOKEN;
                }
                list.add(token);
                sb2.setLength(0);
                return;
            }
            addLiteralToken(list, sb2);
            sb2.setLength(0);
            bVar = b.DEFAULT_VAL_STATE;
        }
        this.state = bVar;
    }

    private void handleStartState(char c10, List<Token> list, StringBuilder sb2) {
        if (c10 == '{') {
            list.add(Token.START_TOKEN);
        } else {
            sb2.append(CoreConstants.DOLLAR);
            sb2.append(c10);
        }
        this.state = b.LITERAL_STATE;
    }

    public List<Token> tokenize() throws ScanException {
        char c10;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = this.pointer;
            if (i10 >= this.patternLength) {
                break;
            }
            char cCharAt = this.pattern.charAt(i10);
            this.pointer++;
            int i11 = a.f3740a[this.state.ordinal()];
            if (i11 == 1) {
                handleLiteralState(cCharAt, arrayList, sb2);
            } else if (i11 == 2) {
                handleStartState(cCharAt, arrayList, sb2);
            } else if (i11 == 3) {
                handleDefaultValueState(cCharAt, arrayList, sb2);
            }
        }
        int i12 = a.f3740a[this.state.ordinal()];
        if (i12 == 1) {
            addLiteralToken(arrayList, sb2);
        } else {
            if (i12 == 2) {
                c10 = CoreConstants.DOLLAR;
            } else if (i12 == 3) {
                c10 = CoreConstants.COLON_CHAR;
            }
            sb2.append(c10);
            addLiteralToken(arrayList, sb2);
        }
        return arrayList;
    }
}
