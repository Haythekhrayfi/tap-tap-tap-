package v2;

import android.support.v4.media.c;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f36662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f36663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static b f36664f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f36667c;

    static {
        new b(Integer.MAX_VALUE, "EOF");
        f36662d = new b(41);
        f36663e = new b(WebSocketProtocol.CLOSE_NO_STATUS_CODE, "BARE");
        f36664f = new b(37);
    }

    public b(int i10) {
        this(i10, null, null);
    }

    public b(int i10, String str) {
        this(i10, str, null);
    }

    public b(int i10, String str, List<String> list) {
        this.f36665a = i10;
        this.f36666b = str;
        this.f36667c = list;
    }

    public b(int i10, List<String> list) {
        this(i10, null, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f36665a != bVar.f36665a) {
            return false;
        }
        String str = this.f36666b;
        String str2 = bVar.f36666b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        int i10 = this.f36665a * 29;
        String str = this.f36666b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str;
        StringBuilder sbA;
        String str2;
        int i10 = this.f36665a;
        if (i10 == 37) {
            str = "%";
        } else if (i10 == 41) {
            str = "RIGHT_PARENTHESIS";
        } else if (i10 == 1000) {
            str = "LITERAL";
        } else if (i10 != 1002) {
            switch (i10) {
                case 1004:
                    str = "SIMPLE_KEYWORD";
                    break;
                case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
                    str = "COMPOSITE_KEYWORD";
                    break;
                case 1006:
                    str = "OPTION";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "FormatModifier";
        }
        if (this.f36666b == null) {
            sbA = c.a("Token(", str);
            str2 = ")";
        } else {
            sbA = androidx.activity.result.c.a("Token(", str, ", \"");
            sbA.append(this.f36666b);
            str2 = "\")";
        }
        sbA.append(str2);
        return sbA.toString();
    }
}
