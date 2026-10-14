package x;

import t.k;
import t.m;
import t.n;
import y.p;

/* JADX INFO: loaded from: classes.dex */
public class b extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f37315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f37316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f37317c;

    public b() {
        n nVar = new n();
        this.f37315a = nVar;
        this.f37317c = nVar;
    }

    @Override // y.p
    public float a() {
        return this.f37317c.b();
    }

    public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        n nVar = this.f37315a;
        this.f37317c = nVar;
        nVar.f35634l = f10;
        boolean z10 = f10 > f11;
        nVar.f35633k = z10;
        if (z10) {
            f12 = -f12;
            f16 = f10 - f11;
        } else {
            f16 = f11 - f10;
        }
        nVar.d(f12, f16, f14, f15, f13);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.f37317c.getInterpolation(f10);
    }
}
