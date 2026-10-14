package fd;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f29622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.l<Throwable, jc.w> f29623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f29625e;

    /* JADX WARN: Multi-variable type inference failed */
    public u(Object obj, g gVar, uc.l<? super Throwable, jc.w> lVar, Object obj2, Throwable th) {
        this.f29621a = obj;
        this.f29622b = gVar;
        this.f29623c = lVar;
        this.f29624d = obj2;
        this.f29625e = th;
    }

    public /* synthetic */ u(Object obj, g gVar, uc.l lVar, Object obj2, Throwable th, int i10, vc.g gVar2) {
        this(obj, (i10 & 2) != 0 ? null : gVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }

    public static u a(u uVar, Object obj, g gVar, uc.l lVar, Object obj2, Throwable th, int i10) {
        Object obj3 = (i10 & 1) != 0 ? uVar.f29621a : null;
        if ((i10 & 2) != 0) {
            gVar = uVar.f29622b;
        }
        g gVar2 = gVar;
        uc.l<Throwable, jc.w> lVar2 = (i10 & 4) != 0 ? uVar.f29623c : null;
        Object obj4 = (i10 & 8) != 0 ? uVar.f29624d : null;
        if ((i10 & 16) != 0) {
            th = uVar.f29625e;
        }
        Objects.requireNonNull(uVar);
        return new u(obj3, gVar2, lVar2, obj4, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return j0.d(this.f29621a, uVar.f29621a) && j0.d(this.f29622b, uVar.f29622b) && j0.d(this.f29623c, uVar.f29623c) && j0.d(this.f29624d, uVar.f29624d) && j0.d(this.f29625e, uVar.f29625e);
    }

    public int hashCode() {
        Object obj = this.f29621a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        g gVar = this.f29622b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        uc.l<Throwable, jc.w> lVar = this.f29623c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f29624d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f29625e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CompletedContinuation(result=");
        sbA.append(this.f29621a);
        sbA.append(", cancelHandler=");
        sbA.append(this.f29622b);
        sbA.append(", onCancellation=");
        sbA.append(this.f29623c);
        sbA.append(", idempotentResume=");
        sbA.append(this.f29624d);
        sbA.append(", cancelCause=");
        sbA.append(this.f29625e);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
