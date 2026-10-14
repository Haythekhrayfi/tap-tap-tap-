package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class p extends RecyclerView.n implements RecyclerView.q {
    public Rect B;
    public long C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2741k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f2743m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2745o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f2748r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f2750t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List<RecyclerView.c0> f2751u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<Integer> f2752v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p0.e f2755y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f2756z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<View> f2731a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f2732b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.c0 f2733c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2742l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2744n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<f> f2746p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f2749s = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f2753w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2754x = -1;
    public final RecyclerView.s A = new b();

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0081  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:6:0x000d  */
        @Override // java.lang.Runnable
        public void run() {
            int iF;
            int iF2;
            int i10;
            p pVar = p.this;
            RecyclerView.c0 c0Var = pVar.f2733c;
            if (c0Var != null) {
                boolean z10 = false;
                if (c0Var == null) {
                    pVar.C = Long.MIN_VALUE;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j10 = pVar.C;
                    long j11 = j10 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j10;
                    RecyclerView.o layoutManager = pVar.f2748r.getLayoutManager();
                    if (pVar.B == null) {
                        pVar.B = new Rect();
                    }
                    layoutManager.calculateItemDecorationsForChild(pVar.f2733c.itemView, pVar.B);
                    if (layoutManager.canScrollHorizontally()) {
                        int i11 = (int) (pVar.f2740j + pVar.f2738h);
                        int paddingLeft = (i11 - pVar.B.left) - pVar.f2748r.getPaddingLeft();
                        float f10 = pVar.f2738h;
                        if ((f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || paddingLeft >= 0) && (f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || (paddingLeft = ((pVar.f2733c.itemView.getWidth() + i11) + pVar.B.right) - (pVar.f2748r.getWidth() - pVar.f2748r.getPaddingRight())) <= 0)) {
                            iF = 0;
                        } else {
                            iF = paddingLeft;
                        }
                    } else {
                        iF = 0;
                    }
                    if (layoutManager.canScrollVertically()) {
                        int i12 = (int) (pVar.f2741k + pVar.f2739i);
                        int paddingTop = (i12 - pVar.B.top) - pVar.f2748r.getPaddingTop();
                        float f11 = pVar.f2739i;
                        if ((f11 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || paddingTop >= 0) && (f11 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || (paddingTop = ((pVar.f2733c.itemView.getHeight() + i12) + pVar.B.bottom) - (pVar.f2748r.getHeight() - pVar.f2748r.getPaddingBottom())) <= 0)) {
                            iF2 = 0;
                        } else {
                            iF2 = paddingTop;
                        }
                    } else {
                        iF2 = 0;
                    }
                    if (iF != 0) {
                        d dVar = pVar.f2743m;
                        RecyclerView recyclerView = pVar.f2748r;
                        int width = pVar.f2733c.itemView.getWidth();
                        pVar.f2748r.getWidth();
                        iF = dVar.f(recyclerView, width, iF, j11);
                    }
                    int i13 = iF;
                    if (iF2 != 0) {
                        d dVar2 = pVar.f2743m;
                        RecyclerView recyclerView2 = pVar.f2748r;
                        int height = pVar.f2733c.itemView.getHeight();
                        pVar.f2748r.getHeight();
                        i10 = i13;
                        iF2 = dVar2.f(recyclerView2, height, iF2, j11);
                    } else {
                        i10 = i13;
                    }
                    if (i10 == 0 && iF2 == 0) {
                        pVar.C = Long.MIN_VALUE;
                    } else {
                        if (pVar.C == Long.MIN_VALUE) {
                            pVar.C = jCurrentTimeMillis;
                        }
                        pVar.f2748r.scrollBy(i10, iF2);
                        z10 = true;
                    }
                }
                if (z10) {
                    p pVar2 = p.this;
                    RecyclerView.c0 c0Var2 = pVar2.f2733c;
                    if (c0Var2 != null) {
                        pVar2.m(c0Var2);
                    }
                    p pVar3 = p.this;
                    pVar3.f2748r.removeCallbacks(pVar3.f2749s);
                    RecyclerView recyclerView3 = p.this.f2748r;
                    WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                    p0.e0.d.m(recyclerView3, this);
                }
            }
        }
    }

    public class b implements RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            ((p0.e.b) p.this.f2755y.f34352a).f34353a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = p.this.f2750t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (p.this.f2742l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(p.this.f2742l);
            if (iFindPointerIndex >= 0) {
                p.this.g(actionMasked, motionEvent, iFindPointerIndex);
            }
            p pVar = p.this;
            RecyclerView.c0 c0Var = pVar.f2733c;
            if (c0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        pVar.p(motionEvent, pVar.f2745o, iFindPointerIndex);
                        p.this.m(c0Var);
                        p pVar2 = p.this;
                        pVar2.f2748r.removeCallbacks(pVar2.f2749s);
                        p.this.f2749s.run();
                        p.this.f2748r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    p pVar3 = p.this;
                    if (pointerId == pVar3.f2742l) {
                        pVar3.f2742l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        p pVar4 = p.this;
                        pVar4.p(motionEvent, pVar4.f2745o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = pVar.f2750t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            p.this.o(null, 0);
            p.this.f2742l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            ((p0.e.b) p.this.f2755y.f34352a).f34353a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                p.this.f2742l = motionEvent.getPointerId(0);
                p.this.f2734d = motionEvent.getX();
                p.this.f2735e = motionEvent.getY();
                p pVar = p.this;
                VelocityTracker velocityTracker = pVar.f2750t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                pVar.f2750t = VelocityTracker.obtain();
                p pVar2 = p.this;
                if (pVar2.f2733c == null) {
                    if (!pVar2.f2746p.isEmpty()) {
                        View viewJ = pVar2.j(motionEvent);
                        for (int size = pVar2.f2746p.size() - 1; size >= 0; size--) {
                            f fVar2 = pVar2.f2746p.get(size);
                            if (fVar2.f2771e.itemView == viewJ) {
                                fVar = fVar2;
                                break;
                            }
                        }
                    }
                    if (fVar != null) {
                        p pVar3 = p.this;
                        pVar3.f2734d -= fVar.f2775i;
                        pVar3.f2735e -= fVar.f2776j;
                        pVar3.i(fVar.f2771e, true);
                        if (p.this.f2731a.remove(fVar.f2771e.itemView)) {
                            p pVar4 = p.this;
                            pVar4.f2743m.a(pVar4.f2748r, fVar.f2771e);
                        }
                        p.this.o(fVar.f2771e, fVar.f2772f);
                        p pVar5 = p.this;
                        pVar5.p(motionEvent, pVar5.f2745o, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                p pVar6 = p.this;
                pVar6.f2742l = -1;
                pVar6.o(null, 0);
            } else {
                int i10 = p.this.f2742l;
                if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    p.this.g(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker2 = p.this.f2750t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return p.this.f2733c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z10) {
            if (z10) {
                p.this.o(null, 0);
            }
        }
    }

    public class c extends f {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f2759n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f2760o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.c0 c0Var, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.c0 c0Var2) {
            super(c0Var, i10, i11, f10, f11, f12, f13);
            this.f2759n = i12;
            this.f2760o = c0Var2;
        }

        @Override // androidx.recyclerview.widget.p.f, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2778l) {
                this.f2771e.setIsRecyclable(true);
            }
            this.f2778l = true;
            if (this.f2777k) {
                return;
            }
            if (this.f2759n <= 0) {
                p pVar = p.this;
                pVar.f2743m.a(pVar.f2748r, this.f2760o);
            } else {
                p.this.f2731a.add(this.f2760o.itemView);
                this.f2774h = true;
                int i10 = this.f2759n;
                if (i10 > 0) {
                    p pVar2 = p.this;
                    pVar2.f2748r.post(new q(pVar2, this, i10));
                }
            }
            p pVar3 = p.this;
            View view = pVar3.f2753w;
            View view2 = this.f2760o.itemView;
            if (view == view2) {
                pVar3.n(view2);
            }
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Interpolator f2762b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Interpolator f2763c = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2764a = -1;

        public static class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        public static class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int c(int i10, int i11) {
            int i12;
            int i13 = i10 & 789516;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & 789516) << 2;
            }
            return i14 | i12;
        }

        public void a(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            View view = c0Var.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                p0.e0.i.s(view, fFloatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }

        public int b(int i10, int i11) {
            int i12;
            int i13 = i10 & 3158064;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (i15 & 3158064) >> 2;
            }
            return i14 | i12;
        }

        public final int d(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            int iE = e(recyclerView, c0Var);
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            return b(iE, p0.e0.e.d(recyclerView));
        }

        public abstract int e(RecyclerView recyclerView, RecyclerView.c0 c0Var);

        public int f(RecyclerView recyclerView, int i10, int i11, long j10) {
            if (this.f2764a == -1) {
                this.f2764a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int interpolation = (int) (((a) f2762b).getInterpolation(j10 <= 2000 ? j10 / 2000.0f : 1.0f) * ((int) (((b) f2763c).getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * this.f2764a)));
            if (interpolation == 0) {
                return i11 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, float f10, float f11, int i10, boolean z10) {
            View view = c0Var.itemView;
            if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                Float fValueOf = Float.valueOf(p0.e0.i.i(view));
                int childCount = recyclerView.getChildCount();
                float f12 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = recyclerView.getChildAt(i11);
                    if (childAt != view) {
                        WeakHashMap<View, m0> weakHashMap2 = p0.e0.f34354a;
                        float fI = p0.e0.i.i(childAt);
                        if (fI > f12) {
                            f12 = fI;
                        }
                    }
                }
                p0.e0.i.s(view, f12 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f10);
            view.setTranslationY(f11);
        }

        public abstract boolean h(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2);

        public void i(RecyclerView.c0 c0Var, int i10) {
        }

        public abstract void j(RecyclerView.c0 c0Var, int i10);
    }

    public class e extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2765c = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewJ;
            RecyclerView.c0 childViewHolder;
            if (!this.f2765c || (viewJ = p.this.j(motionEvent)) == null || (childViewHolder = p.this.f2748r.getChildViewHolder(viewJ)) == null) {
                return;
            }
            p pVar = p.this;
            if ((pVar.f2743m.d(pVar.f2748r, childViewHolder) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = p.this.f2742l;
                if (pointerId == i10) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    p pVar2 = p.this;
                    pVar2.f2734d = x10;
                    pVar2.f2735e = y10;
                    pVar2.f2739i = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    pVar2.f2738h = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    Objects.requireNonNull(pVar2.f2743m);
                    p.this.o(childViewHolder, 2);
                }
            }
        }
    }

    public static class f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f2767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f2768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f2769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f2770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final RecyclerView.c0 f2771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2772f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ValueAnimator f2773g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f2774h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f2775i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f2776j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2777k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f2778l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f2779m;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.f2779m = valueAnimator.getAnimatedFraction();
            }
        }

        public f(RecyclerView.c0 c0Var, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f2772f = i11;
            this.f2771e = c0Var;
            this.f2767a = f10;
            this.f2768b = f11;
            this.f2769c = f12;
            this.f2770d = f13;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
            this.f2773g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(c0Var.itemView);
            valueAnimatorOfFloat.addListener(this);
            this.f2779m = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2779m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2778l) {
                this.f2771e.setIsRecyclable(true);
            }
            this.f2778l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface g {
        void prepareForDrop(View view, View view2, int i10, int i11);
    }

    public p(d dVar) {
        this.f2743m = dVar;
    }

    public static boolean l(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(View view) {
        n(view);
        RecyclerView.c0 childViewHolder = this.f2748r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.c0 c0Var = this.f2733c;
        if (c0Var != null && childViewHolder == c0Var) {
            o(null, 0);
            return;
        }
        i(childViewHolder, false);
        if (this.f2731a.remove(childViewHolder.itemView)) {
            this.f2743m.a(this.f2748r, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d(View view) {
    }

    public final int f(RecyclerView.c0 c0Var, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.f2738h > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 8 : 4;
        VelocityTracker velocityTracker = this.f2750t;
        if (velocityTracker != null && this.f2742l > -1) {
            d dVar = this.f2743m;
            float f10 = this.f2737g;
            Objects.requireNonNull(dVar);
            velocityTracker.computeCurrentVelocity(1000, f10);
            float xVelocity = this.f2750t.getXVelocity(this.f2742l);
            float yVelocity = this.f2750t.getYVelocity(this.f2742l);
            int i12 = xVelocity <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12) {
                d dVar2 = this.f2743m;
                float f11 = this.f2736f;
                Objects.requireNonNull(dVar2);
                if (fAbs >= f11 && fAbs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
        }
        float width = this.f2748r.getWidth();
        Objects.requireNonNull(this.f2743m);
        float f12 = width * 0.5f;
        if ((i10 & i11) == 0 || Math.abs(this.f2738h) <= f12) {
            return 0;
        }
        return i11;
    }

    public void g(int i10, MotionEvent motionEvent, int i11) {
        int iD;
        View viewJ;
        if (this.f2733c == null && i10 == 2 && this.f2744n != 2) {
            Objects.requireNonNull(this.f2743m);
            if (this.f2748r.getScrollState() == 1) {
                return;
            }
            RecyclerView.o layoutManager = this.f2748r.getLayoutManager();
            int i12 = this.f2742l;
            RecyclerView.c0 childViewHolder = null;
            if (i12 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i12);
                float x10 = motionEvent.getX(iFindPointerIndex) - this.f2734d;
                float y10 = motionEvent.getY(iFindPointerIndex) - this.f2735e;
                float fAbs = Math.abs(x10);
                float fAbs2 = Math.abs(y10);
                float f10 = this.f2747q;
                if ((fAbs >= f10 || fAbs2 >= f10) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewJ = j(motionEvent)) != null))) {
                    childViewHolder = this.f2748r.getChildViewHolder(viewJ);
                }
            }
            if (childViewHolder == null || (iD = (this.f2743m.d(this.f2748r, childViewHolder) & 65280) >> 8) == 0) {
                return;
            }
            float x11 = motionEvent.getX(i11);
            float y11 = motionEvent.getY(i11);
            float f11 = x11 - this.f2734d;
            float f12 = y11 - this.f2735e;
            float fAbs3 = Math.abs(f11);
            float fAbs4 = Math.abs(f12);
            float f13 = this.f2747q;
            if (fAbs3 >= f13 || fAbs4 >= f13) {
                if (fAbs3 > fAbs4) {
                    if (f11 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && (iD & 4) == 0) {
                        return;
                    }
                    if (f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && (iD & 8) == 0) {
                        return;
                    }
                } else {
                    if (f12 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && (iD & 1) == 0) {
                        return;
                    }
                    if (f12 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && (iD & 2) == 0) {
                        return;
                    }
                }
                this.f2739i = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                this.f2738h = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                this.f2742l = motionEvent.getPointerId(0);
                o(childViewHolder, 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.setEmpty();
    }

    public final int h(RecyclerView.c0 c0Var, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.f2739i > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 2 : 1;
        VelocityTracker velocityTracker = this.f2750t;
        if (velocityTracker != null && this.f2742l > -1) {
            d dVar = this.f2743m;
            float f10 = this.f2737g;
            Objects.requireNonNull(dVar);
            velocityTracker.computeCurrentVelocity(1000, f10);
            float xVelocity = this.f2750t.getXVelocity(this.f2742l);
            float yVelocity = this.f2750t.getYVelocity(this.f2742l);
            int i12 = yVelocity <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11) {
                d dVar2 = this.f2743m;
                float f11 = this.f2736f;
                Objects.requireNonNull(dVar2);
                if (fAbs >= f11 && fAbs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
        }
        float height = this.f2748r.getHeight();
        Objects.requireNonNull(this.f2743m);
        float f12 = height * 0.5f;
        if ((i10 & i11) == 0 || Math.abs(this.f2739i) <= f12) {
            return 0;
        }
        return i11;
    }

    public void i(RecyclerView.c0 c0Var, boolean z10) {
        for (int size = this.f2746p.size() - 1; size >= 0; size--) {
            f fVar = this.f2746p.get(size);
            if (fVar.f2771e == c0Var) {
                fVar.f2777k |= z10;
                if (!fVar.f2778l) {
                    fVar.f2773g.cancel();
                }
                this.f2746p.remove(size);
                return;
            }
        }
    }

    public View j(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.c0 c0Var = this.f2733c;
        if (c0Var != null) {
            View view = c0Var.itemView;
            if (l(view, x10, y10, this.f2740j + this.f2738h, this.f2741k + this.f2739i)) {
                return view;
            }
        }
        for (int size = this.f2746p.size() - 1; size >= 0; size--) {
            f fVar = this.f2746p.get(size);
            View view2 = fVar.f2771e.itemView;
            if (l(view2, x10, y10, fVar.f2775i, fVar.f2776j)) {
                return view2;
            }
        }
        return this.f2748r.findChildViewUnder(x10, y10);
    }

    public final void k(float[] fArr) {
        if ((this.f2745o & 12) != 0) {
            fArr[0] = (this.f2740j + this.f2738h) - this.f2733c.itemView.getLeft();
        } else {
            fArr[0] = this.f2733c.itemView.getTranslationX();
        }
        if ((this.f2745o & 3) != 0) {
            fArr[1] = (this.f2741k + this.f2739i) - this.f2733c.itemView.getTop();
        } else {
            fArr[1] = this.f2733c.itemView.getTranslationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(RecyclerView.c0 c0Var) {
        List<RecyclerView.c0> list;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        if (!this.f2748r.isLayoutRequested() && this.f2744n == 2) {
            Objects.requireNonNull(this.f2743m);
            int i10 = (int) (this.f2740j + this.f2738h);
            int i11 = (int) (this.f2741k + this.f2739i);
            if (Math.abs(i11 - c0Var.itemView.getTop()) >= c0Var.itemView.getHeight() * 0.5f || Math.abs(i10 - c0Var.itemView.getLeft()) >= c0Var.itemView.getWidth() * 0.5f) {
                List<RecyclerView.c0> list2 = this.f2751u;
                if (list2 == null) {
                    this.f2751u = new ArrayList();
                    this.f2752v = new ArrayList();
                } else {
                    list2.clear();
                    this.f2752v.clear();
                }
                Objects.requireNonNull(this.f2743m);
                int iRound = Math.round(this.f2740j + this.f2738h) - 0;
                int iRound2 = Math.round(this.f2741k + this.f2739i) - 0;
                int width = c0Var.itemView.getWidth() + iRound + 0;
                int height = c0Var.itemView.getHeight() + iRound2 + 0;
                int i12 = (iRound + width) / 2;
                int i13 = (iRound2 + height) / 2;
                RecyclerView.o layoutManager = this.f2748r.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = layoutManager.getChildAt(i14);
                    if (childAt != c0Var.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                        RecyclerView.c0 childViewHolder = this.f2748r.getChildViewHolder(childAt);
                        Objects.requireNonNull(this.f2743m);
                        int iAbs5 = Math.abs(i12 - ((childAt.getRight() + childAt.getLeft()) / 2));
                        int iAbs6 = Math.abs(i13 - ((childAt.getBottom() + childAt.getTop()) / 2));
                        int i15 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                        int size = this.f2751u.size();
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < size) {
                            int i18 = size;
                            if (i15 <= this.f2752v.get(i16).intValue()) {
                                break;
                            }
                            i17++;
                            i16++;
                            size = i18;
                        }
                        this.f2751u.add(i17, childViewHolder);
                        this.f2752v.add(i17, Integer.valueOf(i15));
                    }
                    i14++;
                    iRound = iRound;
                    iRound2 = iRound2;
                }
                List<RecyclerView.c0> list3 = this.f2751u;
                if (list3.size() == 0) {
                    return;
                }
                Objects.requireNonNull(this.f2743m);
                int width2 = c0Var.itemView.getWidth() + i10;
                int height2 = c0Var.itemView.getHeight() + i11;
                int left2 = i10 - c0Var.itemView.getLeft();
                int top2 = i11 - c0Var.itemView.getTop();
                int size2 = list3.size();
                int i19 = -1;
                RecyclerView.c0 c0Var2 = null;
                int i20 = 0;
                while (i20 < size2) {
                    RecyclerView.c0 c0Var3 = list3.get(i20);
                    if (left2 <= 0 || (right = c0Var3.itemView.getRight() - width2) >= 0) {
                        list = list3;
                    } else {
                        list = list3;
                        if (c0Var3.itemView.getRight() > c0Var.itemView.getRight() && (iAbs4 = Math.abs(right)) > i19) {
                            i19 = iAbs4;
                            c0Var2 = c0Var3;
                        }
                    }
                    if (left2 < 0 && (left = c0Var3.itemView.getLeft() - i10) > 0 && c0Var3.itemView.getLeft() < c0Var.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i19) {
                        i19 = iAbs3;
                        c0Var2 = c0Var3;
                    }
                    if (top2 < 0 && (top = c0Var3.itemView.getTop() - i11) > 0 && c0Var3.itemView.getTop() < c0Var.itemView.getTop() && (iAbs2 = Math.abs(top)) > i19) {
                        i19 = iAbs2;
                        c0Var2 = c0Var3;
                    }
                    if (top2 > 0 && (bottom = c0Var3.itemView.getBottom() - height2) < 0 && c0Var3.itemView.getBottom() > c0Var.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i19) {
                        i19 = iAbs;
                        c0Var2 = c0Var3;
                    }
                    i20++;
                    list3 = list;
                }
                if (c0Var2 == null) {
                    this.f2751u.clear();
                    this.f2752v.clear();
                    return;
                }
                int adapterPosition = c0Var2.getAdapterPosition();
                c0Var.getAdapterPosition();
                if (this.f2743m.h(this.f2748r, c0Var, c0Var2)) {
                    d dVar = this.f2743m;
                    RecyclerView recyclerView = this.f2748r;
                    Objects.requireNonNull(dVar);
                    RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
                    if (layoutManager2 instanceof g) {
                        ((g) layoutManager2).prepareForDrop(c0Var.itemView, c0Var2.itemView, i10, i11);
                        return;
                    }
                    if (layoutManager2.canScrollHorizontally()) {
                        if (layoutManager2.getDecoratedLeft(c0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                            recyclerView.scrollToPosition(adapterPosition);
                        }
                        if (layoutManager2.getDecoratedRight(c0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.scrollToPosition(adapterPosition);
                        }
                    }
                    if (layoutManager2.canScrollVertically()) {
                        if (layoutManager2.getDecoratedTop(c0Var2.itemView) <= recyclerView.getPaddingTop()) {
                            recyclerView.scrollToPosition(adapterPosition);
                        }
                        if (layoutManager2.getDecoratedBottom(c0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.scrollToPosition(adapterPosition);
                        }
                    }
                }
            }
        }
    }

    public void n(View view) {
        if (view == this.f2753w) {
            this.f2753w = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[PHI: r2
  0x0086: PHI (r2v13 int) = (r2v12 int), (r2v15 int) binds: [B:41:0x00a6, B:30:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:81:0x019e  */
    public void o(RecyclerView.c0 c0Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        RecyclerView.c0 c0Var2;
        int iH;
        int i12;
        float fSignum;
        float fSignum2;
        int i13;
        long j10;
        if (c0Var == this.f2733c && i10 == this.f2744n) {
            return;
        }
        this.C = Long.MIN_VALUE;
        int i14 = this.f2744n;
        i(c0Var, true);
        this.f2744n = i10;
        if (i10 == 2) {
            if (c0Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f2753w = c0Var.itemView;
        }
        int i15 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.c0 c0Var3 = this.f2733c;
        if (c0Var3 != null) {
            if (c0Var3.itemView.getParent() != null) {
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    if (this.f2744n == 2) {
                        iH = 0;
                    } else {
                        int iE = this.f2743m.e(this.f2748r, c0Var3);
                        d dVar = this.f2743m;
                        RecyclerView recyclerView = this.f2748r;
                        WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                        int iB = (dVar.b(iE, p0.e0.e.d(recyclerView)) & 65280) >> 8;
                        if (iB == 0) {
                            iH = 0;
                        } else {
                            int i16 = (iE & 65280) >> 8;
                            if (Math.abs(this.f2738h) > Math.abs(this.f2739i)) {
                                iH = f(c0Var3, iB);
                                if (iH <= 0) {
                                    iH = h(c0Var3, iB);
                                    if (iH <= 0) {
                                        iH = 0;
                                    }
                                } else if ((i16 & iH) == 0) {
                                    iH = d.c(iH, p0.e0.e.d(this.f2748r));
                                }
                            } else {
                                iH = h(c0Var3, iB);
                                if (iH <= 0) {
                                    iH = f(c0Var3, iB);
                                    if (iH <= 0) {
                                        iH = 0;
                                    } else if ((i16 & iH) == 0) {
                                        iH = d.c(iH, p0.e0.e.d(this.f2748r));
                                    }
                                }
                            }
                        }
                    }
                    i12 = iH;
                }
                VelocityTracker velocityTracker = this.f2750t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f2750t = null;
                }
                if (i12 == 1 || i12 == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f2739i) * this.f2748r.getHeight();
                } else if (i12 == 4 || i12 == 8 || i12 == 16 || i12 == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f2738h) * this.f2748r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i14 == 2) {
                    i13 = 8;
                } else {
                    i13 = i12 > 0 ? 2 : 4;
                }
                k(this.f2732b);
                float[] fArr = this.f2732b;
                int i17 = i13;
                i11 = 8;
                c cVar = new c(c0Var3, i13, i14, fArr[0], fArr[1], fSignum, fSignum2, i12, c0Var3);
                d dVar2 = this.f2743m;
                RecyclerView recyclerView2 = this.f2748r;
                Objects.requireNonNull(dVar2);
                RecyclerView.l itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    j10 = i17 == 8 ? 200L : 250L;
                } else {
                    j10 = i17 == 8 ? itemAnimator.f2467e : itemAnimator.f2466d;
                }
                cVar.f2773g.setDuration(j10);
                this.f2746p.add(cVar);
                c0Var3.setIsRecyclable(false);
                cVar.f2773g.start();
                c0Var2 = null;
                z10 = true;
            } else {
                i11 = 8;
                n(c0Var3.itemView);
                this.f2743m.a(this.f2748r, c0Var3);
                c0Var2 = null;
                z10 = false;
            }
            this.f2733c = c0Var2;
        } else {
            i11 = 8;
            z10 = false;
        }
        if (c0Var != null) {
            this.f2745o = (this.f2743m.d(this.f2748r, c0Var) & i15) >> (this.f2744n * i11);
            this.f2740j = c0Var.itemView.getLeft();
            this.f2741k = c0Var.itemView.getTop();
            this.f2733c = c0Var;
            if (i10 == 2) {
                z11 = false;
                c0Var.itemView.performHapticFeedback(0);
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        ViewParent parent = this.f2748r.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f2733c != null ? true : z11);
        }
        if (!z10) {
            this.f2748r.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.f2743m.i(this.f2733c, this.f2744n);
        this.f2748r.invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f10;
        float f11;
        this.f2754x = -1;
        if (this.f2733c != null) {
            k(this.f2732b);
            float[] fArr = this.f2732b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        d dVar = this.f2743m;
        RecyclerView.c0 c0Var = this.f2733c;
        List<f> list = this.f2746p;
        int i10 = this.f2744n;
        Objects.requireNonNull(dVar);
        int i11 = 0;
        for (int size = list.size(); i11 < size; size = size) {
            f fVar = list.get(i11);
            float f13 = fVar.f2767a;
            float f14 = fVar.f2769c;
            fVar.f2775i = f13 == f14 ? fVar.f2771e.itemView.getTranslationX() : w.e.a(f14, f13, fVar.f2779m, f13);
            float f15 = fVar.f2768b;
            float f16 = fVar.f2770d;
            fVar.f2776j = f15 == f16 ? fVar.f2771e.itemView.getTranslationY() : w.e.a(f16, f15, fVar.f2779m, f15);
            int iSave = canvas.save();
            dVar.g(canvas, recyclerView, fVar.f2771e, fVar.f2775i, fVar.f2776j, fVar.f2772f, false);
            canvas.restoreToCount(iSave);
            i11++;
        }
        if (c0Var != null) {
            int iSave2 = canvas.save();
            dVar.g(canvas, recyclerView, c0Var, f10, f11, i10, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        boolean z10 = false;
        if (this.f2733c != null) {
            k(this.f2732b);
            float[] fArr = this.f2732b;
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        d dVar = this.f2743m;
        RecyclerView.c0 c0Var = this.f2733c;
        List<f> list = this.f2746p;
        Objects.requireNonNull(dVar);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = list.get(i10);
            int iSave = canvas.save();
            View view = fVar.f2771e.itemView;
            canvas.restoreToCount(iSave);
        }
        if (c0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            f fVar2 = list.get(i11);
            boolean z11 = fVar2.f2778l;
            if (z11 && !fVar2.f2774h) {
                list.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public void p(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f2734d;
        this.f2738h = f10;
        this.f2739i = y10 - this.f2735e;
        if ((i10 & 4) == 0) {
            this.f2738h = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10);
        }
        if ((i10 & 8) == 0) {
            this.f2738h = Math.min(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, this.f2738h);
        }
        if ((i10 & 1) == 0) {
            this.f2739i = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, this.f2739i);
        }
        if ((i10 & 2) == 0) {
            this.f2739i = Math.min(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, this.f2739i);
        }
    }
}
