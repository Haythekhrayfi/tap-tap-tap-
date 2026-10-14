package o9;

import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.Objects;
import jc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.e f34153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArgbEvaluator f34154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<Float> f34155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34156d;

    public c(n9.e eVar) {
        j0.i(eVar, "styleParams");
        this.f34153a = eVar;
        this.f34154b = new ArgbEvaluator();
        this.f34155c = new SparseArray<>();
    }

    @Override // o9.a
    public n9.c a(int i10) {
        n9.e eVar = this.f34153a;
        n9.d dVar = eVar.f33726b;
        if (dVar instanceof n9.d.a) {
            float f10 = ((n9.d.a) eVar.f33727c).f33720b.f33715a;
            return new n9.c.a((k(i10) * (((n9.d.a) dVar).f33720b.f33715a - f10)) + f10);
        }
        if (!(dVar instanceof n9.d.b)) {
            throw new g();
        }
        n9.d.b bVar = (n9.d.b) eVar.f33727c;
        float f11 = bVar.f33722b.f33716a;
        n9.d.b bVar2 = (n9.d.b) dVar;
        float fK = (k(i10) * (bVar2.f33722b.f33716a - f11)) + f11;
        float f12 = bVar.f33722b.f33717b;
        float fK2 = (k(i10) * (bVar2.f33722b.f33717b - f12)) + f12;
        float f13 = bVar.f33722b.f33718c;
        return new n9.c.b(fK, fK2, (k(i10) * (bVar2.f33722b.f33718c - f13)) + f13);
    }

    @Override // o9.a
    public int c(int i10) {
        n9.e eVar = this.f34153a;
        n9.d dVar = eVar.f33726b;
        if (!(dVar instanceof n9.d.b)) {
            return 0;
        }
        return j(k(i10), ((n9.d.b) eVar.f33727c).f33724d, ((n9.d.b) dVar).f33724d);
    }

    @Override // o9.a
    public void d(int i10) {
        this.f34156d = i10;
    }

    @Override // o9.a
    public int f(int i10) {
        return j(k(i10), this.f34153a.f33727c.a(), this.f34153a.f33726b.a());
    }

    @Override // o9.a
    public void g(int i10, float f10) {
        l(i10, 1.0f - f10);
        l(i10 < this.f34156d + (-1) ? i10 + 1 : 0, f10);
    }

    @Override // o9.a
    public RectF h(float f10, float f11) {
        return null;
    }

    @Override // o9.a
    public float i(int i10) {
        n9.e eVar = this.f34153a;
        n9.d dVar = eVar.f33726b;
        if (!(dVar instanceof n9.d.b)) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        float f10 = ((n9.d.b) eVar.f33727c).f33723c;
        return (k(i10) * (((n9.d.b) dVar).f33723c - f10)) + f10;
    }

    public final int j(float f10, int i10, int i11) {
        Object objEvaluate = this.f34154b.evaluate(f10, Integer.valueOf(i10), Integer.valueOf(i11));
        Objects.requireNonNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objEvaluate).intValue();
    }

    public final float k(int i10) {
        Float f10 = this.f34155c.get(i10, Float.valueOf(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
        j0.h(f10, "itemsScale.get(position, 0f)");
        return f10.floatValue();
    }

    public final void l(int i10, float f10) {
        if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            this.f34155c.remove(i10);
        } else {
            this.f34155c.put(i10, Float.valueOf(Math.abs(f10)));
        }
    }

    @Override // o9.a
    public void onPageSelected(int i10) {
        this.f34155c.clear();
        this.f34155c.put(i10, Float.valueOf(1.0f));
    }
}
