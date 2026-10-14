package u0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Interpolator f35946v = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35948b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f35950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f35951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f35952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f35953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f35954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f35955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f35956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f35958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f35959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f35960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public OverScroller f35963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f35964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f35965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ViewGroup f35966t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35949c = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f35967u = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.o(0);
        }
    }

    public static abstract class c {
        public int a(View view, int i10, int i11) {
            return 0;
        }

        public int b(View view, int i10, int i11) {
            return 0;
        }

        public int c(View view) {
            return 0;
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11) {
        }

        public void f(View view, int i10) {
        }

        public void g(int i10) {
        }

        public void h(View view, int i10, int i11, int i12, int i13) {
        }

        public void i(View view, float f10, float f11) {
        }

        public abstract boolean j(View view, int i10);
    }

    public d(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f35966t = viewGroup;
        this.f35964r = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f35961o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f35948b = viewConfiguration.getScaledTouchSlop();
        this.f35959m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f35960n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f35963q = new OverScroller(context, f35946v);
    }

    public void a() {
        this.f35949c = -1;
        float[] fArr = this.f35950d;
        if (fArr != null) {
            Arrays.fill(fArr, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            Arrays.fill(this.f35951e, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            Arrays.fill(this.f35952f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            Arrays.fill(this.f35953g, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            Arrays.fill(this.f35954h, 0);
            Arrays.fill(this.f35955i, 0);
            Arrays.fill(this.f35956j, 0);
            this.f35957k = 0;
        }
        VelocityTracker velocityTracker = this.f35958l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f35958l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() != this.f35966t) {
            StringBuilder sbA = defpackage.a.a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sbA.append(this.f35966t);
            sbA.append(")");
            throw new IllegalArgumentException(sbA.toString());
        }
        this.f35965s = view;
        this.f35949c = i10;
        this.f35964r.f(view, i10);
        o(1);
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f35954h[i10] & i11) != i11 || (this.f35962p & i11) == 0 || (this.f35956j[i10] & i11) == i11 || (this.f35955i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f35948b;
        if (fAbs <= i12 && fAbs2 <= i12) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            Objects.requireNonNull(this.f35964r);
        }
        return (this.f35955i[i10] & i11) == 0 && fAbs > ((float) this.f35948b);
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f35964r.c(view) > 0;
        Objects.requireNonNull(this.f35964r);
        return z10 && Math.abs(f10) > ((float) this.f35948b);
    }

    public final float e(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        if (fAbs > f12) {
            return f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? f12 : -f12;
        }
        return f10;
    }

    public final int f(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    public final void g(int i10) {
        float[] fArr = this.f35950d;
        if (fArr != null) {
            int i11 = this.f35957k;
            int i12 = 1 << i10;
            if ((i12 & i11) != 0) {
                fArr[i10] = 0.0f;
                this.f35951e[i10] = 0.0f;
                this.f35952f[i10] = 0.0f;
                this.f35953g[i10] = 0.0f;
                this.f35954h[i10] = 0;
                this.f35955i[i10] = 0;
                this.f35956j[i10] = 0;
                this.f35957k = (~i12) & i11;
            }
        }
    }

    public final int h(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f35966t.getWidth();
        float f10 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * f10) + f10;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public View i(int i10, int i11) {
        for (int childCount = this.f35966t.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f35966t;
            Objects.requireNonNull(this.f35964r);
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean j(int i10) {
        if ((this.f35957k & (1 << i10)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k() {
        this.f35958l.computeCurrentVelocity(1000, this.f35959m);
        this.f35964r.i(this.f35965s, e(this.f35958l.getXVelocity(this.f35949c), this.f35960n, this.f35959m), e(this.f35958l.getYVelocity(this.f35949c), this.f35960n, this.f35959m));
        if (this.f35947a == 1) {
            o(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [u0.d$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l(float f10, float f11, int i10) {
        int i11;
        boolean zC = c(f10, f11, i10, 1);
        ?? r10 = zC;
        if (c(f11, f10, i10, 4)) {
            r10 = (zC ? 1 : 0) | 4;
        }
        ?? r11 = r10;
        if (c(f10, f11, i10, 2)) {
            r11 = (r10 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (c(f11, f10, i10, 8)) {
            i11 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 == 0) {
            r12 = i11;
            return;
        }
        r12 = i11;
        int[] iArr = this.f35955i;
        iArr[i10] = (iArr[i10] | r12) == true ? 1 : 0;
        this.f35964r.d(r12, i10);
    }

    public final void m(float f10, float f11, int i10) {
        float[] fArr = this.f35950d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f35951e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f35952f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f35953g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f35954h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f35955i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f35956j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f35950d = fArr2;
            this.f35951e = fArr3;
            this.f35952f = fArr4;
            this.f35953g = fArr5;
            this.f35954h = iArr;
            this.f35955i = iArr2;
            this.f35956j = iArr3;
        }
        float[] fArr9 = this.f35950d;
        this.f35952f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f35951e;
        this.f35953g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f35954h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        int i14 = i12 < this.f35966t.getLeft() + this.f35961o ? 1 : 0;
        if (i13 < this.f35966t.getTop() + this.f35961o) {
            i14 |= 4;
        }
        if (i12 > this.f35966t.getRight() - this.f35961o) {
            i14 |= 2;
        }
        if (i13 > this.f35966t.getBottom() - this.f35961o) {
            i14 |= 8;
        }
        iArr7[i10] = i14;
        this.f35957k |= 1 << i10;
    }

    public final void n(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f35952f[pointerId] = x10;
                this.f35953g[pointerId] = y10;
            }
        }
    }

    public void o(int i10) {
        this.f35966t.removeCallbacks(this.f35967u);
        if (this.f35947a != i10) {
            this.f35947a = i10;
            this.f35964r.g(i10);
            if (this.f35947a == 0) {
                this.f35965s = null;
            }
        }
    }

    public boolean p(View view, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        this.f35965s = view;
        this.f35949c = -1;
        int left = view.getLeft();
        int top = this.f35965s.getTop();
        int i13 = i10 - left;
        int i14 = i11 - top;
        boolean z10 = false;
        if (i13 == 0 && i14 == 0) {
            this.f35963q.abortAnimation();
            o(0);
        } else {
            View view2 = this.f35965s;
            int iF = f(0, (int) this.f35960n, (int) this.f35959m);
            int iF2 = f(0, (int) this.f35960n, (int) this.f35959m);
            int iAbs = Math.abs(i13);
            int iAbs2 = Math.abs(i14);
            int iAbs3 = Math.abs(iF);
            int iAbs4 = Math.abs(iF2);
            int i15 = iAbs3 + iAbs4;
            int i16 = iAbs + iAbs2;
            if (iF != 0) {
                f10 = iAbs3;
                f11 = i15;
            } else {
                f10 = iAbs;
                f11 = i16;
            }
            float f14 = f10 / f11;
            if (iF2 != 0) {
                f12 = iAbs4;
                f13 = i15;
            } else {
                f12 = iAbs2;
                f13 = i16;
            }
            int iH = h(i13, iF, this.f35964r.c(view2));
            Objects.requireNonNull(this.f35964r);
            this.f35963q.startScroll(left, top, i13, i14, i12 != -1 ? i12 : (int) ((h(i14, iF2, 0) * (f12 / f13)) + (iH * f14)));
            o(2);
            z10 = true;
        }
        if (!z10 && this.f35947a == 0 && this.f35965s != null) {
            this.f35965s = null;
        }
        return z10;
    }

    public boolean q(View view, int i10) {
        if (view == this.f35965s && this.f35949c == i10) {
            return true;
        }
        if (view == null || !this.f35964r.j(view, i10)) {
            return false;
        }
        this.f35949c = i10;
        b(view, i10);
        return true;
    }
}
