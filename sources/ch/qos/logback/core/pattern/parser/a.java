package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RestrictedEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IEscapeUtil f3712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f3713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3714e;

    /* JADX INFO: renamed from: ch.qos.logback.core.pattern.parser.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0068a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3715a;

        static {
            int[] iArr = new int[b.values().length];
            f3715a = iArr;
            try {
                iArr[b.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3715a[b.FORMAT_MODIFIER_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3715a[b.OPTION_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3715a[b.KEYWORD_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3715a[b.RIGHT_PARENTHESIS_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        LITERAL_STATE,
        FORMAT_MODIFIER_STATE,
        KEYWORD_STATE,
        OPTION_STATE,
        RIGHT_PARENTHESIS_STATE
    }

    public a(String str, IEscapeUtil iEscapeUtil) {
        new RestrictedEscapeUtil();
        this.f3713d = b.LITERAL_STATE;
        this.f3714e = 0;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
        this.f3710a = str;
        this.f3711b = str.length();
        this.f3712c = iEscapeUtil;
    }

    public final void a(int i10, StringBuffer stringBuffer, List<v2.b> list) {
        if (stringBuffer.length() > 0) {
            list.add(new v2.b(i10, stringBuffer.toString()));
            stringBuffer.setLength(0);
        }
    }

    public void b(String str, StringBuffer stringBuffer) {
        int i10 = this.f3714e;
        if (i10 < this.f3711b) {
            String str2 = this.f3710a;
            this.f3714e = i10 + 1;
            this.f3712c.escape(str, stringBuffer, str2.charAt(i10), this.f3714e);
        }
    }

    public List<v2.b> c() throws ScanException {
        b bVar;
        b bVar2;
        b bVar3;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i10 = this.f3714e;
            if (i10 >= this.f3711b) {
                break;
            }
            char cCharAt = this.f3710a.charAt(i10);
            this.f3714e++;
            int i11 = C0068a.f3715a[this.f3713d.ordinal()];
            if (i11 == 1) {
                if (cCharAt == '%') {
                    a(1000, stringBuffer, arrayList);
                    arrayList.add(v2.b.f36664f);
                    bVar3 = b.FORMAT_MODIFIER_STATE;
                } else if (cCharAt == ')') {
                    a(1000, stringBuffer, arrayList);
                    bVar3 = b.RIGHT_PARENTHESIS_STATE;
                } else if (cCharAt != '\\') {
                    stringBuffer.append(cCharAt);
                } else {
                    b("%()", stringBuffer);
                }
                this.f3713d = bVar3;
            } else if (i11 != 2) {
                if (i11 == 3) {
                    new OptionTokenizer(this).tokenize(cCharAt, arrayList);
                } else if (i11 != 4) {
                    if (i11 == 5) {
                        arrayList.add(v2.b.f36662d);
                        if (cCharAt != ')') {
                            if (cCharAt != '\\') {
                                if (cCharAt != '{') {
                                    stringBuffer.append(cCharAt);
                                } else {
                                    bVar = b.OPTION_STATE;
                                }
                                this.f3713d = bVar;
                            } else {
                                b("%{}", stringBuffer);
                            }
                            bVar = b.LITERAL_STATE;
                            this.f3713d = bVar;
                        }
                    }
                } else if (Character.isJavaIdentifierPart(cCharAt)) {
                    stringBuffer.append(cCharAt);
                } else {
                    if (cCharAt == '{') {
                        a(1004, stringBuffer, arrayList);
                        bVar2 = b.OPTION_STATE;
                    } else {
                        if (cCharAt == '(') {
                            a(WebSocketProtocol.CLOSE_NO_STATUS_CODE, stringBuffer, arrayList);
                        } else if (cCharAt == '%') {
                            a(1004, stringBuffer, arrayList);
                            arrayList.add(v2.b.f36664f);
                            bVar2 = b.FORMAT_MODIFIER_STATE;
                        } else {
                            a(1004, stringBuffer, arrayList);
                            if (cCharAt == ')') {
                                bVar2 = b.RIGHT_PARENTHESIS_STATE;
                            } else if (cCharAt == '\\') {
                                int i12 = this.f3714e;
                                if (i12 < this.f3711b) {
                                    String str = this.f3710a;
                                    this.f3714e = i12 + 1;
                                    this.f3712c.escape("%()", stringBuffer, str.charAt(i12), this.f3714e);
                                }
                            } else {
                                stringBuffer.append(cCharAt);
                            }
                        }
                        bVar2 = b.LITERAL_STATE;
                    }
                    this.f3713d = bVar2;
                }
            } else if (cCharAt == '(') {
                a(1002, stringBuffer, arrayList);
                arrayList.add(v2.b.f36663e);
                this.f3713d = b.LITERAL_STATE;
            } else {
                if (Character.isJavaIdentifierStart(cCharAt)) {
                    a(1002, stringBuffer, arrayList);
                    this.f3713d = b.KEYWORD_STATE;
                }
                stringBuffer.append(cCharAt);
            }
        }
        int i13 = C0068a.f3715a[this.f3713d.ordinal()];
        if (i13 == 1) {
            a(1000, stringBuffer, arrayList);
        } else {
            if (i13 == 2 || i13 == 3) {
                throw new ScanException("Unexpected end of pattern string");
            }
            if (i13 == 4) {
                arrayList.add(new v2.b(1004, stringBuffer.toString()));
            } else if (i13 == 5) {
                arrayList.add(v2.b.f36662d);
            }
        }
        return arrayList;
    }
}
