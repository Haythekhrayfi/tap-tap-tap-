package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.WeakHashMap;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class m extends RecyclerView.n implements RecyclerView.s {
    public static final int[] D = {R.attr.state_pressed};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.t C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f2688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f2692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2696l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2697m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2698n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2699o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2700p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView f2703s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2710z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2701q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2702r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2704t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2705u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2706v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2707w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f2708x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f2709y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            int i10 = mVar.A;
            if (i10 == 1) {
                mVar.f2710z.cancel();
            } else if (i10 != 2) {
                return;
            }
            mVar.A = 3;
            ValueAnimator valueAnimator = mVar.f2710z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            mVar.f2710z.setDuration(500);
            mVar.f2710z.start();
        }
    }

    public class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            m mVar = m.this;
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int iComputeVerticalScrollRange = mVar.f2703s.computeVerticalScrollRange();
            int i12 = mVar.f2702r;
            mVar.f2704t = iComputeVerticalScrollRange - i12 > 0 && i12 >= mVar.f2685a;
            int iComputeHorizontalScrollRange = mVar.f2703s.computeHorizontalScrollRange();
            int i13 = mVar.f2701q;
            boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= mVar.f2685a;
            mVar.f2705u = z10;
            boolean z11 = mVar.f2704t;
            if (!z11 && !z10) {
                if (mVar.f2706v != 0) {
                    mVar.j(0);
                    return;
                }
                return;
            }
            if (z11) {
                float f10 = i12;
                mVar.f2696l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
                mVar.f2695k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
            }
            if (mVar.f2705u) {
                float f11 = iComputeHorizontalScrollOffset;
                float f12 = i13;
                mVar.f2699o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
                mVar.f2698n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
            }
            int i14 = mVar.f2706v;
            if (i14 == 0 || i14 == 1) {
                mVar.j(1);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2713a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2713a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2713a) {
                this.f2713a = false;
                return;
            }
            if (((Float) m.this.f2710z.getAnimatedValue()).floatValue() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                m mVar = m.this;
                mVar.A = 0;
                mVar.j(0);
            } else {
                m mVar2 = m.this;
                mVar2.A = 2;
                mVar2.f2703s.invalidate();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            m.this.f2687c.setAlpha(iFloatValue);
            m.this.f2688d.setAlpha(iFloatValue);
            m.this.f2703s.invalidate();
        }
    }

    public m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
        this.f2710z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        b bVar = new b();
        this.C = bVar;
        this.f2687c = stateListDrawable;
        this.f2688d = drawable;
        this.f2691g = stateListDrawable2;
        this.f2692h = drawable2;
        this.f2689e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f2690f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f2693i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f2694j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f2685a = i11;
        this.f2686b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f2703s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f2703s.removeOnItemTouchListener(this);
            this.f2703s.removeOnScrollListener(bVar);
            f();
        }
        this.f2703s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f2703s.addOnItemTouchListener(this);
        this.f2703s.addOnScrollListener(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2706v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zH = h(motionEvent.getX(), motionEvent.getY());
            boolean zG = g(motionEvent.getX(), motionEvent.getY());
            if (zH || zG) {
                if (zG) {
                    this.f2707w = 1;
                    this.f2700p = (int) motionEvent.getX();
                } else if (zH) {
                    this.f2707w = 2;
                    this.f2697m = (int) motionEvent.getY();
                }
                j(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f2706v == 2) {
            this.f2697m = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f2700p = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            j(1);
            this.f2707w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f2706v == 2) {
            k();
            if (this.f2707w == 1) {
                float x10 = motionEvent.getX();
                int[] iArr = this.f2709y;
                int i10 = this.f2686b;
                iArr[0] = i10;
                iArr[1] = this.f2701q - i10;
                float fMax = Math.max(iArr[0], Math.min(iArr[1], x10));
                if (Math.abs(this.f2699o - fMax) >= 2.0f) {
                    int i11 = i(this.f2700p, fMax, iArr, this.f2703s.computeHorizontalScrollRange(), this.f2703s.computeHorizontalScrollOffset(), this.f2701q);
                    if (i11 != 0) {
                        this.f2703s.scrollBy(i11, 0);
                    }
                    this.f2700p = fMax;
                }
            }
            if (this.f2707w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f2708x;
                int i12 = this.f2686b;
                iArr2[0] = i12;
                iArr2[1] = this.f2702r - i12;
                float fMax2 = Math.max(iArr2[0], Math.min(iArr2[1], y10));
                if (Math.abs(this.f2696l - fMax2) < 2.0f) {
                    return;
                }
                int i13 = i(this.f2697m, fMax2, iArr2, this.f2703s.computeVerticalScrollRange(), this.f2703s.computeVerticalScrollOffset(), this.f2702r);
                if (i13 != 0) {
                    this.f2703s.scrollBy(0, i13);
                }
                this.f2697m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f2706v;
        if (i10 == 1) {
            boolean zH = h(motionEvent.getX(), motionEvent.getY());
            boolean zG = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (zH || zG)) {
                if (zG) {
                    this.f2707w = 1;
                    this.f2700p = (int) motionEvent.getX();
                } else if (zH) {
                    this.f2707w = 2;
                    this.f2697m = (int) motionEvent.getY();
                }
                j(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void e(boolean z10) {
    }

    public final void f() {
        this.f2703s.removeCallbacks(this.B);
    }

    public boolean g(float f10, float f11) {
        if (f11 >= this.f2702r - this.f2693i) {
            int i10 = this.f2699o;
            int i11 = this.f2698n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public boolean h(float f10, float f11) {
        RecyclerView recyclerView = this.f2703s;
        WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
        if (p0.e0.e.d(recyclerView) == 1) {
            if (f10 > this.f2689e / 2) {
                return false;
            }
        } else if (f10 < this.f2701q - this.f2689e) {
            return false;
        }
        int i10 = this.f2696l;
        int i11 = this.f2695k / 2;
        return f11 >= ((float) (i10 - i11)) && f11 <= ((float) (i11 + i10));
    }

    public final int i(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    public void j(int i10) {
        int i11;
        if (i10 == 2 && this.f2706v != 2) {
            this.f2687c.setState(D);
            f();
        }
        if (i10 == 0) {
            this.f2703s.invalidate();
        } else {
            k();
        }
        if (this.f2706v != 2 || i10 == 2) {
            i11 = i10 == 1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 1200;
            this.f2706v = i10;
        }
        this.f2687c.setState(E);
        f();
        this.f2703s.postDelayed(this.B, i11);
        this.f2706v = i10;
    }

    public void k() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f2710z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f2710z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f2710z.setDuration(500L);
        this.f2710z.setStartDelay(0L);
        this.f2710z.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f2701q != this.f2703s.getWidth() || this.f2702r != this.f2703s.getHeight()) {
            this.f2701q = this.f2703s.getWidth();
            this.f2702r = this.f2703s.getHeight();
            j(0);
            return;
        }
        if (this.A != 0) {
            if (this.f2704t) {
                int i10 = this.f2701q;
                int i11 = this.f2689e;
                int i12 = i10 - i11;
                int i13 = this.f2696l;
                int i14 = this.f2695k;
                int i15 = i13 - (i14 / 2);
                this.f2687c.setBounds(0, 0, i11, i14);
                this.f2688d.setBounds(0, 0, this.f2690f, this.f2702r);
                RecyclerView recyclerView2 = this.f2703s;
                WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                if (p0.e0.e.d(recyclerView2) == 1) {
                    this.f2688d.draw(canvas);
                    canvas.translate(this.f2689e, i15);
                    canvas.scale(-1.0f, 1.0f);
                    this.f2687c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i12 = this.f2689e;
                } else {
                    canvas.translate(i12, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    this.f2688d.draw(canvas);
                    canvas.translate(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, i15);
                    this.f2687c.draw(canvas);
                }
                canvas.translate(-i12, -i15);
            }
            if (this.f2705u) {
                int i16 = this.f2702r;
                int i17 = this.f2693i;
                int i18 = i16 - i17;
                int i19 = this.f2699o;
                int i20 = this.f2698n;
                int i21 = i19 - (i20 / 2);
                this.f2691g.setBounds(0, 0, i20, i17);
                this.f2692h.setBounds(0, 0, this.f2701q, this.f2694j);
                canvas.translate(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, i18);
                this.f2692h.draw(canvas);
                canvas.translate(i21, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                this.f2691g.draw(canvas);
                canvas.translate(-i21, -i18);
            }
        }
    }
}
