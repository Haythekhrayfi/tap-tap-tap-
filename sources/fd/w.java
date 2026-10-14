package fd;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.l<Throwable, jc.w> f29632b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Object obj, uc.l<? super Throwable, jc.w> lVar) {
        this.f29631a = obj;
        this.f29632b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return j0.d(this.f29631a, wVar.f29631a) && j0.d(this.f29632b, wVar.f29632b);
    }

    public int hashCode() {
        Object obj = this.f29631a;
        return this.f29632b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CompletedWithCancellation(result=");
        sbA.append(this.f29631a);
        sbA.append(", onCancellation=");
        sbA.append(this.f29632b);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
