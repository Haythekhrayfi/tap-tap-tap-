package t9;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes2.dex */
public class e extends HorizontalScrollView {
    public static final TimeInterpolator G = new c1.b();
    public static final o0.e<f> H = new o0.g(16);
    public ValueAnimator A;
    public ViewPager B;
    public v1.a C;
    public DataSetObserver D;
    public g E;
    public final o0.e<s> F;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<f> f35761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f35762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f35763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f35768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y7.a f35770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f35771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35772n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35773o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f35774p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f35775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f35776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f35777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f35778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f35779u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k9.g f35780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f35782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f35783y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c f35784z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35785a;

        static {
            int[] iArr = new int[b.values().length];
            f35785a = iArr;
            try {
                iArr[b.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35785a[b.SLIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        SLIDE,
        FADE,
        NONE
    }

    public interface c {
        void a(f fVar);

        void b(f fVar);

        void c(f fVar);
    }

    public static class d extends LinearLayout {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final /* synthetic */ int f35786x = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f35787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f35788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f35789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f35790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f35791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f35792h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f35793i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f35794j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float[] f35795k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f35796l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f35797m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f35798n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ValueAnimator f35799o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Paint f35800p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Path f35801q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final RectF f35802r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f35803s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f35804t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f35805u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f35806v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public b f35807w;

        public d(Context context, int i10, int i11) {
            super(context);
            this.f35788d = -1;
            this.f35789e = -1;
            this.f35790f = -1;
            this.f35792h = 0;
            this.f35796l = -1;
            this.f35797m = -1;
            this.f35805u = 1.0f;
            this.f35806v = -1;
            this.f35807w = b.SLIDE;
            setId(R.id.tab_sliding_oval_indicator);
            setWillNotDraw(false);
            int childCount = getChildCount();
            this.f35798n = childCount;
            c(childCount);
            Paint paint = new Paint();
            this.f35800p = paint;
            paint.setAntiAlias(true);
            this.f35802r = new RectF();
            this.f35803s = i10;
            this.f35804t = i11;
            this.f35801q = new Path();
            this.f35795k = new float[8];
        }

        public void a(int i10, long j10) {
            ValueAnimator valueAnimator = this.f35799o;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f35799o.cancel();
                j10 = Math.round((1.0f - this.f35799o.getAnimatedFraction()) * this.f35799o.getDuration());
            }
            View childAt = getChildAt(i10);
            if (childAt == null) {
                g();
                return;
            }
            int i11 = a.f35785a[this.f35807w.ordinal()];
            if (i11 == 1) {
                if (i10 != this.f35790f) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
                    valueAnimatorOfFloat.setInterpolator(e.G);
                    valueAnimatorOfFloat.setDuration(j10);
                    valueAnimatorOfFloat.addUpdateListener(new com.applovin.exoplayer2.ui.m(this));
                    valueAnimatorOfFloat.addListener(new t9.h(this));
                    this.f35806v = i10;
                    this.f35799o = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                    return;
                }
                return;
            }
            if (i11 != 2) {
                f(i10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                return;
            }
            final int i12 = this.f35796l;
            final int i13 = this.f35797m;
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (i12 == left && i13 == right) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(e.G);
            valueAnimatorOfFloat2.setDuration(j10);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t9.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    e.d dVar = this.f35817a;
                    int i14 = i12;
                    int i15 = left;
                    int i16 = i13;
                    int i17 = right;
                    Objects.requireNonNull(dVar);
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    int iRound = Math.round((i15 - i14) * animatedFraction) + i14;
                    int iRound2 = Math.round(animatedFraction * (i17 - i16)) + i16;
                    if (iRound != dVar.f35796l || iRound2 != dVar.f35797m) {
                        dVar.f35796l = iRound;
                        dVar.f35797m = iRound2;
                        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                        e0.d.k(dVar);
                    }
                    WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                    e0.d.k(dVar);
                }
            });
            valueAnimatorOfFloat2.addListener(new t9.g(this));
            this.f35806v = i10;
            this.f35799o = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.start();
        }

        @Override // android.view.ViewGroup
        public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            int childCount = getChildCount();
            if (i10 < 0) {
                i10 = childCount;
            }
            if (i10 == 0) {
                if (childCount != 0) {
                    View childAt = getChildAt(0);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    marginLayoutParams2.leftMargin = this.f35792h;
                    updateViewLayout(childAt, marginLayoutParams2);
                }
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = 0;
            } else {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = this.f35792h;
            }
            super.addView(view, i10, marginLayoutParams);
        }

        public final void b(Canvas canvas, int i10, int i11, float f10, int i12, float f11) {
            if (i10 < 0 || i11 <= i10) {
                return;
            }
            this.f35802r.set(i10, this.f35803s, i11, f10 - this.f35804t);
            float fWidth = this.f35802r.width();
            float fHeight = this.f35802r.height();
            float[] fArr = new float[8];
            for (int i13 = 0; i13 < 8; i13++) {
                float f12 = this.f35795k[i13];
                float fMin = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                if (fHeight > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && fWidth > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    fMin = Math.min(fHeight, fWidth) / 2.0f;
                    if (f12 != -1.0f) {
                        fMin = Math.min(f12, fMin);
                    }
                }
                fArr[i13] = fMin;
            }
            this.f35801q.reset();
            this.f35801q.addRoundRect(this.f35802r, fArr, Path.Direction.CW);
            this.f35801q.close();
            this.f35800p.setColor(i12);
            this.f35800p.setAlpha(Math.round(this.f35800p.getAlpha() * f11));
            canvas.drawPath(this.f35801q, this.f35800p);
        }

        public final void c(int i10) {
            this.f35798n = i10;
            this.f35793i = new int[i10];
            this.f35794j = new int[i10];
            for (int i11 = 0; i11 < this.f35798n; i11++) {
                this.f35793i[i11] = -1;
                this.f35794j[i11] = -1;
            }
        }

        public void d(int i10) {
            if (this.f35789e != i10) {
                if ((i10 >> 24) == 0) {
                    i10 = -1;
                }
                this.f35789e = i10;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.k(this);
            }
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int i10;
            int i11;
            int i12;
            float f10;
            float height = getHeight();
            if (this.f35789e != -1) {
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    b(canvas, this.f35793i[i13], this.f35794j[i13], height, this.f35789e, 1.0f);
                }
            }
            if (this.f35788d != -1) {
                int i14 = a.f35785a[this.f35807w.ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        int[] iArr = this.f35793i;
                        int i15 = this.f35790f;
                        i10 = iArr[i15];
                        i11 = this.f35794j[i15];
                    } else {
                        i10 = this.f35796l;
                        i11 = this.f35797m;
                    }
                    i12 = this.f35788d;
                    f10 = 1.0f;
                } else {
                    int[] iArr2 = this.f35793i;
                    int i16 = this.f35790f;
                    b(canvas, iArr2[i16], this.f35794j[i16], height, this.f35788d, this.f35805u);
                    int i17 = this.f35806v;
                    if (i17 != -1) {
                        i10 = this.f35793i[i17];
                        i11 = this.f35794j[i17];
                        i12 = this.f35788d;
                        f10 = 1.0f - this.f35805u;
                    }
                }
                b(canvas, i10, i11, height, i12, f10);
            }
            super.draw(canvas);
        }

        public void e(int i10) {
            if (this.f35788d != i10) {
                if ((i10 >> 24) == 0) {
                    i10 = -1;
                }
                this.f35788d = i10;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.k(this);
            }
        }

        public void f(int i10, float f10) {
            ValueAnimator valueAnimator = this.f35799o;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f35799o.cancel();
            }
            this.f35790f = i10;
            this.f35791g = f10;
            g();
            float f11 = 1.0f - this.f35791g;
            if (f11 != this.f35805u) {
                this.f35805u = f11;
                int i11 = this.f35790f + 1;
                if (i11 >= this.f35798n) {
                    i11 = -1;
                }
                this.f35806v = i11;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.k(this);
            }
        }

        public void g() {
            int right;
            int right2;
            int i10;
            int childCount = getChildCount();
            if (childCount != this.f35798n) {
                c(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                int left = -1;
                if (childAt == null || childAt.getWidth() <= 0) {
                    right = -1;
                    right2 = -1;
                    i10 = -1;
                } else {
                    left = childAt.getLeft();
                    right = childAt.getRight();
                    if (this.f35807w != b.SLIDE || i11 != this.f35790f || this.f35791g <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || i11 >= childCount - 1) {
                        right2 = right;
                        i10 = left;
                    } else {
                        View childAt2 = getChildAt(i11 + 1);
                        float left2 = this.f35791g * childAt2.getLeft();
                        float f10 = this.f35791g;
                        i10 = (int) (((1.0f - f10) * left) + left2);
                        right2 = (int) (((1.0f - this.f35791g) * right) + (f10 * childAt2.getRight()));
                    }
                }
                int[] iArr = this.f35793i;
                int i12 = iArr[i11];
                int[] iArr2 = this.f35794j;
                int i13 = iArr2[i11];
                if (left != i12 || right != i13) {
                    iArr[i11] = left;
                    iArr2[i11] = right;
                    WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                    e0.d.k(this);
                }
                if (i11 == this.f35790f && (i10 != this.f35796l || right2 != this.f35797m)) {
                    this.f35796l = i10;
                    this.f35797m = right2;
                    WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                    e0.d.k(this);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            g();
            ValueAnimator valueAnimator = this.f35799o;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f35799o.cancel();
            a(this.f35806v, Math.round((1.0f - this.f35799o.getAnimatedFraction()) * this.f35799o.getDuration()));
        }
    }

    /* JADX INFO: renamed from: t9.e$e, reason: collision with other inner class name */
    public class C0419e extends DataSetObserver {
        public C0419e(a aVar) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            e.this.p();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            e.this.p();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f35809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35810b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f35811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public s f35812d;

        public f() {
        }

        public f(a aVar) {
        }

        public void a() {
            e eVar = this.f35811c;
            if (eVar == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            eVar.r(this, true);
        }

        public f b(CharSequence charSequence) {
            this.f35809a = charSequence;
            s sVar = this.f35812d;
            if (sVar != null) {
                sVar.e();
            }
            return this;
        }
    }

    public static class g implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<e> f35813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f35815c;

        public g(e eVar) {
            this.f35813a = new WeakReference<>(eVar);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
            this.f35814b = this.f35815c;
            this.f35815c = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
            e eVar = this.f35813a.get();
            if (eVar != null) {
                if (this.f35815c != 2 || this.f35814b == 1) {
                    eVar.t(i10, f10, true, true);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            e eVar = this.f35813a.get();
            if (eVar == null || eVar.getSelectedTabPosition() == i10) {
                return;
            }
            int i11 = this.f35815c;
            eVar.r(eVar.f35761c.get(i10), i11 == 0 || (i11 == 2 && this.f35814b == 0));
        }
    }

    public static class h implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager f35816a;

        public h(ViewPager viewPager) {
            this.f35816a = viewPager;
        }

        @Override // t9.e.c
        public void a(f fVar) {
        }

        @Override // t9.e.c
        public void b(f fVar) {
            this.f35816a.setCurrentItem(fVar.f35810b);
        }

        @Override // t9.e.c
        public void c(f fVar) {
        }
    }

    public e(Context context) {
        this(context, null);
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"PrivateResource"})
    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35761c = new ArrayList<>();
        this.f35768j = 300L;
        this.f35770l = y7.a.f38439b;
        this.f35773o = Integer.MAX_VALUE;
        this.f35780v = new k9.g(this);
        this.F = new o0.f(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o7.b.f34001f, i10, 2131952533);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, o7.b.f33997b, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, 0);
        this.f35772n = typedArrayObtainStyledAttributes2.getBoolean(6, false);
        this.f35782x = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f35777s = typedArrayObtainStyledAttributes2.getBoolean(1, true);
        this.f35778t = typedArrayObtainStyledAttributes2.getBoolean(5, false);
        this.f35779u = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        d dVar = new d(context, dimensionPixelSize, dimensionPixelSize2);
        this.f35763e = dVar;
        super.addView(dVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        if (dVar.f35787c != dimensionPixelSize3) {
            dVar.f35787c = dimensionPixelSize3;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.k(dVar);
        }
        dVar.e(typedArrayObtainStyledAttributes.getColor(8, 0));
        dVar.d(typedArrayObtainStyledAttributes.getColor(0, 0));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.f35767i = dimensionPixelSize4;
        this.f35766h = dimensionPixelSize4;
        this.f35765g = dimensionPixelSize4;
        this.f35764f = dimensionPixelSize4;
        this.f35764f = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize4);
        this.f35765g = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, this.f35765g);
        this.f35766h = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, this.f35766h);
        this.f35767i = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, this.f35767i);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(23, 2131952184);
        this.f35769k = resourceId;
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, o7.b.f34002g);
        try {
            this.f35771m = typedArrayObtainStyledAttributes3.getColorStateList(3);
            typedArrayObtainStyledAttributes3.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(24)) {
                this.f35771m = typedArrayObtainStyledAttributes.getColorStateList(24);
            }
            if (typedArrayObtainStyledAttributes.hasValue(22)) {
                this.f35771m = l(this.f35771m.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(22, 0));
            }
            this.f35774p = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.f35775q = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f35781w = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f35783y = typedArrayObtainStyledAttributes.getInt(15, 1);
            typedArrayObtainStyledAttributes.recycle();
            this.f35776r = getResources().getDimensionPixelSize(R.dimen.tab_scrollable_min_width);
            j();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes3.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabMaxWidth() {
        return this.f35773o;
    }

    private int getTabMinWidth() {
        int i10 = this.f35774p;
        if (i10 != -1) {
            return i10;
        }
        if (this.f35783y == 0) {
            return this.f35776r;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f35763e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList l(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f35763e.getChildCount();
        if (i10 >= childCount || this.f35763e.getChildAt(i10).isSelected()) {
            return;
        }
        int i11 = 0;
        while (i11 < childCount) {
            this.f35763e.getChildAt(i11).setSelected(i11 == i10);
            i11++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        h(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        h(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        h(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        h(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f35780v.a(motionEvent);
        return zDispatchTouchEvent;
    }

    public void g(f fVar, boolean z10) {
        if (fVar.f35811c != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        s sVar = fVar.f35812d;
        d dVar = this.f35763e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.width = -2;
        layoutParams.weight = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        dVar.addView(sVar, layoutParams);
        if (z10) {
            sVar.setSelected(true);
        }
        int size = this.f35761c.size();
        fVar.f35810b = size;
        this.f35761c.add(size, fVar);
        int size2 = this.f35761c.size();
        while (true) {
            size++;
            if (size >= size2) {
                break;
            } else {
                this.f35761c.get(size).f35810b = size;
            }
        }
        if (z10) {
            fVar.a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public g getPageChangeListener() {
        if (this.E == null) {
            this.E = new g(this);
        }
        return this.E;
    }

    public int getSelectedTabPosition() {
        f fVar = this.f35762d;
        if (fVar != null) {
            return fVar.f35810b;
        }
        return -1;
    }

    public int getSelectedTabTextColor() {
        return this.f35771m.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    public int getTabCount() {
        return this.f35761c.size();
    }

    public int getTabMode() {
        return this.f35783y;
    }

    public ColorStateList getTabTextColors() {
        return this.f35771m;
    }

    public final void h(View view) {
        if (!(view instanceof m)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        f fVarO = o();
        CharSequence charSequence = ((m) view).f35835c;
        if (charSequence != null) {
            fVarO.b(charSequence);
        }
        g(fVarO, this.f35761c.isEmpty());
    }

    public final void i(int i10) {
        boolean z10;
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null && x1.q.k(this)) {
            d dVar = this.f35763e;
            int childCount = dVar.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    z10 = false;
                    break;
                } else {
                    if (dVar.getChildAt(i11).getWidth() <= 0) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            }
            if (!z10) {
                int scrollX = getScrollX();
                int iK = k(i10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                if (scrollX != iK) {
                    if (this.A == null) {
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(new int[0]);
                        this.A = valueAnimatorOfInt;
                        valueAnimatorOfInt.setInterpolator(G);
                        this.A.setDuration(this.f35768j);
                        this.A.addUpdateListener(new com.applovin.exoplayer2.ui.m(this));
                    }
                    this.A.setIntValues(scrollX, iK);
                    this.A.start();
                }
                this.f35763e.a(i10, this.f35768j);
                return;
            }
        }
        t(i10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, true, true);
    }

    public final void j() {
        int iMax;
        int iMax2;
        d dVar;
        if (this.f35783y == 0) {
            iMax = Math.max(0, this.f35781w - this.f35764f);
            iMax2 = Math.max(0, this.f35782x - this.f35766h);
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        d dVar2 = this.f35763e;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.e.k(dVar2, iMax, 0, iMax2, 0);
        int i10 = 1;
        if (this.f35783y != 1) {
            dVar = this.f35763e;
            i10 = 8388611;
        } else {
            dVar = this.f35763e;
        }
        dVar.setGravity(i10);
        for (int i11 = 0; i11 < this.f35763e.getChildCount(); i11++) {
            View childAt = this.f35763e.getChildAt(i11);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.weight = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            childAt.requestLayout();
        }
    }

    public final int k(int i10, float f10) {
        View childAt;
        if (this.f35783y != 0 || (childAt = this.f35763e.getChildAt(i10)) == null) {
            return 0;
        }
        int width = childAt.getWidth();
        if (this.f35778t) {
            return childAt.getLeft() - this.f35779u;
        }
        int i11 = i10 + 1;
        View childAt2 = i11 < this.f35763e.getChildCount() ? this.f35763e.getChildAt(i11) : null;
        return ((childAt.getWidth() / 2) + (childAt.getLeft() + ((int) (((width + (childAt2 != null ? childAt2.getWidth() : 0)) * f10) * 0.5f)))) - (getWidth() / 2);
    }

    public s m(Context context) {
        return new s(context);
    }

    public f n(int i10) {
        return this.f35761c.get(i10);
    }

    public f o() {
        f fVar = (f) ((o0.g) H).b();
        if (fVar == null) {
            fVar = new f(null);
        }
        fVar.f35811c = this;
        s sVarB = this.F.b();
        int i10 = 1;
        if (sVarB == null) {
            sVarB = m(getContext());
            int i11 = this.f35764f;
            int i12 = this.f35765g;
            int i13 = this.f35766h;
            int i14 = this.f35767i;
            Objects.requireNonNull(sVarB);
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.e.k(sVarB, i11, i12, i13, i14);
            y7.a aVar = this.f35770l;
            int i15 = this.f35769k;
            sVarB.f35846c = aVar;
            sVarB.f35847d = i15;
            if (!sVarB.isSelected()) {
                sVarB.setTextAppearance(sVarB.getContext(), sVarB.f35847d);
            }
            sVarB.setTextColorList(this.f35771m);
            sVarB.setBoldTextOnSelection(this.f35772n);
            sVarB.setEllipsizeEnabled(this.f35777s);
            sVarB.setMaxWidthProvider(new t9.d(this, 0));
            sVarB.setOnUpdateListener(new t9.d(this, i10));
        }
        sVarB.setTab(fVar);
        sVarB.setFocusable(true);
        sVarB.setMinimumWidth(getTabMinWidth());
        fVar.f35812d = sVarB;
        return fVar;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    @SuppressLint({"SwitchIntDef"})
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = k9.i.f31952a;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + xc.b.c(44 * displayMetrics.density);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i11)), 1073741824);
        } else if (mode == 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iC = this.f35775q;
            if (iC <= 0) {
                iC = size - xc.b.c(56 * displayMetrics.density);
            }
            this.f35773o = iC;
        }
        super.onMeasure(i10, i11);
        boolean z10 = true;
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.f35783y == 1 ? childAt.getMeasuredWidth() == getMeasuredWidth() : childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                z10 = false;
            }
            if (z10) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.onOverScrolled(i10, i11, z10, z11);
        k9.g gVar = this.f35780v;
        if (gVar.f31942b && z10) {
            View view = gVar.f31941a;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.i.f(view, 0, 0, 1, 0, null);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        this.f35780v.f31942b = false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        f fVar;
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        if (i12 == 0 || i12 == i10 || (fVar = this.f35762d) == null || (i14 = fVar.f35810b) == -1) {
            return;
        }
        t(i14, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, true, true);
    }

    public final void p() {
        int currentItem;
        q();
        v1.a aVar = this.C;
        if (aVar == null) {
            q();
            return;
        }
        int iB = aVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            f fVarO = o();
            Objects.requireNonNull(this.C);
            fVarO.b(null);
            g(fVarO, false);
        }
        ViewPager viewPager = this.B;
        if (viewPager == null || iB <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        r(n(currentItem), true);
    }

    public void q() {
        int childCount = this.f35763e.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            s sVar = (s) this.f35763e.getChildAt(childCount);
            this.f35763e.removeViewAt(childCount);
            if (sVar != null) {
                sVar.setTab(null);
                sVar.setSelected(false);
                this.F.a(sVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.f35761c.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.f35811c = null;
            next.f35812d = null;
            next.f35809a = null;
            next.f35810b = -1;
            ((o0.g) H).a(next);
        }
        this.f35762d = null;
    }

    public void r(f fVar, boolean z10) {
        c cVar;
        c cVar2;
        f fVar2 = this.f35762d;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                c cVar3 = this.f35784z;
                if (cVar3 != null) {
                    cVar3.c(fVar2);
                }
                i(fVar.f35810b);
                return;
            }
            return;
        }
        if (z10) {
            int i10 = fVar != null ? fVar.f35810b : -1;
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
            f fVar3 = this.f35762d;
            if ((fVar3 == null || fVar3.f35810b == -1) && i10 != -1) {
                t(i10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, true, true);
            } else {
                i(i10);
            }
        }
        f fVar4 = this.f35762d;
        if (fVar4 != null && (cVar2 = this.f35784z) != null) {
            cVar2.a(fVar4);
        }
        this.f35762d = fVar;
        if (fVar == null || (cVar = this.f35784z) == null) {
            return;
        }
        cVar.b(fVar);
    }

    public final void s(v1.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        v1.a aVar2 = this.C;
        if (aVar2 != null && (dataSetObserver = this.D) != null) {
            aVar2.f36656a.unregisterObserver(dataSetObserver);
        }
        this.C = aVar;
        if (z10 && aVar != null) {
            if (this.D == null) {
                this.D = new C0419e(null);
            }
            aVar.f36656a.registerObserver(this.D);
        }
        p();
    }

    public void setAnimationDuration(long j10) {
        this.f35768j = j10;
    }

    public void setAnimationType(b bVar) {
        d dVar = this.f35763e;
        if (dVar.f35807w != bVar) {
            dVar.f35807w = bVar;
            ValueAnimator valueAnimator = dVar.f35799o;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            dVar.f35799o.cancel();
        }
    }

    public void setOnTabSelectedListener(c cVar) {
        this.f35784z = cVar;
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f35763e.e(i10);
    }

    public void setTabBackgroundColor(int i10) {
        this.f35763e.d(i10);
    }

    public void setTabIndicatorCornersRadii(float[] fArr) {
        d dVar = this.f35763e;
        if (Arrays.equals(dVar.f35795k, fArr)) {
            return;
        }
        dVar.f35795k = fArr;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.k(dVar);
    }

    public void setTabIndicatorHeight(int i10) {
        d dVar = this.f35763e;
        if (dVar.f35787c != i10) {
            dVar.f35787c = i10;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.k(dVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setTabItemSpacing(int i10) {
        d dVar = this.f35763e;
        if (i10 != dVar.f35792h) {
            dVar.f35792h = i10;
            int childCount = dVar.getChildCount();
            for (int i11 = 1; i11 < childCount; i11++) {
                View childAt = dVar.getChildAt(i11);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                marginLayoutParams.leftMargin = dVar.f35792h;
                dVar.updateViewLayout(childAt, marginLayoutParams);
            }
        }
    }

    public void setTabMode(int i10) {
        if (i10 != this.f35783y) {
            this.f35783y = i10;
            j();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f35771m != colorStateList) {
            this.f35771m = colorStateList;
            int size = this.f35761c.size();
            for (int i10 = 0; i10 < size; i10++) {
                s sVar = this.f35761c.get(i10).f35812d;
                if (sVar != null) {
                    sVar.setTextColorList(this.f35771m);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z10) {
        for (int i10 = 0; i10 < this.f35761c.size(); i10++) {
            this.f35761c.get(i10).f35812d.setEnabled(z10);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        g gVar;
        List<ViewPager.j> list;
        ViewPager viewPager2 = this.B;
        if (viewPager2 != null && (gVar = this.E) != null && (list = viewPager2.T) != null) {
            list.remove(gVar);
        }
        if (viewPager == null) {
            this.B = null;
            setOnTabSelectedListener(null);
            s(null, true);
            return;
        }
        v1.a adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.B = viewPager;
        if (this.E == null) {
            this.E = new g(this);
        }
        g gVar2 = this.E;
        gVar2.f35815c = 0;
        gVar2.f35814b = 0;
        viewPager.b(gVar2);
        setOnTabSelectedListener(new h(viewPager));
        s(adapter, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void t(int i10, float f10, boolean z10, boolean z11) {
        int iRound = Math.round(i10 + f10);
        if (iRound < 0 || iRound >= this.f35763e.getChildCount()) {
            return;
        }
        if (z11) {
            this.f35763e.f(i10, f10);
        }
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A.cancel();
        }
        scrollTo(k(i10, f10), 0);
        if (z10) {
            setSelectedTabView(iRound);
        }
    }
}
