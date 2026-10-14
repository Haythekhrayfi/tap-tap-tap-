package fd;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kd.a<r0<?>> f29636g;

    public final void e0(boolean z10) {
        long jF0 = this.f29634e - f0(z10);
        this.f29634e = jF0;
        if (jF0 <= 0 && this.f29635f) {
            shutdown();
        }
    }

    public final long f0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void g0(r0<?> r0Var) {
        kd.a<r0<?>> aVar = this.f29636g;
        if (aVar == null) {
            aVar = new kd.a<>();
            this.f29636g = aVar;
        }
        Object[] objArr = aVar.f32014a;
        int i10 = aVar.f32016c;
        objArr[i10] = r0Var;
        int length = (objArr.length - 1) & (i10 + 1);
        aVar.f32016c = length;
        int i11 = aVar.f32015b;
        if (length == i11) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            kc.i.f(objArr, objArr2, 0, i11, 0, 10);
            Object[] objArr3 = aVar.f32014a;
            int length3 = objArr3.length;
            int i12 = aVar.f32015b;
            kc.i.f(objArr3, objArr2, length3 - i12, 0, i12, 4);
            aVar.f32014a = objArr2;
            aVar.f32015b = 0;
            aVar.f32016c = length2;
        }
    }

    public final void h0(boolean z10) {
        this.f29634e = f0(z10) + this.f29634e;
        if (z10) {
            return;
        }
        this.f29635f = true;
    }

    public final boolean i0() {
        return this.f29634e >= f0(true);
    }

    public final boolean j0() {
        kd.a<r0<?>> aVar = this.f29636g;
        if (aVar == null) {
            return false;
        }
        int i10 = aVar.f32015b;
        Object obj = null;
        if (i10 != aVar.f32016c) {
            Object[] objArr = aVar.f32014a;
            Object obj2 = objArr[i10];
            objArr[i10] = null;
            aVar.f32015b = (i10 + 1) & (objArr.length - 1);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            obj = obj2;
        }
        r0 r0Var = (r0) obj;
        if (r0Var == null) {
            return false;
        }
        r0Var.run();
        return true;
    }

    public void shutdown() {
    }
}
