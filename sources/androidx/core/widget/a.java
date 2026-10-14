package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f1689s = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0030a f1690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f1691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f1692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f1693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f1694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f1695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f1698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f1699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float[] f1700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1701n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1702o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1705r;

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    public static class C0030a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1709d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1715j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1716k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f1710e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f1714i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f1711f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1712g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1713h = 0;

        public final float a(long j10) {
            long j11 = this.f1710e;
            if (j10 < j11) {
                return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
            long j12 = this.f1714i;
            if (j12 < 0 || j10 < j12) {
                return a.d((j10 - j11) / this.f1706a, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f) * 0.5f;
            }
            float f10 = this.f1715j;
            return (a.d((j10 - j12) / this.f1716k, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f) * f10) + (1.0f - f10);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f1704q) {
                if (aVar.f1702o) {
                    aVar.f1702o = false;
                    C0030a c0030a = aVar.f1690c;
                    Objects.requireNonNull(c0030a);
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0030a.f1710e = jCurrentAnimationTimeMillis;
                    c0030a.f1714i = -1L;
                    c0030a.f1711f = jCurrentAnimationTimeMillis;
                    c0030a.f1715j = 0.5f;
                    c0030a.f1712g = 0;
                    c0030a.f1713h = 0;
                }
                C0030a c0030a2 = a.this.f1690c;
                if ((c0030a2.f1714i > 0 && AnimationUtils.currentAnimationTimeMillis() > c0030a2.f1714i + ((long) c0030a2.f1716k)) || !a.this.h()) {
                    a.this.f1704q = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f1703p) {
                    aVar2.f1703p = false;
                    Objects.requireNonNull(aVar2);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0);
                    aVar2.f1692e.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (c0030a2.f1711f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = c0030a2.a(jCurrentAnimationTimeMillis2);
                long j10 = jCurrentAnimationTimeMillis2 - c0030a2.f1711f;
                c0030a2.f1711f = jCurrentAnimationTimeMillis2;
                float f10 = j10 * ((fA * 4.0f) + ((-4.0f) * fA * fA));
                int i10 = (int) (c0030a2.f1708c * f10);
                c0030a2.f1712g = i10;
                int i11 = (int) (f10 * c0030a2.f1709d);
                c0030a2.f1713h = i11;
                a.this.g(i10, i11);
                View view = a.this.f1692e;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.m(view, this);
            }
        }
    }

    public a(View view) {
        C0030a c0030a = new C0030a();
        this.f1690c = c0030a;
        this.f1691d = new AccelerateInterpolator();
        this.f1694g = new float[]{StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD};
        this.f1695h = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1698k = new float[]{StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD};
        this.f1699l = new float[]{StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD};
        this.f1700m = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1692e = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f1700m;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.f1699l;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f1696i = 1;
        float[] fArr3 = this.f1695h;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f1694g;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f1698k;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f1697j = f1689s;
        c0030a.f1706a = 500;
        c0030a.f1707b = 500;
    }

    public static float d(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    public final float c(int i10, float f10, float f11, float f12) {
        float fD;
        float interpolation;
        float fD2 = d(this.f1694g[i10] * f11, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, this.f1695h[i10]);
        float fE = e(f11 - f10, fD2) - e(f10, fD2);
        if (fE >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            if (fE > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                interpolation = this.f1691d.getInterpolation(fE);
            } else {
                fD = 0.0f;
            }
            if (fD == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
            float f13 = this.f1698k[i10];
            float f14 = this.f1699l[i10];
            float f15 = this.f1700m[i10];
            float f16 = f13 * f12;
            return fD > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? d(fD * f16, f14, f15) : -d((-fD) * f16, f14, f15);
        }
        interpolation = -this.f1691d.getInterpolation(-fE);
        fD = d(interpolation, -1.0f, 1.0f);
        if (fD == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        float f17 = this.f1698k[i10];
        float f18 = this.f1699l[i10];
        float f19 = this.f1700m[i10];
        float f110 = f17 * f12;
        if (fD > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
        }
    }

    public final float e(float f10, float f11) {
        if (f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        int i10 = this.f1696i;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f1704q && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return f10 / (-f11);
        }
        return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public final void f() {
        int i10 = 0;
        if (this.f1702o) {
            this.f1704q = false;
            return;
        }
        C0030a c0030a = this.f1690c;
        Objects.requireNonNull(c0030a);
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (jCurrentAnimationTimeMillis - c0030a.f1710e);
        int i12 = c0030a.f1707b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0030a.f1716k = i10;
        c0030a.f1715j = c0030a.a(jCurrentAnimationTimeMillis);
        c0030a.f1714i = jCurrentAnimationTimeMillis;
    }

    public abstract void g(int i10, int i11);

    public boolean h() {
        C0030a c0030a = this.f1690c;
        float f10 = c0030a.f1709d;
        int iAbs = (int) (f10 / Math.abs(f10));
        float f11 = c0030a.f1708c;
        int iAbs2 = (int) (f11 / Math.abs(f11));
        return (iAbs != 0 && b(iAbs)) || (iAbs2 != 0 && a(iAbs2));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        if (!this.f1705r) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                f();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    f();
                }
            }
            return false;
        }
        this.f1703p = true;
        this.f1701n = false;
        float fC = c(0, motionEvent.getX(), view.getWidth(), this.f1692e.getWidth());
        float fC2 = c(1, motionEvent.getY(), view.getHeight(), this.f1692e.getHeight());
        C0030a c0030a = this.f1690c;
        c0030a.f1708c = fC;
        c0030a.f1709d = fC2;
        if (!this.f1704q && h()) {
            if (this.f1693f == null) {
                this.f1693f = new b();
            }
            this.f1704q = true;
            this.f1702o = true;
            if (this.f1701n || (i10 = this.f1697j) <= 0) {
                this.f1693f.run();
            } else {
                View view2 = this.f1692e;
                Runnable runnable = this.f1693f;
                long j10 = i10;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.n(view2, runnable, j10);
            }
            this.f1701n = true;
        }
        return false;
    }
}
