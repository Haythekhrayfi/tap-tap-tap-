package b7;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3346c;

    public a(int i10, int i11, String str) {
        j0.i(str, "name");
        this.f3344a = i10;
        this.f3345b = i11;
        this.f3346c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3344a == aVar.f3344a && this.f3345b == aVar.f3345b && j0.d(this.f3346c, aVar.f3346c);
    }

    public int hashCode() {
        return this.f3346c.hashCode() + r6.a.a(this.f3345b, Integer.hashCode(this.f3344a) * 31, 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PopupItem(type=");
        sbA.append(this.f3344a);
        sbA.append(", icon=");
        sbA.append(this.f3345b);
        sbA.append(", name=");
        return s.a.a(sbA, this.f3346c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
