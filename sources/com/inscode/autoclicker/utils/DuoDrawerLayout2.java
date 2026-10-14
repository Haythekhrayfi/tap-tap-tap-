package com.inscode.autoclicker.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import u0.d;

/* JADX INFO: loaded from: classes2.dex */
public class DuoDrawerLayout2 extends RelativeLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f13396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f13397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f13398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f13399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f13400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f13401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f13402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f13407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LayoutInflater f13408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DrawerLayout.e f13409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f13410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f13411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f13412w;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            DuoDrawerLayout2.this.getViewTreeObserver().removeOnPreDrawListener(this);
            DuoDrawerLayout2 duoDrawerLayout2 = DuoDrawerLayout2.this;
            d dVar = duoDrawerLayout2.f13407r;
            View view = duoDrawerLayout2.f13411v;
            float width = duoDrawerLayout2.getWidth();
            DuoDrawerLayout2 duoDrawerLayout3 = DuoDrawerLayout2.this;
            if (!dVar.p(view, (int) (width * duoDrawerLayout3.f13398i), duoDrawerLayout3.f13411v.getTop(), -1)) {
                return false;
            }
            DuoDrawerLayout2 duoDrawerLayout4 = DuoDrawerLayout2.this;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.k(duoDrawerLayout4);
            return false;
        }
    }

    public class b extends d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13414a = false;

        public b(com.inscode.autoclicker.utils.a aVar) {
        }

        @Override // u0.d.c
        public int a(View view, int i10, int i11) {
            if (i10 < 0) {
                return 0;
            }
            int width = (int) (DuoDrawerLayout2.this.getWidth() * DuoDrawerLayout2.this.f13398i);
            return i10 > width ? width : i10;
        }

        @Override // u0.d.c
        public int b(View view, int i10, int i11) {
            int identifier;
            if (DuoDrawerLayout2.this.f13411v.getFitsSystemWindows() && (identifier = DuoDrawerLayout2.this.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                return DuoDrawerLayout2.this.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        }

        @Override // u0.d.c
        public int c(View view) {
            return DuoDrawerLayout2.this.getMeasuredWidth();
        }

        @Override // u0.d.c
        public void d(int i10, int i11) {
            this.f13414a = true;
            if (j(DuoDrawerLayout2.this.f13411v, i11) && i10 == 1) {
                DuoDrawerLayout2 duoDrawerLayout2 = DuoDrawerLayout2.this;
                duoDrawerLayout2.f13407r.b(duoDrawerLayout2.f13411v, i11);
            }
        }

        @Override // u0.d.c
        public void e(int i10, int i11) {
        }

        @Override // u0.d.c
        public void f(View view, int i10) {
        }

        @Override // u0.d.c
        public void g(int i10) {
            if (DuoDrawerLayout2.this.getContext().getResources().getConfiguration().orientation == 2) {
                DuoDrawerLayout2 duoDrawerLayout2 = DuoDrawerLayout2.this;
                if (duoDrawerLayout2.f13400k >= 0.6f) {
                    duoDrawerLayout2.f13400k = 1.0f;
                }
            }
            DuoDrawerLayout2 duoDrawerLayout3 = DuoDrawerLayout2.this;
            duoDrawerLayout3.f13401l = duoDrawerLayout3.f13411v.getLeft();
            DuoDrawerLayout2 duoDrawerLayout4 = DuoDrawerLayout2.this;
            duoDrawerLayout4.f13402m = duoDrawerLayout4.f13411v.getTop();
            if (i10 == 0) {
                DuoDrawerLayout2 duoDrawerLayout5 = DuoDrawerLayout2.this;
                float f10 = duoDrawerLayout5.f13400k;
                if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    if (duoDrawerLayout5.findViewWithTag("overlay") != null) {
                        duoDrawerLayout5.findViewWithTag("overlay").setVisibility(4);
                    }
                    DuoDrawerLayout2 duoDrawerLayout6 = DuoDrawerLayout2.this;
                    duoDrawerLayout6.e(duoDrawerLayout6.f13412w, false);
                    DuoDrawerLayout2 duoDrawerLayout7 = DuoDrawerLayout2.this;
                    DrawerLayout.e eVar = duoDrawerLayout7.f13409t;
                    if (eVar != null) {
                        eVar.b(duoDrawerLayout7);
                    }
                } else if (f10 == 1.0f) {
                    if (duoDrawerLayout5.findViewWithTag("overlay") == null) {
                        View viewInflate = duoDrawerLayout5.f13408s.inflate(R.layout.duo_overlay, (ViewGroup) duoDrawerLayout5, false);
                        viewInflate.setTag("overlay");
                        viewInflate.setOnTouchListener(new com.inscode.autoclicker.utils.a(duoDrawerLayout5));
                        viewInflate.setTranslationZ(100.0f);
                        duoDrawerLayout5.addView(viewInflate);
                    }
                    if (duoDrawerLayout5.f13411v == null) {
                        duoDrawerLayout5.f13411v = duoDrawerLayout5.findViewWithTag(AppLovinEventTypes.USER_VIEWED_CONTENT);
                    }
                    float fC = duoDrawerLayout5.c(duoDrawerLayout5.c(duoDrawerLayout5.f13411v.getLeft(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, duoDrawerLayout5.getWidth() * duoDrawerLayout5.f13398i, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, duoDrawerLayout5.f13392c, duoDrawerLayout5.f13399j);
                    View viewFindViewWithTag = duoDrawerLayout5.findViewWithTag("overlay");
                    if (viewFindViewWithTag != null) {
                        viewFindViewWithTag.setTranslationX(duoDrawerLayout5.f13411v.getLeft());
                        viewFindViewWithTag.setTranslationY(duoDrawerLayout5.f13411v.getTop());
                        viewFindViewWithTag.setScaleX(fC);
                        viewFindViewWithTag.setScaleY(fC);
                        viewFindViewWithTag.setVisibility(0);
                    }
                    DuoDrawerLayout2 duoDrawerLayout8 = DuoDrawerLayout2.this;
                    duoDrawerLayout8.e(duoDrawerLayout8.f13412w, true);
                    DuoDrawerLayout2 duoDrawerLayout9 = DuoDrawerLayout2.this;
                    DrawerLayout.e eVar2 = duoDrawerLayout9.f13409t;
                    if (eVar2 != null) {
                        eVar2.a(duoDrawerLayout9);
                    }
                }
            }
            DuoDrawerLayout2 duoDrawerLayout10 = DuoDrawerLayout2.this;
            if (i10 != duoDrawerLayout10.f13404o) {
                duoDrawerLayout10.f13404o = i10;
                DrawerLayout.e eVar3 = duoDrawerLayout10.f13409t;
                if (eVar3 != null) {
                    eVar3.c(i10);
                }
            }
        }

        @Override // u0.d.c
        public void h(View view, int i10, int i11, int i12, int i13) {
            DuoDrawerLayout2 duoDrawerLayout2 = DuoDrawerLayout2.this;
            duoDrawerLayout2.f13400k = duoDrawerLayout2.c(i10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, duoDrawerLayout2.getWidth() * DuoDrawerLayout2.this.f13398i, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
            DuoDrawerLayout2 duoDrawerLayout3 = DuoDrawerLayout2.this;
            float fC = duoDrawerLayout3.c(duoDrawerLayout3.f13400k, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, duoDrawerLayout3.f13392c, duoDrawerLayout3.f13393d);
            DuoDrawerLayout2.this.f13411v.setScaleX(fC);
            DuoDrawerLayout2.this.f13411v.setScaleY(fC);
            DuoDrawerLayout2 duoDrawerLayout4 = DuoDrawerLayout2.this;
            float fC2 = duoDrawerLayout4.c(duoDrawerLayout4.f13400k, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, duoDrawerLayout4.f13394e, duoDrawerLayout4.f13395f);
            DuoDrawerLayout2.this.f13412w.setScaleX(fC2);
            DuoDrawerLayout2.this.f13412w.setScaleY(fC2);
            DuoDrawerLayout2 duoDrawerLayout5 = DuoDrawerLayout2.this;
            DuoDrawerLayout2.this.f13412w.setAlpha(duoDrawerLayout5.c(duoDrawerLayout5.f13400k, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, duoDrawerLayout5.f13396g, duoDrawerLayout5.f13397h));
            DuoDrawerLayout2 duoDrawerLayout6 = DuoDrawerLayout2.this;
            DrawerLayout.e eVar = duoDrawerLayout6.f13409t;
            if (eVar != null) {
                eVar.d(duoDrawerLayout6, duoDrawerLayout6.f13400k);
            }
        }

        @Override // u0.d.c
        public void i(View view, float f10, float f11) {
            if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && DuoDrawerLayout2.this.f13400k > 0.5f)) {
                DuoDrawerLayout2.this.d();
            } else {
                DuoDrawerLayout2.this.a();
            }
            this.f13414a = false;
        }

        @Override // u0.d.c
        public boolean j(View view, int i10) {
            DuoDrawerLayout2 duoDrawerLayout2 = DuoDrawerLayout2.this;
            int i11 = duoDrawerLayout2.f13403n;
            return (i11 == 0 || i11 == 2) && view == duoDrawerLayout2.f13411v && this.f13414a;
        }
    }

    public DuoDrawerLayout2(Context context) {
        this(context, null);
    }

    public DuoDrawerLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DuoDrawerLayout2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13392c = 1.0f;
        this.f13393d = 0.7f;
        this.f13394e = 1.1f;
        this.f13395f = 1.0f;
        this.f13396g = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f13397h = 1.0f;
        this.f13398i = 0.7f;
        this.f13399j = 0.7f;
        this.f13404o = 0;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pd.a.f34636a);
        try {
            this.f13405p = typedArrayObtainStyledAttributes.getResourceId(5, -54321);
            this.f13406q = typedArrayObtainStyledAttributes.getResourceId(1, -54321);
            this.f13392c = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
            this.f13393d = typedArrayObtainStyledAttributes.getFloat(3, 0.7f);
            this.f13394e = typedArrayObtainStyledAttributes.getFloat(8, 1.1f);
            this.f13395f = typedArrayObtainStyledAttributes.getFloat(9, 1.0f);
            this.f13396g = typedArrayObtainStyledAttributes.getFloat(6, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            this.f13397h = typedArrayObtainStyledAttributes.getFloat(7, 1.0f);
            this.f13398i = typedArrayObtainStyledAttributes.getFloat(4, 0.7f);
            this.f13399j = typedArrayObtainStyledAttributes.getFloat(0, 0.7f);
            typedArrayObtainStyledAttributes.recycle();
            this.f13408s = LayoutInflater.from(getContext());
            b bVar = new b(null);
            this.f13410u = bVar;
            d dVar = new d(getContext(), this, bVar);
            dVar.f35948b = (int) (dVar.f35948b * 1.0f);
            this.f13407r = dVar;
            dVar.f35962p = 1;
            setFocusableInTouchMode(true);
            setClipChildren(false);
            requestFocus();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void a() {
        if (this.f13411v == null) {
            this.f13411v = findViewWithTag(AppLovinEventTypes.USER_VIEWED_CONTENT);
        }
        View view = this.f13411v;
        if (view == null || !this.f13407r.p(view, 0 - view.getPaddingLeft(), this.f13411v.getTop(), -1)) {
            return;
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.k(this);
    }

    public void b() {
        if (this.f13411v == null) {
            this.f13411v = findViewWithTag(AppLovinEventTypes.USER_VIEWED_CONTENT);
        }
        View view = this.f13411v;
        if (view == null || !this.f13407r.p(view, 0 - view.getPaddingLeft(), this.f13411v.getTop(), 2000)) {
            return;
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.k(this);
    }

    public final float c(float f10, float f11, float f12, float f13, float f14) {
        return (((f14 - f13) * (f10 - f11)) / (((int) f12) - f11)) + f13;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        d dVar = this.f13407r;
        if (dVar.f35947a == 2) {
            boolean zComputeScrollOffset = dVar.f35963q.computeScrollOffset();
            int currX = dVar.f35963q.getCurrX();
            int currY = dVar.f35963q.getCurrY();
            int left = currX - dVar.f35965s.getLeft();
            int top = currY - dVar.f35965s.getTop();
            if (left != 0) {
                View view = dVar.f35965s;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = dVar.f35965s;
                WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                dVar.f35964r.h(dVar.f35965s, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == dVar.f35963q.getFinalX() && currY == dVar.f35963q.getFinalY()) {
                dVar.f35963q.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                dVar.f35966t.post(dVar.f35967u);
            }
        }
        if (dVar.f35947a == 2) {
            WeakHashMap<View, m0> weakHashMap3 = e0.f34354a;
            e0.d.k(this);
        } else {
            this.f13401l = this.f13411v.getLeft();
            this.f13402m = this.f13411v.getTop();
        }
    }

    public void d() {
        int width = (int) (getWidth() * this.f13398i);
        if (width == 0) {
            getViewTreeObserver().addOnPreDrawListener(new a());
            return;
        }
        d dVar = this.f13407r;
        View view = this.f13411v;
        if (dVar.p(view, width, view.getTop(), -1)) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.k(this);
        }
    }

    public final void e(View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof Toolbar) {
                    e(childAt, true);
                } else {
                    e(childAt, z10);
                }
            }
        }
    }

    public View getContentView() {
        if (this.f13411v == null) {
            this.f13411v = findViewWithTag(AppLovinEventTypes.USER_VIEWED_CONTENT);
        }
        return this.f13411v;
    }

    public View getMenuView() {
        if (this.f13412w == null) {
            this.f13412w = findViewWithTag("menu");
        }
        return this.f13412w;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View viewI;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.f13407r.a();
            return false;
        }
        d dVar = this.f13407r;
        Objects.requireNonNull(dVar);
        int actionMasked2 = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked2 == 0) {
            dVar.a();
        }
        if (dVar.f35958l == null) {
            dVar.f35958l = VelocityTracker.obtain();
        }
        dVar.f35958l.addMovement(motionEvent);
        if (actionMasked2 == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            dVar.m(x10, y10, pointerId);
            View viewI2 = dVar.i((int) x10, (int) y10);
            if (viewI2 == dVar.f35965s && dVar.f35947a == 2) {
                dVar.q(viewI2, pointerId);
            }
            int i10 = dVar.f35954h[pointerId] & dVar.f35962p;
            if (i10 != 0) {
                dVar.f35964r.e(i10, pointerId);
            }
        } else if (actionMasked2 == 1) {
            dVar.a();
        } else if (actionMasked2 != 2) {
            if (actionMasked2 == 3) {
                dVar.a();
            } else if (actionMasked2 == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                dVar.m(x11, y11, pointerId2);
                int i11 = dVar.f35947a;
                if (i11 == 0) {
                    int i12 = dVar.f35954h[pointerId2] & dVar.f35962p;
                    if (i12 != 0) {
                        dVar.f35964r.e(i12, pointerId2);
                    }
                } else if (i11 == 2 && (viewI = dVar.i((int) x11, (int) y11)) == dVar.f35965s) {
                    dVar.q(viewI, pointerId2);
                }
            } else if (actionMasked2 == 6) {
                dVar.g(motionEvent.getPointerId(actionIndex));
            }
        } else if (dVar.f35950d != null && dVar.f35951e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i13 = 0; i13 < pointerCount; i13++) {
                int pointerId3 = motionEvent.getPointerId(i13);
                if (dVar.j(pointerId3)) {
                    float x12 = motionEvent.getX(i13);
                    float y12 = motionEvent.getY(i13);
                    float f10 = x12 - dVar.f35950d[pointerId3];
                    float f11 = y12 - dVar.f35951e[pointerId3];
                    View viewI3 = dVar.i((int) x12, (int) y12);
                    boolean z10 = viewI3 != null && dVar.d(viewI3, f10, f11);
                    if (!z10) {
                        dVar.l(f10, f11, pointerId3);
                        if (dVar.f35947a != 1) {
                            break;
                        }
                    } else {
                        int left = viewI3.getLeft();
                        int i14 = (int) f10;
                        int iA = dVar.f35964r.a(viewI3, left + i14, i14);
                        int i15 = (int) f11;
                        dVar.f35964r.b(viewI3, viewI3.getTop() + i15, i15);
                        int iC = dVar.f35964r.c(viewI3);
                        Objects.requireNonNull(dVar.f35964r);
                        if (iC == 0 || (iC > 0 && iA == left)) {
                            break;
                        }
                        dVar.l(f10, f11, pointerId3);
                        if (dVar.f35947a != 1 || (z10 && dVar.q(viewI3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            dVar.n(motionEvent);
        }
        return dVar.f35947a == 1;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!(this.f13400k == 1.0f) || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        a();
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            try {
                String str = (String) childAt.getTag();
                if (str.equals(AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                    this.f13411v = childAt;
                } else if (str.equals("menu")) {
                    this.f13412w = childAt;
                }
            } catch (Exception unused) {
            }
            if (this.f13411v != null && this.f13412w != null) {
                break;
            }
        }
        if (this.f13412w == null) {
            int i15 = this.f13405p;
            if (i15 == -54321) {
                throw new IllegalStateException("Missing menu layout. Set a \"menu\" tag on the menu layout (in XML android:xml=\"menu\"). Or set the \"app:menu\" attribute on the drawer layout.");
            }
            View viewInflate = this.f13408s.inflate(i15, (ViewGroup) this, false);
            this.f13412w = viewInflate;
            if (viewInflate != null) {
                viewInflate.setTag("menu");
                addView(this.f13412w);
            }
        }
        if (this.f13411v == null) {
            int i16 = this.f13406q;
            if (i16 == -54321) {
                throw new IllegalStateException("Missing content layout. Set a \"content\" tag on the content layout (in XML android:xml=\"content\"). Or set the \"app:content\" attribute on the drawer layout.");
            }
            View viewInflate2 = this.f13408s.inflate(i16, (ViewGroup) this, false);
            this.f13411v = viewInflate2;
            if (viewInflate2 != null) {
                viewInflate2.setTag(AppLovinEventTypes.USER_VIEWED_CONTENT);
                addView(this.f13411v);
            }
        }
        if (this.f13400k == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            e(this.f13411v, true);
            e(this.f13412w, false);
        }
        this.f13411v.offsetLeftAndRight((int) this.f13401l);
        this.f13411v.offsetTopAndBottom((int) this.f13402m);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("superState");
            if (bundle.getFloat("dragOffset", StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) > 0.6f) {
                d();
            }
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putFloat("dragOffset", this.f13400k);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        d dVar = this.f13407r;
        Objects.requireNonNull(dVar);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            dVar.a();
        }
        if (dVar.f35958l == null) {
            dVar.f35958l = VelocityTracker.obtain();
        }
        dVar.f35958l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (dVar.f35947a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i11 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i11);
                            if (dVar.j(pointerId)) {
                                float x10 = motionEvent.getX(i11);
                                float y10 = motionEvent.getY(i11);
                                float f10 = x10 - dVar.f35950d[pointerId];
                                float f11 = y10 - dVar.f35951e[pointerId];
                                dVar.l(f10, f11, pointerId);
                                if (dVar.f35947a != 1) {
                                    View viewI = dVar.i((int) x10, (int) y10);
                                    if (dVar.d(viewI, f10, f11) && dVar.q(viewI, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i11++;
                        }
                    } else if (dVar.j(dVar.f35949c)) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(dVar.f35949c);
                        float x11 = motionEvent.getX(iFindPointerIndex);
                        float y11 = motionEvent.getY(iFindPointerIndex);
                        float[] fArr = dVar.f35952f;
                        int i12 = dVar.f35949c;
                        int i13 = (int) (x11 - fArr[i12]);
                        int i14 = (int) (y11 - dVar.f35953g[i12]);
                        int left = dVar.f35965s.getLeft() + i13;
                        int top = dVar.f35965s.getTop() + i14;
                        int left2 = dVar.f35965s.getLeft();
                        int top2 = dVar.f35965s.getTop();
                        if (i13 != 0) {
                            left = dVar.f35964r.a(dVar.f35965s, left, i13);
                            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                            dVar.f35965s.offsetLeftAndRight(left - left2);
                        }
                        int i15 = left;
                        if (i14 != 0) {
                            top = dVar.f35964r.b(dVar.f35965s, top, i14);
                            WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                            dVar.f35965s.offsetTopAndBottom(top - top2);
                        }
                        int i16 = top;
                        if (i13 != 0 || i14 != 0) {
                            dVar.f35964r.h(dVar.f35965s, i15, i16, i15 - left2, i16 - top2);
                        }
                    }
                    dVar.n(motionEvent);
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x12 = motionEvent.getX(actionIndex);
                        float y12 = motionEvent.getY(actionIndex);
                        dVar.m(x12, y12, pointerId2);
                        if (dVar.f35947a == 0) {
                            dVar.q(dVar.i((int) x12, (int) y12), pointerId2);
                            int i17 = dVar.f35954h[pointerId2] & dVar.f35962p;
                            if (i17 != 0) {
                                dVar.f35964r.e(i17, pointerId2);
                            }
                        } else {
                            int i18 = (int) x12;
                            int i19 = (int) y12;
                            View view = dVar.f35965s;
                            if (view != null && i18 >= view.getLeft() && i18 < view.getRight() && i19 >= view.getTop() && i19 < view.getBottom()) {
                                i11 = 1;
                            }
                            if (i11 != 0) {
                                dVar.q(dVar.f35965s, pointerId2);
                            }
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (dVar.f35947a == 1 && pointerId3 == dVar.f35949c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i11 >= pointerCount2) {
                                    i10 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i11);
                                if (pointerId4 != dVar.f35949c) {
                                    View viewI2 = dVar.i((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                    View view2 = dVar.f35965s;
                                    if (viewI2 == view2 && dVar.q(view2, pointerId4)) {
                                        i10 = dVar.f35949c;
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (i10 == -1) {
                                dVar.k();
                            }
                        }
                        dVar.g(pointerId3);
                    }
                } else if (dVar.f35947a == 1) {
                    dVar.f35964r.i(dVar.f35965s, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    if (dVar.f35947a == 1) {
                        dVar.o(0);
                    }
                }
            } else if (dVar.f35947a == 1) {
                dVar.k();
            }
            dVar.a();
        } else {
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            int pointerId5 = motionEvent.getPointerId(0);
            View viewI3 = dVar.i((int) x13, (int) y13);
            dVar.m(x13, y13, pointerId5);
            dVar.q(viewI3, pointerId5);
            int i20 = dVar.f35954h[pointerId5] & dVar.f35962p;
            if (i20 != 0) {
                dVar.f35964r.e(i20, pointerId5);
            }
        }
        return true;
    }

    public void setClickToCloseScale(float f10) {
        this.f13399j = f10;
        invalidate();
        requestLayout();
    }

    public void setContentScaleClosed(float f10) {
        this.f13392c = f10;
        invalidate();
        requestLayout();
    }

    public void setContentScaleOpen(float f10) {
        this.f13393d = f10;
        invalidate();
        requestLayout();
    }

    public void setContentView(View view) {
        if (view.getParent() != null) {
            throw new IllegalStateException("Your content view already has a parent. Please make sure your content view does not have a parent.");
        }
        View viewFindViewWithTag = findViewWithTag(AppLovinEventTypes.USER_VIEWED_CONTENT);
        this.f13411v = viewFindViewWithTag;
        if (viewFindViewWithTag != null) {
            removeView(viewFindViewWithTag);
        }
        this.f13411v = view;
        view.setTag(AppLovinEventTypes.USER_VIEWED_CONTENT);
        addView(this.f13411v);
        invalidate();
        requestLayout();
    }

    public void setDrawerListener(DrawerLayout.e eVar) {
        this.f13409t = eVar;
    }

    public void setDrawerLockMode(int i10) {
        this.f13403n = i10;
        if (i10 == 1) {
            this.f13407r.a();
            a();
        } else {
            if (i10 != 2) {
                return;
            }
            this.f13407r.a();
            d();
        }
    }

    public void setMarginFactor(float f10) {
        this.f13398i = f10;
        invalidate();
        requestLayout();
    }

    public void setMenuAlphaClosed(float f10) {
        this.f13396g = f10;
        invalidate();
        requestLayout();
    }

    public void setMenuAlphaOpen(float f10) {
        this.f13397h = f10;
        invalidate();
        requestLayout();
    }

    public void setMenuScaleClosed(float f10) {
        this.f13394e = f10;
        invalidate();
        requestLayout();
    }

    public void setMenuScaleOpen(float f10) {
        this.f13395f = f10;
        invalidate();
        requestLayout();
    }

    public void setMenuView(View view) {
        if (view.getParent() != null) {
            throw new IllegalStateException("Your menu view already has a parent. Please make sure your menu view does not have a parent.");
        }
        View viewFindViewWithTag = findViewWithTag("menu");
        this.f13412w = viewFindViewWithTag;
        if (viewFindViewWithTag != null) {
            removeView(viewFindViewWithTag);
        }
        this.f13412w = view;
        view.setTag("menu");
        addView(this.f13412w);
        invalidate();
        requestLayout();
    }
}
