package pe;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f34687e = new h('0', '+', CoreConstants.DASH_CHAR, CoreConstants.DOT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f34688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f34689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f34690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char f34691d;

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public h(char c10, char c11, char c12, char c13) {
        this.f34688a = c10;
        this.f34689b = c11;
        this.f34690c = c12;
        this.f34691d = c13;
    }

    public String a(String str) {
        char c10 = this.f34688a;
        if (c10 == '0') {
            return str;
        }
        int i10 = c10 - '0';
        char[] charArray = str.toCharArray();
        for (int i11 = 0; i11 < charArray.length; i11++) {
            charArray[i11] = (char) (charArray[i11] + i10);
        }
        return new String(charArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f34688a == hVar.f34688a && this.f34689b == hVar.f34689b && this.f34690c == hVar.f34690c && this.f34691d == hVar.f34691d;
    }

    public int hashCode() {
        return this.f34688a + this.f34689b + this.f34690c + this.f34691d;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DecimalStyle[");
        sbA.append(this.f34688a);
        sbA.append(this.f34689b);
        sbA.append(this.f34690c);
        sbA.append(this.f34691d);
        sbA.append("]");
        return sbA.toString();
    }
}
