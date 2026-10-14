package r6;

import android.os.SystemClock;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k6.b("a")
    private List<c> f35174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k6.b("b")
    private long f35175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @k6.b("c")
    private long f35176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @k6.b("d")
    private long f35177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @k6.b("e")
    private double f35178g;

    public d(List<c> list, long j10, long j11, long j12, double d10) {
        j0.i(list, "actions");
        this.f35174c = list;
        this.f35175d = j10;
        this.f35176e = j11;
        this.f35177f = j12;
        this.f35178g = d10;
    }

    public /* synthetic */ d(List list, long j10, long j11, long j12, double d10, int i10, vc.g gVar) {
        this(list, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? SystemClock.elapsedRealtime() : j11, (i10 & 8) == 0 ? j12 : 0L, (i10 & 16) != 0 ? 1.0d : d10);
    }

    public final List<c> a() {
        return this.f35174c;
    }

    public final long b() {
        return this.f35177f;
    }

    public final long c() {
        return this.f35175d;
    }

    public final double d() {
        return this.f35178g;
    }

    public final long e() {
        return this.f35176e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j0.d(this.f35174c, dVar.f35174c) && this.f35175d == dVar.f35175d && this.f35176e == dVar.f35176e && this.f35177f == dVar.f35177f && Double.compare(this.f35178g, dVar.f35178g) == 0;
    }

    public final boolean f() {
        List<c> list = this.f35174c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((c) it.next()).d() == 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void g(long j10) {
        this.f35177f = j10;
    }

    public final void h(long j10) {
        this.f35175d = j10;
    }

    public int hashCode() {
        return Double.hashCode(this.f35178g) + b.a(this.f35177f, b.a(this.f35176e, b.a(this.f35175d, this.f35174c.hashCode() * 31, 31), 31), 31);
    }

    public final void i(double d10) {
        this.f35178g = d10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ActionSet(actions=");
        sbA.append(this.f35174c);
        sbA.append(", duration=");
        sbA.append(this.f35175d);
        sbA.append(", time=");
        sbA.append(this.f35176e);
        sbA.append(", breakBefore=");
        sbA.append(this.f35177f);
        sbA.append(", playbackSpeed=");
        sbA.append(this.f35178g);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
