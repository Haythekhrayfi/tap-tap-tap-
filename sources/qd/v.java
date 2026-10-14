package qd;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f34931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v f34936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v f34937g;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    public v() {
        this.f34931a = new byte[8192];
        this.f34935e = true;
        this.f34934d = false;
    }

    public v(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        j0.i(bArr, "data");
        this.f34931a = bArr;
        this.f34932b = i10;
        this.f34933c = i11;
        this.f34934d = z10;
        this.f34935e = z11;
    }

    public final v a() {
        v vVar = this.f34936f;
        if (vVar == this) {
            vVar = null;
        }
        v vVar2 = this.f34937g;
        j0.f(vVar2);
        vVar2.f34936f = this.f34936f;
        v vVar3 = this.f34936f;
        j0.f(vVar3);
        vVar3.f34937g = this.f34937g;
        this.f34936f = null;
        this.f34937g = null;
        return vVar;
    }

    public final v b(v vVar) {
        vVar.f34937g = this;
        vVar.f34936f = this.f34936f;
        v vVar2 = this.f34936f;
        j0.f(vVar2);
        vVar2.f34937g = vVar;
        this.f34936f = vVar;
        return vVar;
    }

    public final v c() {
        this.f34934d = true;
        return new v(this.f34931a, this.f34932b, this.f34933c, true, false);
    }

    public final void d(v vVar, int i10) {
        if (!vVar.f34935e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = vVar.f34933c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (vVar.f34934d) {
                throw new IllegalArgumentException();
            }
            int i13 = vVar.f34932b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = vVar.f34931a;
            kc.i.e(bArr, bArr, 0, i13, i11, 2);
            vVar.f34933c -= vVar.f34932b;
            vVar.f34932b = 0;
        }
        byte[] bArr2 = this.f34931a;
        byte[] bArr3 = vVar.f34931a;
        int i14 = vVar.f34933c;
        int i15 = this.f34932b;
        kc.i.c(bArr2, bArr3, i14, i15, i15 + i10);
        vVar.f34933c += i10;
        this.f34932b += i10;
    }
}
