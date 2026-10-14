package g8;

import ch.qos.logback.core.CoreConstants;
import h0.f;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30049d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30052c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }

        public final d a(String str, String str2) {
            if (str.length() > str2.length()) {
                d dVarA = a(str2, str);
                return new d(dVarA.f30050a, dVarA.f30052c, dVarA.f30051b);
            }
            int i10 = 0;
            int length = str2.length() - 1;
            int length2 = str2.length() - str.length();
            while (i10 < length && i10 < str.length() && str.charAt(i10) == str2.charAt(i10)) {
                i10++;
            }
            while (true) {
                int i11 = length - length2;
                if (i11 < i10 || str.charAt(i11) != str2.charAt(length)) {
                    break;
                }
                length--;
            }
            int i12 = (length + 1) - i10;
            return new d(i10, i12, i12 - length2);
        }
    }

    public d(int i10, int i11, int i12) {
        this.f30050a = i10;
        this.f30051b = i11;
        this.f30052c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f30050a == dVar.f30050a && this.f30051b == dVar.f30051b && this.f30052c == dVar.f30052c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f30052c) + r6.a.a(this.f30051b, Integer.hashCode(this.f30050a) * 31, 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("TextDiff(start=");
        sbA.append(this.f30050a);
        sbA.append(", added=");
        sbA.append(this.f30051b);
        sbA.append(", removed=");
        return f.a(sbA, this.f30052c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
