package y3;

import b4.j;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class f<Z> extends a<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38054c;

    public f() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public f(int i10, int i11) {
        this.f38053b = i10;
        this.f38054c = i11;
    }

    @Override // y3.h
    public final void a(g gVar) throws Throwable {
        if (j.i(this.f38053b, this.f38054c)) {
            ((x3.g) gVar).b(this.f38053b, this.f38054c);
        } else {
            StringBuilder sbA = defpackage.a.a("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
            sbA.append(this.f38053b);
            sbA.append(" and height: ");
            throw new IllegalArgumentException(android.support.v4.media.b.a(sbA, this.f38054c, ", either provide dimensions in the constructor or call override()"));
        }
    }

    @Override // y3.h
    public void e(g gVar) {
    }
}
