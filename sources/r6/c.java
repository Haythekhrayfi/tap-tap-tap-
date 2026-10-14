package r6;

import android.os.SystemClock;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends f implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k6.b("a")
    private float f35169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k6.b("b")
    private float f35170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @k6.b("c")
    private final long f35171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @k6.b("d")
    private final int f35172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @k6.b("e")
    private final int f35173g;

    public c(float f10, float f11, long j10, int i10, int i11) {
        this.f35169c = f10;
        this.f35170d = f11;
        this.f35171e = j10;
        this.f35172f = i10;
        this.f35173g = i11;
    }

    public /* synthetic */ c(float f10, float f11, long j10, int i10, int i11, int i12, vc.g gVar) {
        this(f10, f11, (i12 & 4) != 0 ? SystemClock.elapsedRealtime() : j10, i10, (i12 & 16) != 0 ? 0 : i11);
    }

    public static c a(c cVar, float f10, float f11, long j10, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            f10 = cVar.f35169c;
        }
        float f12 = f10;
        if ((i12 & 2) != 0) {
            f11 = cVar.f35170d;
        }
        float f13 = f11;
        if ((i12 & 4) != 0) {
            j10 = cVar.f35171e;
        }
        long j11 = j10;
        if ((i12 & 8) != 0) {
            i10 = cVar.f35172f;
        }
        int i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = cVar.f35173g;
        }
        Objects.requireNonNull(cVar);
        return new c(f12, f13, j11, i13, i11);
    }

    public final int b() {
        return this.f35173g;
    }

    public final long c() {
        return this.f35171e;
    }

    public final int d() {
        return this.f35172f;
    }

    public final float e() {
        return this.f35169c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f35169c, cVar.f35169c) == 0 && Float.compare(this.f35170d, cVar.f35170d) == 0 && this.f35171e == cVar.f35171e && this.f35172f == cVar.f35172f && this.f35173g == cVar.f35173g;
    }

    public final float f() {
        return this.f35170d;
    }

    public final void g(float f10) {
        this.f35169c = f10;
    }

    public final void h(float f10) {
        this.f35170d = f10;
    }

    public int hashCode() {
        return Integer.hashCode(this.f35173g) + a.a(this.f35172f, b.a(this.f35171e, (Float.hashCode(this.f35170d) + (Float.hashCode(this.f35169c) * 31)) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ActionEvent(x=");
        sbA.append(this.f35169c);
        sbA.append(", y=");
        sbA.append(this.f35170d);
        sbA.append(", time=");
        sbA.append(this.f35171e);
        sbA.append(", type=");
        sbA.append(this.f35172f);
        sbA.append(", pointerIndex=");
        return h0.f.a(sbA, this.f35173g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
