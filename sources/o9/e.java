package o9;

import android.graphics.RectF;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.e f34162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f34163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f34164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f34165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f34166e;

    public e(n9.e eVar) {
        j0.i(eVar, "styleParams");
        this.f34162a = eVar;
        this.f34164c = new RectF();
    }

    @Override // o9.a
    public n9.c a(int i10) {
        return this.f34162a.f33727c.b();
    }

    @Override // o9.a
    public void b(float f10) {
        this.f34165d = f10;
    }

    @Override // o9.a
    public int c(int i10) {
        n9.d dVar = this.f34162a.f33727c;
        Objects.requireNonNull(dVar);
        if (dVar instanceof n9.d.b) {
            return ((n9.d.b) dVar).f33724d;
        }
        return 0;
    }

    @Override // o9.a
    public void d(int i10) {
    }

    @Override // o9.a
    public void e(float f10) {
        this.f34166e = f10;
    }

    @Override // o9.a
    public int f(int i10) {
        return this.f34162a.f33727c.a();
    }

    @Override // o9.a
    public void g(int i10, float f10) {
        this.f34163b = f10;
    }

    @Override // o9.a
    public RectF h(float f10, float f11) {
        float fB = this.f34166e;
        if (fB == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            fB = this.f34162a.f33726b.b().b();
        }
        this.f34164c.top = f11 - (this.f34162a.f33726b.b().a() / 2.0f);
        RectF rectF = this.f34164c;
        float f12 = this.f34165d;
        float f13 = fB / 2.0f;
        rectF.right = bd.e.b(this.f34163b * f12 * 2.0f, f12) + f10 + f13;
        this.f34164c.bottom = (this.f34162a.f33726b.b().a() / 2.0f) + f11;
        this.f34164c.left = (bd.e.a(((this.f34163b - 0.5f) * this.f34165d) * 2.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) + f10) - f13;
        return this.f34164c;
    }

    @Override // o9.a
    public float i(int i10) {
        n9.d dVar = this.f34162a.f33727c;
        Objects.requireNonNull(dVar);
        return dVar instanceof n9.d.b ? ((n9.d.b) dVar).f33723c : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // o9.a
    public void onPageSelected(int i10) {
    }
}
