package kc;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f32013b;

    public z(int i10, T t10) {
        this.f32012a = i10;
        this.f32013b = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f32012a == zVar.f32012a && j0.d(this.f32013b, zVar.f32013b);
    }

    public int hashCode() {
        int i10 = this.f32012a * 31;
        T t10 = this.f32013b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("IndexedValue(index=");
        sbA.append(this.f32012a);
        sbA.append(", value=");
        sbA.append(this.f32013b);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
