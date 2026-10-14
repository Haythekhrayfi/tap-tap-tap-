package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.ads.AdError;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class r extends ConstraintLayout implements p0.s {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static boolean f37757r0;
    public e A;
    public y.b B;
    public int C;
    public int D;
    public boolean E;
    public float F;
    public float G;
    public long H;
    public float I;
    public boolean J;
    public ArrayList<o> K;
    public ArrayList<o> L;
    public CopyOnWriteArrayList<k> M;
    public int N;
    public long O;
    public float P;
    public int Q;
    public float R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f37758a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f37759b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f37760c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f37761c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Interpolator f37762d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public t.d f37763d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f37764e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f37765e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f37766f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public j f37767f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37768g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Runnable f37769g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37770h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public HashMap<View, Object> f37771h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37772i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Rect f37773i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37774j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f37775j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37776k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public l f37777k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37778l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public g f37779l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap<View, n> f37780m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f37781m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f37782n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public RectF f37783n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f37784o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public View f37785o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f37786p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Matrix f37787p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f37788q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList<Integer> f37789q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f37790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f37791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f37792t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f37793u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k f37794v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f37795w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f f37796x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f37797y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x.b f37798z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.f37767f0.a();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f37800c;

        public b(View view) {
            this.f37800c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37800c.setNestedScrollingEnabled(true);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.f37767f0.a();
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37802a;

        static {
            int[] iArr = new int[l.values().length];
            f37802a = iArr;
            try {
                iArr[l.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37802a[l.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37802a[l.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37802a[l.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class e extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f37803a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f37804b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f37805c;

        public e() {
        }

        @Override // y.p
        public float a() {
            return r.this.f37766f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = this.f37803a;
            if (f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                float f12 = this.f37805c;
                if (f11 / f12 < f10) {
                    f10 = f11 / f12;
                }
                r.this.f37766f = f11 - (f12 * f10);
                return ((f11 * f10) - (((f12 * f10) * f10) / 2.0f)) + this.f37804b;
            }
            float f13 = this.f37805c;
            if ((-f11) / f13 < f10) {
                f10 = (-f11) / f13;
            }
            r.this.f37766f = (f13 * f10) + f11;
            return (((f13 * f10) * f10) / 2.0f) + (f11 * f10) + this.f37804b;
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f37807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f37808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f37809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f37810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f37811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Paint f37812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Paint f37813g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Paint f37814h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Paint f37815i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float[] f37816j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f37817k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Rect f37818l = new Rect();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f37819m = 1;

        public f() {
            Paint paint = new Paint();
            this.f37811e = paint;
            paint.setAntiAlias(true);
            this.f37811e.setColor(-21965);
            this.f37811e.setStrokeWidth(2.0f);
            this.f37811e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f37812f = paint2;
            paint2.setAntiAlias(true);
            this.f37812f.setColor(-2067046);
            this.f37812f.setStrokeWidth(2.0f);
            this.f37812f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f37813g = paint3;
            paint3.setAntiAlias(true);
            this.f37813g.setColor(-13391360);
            this.f37813g.setStrokeWidth(2.0f);
            this.f37813g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f37814h = paint4;
            paint4.setAntiAlias(true);
            this.f37814h.setColor(-13391360);
            this.f37814h.setTextSize(r.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f37816j = new float[8];
            Paint paint5 = new Paint();
            this.f37815i = paint5;
            paint5.setAntiAlias(true);
            this.f37813g.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
            this.f37809c = new float[100];
            this.f37808b = new int[50];
        }

        public void a(Canvas canvas, int i10, int i11, n nVar) {
            int width;
            int height;
            if (i10 == 4) {
                boolean z10 = false;
                boolean z11 = false;
                for (int i12 = 0; i12 < this.f37817k; i12++) {
                    int[] iArr = this.f37808b;
                    if (iArr[i12] == 1) {
                        z10 = true;
                    }
                    if (iArr[i12] == 0) {
                        z11 = true;
                    }
                }
                if (z10) {
                    d(canvas);
                }
                if (z11) {
                    b(canvas);
                }
            }
            if (i10 == 2) {
                d(canvas);
            }
            if (i10 == 3) {
                b(canvas);
            }
            canvas.drawLines(this.f37807a, this.f37811e);
            View view = nVar.f37728b;
            if (view != null) {
                width = view.getWidth();
                height = nVar.f37728b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i13 = 1;
            while (i13 < i11 - 1) {
                if (i10 == 4 && this.f37808b[i13 - 1] == 0) {
                    i13 = i13;
                } else {
                    float[] fArr = this.f37809c;
                    int i14 = i13 * 2;
                    float f10 = fArr[i14];
                    float f11 = fArr[i14 + 1];
                    this.f37810d.reset();
                    this.f37810d.moveTo(f10, f11 + 10.0f);
                    this.f37810d.lineTo(f10 + 10.0f, f11);
                    this.f37810d.lineTo(f10, f11 - 10.0f);
                    this.f37810d.lineTo(f10 - 10.0f, f11);
                    this.f37810d.close();
                    int i15 = i13 - 1;
                    nVar.f37747u.get(i15);
                    if (i10 == 4) {
                        int[] iArr2 = this.f37808b;
                        if (iArr2[i15] == 1) {
                            e(canvas, f10 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                        } else if (iArr2[i15] == 0) {
                            c(canvas, f10 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                        } else {
                            if (iArr2[i15] == 2) {
                                f(canvas, f10 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, width, height);
                            }
                            canvas.drawPath(this.f37810d, this.f37815i);
                        }
                        canvas.drawPath(this.f37810d, this.f37815i);
                    } else {
                        f11 = f11;
                        f10 = f10;
                        i13 = i13;
                    }
                    if (i10 == 2) {
                        e(canvas, f10 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    }
                    if (i10 == 3) {
                        c(canvas, f10 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    }
                    if (i10 == 6) {
                        f(canvas, f10 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11 - StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, width, height);
                    }
                    canvas.drawPath(this.f37810d, this.f37815i);
                }
                i13++;
            }
            float[] fArr2 = this.f37807a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f37812f);
                float[] fArr3 = this.f37807a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f37812f);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.f37807a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.f37813g);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.f37813g);
        }

        public final void c(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f37807a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fMin = Math.min(f12, f14);
            float fMax = Math.max(f13, f15);
            float fMin2 = f10 - Math.min(f12, f14);
            float fMax2 = Math.max(f13, f15) - f11;
            StringBuilder sbA = defpackage.a.a("");
            sbA.append(((int) (((double) ((fMin2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d)) / 100.0f);
            String string = sbA.toString();
            g(string, this.f37814h);
            canvas.drawText(string, ((fMin2 / 2.0f) - (this.f37818l.width() / 2)) + fMin, f11 - 20.0f, this.f37814h);
            canvas.drawLine(f10, f11, Math.min(f12, f14), f11, this.f37813g);
            StringBuilder sbA2 = defpackage.a.a("");
            sbA2.append(((int) (((double) ((fMax2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d)) / 100.0f);
            String string2 = sbA2.toString();
            g(string2, this.f37814h);
            canvas.drawText(string2, f10 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f37818l.height() / 2)), this.f37814h);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), this.f37813g);
        }

        public final void d(Canvas canvas) {
            float[] fArr = this.f37807a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f37813g);
        }

        public final void e(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f37807a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f12 - f14, f13 - f15);
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f11 - f13) * f17) + ((f10 - f12) * f16)) / (fHypot * fHypot);
            float f19 = f12 + (f16 * f18);
            float f20 = f13 + (f18 * f17);
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f19, f20);
            float fHypot2 = (float) Math.hypot(f19 - f10, f20 - f11);
            StringBuilder sbA = defpackage.a.a("");
            sbA.append(((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            String string = sbA.toString();
            g(string, this.f37814h);
            canvas.drawTextOnPath(string, path, (fHypot2 / 2.0f) - (this.f37818l.width() / 2), -20.0f, this.f37814h);
            canvas.drawLine(f10, f11, f19, f20, this.f37813g);
        }

        public final void f(Canvas canvas, float f10, float f11, int i10, int i11) {
            StringBuilder sbA = defpackage.a.a("");
            sbA.append(((int) (((double) (((f10 - (i10 / 2)) * 100.0f) / (r.this.getWidth() - i10))) + 0.5d)) / 100.0f);
            String string = sbA.toString();
            g(string, this.f37814h);
            canvas.drawText(string, ((f10 / 2.0f) - (this.f37818l.width() / 2)) + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11 - 20.0f, this.f37814h);
            canvas.drawLine(f10, f11, Math.min(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f), f11, this.f37813g);
            StringBuilder sbA2 = defpackage.a.a("");
            sbA2.append(((int) (((double) (((f11 - (i11 / 2)) * 100.0f) / (r.this.getHeight() - i11))) + 0.5d)) / 100.0f);
            String string2 = sbA2.toString();
            g(string2, this.f37814h);
            canvas.drawText(string2, f10 + 5.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD - ((f11 / 2.0f) - (this.f37818l.height() / 2)), this.f37814h);
            canvas.drawLine(f10, f11, f10, Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f), this.f37813g);
        }

        public void g(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f37818l);
        }
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v.g f37821a = new v.g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v.g f37822b = new v.g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f37823c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f37824d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f37826f;

        public g() {
        }

        public void a() {
            int i10;
            Interpolator interpolatorLoadInterpolator;
            int childCount = r.this.getChildCount();
            r.this.f37780m.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = r.this.getChildAt(i11);
                n nVar = new n(childAt);
                int id2 = childAt.getId();
                iArr[i11] = id2;
                sparseArray.put(id2, nVar);
                r.this.f37780m.put(childAt, nVar);
            }
            int i12 = 0;
            while (i12 < childCount) {
                View childAt2 = r.this.getChildAt(i12);
                n nVar2 = r.this.f37780m.get(childAt2);
                if (nVar2 == null) {
                    childCount = childCount;
                    sparseArray = sparseArray;
                    iArr = iArr;
                } else {
                    String str = " (";
                    String str2 = "no widget for  ";
                    String str3 = "MotionLayout";
                    if (this.f37823c != null) {
                        v.f fVarD = d(this.f37821a, childAt2);
                        if (fVarD != null) {
                            Rect rectA = r.a(r.this, fVarD);
                            androidx.constraintlayout.widget.c cVar = this.f37823c;
                            int width = r.this.getWidth();
                            int height = r.this.getHeight();
                            int i13 = cVar.f1506c;
                            if (i13 != 0) {
                                i10 = i13;
                                nVar2.e(rectA, nVar2.f37727a, i10, width, height);
                            } else {
                                i10 = i13;
                            }
                            s sVar = nVar2.f37732f;
                            sVar.f37838e = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                            sVar.f37839f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                            nVar2.d(sVar);
                            nVar2.f37732f.d(rectA.left, rectA.top, rectA.width(), rectA.height());
                            androidx.constraintlayout.widget.c.a aVarH = cVar.h(nVar2.f37729c);
                            nVar2.f37732f.a(aVarH);
                            nVar2.f37738l = aVarH.f1513d.f1580g;
                            nVar2.f37734h.d(rectA, cVar, i10, nVar2.f37729c);
                            nVar2.C = aVarH.f1515f.f1602i;
                            androidx.constraintlayout.widget.c.C0027c c0027c = aVarH.f1513d;
                            nVar2.E = c0027c.f1584k;
                            nVar2.F = c0027c.f1583j;
                            Context context = nVar2.f37728b.getContext();
                            androidx.constraintlayout.widget.c.C0027c c0027c2 = aVarH.f1513d;
                            int i14 = c0027c2.f1586m;
                            String str4 = c0027c2.f1585l;
                            int i15 = c0027c2.f1587n;
                            if (i14 == -2) {
                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i15);
                            } else if (i14 == -1) {
                                interpolatorLoadInterpolator = new m(t.c.c(str4));
                            } else if (i14 == 0) {
                                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                            } else if (i14 == 1) {
                                interpolatorLoadInterpolator = new AccelerateInterpolator();
                            } else if (i14 == 2) {
                                interpolatorLoadInterpolator = new DecelerateInterpolator();
                            } else if (i14 != 4) {
                                interpolatorLoadInterpolator = i14 != 5 ? null : new OvershootInterpolator();
                            } else {
                                interpolatorLoadInterpolator = new BounceInterpolator();
                            }
                            nVar2.G = interpolatorLoadInterpolator;
                        } else {
                            childCount = childCount;
                            sparseArray = sparseArray;
                            iArr = iArr;
                            str3 = "MotionLayout";
                            str2 = "no widget for  ";
                            str = " (";
                            if (r.this.f37795w != 0) {
                                Log.e(str3, y.a.b() + str2 + y.a.d(childAt2) + str + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        childCount = childCount;
                        sparseArray = sparseArray;
                        iArr = iArr;
                        str3 = "MotionLayout";
                        str2 = "no widget for  ";
                        str = " (";
                        Objects.requireNonNull(r.this);
                    }
                    if (this.f37824d != null) {
                        v.f fVarD2 = d(this.f37822b, childAt2);
                        if (fVarD2 != null) {
                            Rect rectA2 = r.a(r.this, fVarD2);
                            androidx.constraintlayout.widget.c cVar2 = this.f37824d;
                            int width2 = r.this.getWidth();
                            int height2 = r.this.getHeight();
                            int i16 = cVar2.f1506c;
                            if (i16 != 0) {
                                nVar2.e(rectA2, nVar2.f37727a, i16, width2, height2);
                                rectA2 = nVar2.f37727a;
                            }
                            s sVar2 = nVar2.f37733g;
                            sVar2.f37838e = 1.0f;
                            sVar2.f37839f = 1.0f;
                            nVar2.d(sVar2);
                            nVar2.f37733g.d(rectA2.left, rectA2.top, rectA2.width(), rectA2.height());
                            nVar2.f37733g.a(cVar2.h(nVar2.f37729c));
                            nVar2.f37735i.d(rectA2, cVar2, i16, nVar2.f37729c);
                        } else if (r.this.f37795w != 0) {
                            Log.e(str3, y.a.b() + str2 + y.a.d(childAt2) + str + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i12++;
                childCount = childCount;
                sparseArray = sparseArray;
                iArr = iArr;
            }
            SparseArray sparseArray2 = sparseArray;
            int[] iArr2 = iArr;
            int i17 = 0;
            while (i17 < childCount) {
                SparseArray sparseArray3 = sparseArray2;
                n nVar3 = (n) sparseArray3.get(iArr2[i17]);
                int i18 = nVar3.f37732f.f37846m;
                if (i18 != -1) {
                    n nVar4 = (n) sparseArray3.get(i18);
                    nVar3.f37732f.f(nVar4, nVar4.f37732f);
                    nVar3.f37733g.f(nVar4, nVar4.f37733g);
                }
                i17++;
                sparseArray2 = sparseArray3;
            }
        }

        public final void b(int i10, int i11) {
            int optimizationLevel = r.this.getOptimizationLevel();
            r rVar = r.this;
            if (rVar.f37770h == rVar.getStartState()) {
                r rVar2 = r.this;
                v.g gVar = this.f37822b;
                androidx.constraintlayout.widget.c cVar = this.f37824d;
                rVar2.resolveSystem(gVar, optimizationLevel, (cVar == null || cVar.f1506c == 0) ? i10 : i11, (cVar == null || cVar.f1506c == 0) ? i11 : i10);
                androidx.constraintlayout.widget.c cVar2 = this.f37823c;
                if (cVar2 != null) {
                    r rVar3 = r.this;
                    v.g gVar2 = this.f37821a;
                    int i12 = cVar2.f1506c;
                    int i13 = i12 == 0 ? i10 : i11;
                    if (i12 == 0) {
                        i10 = i11;
                    }
                    rVar3.resolveSystem(gVar2, optimizationLevel, i13, i10);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.c cVar3 = this.f37823c;
            if (cVar3 != null) {
                r rVar4 = r.this;
                v.g gVar3 = this.f37821a;
                int i14 = cVar3.f1506c;
                rVar4.resolveSystem(gVar3, optimizationLevel, i14 == 0 ? i10 : i11, i14 == 0 ? i11 : i10);
            }
            r rVar5 = r.this;
            v.g gVar4 = this.f37822b;
            androidx.constraintlayout.widget.c cVar4 = this.f37824d;
            int i15 = (cVar4 == null || cVar4.f1506c == 0) ? i10 : i11;
            if (cVar4 == null || cVar4.f1506c == 0) {
                i10 = i11;
            }
            rVar5.resolveSystem(gVar4, optimizationLevel, i15, i10);
        }

        public void c(v.g gVar, v.g gVar2) {
            v.f kVar;
            ArrayList<v.f> arrayList = gVar.P0;
            HashMap<v.f, v.f> map = new HashMap<>();
            map.put(gVar, gVar2);
            gVar2.P0.clear();
            gVar2.k(gVar, map);
            for (v.f fVar : arrayList) {
                if (fVar instanceof v.a) {
                    kVar = new v.a();
                } else if (fVar instanceof v.i) {
                    kVar = new v.i();
                } else if (fVar instanceof v.h) {
                    kVar = new v.h();
                } else if (fVar instanceof v.m) {
                    kVar = new v.m();
                } else {
                    kVar = fVar instanceof v.j ? new v.k() : new v.f();
                }
                gVar2.P0.add(kVar);
                v.f fVar2 = kVar.Y;
                if (fVar2 != null) {
                    ((v.o) fVar2).P0.remove(kVar);
                    kVar.L();
                }
                kVar.Y = gVar2;
                map.put(fVar, kVar);
            }
            for (v.f fVar3 : arrayList) {
                map.get(fVar3).k(fVar3, map);
            }
        }

        public v.f d(v.g gVar, View view) {
            if (gVar.f36604o0 == view) {
                return gVar;
            }
            ArrayList<v.f> arrayList = gVar.P0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                v.f fVar = arrayList.get(i10);
                if (fVar.f36604o0 == view) {
                    return fVar;
                }
            }
            return null;
        }

        public void e(androidx.constraintlayout.widget.c cVar, androidx.constraintlayout.widget.c cVar2) {
            this.f37823c = cVar;
            this.f37824d = cVar2;
            this.f37821a = new v.g();
            this.f37822b = new v.g();
            this.f37821a.n0(r.this.mLayoutWidget.T0);
            this.f37822b.n0(r.this.mLayoutWidget.T0);
            this.f37821a.P0.clear();
            this.f37822b.P0.clear();
            c(r.this.mLayoutWidget, this.f37821a);
            c(r.this.mLayoutWidget, this.f37822b);
            if (r.this.f37788q > 0.5d) {
                if (cVar != null) {
                    g(this.f37821a, cVar);
                }
                g(this.f37822b, cVar2);
            } else {
                g(this.f37822b, cVar2);
                if (cVar != null) {
                    g(this.f37821a, cVar);
                }
            }
            this.f37821a.U0 = r.this.isRtl();
            v.g gVar = this.f37821a;
            gVar.Q0.c(gVar);
            this.f37822b.U0 = r.this.isRtl();
            v.g gVar2 = this.f37822b;
            gVar2.Q0.c(gVar2);
            ViewGroup.LayoutParams layoutParams = r.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    v.g gVar3 = this.f37821a;
                    v.f.b bVar = v.f.b.WRAP_CONTENT;
                    gVar3.V(bVar);
                    this.f37822b.V(bVar);
                }
                if (layoutParams.height == -2) {
                    v.g gVar4 = this.f37821a;
                    v.f.b bVar2 = v.f.b.WRAP_CONTENT;
                    gVar4.Y(bVar2);
                    this.f37822b.Y(bVar2);
                }
            }
        }

        public void f() {
            r rVar = r.this;
            int i10 = rVar.f37774j;
            int i11 = rVar.f37776k;
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            r rVar2 = r.this;
            rVar2.f37758a0 = mode;
            rVar2.f37759b0 = mode2;
            rVar2.getOptimizationLevel();
            b(i10, i11);
            boolean z10 = true;
            int i12 = 0;
            if (((r.this.getParent() instanceof r) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                b(i10, i11);
                r.this.T = this.f37821a.z();
                r.this.U = this.f37821a.q();
                r.this.V = this.f37822b.z();
                r.this.W = this.f37822b.q();
                r rVar3 = r.this;
                rVar3.S = (rVar3.T == rVar3.V && rVar3.U == rVar3.W) ? false : true;
            }
            r rVar4 = r.this;
            int i13 = rVar4.T;
            int i14 = rVar4.U;
            int i15 = rVar4.f37758a0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                i13 = (int) ((rVar4.f37761c0 * (rVar4.V - i13)) + i13);
            }
            int i16 = rVar4.f37759b0;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                i14 = (int) ((rVar4.f37761c0 * (rVar4.W - i14)) + i14);
            }
            int i17 = i14;
            v.g gVar = this.f37821a;
            rVar4.resolveMeasuredDimension(i10, i11, i13, i17, gVar.f36633e1 || this.f37822b.f36633e1, gVar.f36634f1 || this.f37822b.f36634f1);
            r rVar5 = r.this;
            int childCount = rVar5.getChildCount();
            rVar5.f37779l0.a();
            rVar5.f37793u = true;
            SparseArray sparseArray = new SparseArray();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt = rVar5.getChildAt(i18);
                sparseArray.put(childAt.getId(), rVar5.f37780m.get(childAt));
            }
            int width = rVar5.getWidth();
            int height = rVar5.getHeight();
            t.b bVar = rVar5.f37760c.f37855c;
            int i19 = bVar != null ? bVar.f37888p : -1;
            if (i19 != -1) {
                for (int i20 = 0; i20 < childCount; i20++) {
                    n nVar = rVar5.f37780m.get(rVar5.getChildAt(i20));
                    if (nVar != null) {
                        nVar.B = i19;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[rVar5.f37780m.size()];
            int i21 = 0;
            for (int i22 = 0; i22 < childCount; i22++) {
                n nVar2 = rVar5.f37780m.get(rVar5.getChildAt(i22));
                int i23 = nVar2.f37732f.f37846m;
                if (i23 != -1) {
                    sparseBooleanArray.put(i23, true);
                    iArr[i21] = nVar2.f37732f.f37846m;
                    i21++;
                }
            }
            for (int i24 = 0; i24 < i21; i24++) {
                n nVar3 = rVar5.f37780m.get(rVar5.findViewById(iArr[i24]));
                if (nVar3 != null) {
                    rVar5.f37760c.g(nVar3);
                    nVar3.f(width, height, rVar5.getNanoTime());
                }
            }
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt2 = rVar5.getChildAt(i25);
                n nVar4 = rVar5.f37780m.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && nVar4 != null) {
                    rVar5.f37760c.g(nVar4);
                    nVar4.f(width, height, rVar5.getNanoTime());
                }
            }
            t.b bVar2 = rVar5.f37760c.f37855c;
            float f10 = bVar2 != null ? bVar2.f37881i : 0.0f;
            if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                boolean z11 = ((double) f10) < 0.0d;
                float fAbs = Math.abs(f10);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                int i26 = 0;
                while (true) {
                    if (i26 >= childCount) {
                        z10 = false;
                        break;
                    }
                    n nVar5 = rVar5.f37780m.get(rVar5.getChildAt(i26));
                    if (!Float.isNaN(nVar5.f37738l)) {
                        break;
                    }
                    s sVar = nVar5.f37733g;
                    float f11 = sVar.f37840g;
                    float f12 = sVar.f37841h;
                    float f13 = z11 ? f12 - f11 : f12 + f11;
                    fMin2 = Math.min(fMin2, f13);
                    fMax2 = Math.max(fMax2, f13);
                    i26++;
                }
                if (!z10) {
                    while (i12 < childCount) {
                        n nVar6 = rVar5.f37780m.get(rVar5.getChildAt(i12));
                        s sVar2 = nVar6.f37733g;
                        float f14 = sVar2.f37840g;
                        float f15 = sVar2.f37841h;
                        float f16 = z11 ? f15 - f14 : f15 + f14;
                        nVar6.f37740n = 1.0f / (1.0f - fAbs);
                        nVar6.f37739m = fAbs - (((f16 - fMin2) * fAbs) / (fMax2 - fMin2));
                        i12++;
                    }
                    return;
                }
                for (int i27 = 0; i27 < childCount; i27++) {
                    n nVar7 = rVar5.f37780m.get(rVar5.getChildAt(i27));
                    if (!Float.isNaN(nVar7.f37738l)) {
                        fMin = Math.min(fMin, nVar7.f37738l);
                        fMax = Math.max(fMax, nVar7.f37738l);
                    }
                }
                while (i12 < childCount) {
                    n nVar8 = rVar5.f37780m.get(rVar5.getChildAt(i12));
                    if (!Float.isNaN(nVar8.f37738l)) {
                        nVar8.f37740n = 1.0f / (1.0f - fAbs);
                        float f17 = nVar8.f37738l;
                        nVar8.f37739m = fAbs - (z11 ? ((fMax - f17) / (fMax - fMin)) * fAbs : ((f17 - fMin) * fAbs) / (fMax - fMin));
                    }
                    i12++;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(v.g gVar, androidx.constraintlayout.widget.c cVar) {
            androidx.constraintlayout.widget.c.a aVar;
            androidx.constraintlayout.widget.c.a aVar2;
            SparseArray<v.f> sparseArray = new SparseArray<>();
            androidx.constraintlayout.widget.d.a aVar3 = new androidx.constraintlayout.widget.d.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, gVar);
            sparseArray.put(r.this.getId(), gVar);
            if (cVar != null && cVar.f1506c != 0) {
                r rVar = r.this;
                rVar.resolveSystem(this.f37822b, rVar.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(r.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(r.this.getWidth(), 1073741824));
            }
            for (v.f fVar : gVar.P0) {
                fVar.f36610r0 = true;
                sparseArray.put(((View) fVar.f36604o0).getId(), fVar);
            }
            for (v.f fVar2 : gVar.P0) {
                View view = (View) fVar2.f36604o0;
                int id2 = view.getId();
                if (cVar.f1509f.containsKey(Integer.valueOf(id2)) && (aVar2 = cVar.f1509f.get(Integer.valueOf(id2))) != null) {
                    aVar2.a(aVar3);
                }
                fVar2.Z(cVar.h(view.getId()).f1514e.f1535c);
                fVar2.U(cVar.h(view.getId()).f1514e.f1537d);
                if (view instanceof androidx.constraintlayout.widget.b) {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) view;
                    int id3 = bVar.getId();
                    if (cVar.f1509f.containsKey(Integer.valueOf(id3)) && (aVar = cVar.f1509f.get(Integer.valueOf(id3))) != null && (fVar2 instanceof v.k)) {
                        bVar.m(aVar, (v.k) fVar2, aVar3, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).o();
                    }
                }
                aVar3.resolveLayoutDirection(r.this.getLayoutDirection());
                r.this.applyConstraintsFromLayoutParams(false, view, fVar2, aVar3, sparseArray);
                fVar2.f36608q0 = cVar.h(view.getId()).f1512c.f1590c == 1 ? view.getVisibility() : cVar.h(view.getId()).f1512c.f1589b;
            }
            for (v.f fVar3 : gVar.P0) {
                if (fVar3 instanceof v.n) {
                    androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) fVar3.f36604o0;
                    v.j jVar = (v.j) fVar3;
                    Objects.requireNonNull(bVar2);
                    jVar.a();
                    for (int i10 = 0; i10 < bVar2.f1494d; i10++) {
                        jVar.b(sparseArray.get(bVar2.f1493c[i10]));
                    }
                    ((v.n) jVar).d0();
                }
            }
        }
    }

    public interface h {
    }

    public static class i implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static i f37828b = new i();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VelocityTracker f37829a;

        public void a(int i10) {
            VelocityTracker velocityTracker = this.f37829a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10);
            }
        }

        public float b() {
            VelocityTracker velocityTracker = this.f37829a;
            return velocityTracker != null ? velocityTracker.getXVelocity() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }

        public float c() {
            VelocityTracker velocityTracker = this.f37829a;
            return velocityTracker != null ? velocityTracker.getYVelocity() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
    }

    public class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f37830a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f37831b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37832c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37833d = -1;

        public j() {
        }

        public void a() {
            int i10 = this.f37832c;
            if (i10 != -1 || this.f37833d != -1) {
                if (i10 == -1) {
                    r.this.r(this.f37833d);
                } else {
                    int i11 = this.f37833d;
                    if (i11 == -1) {
                        r.this.setState(i10, -1, -1);
                    } else {
                        r.this.o(i10, i11);
                    }
                }
                r.this.setState(l.SETUP);
            }
            if (Float.isNaN(this.f37831b)) {
                if (Float.isNaN(this.f37830a)) {
                    return;
                }
                r.this.setProgress(this.f37830a);
            } else {
                r.this.n(this.f37830a, this.f37831b);
                this.f37830a = Float.NaN;
                this.f37831b = Float.NaN;
                this.f37832c = -1;
                this.f37833d = -1;
            }
        }
    }

    public interface k {
        void a(r rVar, int i10, int i11, float f10);

        void b(r rVar, int i10, boolean z10, float f10);

        void c(r rVar, int i10);

        void d(r rVar, int i10, int i11);
    }

    public enum l {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public r(Context context) {
        super(context);
        this.f37764e = null;
        this.f37766f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37768g = -1;
        this.f37770h = -1;
        this.f37772i = -1;
        this.f37774j = 0;
        this.f37776k = 0;
        this.f37778l = true;
        this.f37780m = new HashMap<>();
        this.f37782n = 0L;
        this.f37784o = 1.0f;
        this.f37786p = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37788q = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37791s = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37793u = false;
        this.f37795w = 0;
        this.f37797y = false;
        this.f37798z = new x.b();
        this.A = new e();
        this.E = false;
        this.J = false;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = 0;
        this.O = -1L;
        this.P = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.Q = 0;
        this.R = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.S = false;
        this.f37763d0 = new t.d();
        this.f37765e0 = false;
        this.f37769g0 = null;
        this.f37771h0 = new HashMap<>();
        this.f37773i0 = new Rect();
        this.f37775j0 = false;
        this.f37777k0 = l.UNDEFINED;
        this.f37779l0 = new g();
        this.f37781m0 = false;
        this.f37783n0 = new RectF();
        this.f37785o0 = null;
        this.f37787p0 = null;
        this.f37789q0 = new ArrayList<>();
        j(null);
    }

    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37764e = null;
        this.f37766f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37768g = -1;
        this.f37770h = -1;
        this.f37772i = -1;
        this.f37774j = 0;
        this.f37776k = 0;
        this.f37778l = true;
        this.f37780m = new HashMap<>();
        this.f37782n = 0L;
        this.f37784o = 1.0f;
        this.f37786p = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37788q = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37791s = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37793u = false;
        this.f37795w = 0;
        this.f37797y = false;
        this.f37798z = new x.b();
        this.A = new e();
        this.E = false;
        this.J = false;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = 0;
        this.O = -1L;
        this.P = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.Q = 0;
        this.R = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.S = false;
        this.f37763d0 = new t.d();
        this.f37765e0 = false;
        this.f37769g0 = null;
        this.f37771h0 = new HashMap<>();
        this.f37773i0 = new Rect();
        this.f37775j0 = false;
        this.f37777k0 = l.UNDEFINED;
        this.f37779l0 = new g();
        this.f37781m0 = false;
        this.f37783n0 = new RectF();
        this.f37785o0 = null;
        this.f37787p0 = null;
        this.f37789q0 = new ArrayList<>();
        j(attributeSet);
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37764e = null;
        this.f37766f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37768g = -1;
        this.f37770h = -1;
        this.f37772i = -1;
        this.f37774j = 0;
        this.f37776k = 0;
        this.f37778l = true;
        this.f37780m = new HashMap<>();
        this.f37782n = 0L;
        this.f37784o = 1.0f;
        this.f37786p = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37788q = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37791s = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37793u = false;
        this.f37795w = 0;
        this.f37797y = false;
        this.f37798z = new x.b();
        this.A = new e();
        this.E = false;
        this.J = false;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = 0;
        this.O = -1L;
        this.P = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.Q = 0;
        this.R = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.S = false;
        this.f37763d0 = new t.d();
        this.f37765e0 = false;
        this.f37769g0 = null;
        this.f37771h0 = new HashMap<>();
        this.f37773i0 = new Rect();
        this.f37775j0 = false;
        this.f37777k0 = l.UNDEFINED;
        this.f37779l0 = new g();
        this.f37781m0 = false;
        this.f37783n0 = new RectF();
        this.f37785o0 = null;
        this.f37787p0 = null;
        this.f37789q0 = new ArrayList<>();
        j(attributeSet);
    }

    public static Rect a(r rVar, v.f fVar) {
        rVar.f37773i0.top = fVar.B();
        rVar.f37773i0.left = fVar.A();
        Rect rect = rVar.f37773i0;
        int iZ = fVar.z();
        Rect rect2 = rVar.f37773i0;
        rect.right = iZ + rect2.left;
        int iQ = fVar.q();
        Rect rect3 = rVar.f37773i0;
        rect2.bottom = iQ + rect3.top;
        return rect3;
    }

    public void b(float f10) {
        t tVar = this.f37760c;
        if (tVar == null) {
            return;
        }
        float f11 = this.f37788q;
        float f12 = this.f37786p;
        if (f11 != f12 && this.f37792t) {
            this.f37788q = f12;
        }
        float f13 = this.f37788q;
        if (f13 == f10) {
            return;
        }
        this.f37797y = false;
        this.f37791s = f10;
        this.f37784o = tVar.c() / 1000.0f;
        setProgress(this.f37791s);
        this.f37762d = null;
        this.f37764e = this.f37760c.f();
        this.f37792t = false;
        this.f37782n = getNanoTime();
        this.f37793u = true;
        this.f37786p = f13;
        this.f37788q = f13;
        invalidate();
    }

    public void c(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n nVar = this.f37780m.get(getChildAt(i10));
            if (nVar != null && "button".equals(y.a.d(nVar.f37728b)) && nVar.A != null) {
                int i11 = 0;
                while (true) {
                    y.k[] kVarArr = nVar.A;
                    if (i11 < kVarArr.length) {
                        kVarArr[i11].g(z10 ? -100.0f : 100.0f, nVar.f37728b);
                        i11++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:143:0x0221  */
    /* JADX WARN: Code duplicated, block: B:161:0x024e A[PHI: r2
  0x024e: PHI (r2v3 int) = (r2v1 int), (r2v4 int) binds: [B:166:0x025b, B:159:0x024b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4 A[PHI: r3
  0x00e4: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ad, B:58:0x00d8, B:60:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0150  */
    /* JADX WARN: Code duplicated, block: B:93:0x0158  */
    /* JADX WARN: Code duplicated, block: B:96:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    public void d(boolean z10) {
        boolean z11;
        char c10;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        n nVar;
        int i14;
        if (this.f37790r == -1) {
            this.f37790r = getNanoTime();
        }
        float f10 = this.f37788q;
        if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f10 < 1.0f) {
            this.f37770h = -1;
        }
        boolean z12 = true;
        boolean z13 = false;
        if (this.J || (this.f37793u && (z10 || this.f37791s != f10))) {
            float fSignum = Math.signum(this.f37791s - f10);
            long nanoTime2 = getNanoTime();
            Interpolator interpolator3 = this.f37762d;
            float f11 = !(interpolator3 instanceof p) ? (((nanoTime2 - this.f37790r) * fSignum) * 1.0E-9f) / this.f37784o : 0.0f;
            float f12 = this.f37788q + f11;
            if (this.f37792t) {
                f12 = this.f37791s;
            }
            if ((fSignum <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f12 < this.f37791s) && (fSignum > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f12 > this.f37791s)) {
                z11 = false;
            } else {
                f12 = this.f37791s;
                this.f37793u = false;
                z11 = true;
            }
            this.f37788q = f12;
            this.f37786p = f12;
            this.f37790r = nanoTime2;
            if (interpolator3 == null || z11) {
                this.f37766f = f11;
            } else {
                if (this.f37797y) {
                    float interpolation2 = interpolator3.getInterpolation((nanoTime2 - this.f37782n) * 1.0E-9f);
                    Interpolator interpolator4 = this.f37762d;
                    x.b bVar = this.f37798z;
                    c10 = interpolator4 == bVar ? bVar.f37317c.a() ? (char) 2 : (char) 1 : (char) 0;
                    this.f37788q = interpolation2;
                    this.f37790r = nanoTime2;
                    Interpolator interpolator5 = this.f37762d;
                    if (interpolator5 instanceof p) {
                        float fA = ((p) interpolator5).a();
                        this.f37766f = fA;
                        if (Math.abs(fA) * this.f37784o <= 1.0E-5f && c10 == 2) {
                            this.f37793u = false;
                        }
                        if (fA > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && interpolation2 >= 1.0f) {
                            this.f37788q = 1.0f;
                            this.f37793u = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || interpolation2 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            f12 = interpolation2;
                        } else {
                            this.f37788q = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                            this.f37793u = false;
                            f12 = 0.0f;
                        }
                    } else {
                        f12 = interpolation2;
                    }
                } else {
                    float interpolation3 = interpolator3.getInterpolation(f12);
                    Interpolator interpolator6 = this.f37762d;
                    this.f37766f = interpolator6 instanceof p ? ((p) interpolator6).a() : ((interpolator6.getInterpolation(f12 + f11) - interpolation3) * fSignum) / f11;
                    f12 = interpolation3;
                }
                if (Math.abs(this.f37766f) > 1.0E-5f) {
                    setState(l.MOVING);
                }
                if (c10 != 1) {
                    if ((fSignum <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 >= this.f37791s) || (fSignum <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 <= this.f37791s)) {
                        f12 = this.f37791s;
                        this.f37793u = false;
                    }
                    if (f12 < 1.0f || f12 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        this.f37793u = false;
                        setState(l.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.J = false;
                nanoTime = getNanoTime();
                this.f37761c0 = f12;
                interpolator = this.f37764e;
                if (interpolator == null) {
                    interpolation = f12;
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                }
                interpolator2 = this.f37764e;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f37784o) + f12);
                    this.f37766f = interpolation4;
                    this.f37766f = interpolation4 - this.f37764e.getInterpolation(f12);
                }
                for (i10 = 0; i10 < childCount; i10++) {
                    childAt = getChildAt(i10);
                    nVar = this.f37780m.get(childAt);
                    if (nVar != null) {
                        this.J = nVar.c(childAt, interpolation, nanoTime, this.f37763d0) | this.J;
                    }
                }
                boolean z14 = (fSignum <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 >= this.f37791s) || (fSignum <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 <= this.f37791s);
                if (!this.J && !this.f37793u && z14) {
                    setState(l.FINISHED);
                }
                if (this.S) {
                    requestLayout();
                }
                this.J = (!z14) | this.J;
                if (f12 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && (i13 = this.f37768g) != -1 && this.f37770h != i13) {
                    this.f37770h = i13;
                    this.f37760c.b(i13).a(this);
                    setState(l.FINISHED);
                    z13 = true;
                }
                if (f12 >= 1.0d) {
                    i11 = this.f37770h;
                    i12 = this.f37772i;
                    if (i11 != i12) {
                        this.f37770h = i12;
                        this.f37760c.b(i12).a(this);
                        setState(l.FINISHED);
                        z13 = true;
                    }
                }
                if (!this.J || this.f37793u) {
                    invalidate();
                } else if ((fSignum > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 == 1.0f) || (fSignum < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
                    setState(l.FINISHED);
                }
                if (!this.J && !this.f37793u && ((fSignum > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 == 1.0f) || (fSignum < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD))) {
                    k();
                }
            }
            c10 = 0;
            if (Math.abs(this.f37766f) > 1.0E-5f) {
                setState(l.MOVING);
            }
            if (c10 != 1) {
                if (fSignum <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    f12 = this.f37791s;
                    this.f37793u = false;
                } else {
                    f12 = this.f37791s;
                    this.f37793u = false;
                }
                if (f12 < 1.0f) {
                    this.f37793u = false;
                    setState(l.FINISHED);
                } else {
                    this.f37793u = false;
                    setState(l.FINISHED);
                }
            }
            childCount = getChildCount();
            this.J = false;
            nanoTime = getNanoTime();
            this.f37761c0 = f12;
            interpolator = this.f37764e;
            if (interpolator == null) {
                interpolation = f12;
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            interpolator2 = this.f37764e;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f37784o) + f12);
                this.f37766f = interpolation5;
                this.f37766f = interpolation5 - this.f37764e.getInterpolation(f12);
            }
            while (i10 < childCount) {
                childAt = getChildAt(i10);
                nVar = this.f37780m.get(childAt);
                if (nVar != null) {
                    this.J = nVar.c(childAt, interpolation, nanoTime, this.f37763d0) | this.J;
                }
            }
            if (fSignum <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            }
            if (!this.J) {
                setState(l.FINISHED);
            }
            if (this.S) {
                requestLayout();
            }
            this.J = (!z14) | this.J;
            if (f12 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                this.f37770h = i13;
                this.f37760c.b(i13).a(this);
                setState(l.FINISHED);
                z13 = true;
            }
            if (f12 >= 1.0d) {
                i11 = this.f37770h;
                i12 = this.f37772i;
                if (i11 != i12) {
                    this.f37770h = i12;
                    this.f37760c.b(i12).a(this);
                    setState(l.FINISHED);
                    z13 = true;
                }
            }
            if (this.J) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.J) {
                k();
            }
        }
        float f13 = this.f37788q;
        if (f13 >= 1.0f) {
            int i15 = this.f37770h;
            i14 = this.f37772i;
            if (i15 == i14) {
                z12 = z13;
            }
            this.f37770h = i14;
            z13 = z12;
        } else if (f13 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            int i16 = this.f37770h;
            i14 = this.f37768g;
            if (i16 == i14) {
                z12 = z13;
            }
            this.f37770h = i14;
            z13 = z12;
        }
        this.f37781m0 |= z13;
        if (z13 && !this.f37765e0) {
            requestLayout();
        }
        this.f37786p = this.f37788q;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02d2 A[PHI: r0
  0x02d2: PHI (r0v25 float) = (r0v24 float), (r0v33 float) binds: [B:102:0x02b1, B:107:0x02bc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i10;
        Iterator<n> it;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        double dA;
        a0 a0Var;
        ArrayList<z.a> arrayList;
        int i17 = 0;
        d(false);
        t tVar = this.f37760c;
        if (tVar != null && (a0Var = tVar.f37869q) != null && (arrayList = a0Var.f37608e) != null) {
            Iterator<z.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
            a0Var.f37608e.removeAll(a0Var.f37609f);
            a0Var.f37609f.clear();
            if (a0Var.f37608e.isEmpty()) {
                a0Var.f37608e = null;
            }
        }
        super.dispatchDraw(canvas);
        if (this.f37760c == null) {
            return;
        }
        int i18 = 1;
        if ((this.f37795w & 1) == 1 && !isInEditMode()) {
            this.N++;
            long nanoTime = getNanoTime();
            long j10 = this.O;
            if (j10 != -1) {
                long j11 = nanoTime - j10;
                if (j11 > 200000000) {
                    this.P = ((int) ((this.N / (j11 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.N = 0;
                    this.O = nanoTime;
                }
            } else {
                this.O = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sbA = defpackage.a.a(this.P + " fps " + y.a.e(this, this.f37768g) + " -> ");
            sbA.append(y.a.e(this, this.f37772i));
            sbA.append(" (progress: ");
            sbA.append(progress);
            sbA.append(" ) state=");
            int i19 = this.f37770h;
            sbA.append(i19 == -1 ? AdError.UNDEFINED_DOMAIN : y.a.e(this, i19));
            String string = sbA.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f37795w > 1) {
            if (this.f37796x == null) {
                this.f37796x = new f();
            }
            f fVar = this.f37796x;
            HashMap<View, n> map = this.f37780m;
            int iC = this.f37760c.c();
            int i20 = this.f37795w;
            Objects.requireNonNull(fVar);
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!r.this.isInEditMode() && (i20 & 1) == 2) {
                String str = r.this.getContext().getResources().getResourceName(r.this.f37772i) + ":" + r.this.getProgress();
                canvas.drawText(str, 10.0f, r.this.getHeight() - 30, fVar.f37814h);
                canvas.drawText(str, 11.0f, r.this.getHeight() - 29, fVar.f37811e);
            }
            Iterator<n> it3 = map.values().iterator();
            Canvas canvas2 = canvas;
            while (it3.hasNext()) {
                n next = it3.next();
                int iMax = next.f37732f.f37837d;
                Iterator<s> it4 = next.f37747u.iterator();
                while (it4.hasNext()) {
                    iMax = Math.max(iMax, it4.next().f37837d);
                }
                int iMax2 = Math.max(iMax, next.f37733g.f37837d);
                if (i20 > 0 && iMax2 == 0) {
                    iMax2 = i18;
                }
                if (iMax2 != 0) {
                    float[] fArr = fVar.f37809c;
                    int[] iArr = fVar.f37808b;
                    if (fArr != null) {
                        if (iArr != null) {
                            Iterator<s> it5 = next.f37747u.iterator();
                            int i21 = i17;
                            while (it5.hasNext()) {
                                iArr[i21] = it5.next().f37850q;
                                i21++;
                            }
                        }
                        int i22 = i17;
                        int i23 = i22;
                        for (double[] dArrF = next.f37736j[i17].f(); i17 < dArrF.length; dArrF = dArrF) {
                            next.f37736j[i22].c(dArrF[i17], next.f37742p);
                            next.f37732f.c(dArrF[i17], next.f37741o, next.f37742p, fArr, i23);
                            i23 += 2;
                            i17++;
                            i22 = 0;
                        }
                        i10 = i23 / 2;
                    } else {
                        i10 = 0;
                    }
                    fVar.f37817k = i10;
                    if (iMax2 >= 1) {
                        int i24 = iC / 16;
                        float[] fArr2 = fVar.f37807a;
                        if (fArr2 == null || fArr2.length != i24 * 2) {
                            fVar.f37807a = new float[i24 * 2];
                            fVar.f37810d = new Path();
                        }
                        float f10 = fVar.f37819m;
                        canvas2.translate(f10, f10);
                        fVar.f37811e.setColor(1996488704);
                        fVar.f37815i.setColor(1996488704);
                        fVar.f37812f.setColor(1996488704);
                        fVar.f37813g.setColor(1996488704);
                        float[] fArr3 = fVar.f37807a;
                        float f11 = 1.0f;
                        float f12 = 1.0f / (i24 - 1);
                        HashMap<String, x.d> map2 = next.f37751y;
                        x.d dVar = map2 == null ? null : map2.get("translationX");
                        HashMap<String, x.d> map3 = next.f37751y;
                        x.d dVar2 = map3 == null ? null : map3.get("translationY");
                        HashMap<String, x.c> map4 = next.f37752z;
                        x.c cVar = map4 == null ? null : map4.get("translationX");
                        HashMap<String, x.c> map5 = next.f37752z;
                        x.c cVar2 = map5 == null ? null : map5.get("translationY");
                        int i25 = 0;
                        while (i25 < i24) {
                            int i26 = i24;
                            float fMin = i25 * f12;
                            float f13 = f12;
                            float f14 = next.f37740n;
                            if (f14 != f11) {
                                float f15 = next.f37739m;
                                if (fMin < f15) {
                                    fMin = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                }
                                if (fMin > f15) {
                                    i15 = iC;
                                    i16 = i20;
                                    if (fMin < 1.0d) {
                                        fMin = Math.min((fMin - f15) * f14, 1.0f);
                                    }
                                } else {
                                    i15 = iC;
                                    i16 = i20;
                                }
                            } else {
                                i15 = iC;
                                i16 = i20;
                            }
                            double d10 = fMin;
                            t.c cVar3 = next.f37732f.f37836c;
                            Iterator<s> it6 = next.f37747u.iterator();
                            float f16 = Float.NaN;
                            float f17 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                            while (it6.hasNext()) {
                                Iterator<n> it7 = it3;
                                s next2 = it6.next();
                                Iterator<s> it8 = it6;
                                t.c cVar4 = next2.f37836c;
                                if (cVar4 != null) {
                                    float f18 = next2.f37838e;
                                    if (f18 < fMin) {
                                        f17 = f18;
                                        cVar3 = cVar4;
                                    } else if (Float.isNaN(f16)) {
                                        f16 = next2.f37838e;
                                    }
                                }
                                it6 = it8;
                                it3 = it7;
                            }
                            Iterator<n> it9 = it3;
                            if (cVar3 != null) {
                                if (Float.isNaN(f16)) {
                                    f16 = 1.0f;
                                }
                                float f19 = f16 - f17;
                                dA = (((float) cVar3.a((fMin - f17) / f19)) * f19) + f17;
                            } else {
                                dA = d10;
                            }
                            next.f37736j[0].c(dA, next.f37742p);
                            t.b bVar = next.f37737k;
                            if (bVar != null) {
                                double[] dArr = next.f37742p;
                                if (dArr.length > 0) {
                                    bVar.c(dA, dArr);
                                }
                            }
                            int i27 = i25 * 2;
                            int i28 = i25;
                            x.c cVar5 = cVar;
                            x.c cVar6 = cVar2;
                            double d11 = dA;
                            x.d dVar3 = dVar2;
                            x.d dVar4 = dVar;
                            next.f37732f.c(d11, next.f37741o, next.f37742p, fArr3, i27);
                            if (cVar5 != null) {
                                fArr3[i27] = cVar5.a(fMin) + fArr3[i27];
                            } else if (dVar4 != null) {
                                fArr3[i27] = dVar4.a(fMin) + fArr3[i27];
                            }
                            if (cVar6 != null) {
                                int i29 = i27 + 1;
                                fArr3[i29] = cVar6.a(fMin) + fArr3[i29];
                            } else if (dVar3 != null) {
                                int i30 = i27 + 1;
                                fArr3[i30] = dVar3.a(fMin) + fArr3[i30];
                            }
                            i25 = i28 + 1;
                            cVar2 = cVar6;
                            dVar2 = dVar3;
                            dVar = dVar4;
                            cVar = cVar5;
                            f12 = f13;
                            iC = i15;
                            i20 = i16;
                            it3 = it9;
                            f11 = 1.0f;
                            i24 = i26;
                        }
                        it = it3;
                        i11 = iC;
                        i12 = i20;
                        fVar.a(canvas, iMax2, fVar.f37817k, next);
                        fVar.f37811e.setColor(-21965);
                        fVar.f37812f.setColor(-2067046);
                        fVar.f37815i.setColor(-2067046);
                        fVar.f37813g.setColor(-13391360);
                        float f20 = -fVar.f37819m;
                        canvas.translate(f20, f20);
                        fVar.a(canvas, iMax2, fVar.f37817k, next);
                        if (iMax2 == 5) {
                            fVar.f37810d.reset();
                            for (int i31 = 0; i31 <= 50; i31++) {
                                float[] fArr4 = fVar.f37816j;
                                next.f37736j[0].c(next.a(i31 / 50, null), next.f37742p);
                                s sVar = next.f37732f;
                                int[] iArr2 = next.f37741o;
                                double[] dArr2 = next.f37742p;
                                float f21 = sVar.f37840g;
                                float fCos = sVar.f37841h;
                                float f22 = sVar.f37842i;
                                float f23 = sVar.f37843j;
                                for (int i32 = 0; i32 < iArr2.length; i32++) {
                                    float f24 = (float) dArr2[i32];
                                    int i33 = iArr2[i32];
                                    if (i33 == 1) {
                                        f21 = f24;
                                    } else if (i33 == 2) {
                                        fCos = f24;
                                    } else if (i33 == 3) {
                                        f22 = f24;
                                    } else if (i33 == 4) {
                                        f23 = f24;
                                    }
                                }
                                if (sVar.f37848o != null) {
                                    double d12 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                    double d13 = f21;
                                    double d14 = fCos;
                                    float fA = (float) (androidx.appcompat.app.w.a(d14, d13, d12) - ((double) (f22 / 2.0f)));
                                    fCos = (float) ((d12 - (Math.cos(d14) * d13)) - ((double) (f23 / 2.0f)));
                                    f21 = fA;
                                }
                                float f25 = f22 + f21;
                                float f26 = f23 + fCos;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f27 = f21 + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                float f28 = fCos + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                float f29 = f25 + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                float f30 = f26 + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                fArr4[0] = f27;
                                fArr4[1] = f28;
                                fArr4[2] = f29;
                                fArr4[3] = f28;
                                fArr4[4] = f29;
                                fArr4[5] = f30;
                                fArr4[6] = f27;
                                fArr4[7] = f30;
                                Path path = fVar.f37810d;
                                float[] fArr5 = fVar.f37816j;
                                path.moveTo(fArr5[0], fArr5[1]);
                                Path path2 = fVar.f37810d;
                                float[] fArr6 = fVar.f37816j;
                                path2.lineTo(fArr6[2], fArr6[3]);
                                Path path3 = fVar.f37810d;
                                float[] fArr7 = fVar.f37816j;
                                path3.lineTo(fArr7[4], fArr7[5]);
                                Path path4 = fVar.f37810d;
                                float[] fArr8 = fVar.f37816j;
                                path4.lineTo(fArr8[6], fArr8[7]);
                                fVar.f37810d.close();
                            }
                            i13 = 0;
                            i14 = 1;
                            fVar.f37811e.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(fVar.f37810d, fVar.f37811e);
                            canvas.translate(-2.0f, -2.0f);
                            fVar.f37811e.setColor(-65536);
                            canvas.drawPath(fVar.f37810d, fVar.f37811e);
                        } else {
                            i13 = 0;
                            i14 = 1;
                        }
                        canvas2 = canvas;
                        i18 = i14;
                        i17 = i13;
                    } else {
                        it = it3;
                        i11 = iC;
                        i12 = i20;
                        i17 = 0;
                        i18 = 1;
                    }
                    iC = i11;
                    i20 = i12;
                    it3 = it;
                }
            }
            canvas.restore();
        }
    }

    public final void e() {
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if ((this.f37794v == null && ((copyOnWriteArrayList = this.M) == null || copyOnWriteArrayList.isEmpty())) || this.R == this.f37786p) {
            return;
        }
        if (this.Q != -1) {
            k kVar = this.f37794v;
            if (kVar != null) {
                kVar.d(this, this.f37768g, this.f37772i);
            }
            CopyOnWriteArrayList<k> copyOnWriteArrayList2 = this.M;
            if (copyOnWriteArrayList2 != null) {
                Iterator<k> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().d(this, this.f37768g, this.f37772i);
                }
            }
        }
        this.Q = -1;
        float f10 = this.f37786p;
        this.R = f10;
        k kVar2 = this.f37794v;
        if (kVar2 != null) {
            kVar2.a(this, this.f37768g, this.f37772i, f10);
        }
        CopyOnWriteArrayList<k> copyOnWriteArrayList3 = this.M;
        if (copyOnWriteArrayList3 != null) {
            Iterator<k> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.f37768g, this.f37772i, this.f37786p);
            }
        }
    }

    public void f() {
        int iIntValue;
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if ((this.f37794v != null || ((copyOnWriteArrayList = this.M) != null && !copyOnWriteArrayList.isEmpty())) && this.Q == -1) {
            this.Q = this.f37770h;
            if (this.f37789q0.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.f37789q0;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i10 = this.f37770h;
            if (iIntValue != i10 && i10 != -1) {
                this.f37789q0.add(Integer.valueOf(i10));
            }
        }
        l();
        Runnable runnable = this.f37769g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void g(int i10, float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        HashMap<View, n> map = this.f37780m;
        View viewById = getViewById(i10);
        n nVar = map.get(viewById);
        if (nVar == null) {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewById == null ? android.support.v4.media.a.a("", i10) : viewById.getContext().getResources().getResourceName(i10)));
            return;
        }
        float fA = nVar.a(f10, nVar.f37748v);
        t.b[] bVarArr = nVar.f37736j;
        int i11 = 0;
        if (bVarArr != null) {
            double d10 = fA;
            bVarArr[0].e(d10, nVar.f37743q);
            nVar.f37736j[0].c(d10, nVar.f37742p);
            float f13 = nVar.f37748v[0];
            while (true) {
                dArr = nVar.f37743q;
                if (i11 >= dArr.length) {
                    break;
                }
                dArr[i11] = dArr[i11] * ((double) f13);
                i11++;
            }
            t.b bVar = nVar.f37737k;
            if (bVar != null) {
                double[] dArr2 = nVar.f37742p;
                if (dArr2.length > 0) {
                    bVar.c(d10, dArr2);
                    nVar.f37737k.e(d10, nVar.f37743q);
                    nVar.f37732f.e(f11, f12, fArr, nVar.f37741o, nVar.f37743q, nVar.f37742p);
                }
            } else {
                nVar.f37732f.e(f11, f12, fArr, nVar.f37741o, dArr, nVar.f37742p);
            }
        } else {
            s sVar = nVar.f37733g;
            float f14 = sVar.f37840g;
            s sVar2 = nVar.f37732f;
            float f15 = f14 - sVar2.f37840g;
            float f16 = sVar.f37841h - sVar2.f37841h;
            float f17 = sVar.f37842i - sVar2.f37842i;
            float f18 = (sVar.f37843j - sVar2.f37843j) + f16;
            fArr[0] = ((f17 + f15) * f11) + ((1.0f - f11) * f15);
            fArr[1] = (f18 * f12) + ((1.0f - f12) * f16);
        }
        viewById.getY();
    }

    public int[] getConstraintSetIds() {
        t tVar = this.f37760c;
        if (tVar == null) {
            return null;
        }
        int size = tVar.f37859g.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = tVar.f37859g.keyAt(i10);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f37770h;
    }

    public ArrayList<t.b> getDefinedTransitions() {
        t tVar = this.f37760c;
        if (tVar == null) {
            return null;
        }
        return tVar.f37856d;
    }

    public y.b getDesignTool() {
        if (this.B == null) {
            this.B = new y.b(this);
        }
        return this.B;
    }

    public int getEndState() {
        return this.f37772i;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f37788q;
    }

    public t getScene() {
        return this.f37760c;
    }

    public int getStartState() {
        return this.f37768g;
    }

    public float getTargetPosition() {
        return this.f37791s;
    }

    public Bundle getTransitionState() {
        if (this.f37767f0 == null) {
            this.f37767f0 = new j();
        }
        j jVar = this.f37767f0;
        r rVar = r.this;
        jVar.f37833d = rVar.f37772i;
        jVar.f37832c = rVar.f37768g;
        jVar.f37831b = rVar.getVelocity();
        jVar.f37830a = r.this.getProgress();
        j jVar2 = this.f37767f0;
        Objects.requireNonNull(jVar2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", jVar2.f37830a);
        bundle.putFloat("motion.velocity", jVar2.f37831b);
        bundle.putInt("motion.StartState", jVar2.f37832c);
        bundle.putInt("motion.EndState", jVar2.f37833d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        t tVar = this.f37760c;
        if (tVar != null) {
            this.f37784o = tVar.c() / 1000.0f;
        }
        return (long) (this.f37784o * 1000.0f);
    }

    public float getVelocity() {
        return this.f37766f;
    }

    public androidx.constraintlayout.widget.c h(int i10) {
        t tVar = this.f37760c;
        if (tVar == null) {
            return null;
        }
        return tVar.b(i10);
    }

    public final boolean i(float f10, float f11, View view, MotionEvent motionEvent) {
        boolean z10;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z10 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z10 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i((childAt.getLeft() + f10) - view.getScrollX(), (childAt.getTop() + f11) - view.getScrollY(), childAt, motionEvent)) {
                z10 = true;
                break;
            }
            childCount--;
        }
        if (!z10) {
            this.f37783n0.set(f10, f11, (view.getRight() + f10) - view.getLeft(), (view.getBottom() + f11) - view.getTop());
            if (motionEvent.getAction() != 0 || this.f37783n0.contains(motionEvent.getX(), motionEvent.getY())) {
                float f12 = -f10;
                float f13 = -f11;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f12, f13);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f12, -f13);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f12, f13);
                    if (this.f37787p0 == null) {
                        this.f37787p0 = new Matrix();
                    }
                    matrix.invert(this.f37787p0);
                    motionEventObtain.transform(this.f37787p0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z10;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public final void j(AttributeSet attributeSet) {
        t tVar;
        f37757r0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z.d.f44948o);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 2) {
                    this.f37760c = new t(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f37770h = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f37791s = typedArrayObtainStyledAttributes.getFloat(index, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    this.f37793u = true;
                } else if (index == 0) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == 5) {
                    if (this.f37795w == 0) {
                        this.f37795w = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f37795w = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f37760c == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.f37760c = null;
            }
        }
        if (this.f37795w != 0) {
            t tVar2 = this.f37760c;
            if (tVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int i11 = tVar2.i();
                t tVar3 = this.f37760c;
                androidx.constraintlayout.widget.c cVarB = tVar3.b(tVar3.i());
                String strC = y.a.c(getContext(), i11);
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    int id2 = childAt.getId();
                    if (id2 == -1) {
                        StringBuilder sbA = androidx.activity.result.c.a("CHECK: ", strC, " ALL VIEWS SHOULD HAVE ID's ");
                        sbA.append(childAt.getClass().getName());
                        sbA.append(" does not!");
                        Log.w("MotionLayout", sbA.toString());
                    }
                    if (cVarB.i(id2) == null) {
                        StringBuilder sbA2 = androidx.activity.result.c.a("CHECK: ", strC, " NO CONSTRAINTS for ");
                        sbA2.append(y.a.d(childAt));
                        Log.w("MotionLayout", sbA2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) cVarB.f1509f.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i13 = 0; i13 < length; i13++) {
                    iArr[i13] = numArr[i13].intValue();
                }
                for (int i14 = 0; i14 < length; i14++) {
                    int i15 = iArr[i14];
                    String strC2 = y.a.c(getContext(), i15);
                    if (findViewById(iArr[i14]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strC + " NO View matches id " + strC2);
                    }
                    if (cVarB.h(i15).f1514e.f1537d == -1) {
                        Log.w("MotionLayout", q.a("CHECK: ", strC, "(", strC2, ") no LAYOUT_HEIGHT"));
                    }
                    if (cVarB.h(i15).f1514e.f1535c == -1) {
                        Log.w("MotionLayout", q.a("CHECK: ", strC, "(", strC2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (t.b bVar : this.f37760c.f37856d) {
                    if (bVar == this.f37760c.f37855c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (bVar.f37876d == bVar.f37875c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i16 = bVar.f37876d;
                    int i17 = bVar.f37875c;
                    String strC3 = y.a.c(getContext(), i16);
                    String strC4 = y.a.c(getContext(), i17);
                    if (sparseIntArray.get(i16) == i17) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strC3 + "->" + strC4);
                    }
                    if (sparseIntArray2.get(i17) == i16) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strC3 + "->" + strC4);
                    }
                    sparseIntArray.put(i16, i17);
                    sparseIntArray2.put(i17, i16);
                    if (this.f37760c.b(i16) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + strC3);
                    }
                    if (this.f37760c.b(i17) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + strC3);
                    }
                }
            }
        }
        if (this.f37770h != -1 || (tVar = this.f37760c) == null) {
            return;
        }
        this.f37770h = tVar.i();
        this.f37768g = this.f37760c.i();
        this.f37772i = this.f37760c.d();
    }

    public void k() {
        t.b bVar;
        x xVar;
        View viewFindViewById;
        t tVar = this.f37760c;
        if (tVar == null) {
            return;
        }
        if (tVar.a(this, this.f37770h)) {
            requestLayout();
            return;
        }
        int i10 = this.f37770h;
        if (i10 != -1) {
            t tVar2 = this.f37760c;
            for (t.b bVar2 : tVar2.f37856d) {
                if (bVar2.f37885m.size() > 0) {
                    Iterator<t.b.a> it = bVar2.f37885m.iterator();
                    while (it.hasNext()) {
                        it.next().b(this);
                    }
                }
            }
            for (t.b bVar3 : tVar2.f37858f) {
                if (bVar3.f37885m.size() > 0) {
                    Iterator<t.b.a> it2 = bVar3.f37885m.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(this);
                    }
                }
            }
            for (t.b bVar4 : tVar2.f37856d) {
                if (bVar4.f37885m.size() > 0) {
                    Iterator<t.b.a> it3 = bVar4.f37885m.iterator();
                    while (it3.hasNext()) {
                        it3.next().a(this, i10, bVar4);
                    }
                }
            }
            for (t.b bVar5 : tVar2.f37858f) {
                if (bVar5.f37885m.size() > 0) {
                    Iterator<t.b.a> it4 = bVar5.f37885m.iterator();
                    while (it4.hasNext()) {
                        it4.next().a(this, i10, bVar5);
                    }
                }
            }
        }
        if (!this.f37760c.q() || (bVar = this.f37760c.f37855c) == null || (xVar = bVar.f37884l) == null) {
            return;
        }
        int i11 = xVar.f37910d;
        if (i11 != -1) {
            viewFindViewById = xVar.f37926t.findViewById(i11);
            if (viewFindViewById == null) {
                StringBuilder sbA = defpackage.a.a("cannot find TouchAnchorId @id/");
                sbA.append(y.a.c(xVar.f37926t.getContext(), xVar.f37910d));
                Log.e("TouchResponse", sbA.toString());
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new v());
            nestedScrollView.setOnScrollChangeListener(new w());
        }
    }

    public final void l() {
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if (this.f37794v == null && ((copyOnWriteArrayList = this.M) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        for (Integer num : this.f37789q0) {
            k kVar = this.f37794v;
            if (kVar != null) {
                kVar.c(this, num.intValue());
            }
            CopyOnWriteArrayList<k> copyOnWriteArrayList2 = this.M;
            if (copyOnWriteArrayList2 != null) {
                Iterator<k> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, num.intValue());
                }
            }
        }
        this.f37789q0.clear();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i10) {
        t.b bVar;
        if (i10 == 0) {
            this.f37760c = null;
            return;
        }
        try {
            t tVar = new t(getContext(), this, i10);
            this.f37760c = tVar;
            if (this.f37770h == -1) {
                this.f37770h = tVar.i();
                this.f37768g = this.f37760c.i();
                this.f37772i = this.f37760c.d();
            }
            if (!super.isAttachedToWindow()) {
                this.f37760c = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                t tVar2 = this.f37760c;
                if (tVar2 != null) {
                    androidx.constraintlayout.widget.c cVarB = tVar2.b(this.f37770h);
                    this.f37760c.o(this);
                    if (cVarB != null) {
                        cVarB.c(this, true);
                        setConstraintSet(null);
                        requestLayout();
                    }
                    this.f37768g = this.f37770h;
                }
                k();
                j jVar = this.f37767f0;
                if (jVar != null) {
                    if (this.f37775j0) {
                        post(new a());
                        return;
                    } else {
                        jVar.a();
                        return;
                    }
                }
                t tVar3 = this.f37760c;
                if (tVar3 == null || (bVar = tVar3.f37855c) == null || bVar.f37886n != 4) {
                    return;
                }
                q();
                setState(l.SETUP);
                setState(l.MOVING);
            } catch (Exception e10) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e10);
            }
        } catch (Exception e11) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e11);
        }
    }

    public void m() {
        this.f37779l0.f();
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    public void n(float f10, float f11) {
        if (!super.isAttachedToWindow()) {
            if (this.f37767f0 == null) {
                this.f37767f0 = new j();
            }
            j jVar = this.f37767f0;
            jVar.f37830a = f10;
            jVar.f37831b = f11;
            return;
        }
        setProgress(f10);
        setState(l.MOVING);
        this.f37766f = f11;
        float f12 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (f11 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            if (f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                f12 = 1.0f;
            }
        } else {
            if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f10 == 1.0f) {
                return;
            }
            if (f10 > 0.5f) {
                f12 = 1.0f;
            }
        }
        b(f12);
    }

    public void o(int i10, int i11) {
        if (!super.isAttachedToWindow()) {
            if (this.f37767f0 == null) {
                this.f37767f0 = new j();
            }
            j jVar = this.f37767f0;
            jVar.f37832c = i10;
            jVar.f37833d = i11;
            return;
        }
        t tVar = this.f37760c;
        if (tVar != null) {
            this.f37768g = i10;
            this.f37772i = i11;
            tVar.p(i10, i11);
            this.f37779l0.e(this.f37760c.b(i10), this.f37760c.b(i11));
            m();
            this.f37788q = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            b(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        t.b bVar;
        int i10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        t tVar = this.f37760c;
        if (tVar != null && (i10 = this.f37770h) != -1) {
            androidx.constraintlayout.widget.c cVarB = tVar.b(i10);
            this.f37760c.o(this);
            if (cVarB != null) {
                cVarB.c(this, true);
                setConstraintSet(null);
                requestLayout();
            }
            this.f37768g = this.f37770h;
        }
        k();
        j jVar = this.f37767f0;
        if (jVar != null) {
            if (this.f37775j0) {
                post(new c());
                return;
            } else {
                jVar.a();
                return;
            }
        }
        t tVar2 = this.f37760c;
        if (tVar2 == null || (bVar = tVar2.f37855c) == null || bVar.f37886n != 4) {
            return;
        }
        q();
        setState(l.SETUP);
        setState(l.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x xVar;
        int i10;
        RectF rectFB;
        int currentState;
        t tVar = this.f37760c;
        if (tVar != null && this.f37778l) {
            a0 a0Var = tVar.f37869q;
            if (a0Var != null && (currentState = a0Var.f37604a.getCurrentState()) != -1) {
                if (a0Var.f37606c == null) {
                    a0Var.f37606c = new HashSet<>();
                    for (z zVar : a0Var.f37605b) {
                        int childCount = a0Var.f37604a.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = a0Var.f37604a.getChildAt(i11);
                            if (zVar.c(childAt)) {
                                childAt.getId();
                                a0Var.f37606c.add(childAt);
                            }
                        }
                    }
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<z.a> arrayList = a0Var.f37608e;
                int i12 = 2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (z.a aVar : a0Var.f37608e) {
                        Objects.requireNonNull(aVar);
                        if (action != 1) {
                            if (action == 2) {
                                aVar.f37957c.f37728b.getHitRect(aVar.f37966l);
                                if (!aVar.f37966l.contains((int) x10, (int) y10) && !aVar.f37962h) {
                                    aVar.b(true);
                                }
                            }
                        } else if (!aVar.f37962h) {
                            aVar.b(true);
                        }
                    }
                }
                if (action == 0 || action == 1) {
                    androidx.constraintlayout.widget.c cVarH = a0Var.f37604a.h(currentState);
                    Iterator<z> it = a0Var.f37605b.iterator();
                    while (it.hasNext()) {
                        z next = it.next();
                        int i13 = next.f37935b;
                        if (i13 != 1 ? !(i13 != i12 ? !(i13 == 3 && action == 0) : action != 1) : action == 0) {
                            for (View view : a0Var.f37606c) {
                                if (next.c(view)) {
                                    view.getHitRect(rect);
                                    if (rect.contains((int) x10, (int) y10)) {
                                        next.a(a0Var, a0Var.f37604a, currentState, cVarH, view);
                                    }
                                    next = next;
                                    i12 = i12;
                                }
                            }
                        }
                    }
                }
            }
            t.b bVar = this.f37760c.f37855c;
            if (bVar != null && (!bVar.f37887o) && (xVar = bVar.f37884l) != null && ((motionEvent.getAction() != 0 || (rectFB = xVar.b(this, new RectF())) == null || rectFB.contains(motionEvent.getX(), motionEvent.getY())) && (i10 = xVar.f37911e) != -1)) {
                View view2 = this.f37785o0;
                if (view2 == null || view2.getId() != i10) {
                    this.f37785o0 = findViewById(i10);
                }
                View view3 = this.f37785o0;
                if (view3 != null) {
                    this.f37783n0.set(view3.getLeft(), this.f37785o0.getTop(), this.f37785o0.getRight(), this.f37785o0.getBottom());
                    if (this.f37783n0.contains(motionEvent.getX(), motionEvent.getY()) && !i(this.f37785o0.getLeft(), this.f37785o0.getTop(), this.f37785o0, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f37765e0 = true;
        try {
            if (this.f37760c == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.C != i14 || this.D != i15) {
                m();
                d(true);
            }
            this.C = i14;
            this.D = i15;
        } finally {
            this.f37765e0 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        if (this.f37760c == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z11 = true;
        boolean z12 = (this.f37774j == i10 && this.f37776k == i11) ? false : true;
        if (this.f37781m0) {
            this.f37781m0 = false;
            k();
            l();
            z12 = true;
        }
        if (this.mDirtyHierarchy) {
            z12 = true;
        }
        this.f37774j = i10;
        this.f37776k = i11;
        int i12 = this.f37760c.i();
        int iD = this.f37760c.d();
        if (!z12) {
            g gVar = this.f37779l0;
            if (!((i12 == gVar.f37825e && iD == gVar.f37826f) ? false : true)) {
                if (z12) {
                    super.onMeasure(i10, i11);
                }
                z10 = true;
            } else if (this.f37768g != -1) {
                super.onMeasure(i10, i11);
                this.f37779l0.e(this.f37760c.b(i12), this.f37760c.b(iD));
                this.f37779l0.f();
                g gVar2 = this.f37779l0;
                gVar2.f37825e = i12;
                gVar2.f37826f = iD;
                z10 = false;
            } else {
                if (z12) {
                    super.onMeasure(i10, i11);
                }
                z10 = true;
            }
        } else if (this.f37768g != -1) {
            super.onMeasure(i10, i11);
            this.f37779l0.e(this.f37760c.b(i12), this.f37760c.b(iD));
            this.f37779l0.f();
            g gVar3 = this.f37779l0;
            gVar3.f37825e = i12;
            gVar3.f37826f = iD;
            z10 = false;
        } else {
            if (z12) {
                super.onMeasure(i10, i11);
            }
            z10 = true;
        }
        if (this.S || z10) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iZ = this.mLayoutWidget.z() + getPaddingRight() + getPaddingLeft();
            int iQ = this.mLayoutWidget.q() + paddingBottom;
            int i13 = this.f37758a0;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                int i14 = this.T;
                iZ = (int) ((this.f37761c0 * (this.V - i14)) + i14);
                requestLayout();
            }
            int i15 = this.f37759b0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                int i16 = this.U;
                iQ = (int) ((this.f37761c0 * (this.W - i16)) + i16);
                requestLayout();
            }
            setMeasuredDimension(iZ, iQ);
        }
        float fSignum = Math.signum(this.f37791s - this.f37788q);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f37762d;
        float interpolation = this.f37788q + (!(interpolator instanceof x.b) ? (((nanoTime - this.f37790r) * fSignum) * 1.0E-9f) / this.f37784o : 0.0f);
        if (this.f37792t) {
            interpolation = this.f37791s;
        }
        if ((fSignum <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || interpolation < this.f37791s) && (fSignum > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || interpolation > this.f37791s)) {
            z11 = false;
        } else {
            interpolation = this.f37791s;
        }
        if (interpolator != null && !z11) {
            interpolation = this.f37797y ? interpolator.getInterpolation((nanoTime - this.f37782n) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && interpolation >= this.f37791s) || (fSignum <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && interpolation <= this.f37791s)) {
            interpolation = this.f37791s;
        }
        this.f37761c0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f37764e;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            n nVar = this.f37780m.get(childAt);
            if (nVar != null) {
                nVar.c(childAt, interpolation, nanoTime2, this.f37763d0);
            }
        }
        if (this.S) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // p0.r
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        t.b bVar;
        boolean z10;
        ?? r10;
        x xVar;
        float f10;
        x xVar2;
        x xVar3;
        x xVar4;
        int i13;
        t tVar = this.f37760c;
        if (tVar == null || (bVar = tVar.f37855c) == null || !((z10 = !bVar.f37887o))) {
            return;
        }
        int i14 = -1;
        if (!z10 || (xVar4 = bVar.f37884l) == null || (i13 = xVar4.f37911e) == -1 || view.getId() == i13) {
            t.b bVar2 = tVar.f37855c;
            if ((bVar2 == null || (xVar3 = bVar2.f37884l) == null) ? false : xVar3.f37929w) {
                x xVar5 = bVar.f37884l;
                if (xVar5 != null && (xVar5.f37931y & 4) != 0) {
                    i14 = i11;
                }
                float f11 = this.f37786p;
                if ((f11 == 1.0f || f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            x xVar6 = bVar.f37884l;
            if (xVar6 != null && (xVar6.f37931y & 1) != 0) {
                float f12 = i10;
                float f13 = i11;
                t.b bVar3 = tVar.f37855c;
                if (bVar3 == null || (xVar2 = bVar3.f37884l) == null) {
                    f10 = 0.0f;
                } else {
                    xVar2.f37926t.g(xVar2.f37910d, xVar2.f37926t.getProgress(), xVar2.f37914h, xVar2.f37913g, xVar2.f37922p);
                    float f14 = xVar2.f37919m;
                    if (f14 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        float[] fArr = xVar2.f37922p;
                        if (fArr[0] == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            fArr[0] = 1.0E-7f;
                        }
                        f10 = (f12 * f14) / fArr[0];
                    } else {
                        float[] fArr2 = xVar2.f37922p;
                        if (fArr2[1] == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            fArr2[1] = 1.0E-7f;
                        }
                        f10 = (f13 * xVar2.f37920n) / fArr2[1];
                    }
                }
                float f15 = this.f37788q;
                if ((f15 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) || (f15 >= 1.0f && f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new b(view));
                    return;
                }
            }
            float f16 = this.f37786p;
            long nanoTime = getNanoTime();
            float f17 = i10;
            this.F = f17;
            float f18 = i11;
            this.G = f18;
            this.I = (float) ((nanoTime - this.H) * 1.0E-9d);
            this.H = nanoTime;
            t.b bVar4 = tVar.f37855c;
            if (bVar4 != null && (xVar = bVar4.f37884l) != null) {
                float progress = xVar.f37926t.getProgress();
                if (!xVar.f37921o) {
                    xVar.f37921o = true;
                    xVar.f37926t.setProgress(progress);
                }
                xVar.f37926t.g(xVar.f37910d, progress, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                float f19 = xVar.f37919m;
                float[] fArr3 = xVar.f37922p;
                if (Math.abs((xVar.f37920n * fArr3[1]) + (f19 * fArr3[0])) < 0.01d) {
                    float[] fArr4 = xVar.f37922p;
                    fArr4[0] = 0.01f;
                    fArr4[1] = 0.01f;
                }
                float f20 = xVar.f37919m;
                float fMax = Math.max(Math.min(progress + (f20 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? (f17 * f20) / xVar.f37922p[0] : (f18 * xVar.f37920n) / xVar.f37922p[1]), 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                if (fMax != xVar.f37926t.getProgress()) {
                    xVar.f37926t.setProgress(fMax);
                }
            }
            if (f16 != this.f37786p) {
                iArr[0] = i10;
                r10 = 1;
                iArr[1] = i11;
            } else {
                r10 = 1;
            }
            d(false);
            if (iArr[0] == 0 && iArr[r10] == 0) {
                return;
            }
            this.E = r10;
        }
    }

    @Override // p0.r
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // p0.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.E || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.E = false;
    }

    @Override // p0.r
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.H = getNanoTime();
        this.I = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.F = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.G = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        x xVar;
        t tVar = this.f37760c;
        if (tVar != null) {
            boolean zIsRtl = isRtl();
            tVar.f37868p = zIsRtl;
            t.b bVar = tVar.f37855c;
            if (bVar == null || (xVar = bVar.f37884l) == null) {
                return;
            }
            xVar.c(zIsRtl);
        }
    }

    @Override // p0.r
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        t.b bVar;
        x xVar;
        t tVar = this.f37760c;
        return (tVar == null || (bVar = tVar.f37855c) == null || (xVar = bVar.f37884l) == null || (xVar.f37931y & 2) != 0) ? false : true;
    }

    @Override // p0.r
    public void onStopNestedScroll(View view, int i10) {
        x xVar;
        t tVar = this.f37760c;
        if (tVar != null) {
            float f10 = this.I;
            float f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                return;
            }
            float f12 = this.F / f10;
            float f13 = this.G / f10;
            t.b bVar = tVar.f37855c;
            if (bVar == null || (xVar = bVar.f37884l) == null) {
                return;
            }
            xVar.f37921o = false;
            float progress = xVar.f37926t.getProgress();
            xVar.f37926t.g(xVar.f37910d, progress, xVar.f37914h, xVar.f37913g, xVar.f37922p);
            float f14 = xVar.f37919m;
            float[] fArr = xVar.f37922p;
            float f15 = fArr[0];
            float f16 = xVar.f37920n;
            float f17 = fArr[1];
            float f18 = f14 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? (f12 * f14) / fArr[0] : (f13 * f16) / fArr[1];
            if (!Float.isNaN(f18)) {
                progress += f18 / 3.0f;
            }
            if (progress != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                boolean z10 = progress != 1.0f;
                int i11 = xVar.f37909c;
                if ((i11 != 3) && z10) {
                    r rVar = xVar.f37926t;
                    if (progress >= 0.5d) {
                        f11 = 1.0f;
                    }
                    rVar.p(i11, f11, f18);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0226  */
    /* JADX WARN: Code duplicated, block: B:111:0x022c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0230  */
    /* JADX WARN: Code duplicated, block: B:119:0x023e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0244  */
    /* JADX WARN: Code duplicated, block: B:124:0x024d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0254  */
    /* JADX WARN: Code duplicated, block: B:129:0x0259  */
    /* JADX WARN: Code duplicated, block: B:131:0x0276  */
    /* JADX WARN: Code duplicated, block: B:132:0x02af  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:140:0x033e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0341  */
    /* JADX WARN: Code duplicated, block: B:143:0x0347  */
    /* JADX WARN: Code duplicated, block: B:146:0x0357  */
    /* JADX WARN: Code duplicated, block: B:148:0x035b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0365  */
    /* JADX WARN: Code duplicated, block: B:153:0x0372  */
    /* JADX WARN: Code duplicated, block: B:154:0x0397  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:159:0x03be  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:163:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:164:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:169:0x0412  */
    /* JADX WARN: Code duplicated, block: B:171:0x043f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0465  */
    /* JADX WARN: Code duplicated, block: B:174:0x046a  */
    /* JADX WARN: Code duplicated, block: B:176:0x04b0 A[PHI: r7 r11
  0x04b0: PHI (r7v49 float) = (r7v41 float), (r7v75 float) binds: [B:173:0x0468, B:175:0x04a1] A[DONT_GENERATE, DONT_INLINE]
  0x04b0: PHI (r11v24 float) = (r11v15 float), (r11v31 float) binds: [B:173:0x0468, B:175:0x04a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:178:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:179:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:182:0x050a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0519  */
    /* JADX WARN: Code duplicated, block: B:186:0x051f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0577  */
    /* JADX WARN: Code duplicated, block: B:213:0x057e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0582  */
    /* JADX WARN: Code duplicated, block: B:216:0x058b  */
    /* JADX WARN: Code duplicated, block: B:217:0x059c  */
    /* JADX WARN: Code duplicated, block: B:219:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:222:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:224:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:227:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:229:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:231:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:233:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:236:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:237:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:240:0x063c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0645  */
    /* JADX WARN: Code duplicated, block: B:244:0x064e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0654  */
    /* JADX WARN: Code duplicated, block: B:248:0x066b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0674  */
    /* JADX WARN: Code duplicated, block: B:254:0x0685  */
    /* JADX WARN: Code duplicated, block: B:256:0x068a  */
    /* JADX WARN: Code duplicated, block: B:258:0x0690  */
    /* JADX WARN: Code duplicated, block: B:260:0x0694  */
    /* JADX WARN: Code duplicated, block: B:261:0x0696  */
    /* JADX WARN: Code duplicated, block: B:265:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:266:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:268:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:270:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:272:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:273:0x0702  */
    /* JADX WARN: Code duplicated, block: B:276:0x072e  */
    /* JADX WARN: Code duplicated, block: B:277:0x0732  */
    /* JADX WARN: Code duplicated, block: B:280:0x073c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0742  */
    /* JADX WARN: Code duplicated, block: B:284:0x0748  */
    /* JADX WARN: Code duplicated, block: B:310:0x0798  */
    /* JADX WARN: Code duplicated, block: B:312:0x079f  */
    /* JADX WARN: Code duplicated, block: B:314:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:315:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:318:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:322:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:323:0x07de  */
    /* JADX WARN: Code duplicated, block: B:326:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x016a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        t.b bVar;
        h hVar;
        i iVar;
        VelocityTracker velocityTracker;
        h hVar2;
        int i10;
        x xVar;
        h hVar3;
        i iVar2;
        VelocityTracker velocityTracker2;
        int action;
        float fB;
        float fC;
        float progress;
        int i11;
        char c10;
        char c11;
        float f10;
        float[] fArr;
        float fAbs;
        float f11;
        int i12;
        float f12;
        float rawY;
        float rawX;
        float progress2;
        int i13;
        char c12;
        char c13;
        float f13;
        float[] fArr2;
        char c14;
        char c15;
        float f14;
        float fMax;
        float progress3;
        r rVar;
        float f15;
        boolean z10;
        float fB2;
        float fC2;
        i iVar3;
        VelocityTracker velocityTracker3;
        int action2;
        float progress4;
        int i14;
        int i15;
        View viewFindViewById;
        float right;
        int i16;
        int i17;
        float degrees;
        float f16;
        int i18;
        float width;
        float height;
        int i19;
        int i20;
        View viewFindViewById2;
        float rawX2;
        float rawY2;
        double dAtan2;
        float fAtan2;
        float progress5;
        int i21;
        char c16;
        float fMax2;
        float progress6;
        r rVar2;
        float degrees2;
        boolean z11;
        MotionEvent motionEvent2;
        t.b bVar2;
        int iA;
        MotionEvent motionEvent3;
        x xVar2;
        RectF rectFA;
        t tVar = this.f37760c;
        if (tVar == null || !this.f37778l || !tVar.q()) {
            return super.onTouchEvent(motionEvent);
        }
        t tVar2 = this.f37760c;
        t.b bVar3 = tVar2.f37855c;
        if (bVar3 != null && !(!bVar3.f37887o)) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        Objects.requireNonNull(tVar2);
        RectF rectF = new RectF();
        if (tVar2.f37867o == null) {
            Objects.requireNonNull(tVar2.f37853a);
            i iVar4 = i.f37828b;
            iVar4.f37829a = VelocityTracker.obtain();
            tVar2.f37867o = iVar4;
        }
        VelocityTracker velocityTracker4 = ((i) tVar2.f37867o).f37829a;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action3 = motionEvent.getAction();
            if (action3 == 0) {
                tVar2.f37870r = motionEvent.getRawX();
                tVar2.f37871s = motionEvent.getRawY();
                tVar2.f37864l = motionEvent;
                tVar2.f37865m = false;
                x xVar3 = tVar2.f37855c.f37884l;
                if (xVar3 != null) {
                    RectF rectFA2 = xVar3.a(tVar2.f37853a, rectF);
                    if (rectFA2 == null || rectFA2.contains(tVar2.f37864l.getX(), tVar2.f37864l.getY())) {
                        RectF rectFB = tVar2.f37855c.f37884l.b(tVar2.f37853a, rectF);
                        tVar2.f37866n = (rectFB == null || rectFB.contains(tVar2.f37864l.getX(), tVar2.f37864l.getY())) ? false : true;
                        x xVar4 = tVar2.f37855c.f37884l;
                        float f17 = tVar2.f37870r;
                        float f18 = tVar2.f37871s;
                        xVar4.f37924r = f17;
                        xVar4.f37925s = f18;
                    } else {
                        tVar2.f37864l = null;
                        tVar2.f37865m = true;
                    }
                }
            } else if (action3 == 2 && !tVar2.f37865m) {
                float rawY3 = motionEvent.getRawY() - tVar2.f37871s;
                float rawX3 = motionEvent.getRawX() - tVar2.f37870r;
                if ((rawX3 != 0.0d || rawY3 != 0.0d) && (motionEvent2 = tVar2.f37864l) != null) {
                    if (currentState != -1) {
                        z.f fVar = tVar2.f37854b;
                        if (fVar == null || (iA = fVar.a(currentState, -1, -1)) == -1) {
                            iA = currentState;
                        }
                        ArrayList<t.b> arrayList = new ArrayList();
                        for (t.b bVar4 : tVar2.f37856d) {
                            if (bVar4.f37876d == iA || bVar4.f37875c == iA) {
                                arrayList.add(bVar4);
                            }
                        }
                        RectF rectF2 = new RectF();
                        float f19 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        bVar2 = null;
                        for (t.b bVar5 : arrayList) {
                            if (bVar5.f37887o || (xVar2 = bVar5.f37884l) == null) {
                                rectF2 = rectF2;
                                rawY3 = rawY3;
                                rawX3 = rawX3;
                                motionEvent3 = motionEvent2;
                                bVar2 = bVar2;
                                bVar2 = bVar2;
                            } else {
                                xVar2.c(tVar2.f37868p);
                                RectF rectFB2 = bVar5.f37884l.b(tVar2.f37853a, rectF2);
                                if ((rectFB2 == null || rectFB2.contains(motionEvent2.getX(), motionEvent2.getY())) && ((rectFA = bVar5.f37884l.a(tVar2.f37853a, rectF2)) == null || rectFA.contains(motionEvent2.getX(), motionEvent2.getY()))) {
                                    x xVar5 = bVar5.f37884l;
                                    float fAtan3 = (xVar5.f37920n * rawY3) + (xVar5.f37919m * rawX3);
                                    if (xVar5.f37918l) {
                                        float x10 = motionEvent2.getX() - bVar5.f37884l.f37915i;
                                        float y10 = motionEvent2.getY() - bVar5.f37884l.f37916j;
                                        double dAtan3 = Math.atan2(rawY3 + y10, rawX3 + x10);
                                        double d10 = x10;
                                        motionEvent3 = motionEvent2;
                                        fAtan3 = ((float) (dAtan3 - Math.atan2(d10, y10))) * 10.0f;
                                    } else {
                                        motionEvent3 = motionEvent2;
                                    }
                                    float f20 = (bVar5.f37875c == currentState ? -1.0f : 1.1f) * fAtan3;
                                    if (f20 > f19) {
                                        f19 = f20;
                                        bVar2 = bVar5;
                                    }
                                } else {
                                    rectF2 = rectF2;
                                    rawY3 = rawY3;
                                    rawX3 = rawX3;
                                    motionEvent3 = motionEvent2;
                                    bVar2 = bVar2;
                                }
                                bVar2 = bVar2;
                            }
                            motionEvent2 = motionEvent3;
                            rectF2 = rectF2;
                            rawY3 = rawY3;
                            rawX3 = rawX3;
                        }
                    } else {
                        bVar2 = tVar2.f37855c;
                    }
                    if (bVar2 != null) {
                        setTransition(bVar2);
                        RectF rectFB3 = tVar2.f37855c.f37884l.b(tVar2.f37853a, rectF);
                        tVar2.f37866n = (rectFB3 == null || rectFB3.contains(tVar2.f37864l.getX(), tVar2.f37864l.getY())) ? false : true;
                        x xVar6 = tVar2.f37855c.f37884l;
                        float f21 = tVar2.f37870r;
                        float f22 = tVar2.f37871s;
                        xVar6.f37924r = f21;
                        xVar6.f37925s = f22;
                        xVar6.f37921o = false;
                    }
                    if (!tVar2.f37865m) {
                        bVar = tVar2.f37855c;
                        if (bVar != null) {
                            hVar3 = tVar2.f37867o;
                            if (xVar.f37918l) {
                                iVar3 = (i) hVar3;
                                velocityTracker3 = iVar3.f37829a;
                                if (velocityTracker3 != null) {
                                    velocityTracker3.addMovement(motionEvent);
                                }
                                action2 = motionEvent.getAction();
                                if (action2 == 0) {
                                    xVar.f37924r = motionEvent.getRawX();
                                    xVar.f37925s = motionEvent.getRawY();
                                    xVar.f37921o = false;
                                } else if (action2 == 1) {
                                    xVar.f37921o = false;
                                    iVar3.a(16);
                                    float fB3 = iVar3.b();
                                    float fC3 = iVar3.c();
                                    progress4 = xVar.f37926t.getProgress();
                                    float width2 = xVar.f37926t.getWidth() / 2.0f;
                                    float height2 = xVar.f37926t.getHeight() / 2.0f;
                                    i14 = xVar.f37917k;
                                    if (i14 != -1) {
                                        viewFindViewById = xVar.f37926t.findViewById(i14);
                                        xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                                        right = ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f) + xVar.f37923q[0];
                                        i16 = xVar.f37923q[1];
                                    } else {
                                        i15 = xVar.f37910d;
                                        if (i15 != -1) {
                                            r rVar3 = xVar.f37926t;
                                            viewFindViewById = xVar.f37926t.findViewById(rVar3.f37780m.get(rVar3.findViewById(i15)).f37732f.f37846m);
                                            xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                                            right = ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f) + xVar.f37923q[0];
                                            i16 = xVar.f37923q[1];
                                        } else {
                                            float rawX4 = motionEvent.getRawX() - width2;
                                            float rawY4 = motionEvent.getRawY() - height2;
                                            double degrees3 = Math.toDegrees(Math.atan2(rawY4, rawX4));
                                            i17 = xVar.f37910d;
                                            if (i17 != -1) {
                                                xVar.f37926t.g(i17, progress4, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                                float[] fArr3 = xVar.f37922p;
                                                fArr3[1] = (float) Math.toDegrees(fArr3[1]);
                                            } else {
                                                xVar.f37922p[1] = 360.0f;
                                            }
                                            degrees = ((float) (Math.toDegrees(Math.atan2(fC3 + rawY4, fB3 + rawX4)) - degrees3)) * 62.5f;
                                            if (Float.isNaN(degrees)) {
                                                f16 = progress4;
                                            } else {
                                                f16 = (((degrees * 3.0f) * xVar.f37930x) / xVar.f37922p[1]) + progress4;
                                            }
                                            if (f16 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16) {
                                                    xVar.f37926t.setState(l.FINISHED);
                                                } else {
                                                    xVar.f37926t.setState(l.FINISHED);
                                                }
                                            } else if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16) {
                                                xVar.f37926t.setState(l.FINISHED);
                                            } else {
                                                xVar.f37926t.setState(l.FINISHED);
                                            }
                                        }
                                    }
                                    height2 = i16 + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                    width2 = right;
                                    float rawX5 = motionEvent.getRawX() - width2;
                                    float rawY5 = motionEvent.getRawY() - height2;
                                    double degrees4 = Math.toDegrees(Math.atan2(rawY5, rawX5));
                                    i17 = xVar.f37910d;
                                    if (i17 != -1) {
                                        xVar.f37926t.g(i17, progress4, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                        float[] fArr4 = xVar.f37922p;
                                        fArr4[1] = (float) Math.toDegrees(fArr4[1]);
                                    } else {
                                        xVar.f37922p[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(fC3 + rawY5, fB3 + rawX5)) - degrees4)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f16 = (((degrees * 3.0f) * xVar.f37930x) / xVar.f37922p[1]) + progress4;
                                    } else {
                                        f16 = progress4;
                                    }
                                    if (f16 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16) {
                                            xVar.f37926t.setState(l.FINISHED);
                                        } else {
                                            xVar.f37926t.setState(l.FINISHED);
                                        }
                                    } else if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16) {
                                        xVar.f37926t.setState(l.FINISHED);
                                    } else {
                                        xVar.f37926t.setState(l.FINISHED);
                                    }
                                } else if (action2 == 2) {
                                    motionEvent.getRawY();
                                    motionEvent.getRawX();
                                    width = xVar.f37926t.getWidth() / 2.0f;
                                    height = xVar.f37926t.getHeight() / 2.0f;
                                    i19 = xVar.f37917k;
                                    if (i19 != -1) {
                                        View viewFindViewById3 = xVar.f37926t.findViewById(i19);
                                        xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                                        float right2 = xVar.f37923q[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                        height = ((viewFindViewById3.getBottom() + viewFindViewById3.getTop()) / 2.0f) + xVar.f37923q[1];
                                        width = right2;
                                    } else {
                                        i20 = xVar.f37910d;
                                        if (i20 != -1) {
                                            r rVar4 = xVar.f37926t;
                                            viewFindViewById2 = xVar.f37926t.findViewById(rVar4.f37780m.get(rVar4.findViewById(i20)).f37732f.f37846m);
                                            if (viewFindViewById2 == null) {
                                                Log.e("TouchResponse", "could not find view to animate to");
                                            } else {
                                                xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                                                width = xVar.f37923q[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                                height = xVar.f37923q[1] + ((viewFindViewById2.getBottom() + viewFindViewById2.getTop()) / 2.0f);
                                            }
                                        }
                                    }
                                    rawX2 = motionEvent.getRawX() - width;
                                    rawY2 = motionEvent.getRawY() - height;
                                    dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                                    fAtan2 = (float) (((dAtan2 - Math.atan2(xVar.f37925s - height, xVar.f37924r - width)) * 180.0d) / 3.141592653589793d);
                                    if (fAtan2 > 330.0f) {
                                        fAtan2 -= 360.0f;
                                    } else if (fAtan2 < -330.0f) {
                                        fAtan2 += 360.0f;
                                    }
                                    if (Math.abs(fAtan2) <= 0.01d) {
                                        progress5 = xVar.f37926t.getProgress();
                                        if (!xVar.f37921o) {
                                            xVar.f37921o = true;
                                            xVar.f37926t.setProgress(progress5);
                                        }
                                        i21 = xVar.f37910d;
                                        if (i21 != -1) {
                                            xVar.f37926t.g(i21, progress5, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                            float[] fArr5 = xVar.f37922p;
                                            c16 = 1;
                                            fArr5[1] = (float) Math.toDegrees(fArr5[1]);
                                        } else {
                                            c16 = 1;
                                            xVar.f37922p[1] = 360.0f;
                                        }
                                        fMax2 = Math.max(Math.min(((fAtan2 * xVar.f37930x) / xVar.f37922p[c16]) + progress5, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                                        progress6 = xVar.f37926t.getProgress();
                                        if (fMax2 != progress6) {
                                            if (progress6 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                r rVar5 = xVar.f37926t;
                                                if (progress6 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                rVar5.c(z11);
                                            } else {
                                                r rVar6 = xVar.f37926t;
                                                if (progress6 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                rVar6.c(z11);
                                            }
                                            xVar.f37926t.setProgress(fMax2);
                                            iVar3.a(1000);
                                            float fB4 = iVar3.b();
                                            double dC = iVar3.c();
                                            double d11 = fB4;
                                            float fSin = (float) ((Math.sin(Math.atan2(dC, d11) - dAtan2) * Math.hypot(dC, d11)) / Math.hypot(rawX2, rawY2));
                                            rVar2 = xVar.f37926t;
                                            degrees2 = (float) Math.toDegrees(fSin);
                                        } else {
                                            rVar2 = xVar.f37926t;
                                            degrees2 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                        }
                                        rVar2.f37766f = degrees2;
                                        xVar.f37924r = motionEvent.getRawX();
                                        xVar.f37925s = motionEvent.getRawY();
                                    } else {
                                        progress5 = xVar.f37926t.getProgress();
                                        if (!xVar.f37921o) {
                                            xVar.f37921o = true;
                                            xVar.f37926t.setProgress(progress5);
                                        }
                                        i21 = xVar.f37910d;
                                        if (i21 != -1) {
                                            xVar.f37926t.g(i21, progress5, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                            float[] fArr6 = xVar.f37922p;
                                            c16 = 1;
                                            fArr6[1] = (float) Math.toDegrees(fArr6[1]);
                                        } else {
                                            c16 = 1;
                                            xVar.f37922p[1] = 360.0f;
                                        }
                                        fMax2 = Math.max(Math.min(((fAtan2 * xVar.f37930x) / xVar.f37922p[c16]) + progress5, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                                        progress6 = xVar.f37926t.getProgress();
                                        if (fMax2 != progress6) {
                                            if (progress6 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                r rVar7 = xVar.f37926t;
                                                if (progress6 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                rVar7.c(z11);
                                            } else {
                                                r rVar8 = xVar.f37926t;
                                                if (progress6 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                rVar8.c(z11);
                                            }
                                            xVar.f37926t.setProgress(fMax2);
                                            iVar3.a(1000);
                                            float fB5 = iVar3.b();
                                            double dC2 = iVar3.c();
                                            double d12 = fB5;
                                            float fSin2 = (float) ((Math.sin(Math.atan2(dC2, d12) - dAtan2) * Math.hypot(dC2, d12)) / Math.hypot(rawX2, rawY2));
                                            rVar2 = xVar.f37926t;
                                            degrees2 = (float) Math.toDegrees(fSin2);
                                        } else {
                                            rVar2 = xVar.f37926t;
                                            degrees2 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                        }
                                        rVar2.f37766f = degrees2;
                                        xVar.f37924r = motionEvent.getRawX();
                                        xVar.f37925s = motionEvent.getRawY();
                                    }
                                }
                            } else {
                                iVar2 = (i) hVar3;
                                velocityTracker2 = iVar2.f37829a;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.addMovement(motionEvent);
                                }
                                action = motionEvent.getAction();
                                if (action == 0) {
                                    xVar.f37924r = motionEvent.getRawX();
                                    xVar.f37925s = motionEvent.getRawY();
                                    xVar.f37921o = false;
                                } else if (action == 1) {
                                    xVar.f37921o = false;
                                    iVar2.a(1000);
                                    fB = iVar2.b();
                                    fC = iVar2.c();
                                    progress = xVar.f37926t.getProgress();
                                    i11 = xVar.f37910d;
                                    if (i11 != -1) {
                                        xVar.f37926t.g(i11, progress, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                        c11 = 0;
                                        c10 = 1;
                                    } else {
                                        float fMin = Math.min(xVar.f37926t.getWidth(), xVar.f37926t.getHeight());
                                        float[] fArr7 = xVar.f37922p;
                                        c10 = 1;
                                        fArr7[1] = xVar.f37920n * fMin;
                                        c11 = 0;
                                        fArr7[0] = fMin * xVar.f37919m;
                                    }
                                    f10 = xVar.f37919m;
                                    fArr = xVar.f37922p;
                                    float f23 = fArr[c11];
                                    float f24 = fArr[c10];
                                    if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        fAbs = fB / fArr[c11];
                                    } else {
                                        fAbs = fC / fArr[c10];
                                    }
                                    if (Float.isNaN(fAbs)) {
                                        f11 = progress;
                                    } else {
                                        f11 = (fAbs / 3.0f) + progress;
                                    }
                                    if (f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f11) {
                                            xVar.f37926t.setState(l.FINISHED);
                                        } else {
                                            xVar.f37926t.setState(l.FINISHED);
                                        }
                                    } else if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f11) {
                                        xVar.f37926t.setState(l.FINISHED);
                                    } else {
                                        xVar.f37926t.setState(l.FINISHED);
                                    }
                                } else if (action == 2) {
                                    rawY = motionEvent.getRawY() - xVar.f37925s;
                                    rawX = motionEvent.getRawX() - xVar.f37924r;
                                    if (Math.abs((xVar.f37920n * rawY) + (xVar.f37919m * rawX)) <= xVar.f37932z) {
                                        progress2 = xVar.f37926t.getProgress();
                                        if (!xVar.f37921o) {
                                            xVar.f37921o = true;
                                            xVar.f37926t.setProgress(progress2);
                                        }
                                        i13 = xVar.f37910d;
                                        if (i13 != -1) {
                                            xVar.f37926t.g(i13, progress2, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                            c13 = 0;
                                            c12 = 1;
                                        } else {
                                            float fMin2 = Math.min(xVar.f37926t.getWidth(), xVar.f37926t.getHeight());
                                            float[] fArr8 = xVar.f37922p;
                                            c12 = 1;
                                            fArr8[1] = xVar.f37920n * fMin2;
                                            c13 = 0;
                                            fArr8[0] = fMin2 * xVar.f37919m;
                                        }
                                        f13 = xVar.f37919m;
                                        fArr2 = xVar.f37922p;
                                        if (Math.abs(((xVar.f37920n * fArr2[c12]) + (f13 * fArr2[c13])) * xVar.f37930x) < 0.01d) {
                                            float[] fArr9 = xVar.f37922p;
                                            c14 = 0;
                                            fArr9[0] = 0.01f;
                                            c15 = 1;
                                            fArr9[1] = 0.01f;
                                        } else {
                                            c14 = 0;
                                            c15 = 1;
                                        }
                                        if (xVar.f37919m != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            f14 = rawX / xVar.f37922p[c14];
                                        } else {
                                            f14 = rawY / xVar.f37922p[c15];
                                        }
                                        fMax = Math.max(Math.min(progress2 + f14, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                                        if (xVar.f37909c == 6) {
                                            fMax = Math.max(fMax, 0.01f);
                                        }
                                        if (xVar.f37909c == 7) {
                                            fMax = Math.min(fMax, 0.99f);
                                        }
                                        progress3 = xVar.f37926t.getProgress();
                                        if (fMax != progress3) {
                                            if (progress3 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                r rVar9 = xVar.f37926t;
                                                if (progress3 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                rVar9.c(z10);
                                            } else {
                                                r rVar10 = xVar.f37926t;
                                                if (progress3 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                rVar10.c(z10);
                                            }
                                            xVar.f37926t.setProgress(fMax);
                                            iVar2.a(1000);
                                            fB2 = iVar2.b();
                                            fC2 = iVar2.c();
                                            if (xVar.f37919m != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                f15 = fB2 / xVar.f37922p[0];
                                            } else {
                                                f15 = fC2 / xVar.f37922p[1];
                                            }
                                            rVar = xVar.f37926t;
                                        } else {
                                            rVar = xVar.f37926t;
                                            f15 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                        }
                                        rVar.f37766f = f15;
                                        xVar.f37924r = motionEvent.getRawX();
                                        xVar.f37925s = motionEvent.getRawY();
                                    } else {
                                        progress2 = xVar.f37926t.getProgress();
                                        if (!xVar.f37921o) {
                                            xVar.f37921o = true;
                                            xVar.f37926t.setProgress(progress2);
                                        }
                                        i13 = xVar.f37910d;
                                        if (i13 != -1) {
                                            xVar.f37926t.g(i13, progress2, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                            c13 = 0;
                                            c12 = 1;
                                        } else {
                                            float fMin3 = Math.min(xVar.f37926t.getWidth(), xVar.f37926t.getHeight());
                                            float[] fArr10 = xVar.f37922p;
                                            c12 = 1;
                                            fArr10[1] = xVar.f37920n * fMin3;
                                            c13 = 0;
                                            fArr10[0] = fMin3 * xVar.f37919m;
                                        }
                                        f13 = xVar.f37919m;
                                        fArr2 = xVar.f37922p;
                                        if (Math.abs(((xVar.f37920n * fArr2[c12]) + (f13 * fArr2[c13])) * xVar.f37930x) < 0.01d) {
                                            float[] fArr11 = xVar.f37922p;
                                            c14 = 0;
                                            fArr11[0] = 0.01f;
                                            c15 = 1;
                                            fArr11[1] = 0.01f;
                                        } else {
                                            c14 = 0;
                                            c15 = 1;
                                        }
                                        if (xVar.f37919m != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            f14 = rawX / xVar.f37922p[c14];
                                        } else {
                                            f14 = rawY / xVar.f37922p[c15];
                                        }
                                        fMax = Math.max(Math.min(progress2 + f14, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                                        if (xVar.f37909c == 6) {
                                            fMax = Math.max(fMax, 0.01f);
                                        }
                                        if (xVar.f37909c == 7) {
                                            fMax = Math.min(fMax, 0.99f);
                                        }
                                        progress3 = xVar.f37926t.getProgress();
                                        if (fMax != progress3) {
                                            if (progress3 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                r rVar11 = xVar.f37926t;
                                                if (progress3 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                rVar11.c(z10);
                                            } else {
                                                r rVar12 = xVar.f37926t;
                                                if (progress3 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                rVar12.c(z10);
                                            }
                                            xVar.f37926t.setProgress(fMax);
                                            iVar2.a(1000);
                                            fB2 = iVar2.b();
                                            fC2 = iVar2.c();
                                            if (xVar.f37919m != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                                f15 = fB2 / xVar.f37922p[0];
                                            } else {
                                                f15 = fC2 / xVar.f37922p[1];
                                            }
                                            rVar = xVar.f37926t;
                                        } else {
                                            rVar = xVar.f37926t;
                                            f15 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                        }
                                        rVar.f37766f = f15;
                                        xVar.f37924r = motionEvent.getRawX();
                                        xVar.f37925s = motionEvent.getRawY();
                                    }
                                }
                            }
                        }
                        tVar2.f37870r = motionEvent.getRawX();
                        tVar2.f37871s = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            iVar = (i) hVar;
                            velocityTracker = iVar.f37829a;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                hVar2 = null;
                                iVar.f37829a = null;
                            } else {
                                hVar2 = null;
                            }
                            tVar2.f37867o = hVar2;
                            i10 = this.f37770h;
                            if (i10 != -1) {
                                tVar2.a(this, i10);
                            }
                        }
                    }
                }
            } else if (!tVar2.f37865m) {
                bVar = tVar2.f37855c;
                if (bVar != null) {
                    hVar3 = tVar2.f37867o;
                    if (xVar.f37918l) {
                        iVar3 = (i) hVar3;
                        velocityTracker3 = iVar3.f37829a;
                        if (velocityTracker3 != null) {
                            velocityTracker3.addMovement(motionEvent);
                        }
                        action2 = motionEvent.getAction();
                        if (action2 == 0) {
                            xVar.f37924r = motionEvent.getRawX();
                            xVar.f37925s = motionEvent.getRawY();
                            xVar.f37921o = false;
                        } else if (action2 == 1) {
                            xVar.f37921o = false;
                            iVar3.a(16);
                            float fB6 = iVar3.b();
                            float fC4 = iVar3.c();
                            progress4 = xVar.f37926t.getProgress();
                            float width3 = xVar.f37926t.getWidth() / 2.0f;
                            float height3 = xVar.f37926t.getHeight() / 2.0f;
                            i14 = xVar.f37917k;
                            if (i14 != -1) {
                                viewFindViewById = xVar.f37926t.findViewById(i14);
                                xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                                right = ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f) + xVar.f37923q[0];
                                i16 = xVar.f37923q[1];
                            } else {
                                i15 = xVar.f37910d;
                                if (i15 != -1) {
                                    r rVar13 = xVar.f37926t;
                                    viewFindViewById = xVar.f37926t.findViewById(rVar13.f37780m.get(rVar13.findViewById(i15)).f37732f.f37846m);
                                    xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                                    right = ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f) + xVar.f37923q[0];
                                    i16 = xVar.f37923q[1];
                                } else {
                                    float rawX6 = motionEvent.getRawX() - width3;
                                    float rawY6 = motionEvent.getRawY() - height3;
                                    double degrees5 = Math.toDegrees(Math.atan2(rawY6, rawX6));
                                    i17 = xVar.f37910d;
                                    if (i17 != -1) {
                                        xVar.f37926t.g(i17, progress4, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                        float[] fArr12 = xVar.f37922p;
                                        fArr12[1] = (float) Math.toDegrees(fArr12[1]);
                                    } else {
                                        xVar.f37922p[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(fC4 + rawY6, fB6 + rawX6)) - degrees5)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f16 = (((degrees * 3.0f) * xVar.f37930x) / xVar.f37922p[1]) + progress4;
                                    } else {
                                        f16 = progress4;
                                    }
                                    if (f16 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16) {
                                            xVar.f37926t.setState(l.FINISHED);
                                        } else {
                                            xVar.f37926t.setState(l.FINISHED);
                                        }
                                    } else if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16) {
                                        xVar.f37926t.setState(l.FINISHED);
                                    } else {
                                        xVar.f37926t.setState(l.FINISHED);
                                    }
                                }
                            }
                            height3 = i16 + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                            width3 = right;
                            float rawX7 = motionEvent.getRawX() - width3;
                            float rawY7 = motionEvent.getRawY() - height3;
                            double degrees6 = Math.toDegrees(Math.atan2(rawY7, rawX7));
                            i17 = xVar.f37910d;
                            if (i17 != -1) {
                                xVar.f37926t.g(i17, progress4, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                float[] fArr13 = xVar.f37922p;
                                fArr13[1] = (float) Math.toDegrees(fArr13[1]);
                            } else {
                                xVar.f37922p[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(fC4 + rawY7, fB6 + rawX7)) - degrees6)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f16 = (((degrees * 3.0f) * xVar.f37930x) / xVar.f37922p[1]) + progress4;
                            } else {
                                f16 = progress4;
                            }
                            if (f16 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16) {
                                    xVar.f37926t.setState(l.FINISHED);
                                } else {
                                    xVar.f37926t.setState(l.FINISHED);
                                }
                            } else if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16) {
                                xVar.f37926t.setState(l.FINISHED);
                            } else {
                                xVar.f37926t.setState(l.FINISHED);
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            width = xVar.f37926t.getWidth() / 2.0f;
                            height = xVar.f37926t.getHeight() / 2.0f;
                            i19 = xVar.f37917k;
                            if (i19 != -1) {
                                View viewFindViewById4 = xVar.f37926t.findViewById(i19);
                                xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                                float right3 = xVar.f37923q[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                height = ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f) + xVar.f37923q[1];
                                width = right3;
                            } else {
                                i20 = xVar.f37910d;
                                if (i20 != -1) {
                                    r rVar14 = xVar.f37926t;
                                    viewFindViewById2 = xVar.f37926t.findViewById(rVar14.f37780m.get(rVar14.findViewById(i20)).f37732f.f37846m);
                                    if (viewFindViewById2 == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                                        width = xVar.f37923q[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                        height = xVar.f37923q[1] + ((viewFindViewById2.getBottom() + viewFindViewById2.getTop()) / 2.0f);
                                    }
                                }
                            }
                            rawX2 = motionEvent.getRawX() - width;
                            rawY2 = motionEvent.getRawY() - height;
                            dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                            fAtan2 = (float) (((dAtan2 - Math.atan2(xVar.f37925s - height, xVar.f37924r - width)) * 180.0d) / 3.141592653589793d);
                            if (fAtan2 > 330.0f) {
                                fAtan2 -= 360.0f;
                            } else if (fAtan2 < -330.0f) {
                                fAtan2 += 360.0f;
                            }
                            if (Math.abs(fAtan2) <= 0.01d) {
                                progress5 = xVar.f37926t.getProgress();
                                if (!xVar.f37921o) {
                                    xVar.f37921o = true;
                                    xVar.f37926t.setProgress(progress5);
                                }
                                i21 = xVar.f37910d;
                                if (i21 != -1) {
                                    xVar.f37926t.g(i21, progress5, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                    float[] fArr14 = xVar.f37922p;
                                    c16 = 1;
                                    fArr14[1] = (float) Math.toDegrees(fArr14[1]);
                                } else {
                                    c16 = 1;
                                    xVar.f37922p[1] = 360.0f;
                                }
                                fMax2 = Math.max(Math.min(((fAtan2 * xVar.f37930x) / xVar.f37922p[c16]) + progress5, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                                progress6 = xVar.f37926t.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        r rVar15 = xVar.f37926t;
                                        if (progress6 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        rVar15.c(z11);
                                    } else {
                                        r rVar16 = xVar.f37926t;
                                        if (progress6 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        rVar16.c(z11);
                                    }
                                    xVar.f37926t.setProgress(fMax2);
                                    iVar3.a(1000);
                                    float fB7 = iVar3.b();
                                    double dC3 = iVar3.c();
                                    double d13 = fB7;
                                    float fSin3 = (float) ((Math.sin(Math.atan2(dC3, d13) - dAtan2) * Math.hypot(dC3, d13)) / Math.hypot(rawX2, rawY2));
                                    rVar2 = xVar.f37926t;
                                    degrees2 = (float) Math.toDegrees(fSin3);
                                } else {
                                    rVar2 = xVar.f37926t;
                                    degrees2 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                }
                                rVar2.f37766f = degrees2;
                                xVar.f37924r = motionEvent.getRawX();
                                xVar.f37925s = motionEvent.getRawY();
                            } else {
                                progress5 = xVar.f37926t.getProgress();
                                if (!xVar.f37921o) {
                                    xVar.f37921o = true;
                                    xVar.f37926t.setProgress(progress5);
                                }
                                i21 = xVar.f37910d;
                                if (i21 != -1) {
                                    xVar.f37926t.g(i21, progress5, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                    float[] fArr15 = xVar.f37922p;
                                    c16 = 1;
                                    fArr15[1] = (float) Math.toDegrees(fArr15[1]);
                                } else {
                                    c16 = 1;
                                    xVar.f37922p[1] = 360.0f;
                                }
                                fMax2 = Math.max(Math.min(((fAtan2 * xVar.f37930x) / xVar.f37922p[c16]) + progress5, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                                progress6 = xVar.f37926t.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        r rVar17 = xVar.f37926t;
                                        if (progress6 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        rVar17.c(z11);
                                    } else {
                                        r rVar18 = xVar.f37926t;
                                        if (progress6 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        rVar18.c(z11);
                                    }
                                    xVar.f37926t.setProgress(fMax2);
                                    iVar3.a(1000);
                                    float fB8 = iVar3.b();
                                    double dC4 = iVar3.c();
                                    double d14 = fB8;
                                    float fSin4 = (float) ((Math.sin(Math.atan2(dC4, d14) - dAtan2) * Math.hypot(dC4, d14)) / Math.hypot(rawX2, rawY2));
                                    rVar2 = xVar.f37926t;
                                    degrees2 = (float) Math.toDegrees(fSin4);
                                } else {
                                    rVar2 = xVar.f37926t;
                                    degrees2 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                }
                                rVar2.f37766f = degrees2;
                                xVar.f37924r = motionEvent.getRawX();
                                xVar.f37925s = motionEvent.getRawY();
                            }
                        }
                    } else {
                        iVar2 = (i) hVar3;
                        velocityTracker2 = iVar2.f37829a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        action = motionEvent.getAction();
                        if (action == 0) {
                            xVar.f37924r = motionEvent.getRawX();
                            xVar.f37925s = motionEvent.getRawY();
                            xVar.f37921o = false;
                        } else if (action == 1) {
                            xVar.f37921o = false;
                            iVar2.a(1000);
                            fB = iVar2.b();
                            fC = iVar2.c();
                            progress = xVar.f37926t.getProgress();
                            i11 = xVar.f37910d;
                            if (i11 != -1) {
                                xVar.f37926t.g(i11, progress, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                c11 = 0;
                                c10 = 1;
                            } else {
                                float fMin4 = Math.min(xVar.f37926t.getWidth(), xVar.f37926t.getHeight());
                                float[] fArr16 = xVar.f37922p;
                                c10 = 1;
                                fArr16[1] = xVar.f37920n * fMin4;
                                c11 = 0;
                                fArr16[0] = fMin4 * xVar.f37919m;
                            }
                            f10 = xVar.f37919m;
                            fArr = xVar.f37922p;
                            float f25 = fArr[c11];
                            float f26 = fArr[c10];
                            if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                fAbs = fB / fArr[c11];
                            } else {
                                fAbs = fC / fArr[c10];
                            }
                            if (Float.isNaN(fAbs)) {
                                f11 = (fAbs / 3.0f) + progress;
                            } else {
                                f11 = progress;
                            }
                            if (f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f11) {
                                    xVar.f37926t.setState(l.FINISHED);
                                } else {
                                    xVar.f37926t.setState(l.FINISHED);
                                }
                            } else if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f11) {
                                xVar.f37926t.setState(l.FINISHED);
                            } else {
                                xVar.f37926t.setState(l.FINISHED);
                            }
                        } else if (action == 2) {
                            rawY = motionEvent.getRawY() - xVar.f37925s;
                            rawX = motionEvent.getRawX() - xVar.f37924r;
                            if (Math.abs((xVar.f37920n * rawY) + (xVar.f37919m * rawX)) <= xVar.f37932z) {
                                progress2 = xVar.f37926t.getProgress();
                                if (!xVar.f37921o) {
                                    xVar.f37921o = true;
                                    xVar.f37926t.setProgress(progress2);
                                }
                                i13 = xVar.f37910d;
                                if (i13 != -1) {
                                    xVar.f37926t.g(i13, progress2, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                    c13 = 0;
                                    c12 = 1;
                                } else {
                                    float fMin5 = Math.min(xVar.f37926t.getWidth(), xVar.f37926t.getHeight());
                                    float[] fArr17 = xVar.f37922p;
                                    c12 = 1;
                                    fArr17[1] = xVar.f37920n * fMin5;
                                    c13 = 0;
                                    fArr17[0] = fMin5 * xVar.f37919m;
                                }
                                f13 = xVar.f37919m;
                                fArr2 = xVar.f37922p;
                                if (Math.abs(((xVar.f37920n * fArr2[c12]) + (f13 * fArr2[c13])) * xVar.f37930x) < 0.01d) {
                                    float[] fArr18 = xVar.f37922p;
                                    c14 = 0;
                                    fArr18[0] = 0.01f;
                                    c15 = 1;
                                    fArr18[1] = 0.01f;
                                } else {
                                    c14 = 0;
                                    c15 = 1;
                                }
                                if (xVar.f37919m != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                    f14 = rawX / xVar.f37922p[c14];
                                } else {
                                    f14 = rawY / xVar.f37922p[c15];
                                }
                                fMax = Math.max(Math.min(progress2 + f14, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                                if (xVar.f37909c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (xVar.f37909c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = xVar.f37926t.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        r rVar19 = xVar.f37926t;
                                        if (progress3 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        rVar19.c(z10);
                                    } else {
                                        r rVar110 = xVar.f37926t;
                                        if (progress3 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        rVar110.c(z10);
                                    }
                                    xVar.f37926t.setProgress(fMax);
                                    iVar2.a(1000);
                                    fB2 = iVar2.b();
                                    fC2 = iVar2.c();
                                    if (xVar.f37919m != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        f15 = fB2 / xVar.f37922p[0];
                                    } else {
                                        f15 = fC2 / xVar.f37922p[1];
                                    }
                                    rVar = xVar.f37926t;
                                } else {
                                    rVar = xVar.f37926t;
                                    f15 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                }
                                rVar.f37766f = f15;
                                xVar.f37924r = motionEvent.getRawX();
                                xVar.f37925s = motionEvent.getRawY();
                            } else {
                                progress2 = xVar.f37926t.getProgress();
                                if (!xVar.f37921o) {
                                    xVar.f37921o = true;
                                    xVar.f37926t.setProgress(progress2);
                                }
                                i13 = xVar.f37910d;
                                if (i13 != -1) {
                                    xVar.f37926t.g(i13, progress2, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                    c13 = 0;
                                    c12 = 1;
                                } else {
                                    float fMin6 = Math.min(xVar.f37926t.getWidth(), xVar.f37926t.getHeight());
                                    float[] fArr19 = xVar.f37922p;
                                    c12 = 1;
                                    fArr19[1] = xVar.f37920n * fMin6;
                                    c13 = 0;
                                    fArr19[0] = fMin6 * xVar.f37919m;
                                }
                                f13 = xVar.f37919m;
                                fArr2 = xVar.f37922p;
                                if (Math.abs(((xVar.f37920n * fArr2[c12]) + (f13 * fArr2[c13])) * xVar.f37930x) < 0.01d) {
                                    float[] fArr110 = xVar.f37922p;
                                    c14 = 0;
                                    fArr110[0] = 0.01f;
                                    c15 = 1;
                                    fArr110[1] = 0.01f;
                                } else {
                                    c14 = 0;
                                    c15 = 1;
                                }
                                if (xVar.f37919m != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                    f14 = rawX / xVar.f37922p[c14];
                                } else {
                                    f14 = rawY / xVar.f37922p[c15];
                                }
                                fMax = Math.max(Math.min(progress2 + f14, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                                if (xVar.f37909c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (xVar.f37909c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = xVar.f37926t.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        r rVar111 = xVar.f37926t;
                                        if (progress3 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        rVar111.c(z10);
                                    } else {
                                        r rVar112 = xVar.f37926t;
                                        if (progress3 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        rVar112.c(z10);
                                    }
                                    xVar.f37926t.setProgress(fMax);
                                    iVar2.a(1000);
                                    fB2 = iVar2.b();
                                    fC2 = iVar2.c();
                                    if (xVar.f37919m != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        f15 = fB2 / xVar.f37922p[0];
                                    } else {
                                        f15 = fC2 / xVar.f37922p[1];
                                    }
                                    rVar = xVar.f37926t;
                                } else {
                                    rVar = xVar.f37926t;
                                    f15 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                }
                                rVar.f37766f = f15;
                                xVar.f37924r = motionEvent.getRawX();
                                xVar.f37925s = motionEvent.getRawY();
                            }
                        }
                    }
                }
                tVar2.f37870r = motionEvent.getRawX();
                tVar2.f37871s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    iVar = (i) hVar;
                    velocityTracker = iVar.f37829a;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        hVar2 = null;
                        iVar.f37829a = null;
                    } else {
                        hVar2 = null;
                    }
                    tVar2.f37867o = hVar2;
                    i10 = this.f37770h;
                    if (i10 != -1) {
                        tVar2.a(this, i10);
                    }
                }
            }
        } else if (!tVar2.f37865m) {
            bVar = tVar2.f37855c;
            if (bVar != null && (xVar = bVar.f37884l) != null && !tVar2.f37866n) {
                hVar3 = tVar2.f37867o;
                if (xVar.f37918l) {
                    iVar3 = (i) hVar3;
                    velocityTracker3 = iVar3.f37829a;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    action2 = motionEvent.getAction();
                    if (action2 == 0) {
                        xVar.f37924r = motionEvent.getRawX();
                        xVar.f37925s = motionEvent.getRawY();
                        xVar.f37921o = false;
                    } else if (action2 == 1) {
                        xVar.f37921o = false;
                        iVar3.a(16);
                        float fB9 = iVar3.b();
                        float fC5 = iVar3.c();
                        progress4 = xVar.f37926t.getProgress();
                        float width4 = xVar.f37926t.getWidth() / 2.0f;
                        float height4 = xVar.f37926t.getHeight() / 2.0f;
                        i14 = xVar.f37917k;
                        if (i14 != -1) {
                            viewFindViewById = xVar.f37926t.findViewById(i14);
                            xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                            right = ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f) + xVar.f37923q[0];
                            i16 = xVar.f37923q[1];
                        } else {
                            i15 = xVar.f37910d;
                            if (i15 != -1) {
                                r rVar113 = xVar.f37926t;
                                viewFindViewById = xVar.f37926t.findViewById(rVar113.f37780m.get(rVar113.findViewById(i15)).f37732f.f37846m);
                                xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                                right = ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f) + xVar.f37923q[0];
                                i16 = xVar.f37923q[1];
                            } else {
                                float rawX8 = motionEvent.getRawX() - width4;
                                float rawY8 = motionEvent.getRawY() - height4;
                                double degrees7 = Math.toDegrees(Math.atan2(rawY8, rawX8));
                                i17 = xVar.f37910d;
                                if (i17 != -1) {
                                    xVar.f37926t.g(i17, progress4, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                    float[] fArr111 = xVar.f37922p;
                                    fArr111[1] = (float) Math.toDegrees(fArr111[1]);
                                } else {
                                    xVar.f37922p[1] = 360.0f;
                                }
                                degrees = ((float) (Math.toDegrees(Math.atan2(fC5 + rawY8, fB9 + rawX8)) - degrees7)) * 62.5f;
                                if (Float.isNaN(degrees)) {
                                    f16 = (((degrees * 3.0f) * xVar.f37930x) / xVar.f37922p[1]) + progress4;
                                } else {
                                    f16 = progress4;
                                }
                                if (f16 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f16 != 1.0f && (i18 = xVar.f37909c) != 3) {
                                    float fAbs2 = (degrees * xVar.f37930x) / xVar.f37922p[1];
                                    float f27 = ((double) f16) < 0.5d ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : 1.0f;
                                    if (i18 == 6) {
                                        if (progress4 + fAbs2 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            fAbs2 = Math.abs(fAbs2);
                                        }
                                        f27 = 1.0f;
                                    }
                                    if (xVar.f37909c == 7) {
                                        if (progress4 + fAbs2 > 1.0f) {
                                            fAbs2 = -Math.abs(fAbs2);
                                        }
                                        f27 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                    }
                                    xVar.f37926t.p(xVar.f37909c, f27, fAbs2 * 3.0f);
                                    if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD >= progress4 || 1.0f <= progress4) {
                                        xVar.f37926t.setState(l.FINISHED);
                                    }
                                } else if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16 || 1.0f <= f16) {
                                    xVar.f37926t.setState(l.FINISHED);
                                }
                            }
                        }
                        height4 = i16 + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                        width4 = right;
                        float rawX9 = motionEvent.getRawX() - width4;
                        float rawY9 = motionEvent.getRawY() - height4;
                        double degrees8 = Math.toDegrees(Math.atan2(rawY9, rawX9));
                        i17 = xVar.f37910d;
                        if (i17 != -1) {
                            xVar.f37926t.g(i17, progress4, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                            float[] fArr112 = xVar.f37922p;
                            fArr112[1] = (float) Math.toDegrees(fArr112[1]);
                        } else {
                            xVar.f37922p[1] = 360.0f;
                        }
                        degrees = ((float) (Math.toDegrees(Math.atan2(fC5 + rawY9, fB9 + rawX9)) - degrees8)) * 62.5f;
                        if (Float.isNaN(degrees)) {
                            f16 = (((degrees * 3.0f) * xVar.f37930x) / xVar.f37922p[1]) + progress4;
                        } else {
                            f16 = progress4;
                        }
                        if (f16 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16) {
                                xVar.f37926t.setState(l.FINISHED);
                            } else {
                                xVar.f37926t.setState(l.FINISHED);
                            }
                        } else if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f16) {
                            xVar.f37926t.setState(l.FINISHED);
                        } else {
                            xVar.f37926t.setState(l.FINISHED);
                        }
                    } else if (action2 == 2) {
                        motionEvent.getRawY();
                        motionEvent.getRawX();
                        width = xVar.f37926t.getWidth() / 2.0f;
                        height = xVar.f37926t.getHeight() / 2.0f;
                        i19 = xVar.f37917k;
                        if (i19 != -1) {
                            View viewFindViewById5 = xVar.f37926t.findViewById(i19);
                            xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                            float right4 = xVar.f37923q[0] + ((viewFindViewById5.getRight() + viewFindViewById5.getLeft()) / 2.0f);
                            height = ((viewFindViewById5.getBottom() + viewFindViewById5.getTop()) / 2.0f) + xVar.f37923q[1];
                            width = right4;
                        } else {
                            i20 = xVar.f37910d;
                            if (i20 != -1) {
                                r rVar114 = xVar.f37926t;
                                viewFindViewById2 = xVar.f37926t.findViewById(rVar114.f37780m.get(rVar114.findViewById(i20)).f37732f.f37846m);
                                if (viewFindViewById2 == null) {
                                    Log.e("TouchResponse", "could not find view to animate to");
                                } else {
                                    xVar.f37926t.getLocationOnScreen(xVar.f37923q);
                                    width = xVar.f37923q[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                    height = xVar.f37923q[1] + ((viewFindViewById2.getBottom() + viewFindViewById2.getTop()) / 2.0f);
                                }
                            }
                        }
                        rawX2 = motionEvent.getRawX() - width;
                        rawY2 = motionEvent.getRawY() - height;
                        dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                        fAtan2 = (float) (((dAtan2 - Math.atan2(xVar.f37925s - height, xVar.f37924r - width)) * 180.0d) / 3.141592653589793d);
                        if (fAtan2 > 330.0f) {
                            fAtan2 -= 360.0f;
                        } else if (fAtan2 < -330.0f) {
                            fAtan2 += 360.0f;
                        }
                        if (Math.abs(fAtan2) <= 0.01d || xVar.f37921o) {
                            progress5 = xVar.f37926t.getProgress();
                            if (!xVar.f37921o) {
                                xVar.f37921o = true;
                                xVar.f37926t.setProgress(progress5);
                            }
                            i21 = xVar.f37910d;
                            if (i21 != -1) {
                                xVar.f37926t.g(i21, progress5, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                float[] fArr113 = xVar.f37922p;
                                c16 = 1;
                                fArr113[1] = (float) Math.toDegrees(fArr113[1]);
                            } else {
                                c16 = 1;
                                xVar.f37922p[1] = 360.0f;
                            }
                            fMax2 = Math.max(Math.min(((fAtan2 * xVar.f37930x) / xVar.f37922p[c16]) + progress5, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                            progress6 = xVar.f37926t.getProgress();
                            if (fMax2 != progress6) {
                                if (progress6 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || progress6 == 1.0f) {
                                    r rVar115 = xVar.f37926t;
                                    if (progress6 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    rVar115.c(z11);
                                }
                                xVar.f37926t.setProgress(fMax2);
                                iVar3.a(1000);
                                float fB10 = iVar3.b();
                                double dC5 = iVar3.c();
                                double d15 = fB10;
                                float fSin5 = (float) ((Math.sin(Math.atan2(dC5, d15) - dAtan2) * Math.hypot(dC5, d15)) / Math.hypot(rawX2, rawY2));
                                rVar2 = xVar.f37926t;
                                degrees2 = (float) Math.toDegrees(fSin5);
                            } else {
                                rVar2 = xVar.f37926t;
                                degrees2 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                            }
                            rVar2.f37766f = degrees2;
                            xVar.f37924r = motionEvent.getRawX();
                            xVar.f37925s = motionEvent.getRawY();
                        }
                    }
                } else {
                    iVar2 = (i) hVar3;
                    velocityTracker2 = iVar2.f37829a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    action = motionEvent.getAction();
                    if (action == 0) {
                        xVar.f37924r = motionEvent.getRawX();
                        xVar.f37925s = motionEvent.getRawY();
                        xVar.f37921o = false;
                    } else if (action == 1) {
                        xVar.f37921o = false;
                        iVar2.a(1000);
                        fB = iVar2.b();
                        fC = iVar2.c();
                        progress = xVar.f37926t.getProgress();
                        i11 = xVar.f37910d;
                        if (i11 != -1) {
                            xVar.f37926t.g(i11, progress, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                            c11 = 0;
                            c10 = 1;
                        } else {
                            float fMin7 = Math.min(xVar.f37926t.getWidth(), xVar.f37926t.getHeight());
                            float[] fArr114 = xVar.f37922p;
                            c10 = 1;
                            fArr114[1] = xVar.f37920n * fMin7;
                            c11 = 0;
                            fArr114[0] = fMin7 * xVar.f37919m;
                        }
                        f10 = xVar.f37919m;
                        fArr = xVar.f37922p;
                        float f28 = fArr[c11];
                        float f29 = fArr[c10];
                        if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            fAbs = fB / fArr[c11];
                        } else {
                            fAbs = fC / fArr[c10];
                        }
                        if (Float.isNaN(fAbs)) {
                            f11 = (fAbs / 3.0f) + progress;
                        } else {
                            f11 = progress;
                        }
                        if (f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f11 != 1.0f && (i12 = xVar.f37909c) != 3) {
                            float f30 = ((double) f11) < 0.5d ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : 1.0f;
                            if (i12 == 6) {
                                if (progress + fAbs < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                    fAbs = Math.abs(fAbs);
                                }
                                f30 = 1.0f;
                            }
                            if (xVar.f37909c == 7) {
                                if (progress + fAbs > 1.0f) {
                                    fAbs = -Math.abs(fAbs);
                                }
                                f12 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                            } else {
                                f12 = f30;
                            }
                            xVar.f37926t.p(xVar.f37909c, f12, fAbs);
                            if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD >= progress || 1.0f <= progress) {
                                xVar.f37926t.setState(l.FINISHED);
                            }
                        } else if (StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD < f11 || 1.0f <= f11) {
                            xVar.f37926t.setState(l.FINISHED);
                        }
                    } else if (action == 2) {
                        rawY = motionEvent.getRawY() - xVar.f37925s;
                        rawX = motionEvent.getRawX() - xVar.f37924r;
                        if (Math.abs((xVar.f37920n * rawY) + (xVar.f37919m * rawX)) <= xVar.f37932z || xVar.f37921o) {
                            progress2 = xVar.f37926t.getProgress();
                            if (!xVar.f37921o) {
                                xVar.f37921o = true;
                                xVar.f37926t.setProgress(progress2);
                            }
                            i13 = xVar.f37910d;
                            if (i13 != -1) {
                                xVar.f37926t.g(i13, progress2, xVar.f37914h, xVar.f37913g, xVar.f37922p);
                                c13 = 0;
                                c12 = 1;
                            } else {
                                float fMin8 = Math.min(xVar.f37926t.getWidth(), xVar.f37926t.getHeight());
                                float[] fArr115 = xVar.f37922p;
                                c12 = 1;
                                fArr115[1] = xVar.f37920n * fMin8;
                                c13 = 0;
                                fArr115[0] = fMin8 * xVar.f37919m;
                            }
                            f13 = xVar.f37919m;
                            fArr2 = xVar.f37922p;
                            if (Math.abs(((xVar.f37920n * fArr2[c12]) + (f13 * fArr2[c13])) * xVar.f37930x) < 0.01d) {
                                float[] fArr116 = xVar.f37922p;
                                c14 = 0;
                                fArr116[0] = 0.01f;
                                c15 = 1;
                                fArr116[1] = 0.01f;
                            } else {
                                c14 = 0;
                                c15 = 1;
                            }
                            if (xVar.f37919m != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                f14 = rawX / xVar.f37922p[c14];
                            } else {
                                f14 = rawY / xVar.f37922p[c15];
                            }
                            fMax = Math.max(Math.min(progress2 + f14, 1.0f), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                            if (xVar.f37909c == 6) {
                                fMax = Math.max(fMax, 0.01f);
                            }
                            if (xVar.f37909c == 7) {
                                fMax = Math.min(fMax, 0.99f);
                            }
                            progress3 = xVar.f37926t.getProgress();
                            if (fMax != progress3) {
                                if (progress3 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || progress3 == 1.0f) {
                                    r rVar116 = xVar.f37926t;
                                    if (progress3 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    rVar116.c(z10);
                                }
                                xVar.f37926t.setProgress(fMax);
                                iVar2.a(1000);
                                fB2 = iVar2.b();
                                fC2 = iVar2.c();
                                if (xVar.f37919m != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                    f15 = fB2 / xVar.f37922p[0];
                                } else {
                                    f15 = fC2 / xVar.f37922p[1];
                                }
                                rVar = xVar.f37926t;
                            } else {
                                rVar = xVar.f37926t;
                                f15 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                            }
                            rVar.f37766f = f15;
                            xVar.f37924r = motionEvent.getRawX();
                            xVar.f37925s = motionEvent.getRawY();
                        }
                    }
                }
            }
            tVar2.f37870r = motionEvent.getRawX();
            tVar2.f37871s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (hVar = tVar2.f37867o) != null) {
                iVar = (i) hVar;
                velocityTracker = iVar.f37829a;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    hVar2 = null;
                    iVar.f37829a = null;
                } else {
                    hVar2 = null;
                }
                tVar2.f37867o = hVar2;
                i10 = this.f37770h;
                if (i10 != -1) {
                    tVar2.a(this, i10);
                }
            }
        }
        if (this.f37760c.f37855c.a(4)) {
            return this.f37760c.f37855c.f37884l.f37921o;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof o) {
            o oVar = (o) view;
            if (this.M == null) {
                this.M = new CopyOnWriteArrayList<>();
            }
            this.M.add(oVar);
            if (oVar.f37753k) {
                if (this.K == null) {
                    this.K = new ArrayList<>();
                }
                this.K.add(oVar);
            }
            if (oVar.f37754l) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                this.L.add(oVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<o> arrayList = this.K;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<o> arrayList2 = this.L;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:70:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    /* JADX WARN: Code duplicated, block: B:80:0x011e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0128  */
    /* JADX WARN: Code duplicated, block: B:88:0x012d  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r15 != 7) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(int r15, float r16, float r17) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.r.p(int, float, float):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i10) {
        this.mConstraintLayoutSpec = null;
    }

    public void q() {
        b(1.0f);
        this.f37769g0 = null;
    }

    public void r(int i10) {
        z.f fVar;
        if (!super.isAttachedToWindow()) {
            if (this.f37767f0 == null) {
                this.f37767f0 = new j();
            }
            this.f37767f0.f37833d = i10;
            return;
        }
        t tVar = this.f37760c;
        if (tVar != null && (fVar = tVar.f37854b) != null) {
            int i11 = this.f37770h;
            float f10 = -1;
            z.f.a aVar = fVar.f44964d.get(i10);
            if (aVar == null) {
                i11 = i10;
            } else if (f10 != -1.0f && f10 != -1.0f) {
                Iterator<z.f.b> it = aVar.f44966b.iterator();
                z.f.b bVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (bVar != null) {
                            i11 = bVar.f44972e;
                            break;
                        } else {
                            i11 = aVar.f44967c;
                            break;
                        }
                    }
                    z.f.b next = it.next();
                    if (next.a(f10, f10)) {
                        if (i11 == next.f44972e) {
                            break;
                        } else {
                            bVar = next;
                        }
                    }
                }
            } else if (aVar.f44967c != i11) {
                Iterator<z.f.b> it2 = aVar.f44966b.iterator();
                do {
                    if (!it2.hasNext()) {
                        i11 = aVar.f44967c;
                        break;
                    }
                } while (i11 != it2.next().f44972e);
            }
            if (i11 != -1) {
                i10 = i11;
            }
        }
        int i12 = this.f37770h;
        if (i12 == i10) {
            return;
        }
        if (this.f37768g == i10) {
            b(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            return;
        }
        if (this.f37772i == i10) {
            b(1.0f);
            return;
        }
        this.f37772i = i10;
        if (i12 != -1) {
            o(i12, i10);
            b(1.0f);
            this.f37788q = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            q();
            return;
        }
        this.f37797y = false;
        this.f37791s = 1.0f;
        this.f37786p = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37788q = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37790r = getNanoTime();
        this.f37782n = getNanoTime();
        this.f37792t = false;
        this.f37762d = null;
        this.f37784o = this.f37760c.c() / 1000.0f;
        this.f37768g = -1;
        this.f37760c.p(-1, this.f37772i);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        this.f37780m.clear();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            this.f37780m.put(childAt, new n(childAt));
            sparseArray.put(childAt.getId(), this.f37780m.get(childAt));
        }
        this.f37793u = true;
        this.f37779l0.e(null, this.f37760c.b(i10));
        m();
        this.f37779l0.a();
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            n nVar = this.f37780m.get(childAt2);
            if (nVar != null) {
                s sVar = nVar.f37732f;
                sVar.f37838e = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                sVar.f37839f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                sVar.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                nVar.f37734h.e(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i15 = 0; i15 < childCount; i15++) {
            n nVar2 = this.f37780m.get(getChildAt(i15));
            if (nVar2 != null) {
                this.f37760c.g(nVar2);
                nVar2.f(width, height, getNanoTime());
            }
        }
        t.b bVar2 = this.f37760c.f37855c;
        float f11 = bVar2 != null ? bVar2.f37881i : 0.0f;
        if (f11 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i16 = 0; i16 < childCount; i16++) {
                s sVar2 = this.f37780m.get(getChildAt(i16)).f37733g;
                float f12 = sVar2.f37841h + sVar2.f37840g;
                fMin = Math.min(fMin, f12);
                fMax = Math.max(fMax, f12);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                n nVar3 = this.f37780m.get(getChildAt(i17));
                s sVar3 = nVar3.f37733g;
                float f13 = sVar3.f37840g;
                float f14 = sVar3.f37841h;
                nVar3.f37740n = 1.0f / (1.0f - f11);
                nVar3.f37739m = f11 - ((((f13 + f14) - fMin) * f11) / (fMax - fMin));
            }
        }
        this.f37786p = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37788q = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37793u = true;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        t tVar;
        t.b bVar;
        if (!this.S && this.f37770h == -1 && (tVar = this.f37760c) != null && (bVar = tVar.f37855c) != null) {
            int i10 = bVar.f37889q;
            if (i10 == 0) {
                return;
            }
            if (i10 == 2) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.f37780m.get(getChildAt(i11)).f37730d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void s(int i10, androidx.constraintlayout.widget.c cVar) {
        t tVar = this.f37760c;
        if (tVar != null) {
            tVar.f37859g.put(i10, cVar);
        }
        this.f37779l0.e(this.f37760c.b(this.f37768g), this.f37760c.b(this.f37772i));
        m();
        if (this.f37770h == i10) {
            cVar.c(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }

    public void setDebugMode(int i10) {
        this.f37795w = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f37775j0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f37778l = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.f37760c != null) {
            setState(l.MOVING);
            Interpolator interpolatorF = this.f37760c.f();
            if (interpolatorF != null) {
                setProgress(interpolatorF.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<o> arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.L.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<o> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.K.get(i10).setProgress(f10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r5.f37788q == com.google.android.material.internal.StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r5.f37788q == 1.0f) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r0 = y.r.l.FINISHED;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setProgress(float r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto Lb
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L12
        Lb:
            java.lang.String r3 = "MotionLayout"
            java.lang.String r4 = "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"
            android.util.Log.w(r3, r4)
        L12:
            boolean r3 = super.isAttachedToWindow()
            if (r3 != 0) goto L28
            y.r$j r0 = r5.f37767f0
            if (r0 != 0) goto L23
            y.r$j r0 = new y.r$j
            r0.<init>()
            r5.f37767f0 = r0
        L23:
            y.r$j r0 = r5.f37767f0
            r0.f37830a = r6
            return
        L28:
            if (r1 > 0) goto L46
            float r1 = r5.f37788q
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L3b
            int r1 = r5.f37770h
            int r2 = r5.f37772i
            if (r1 != r2) goto L3b
            y.r$l r1 = y.r.l.MOVING
            r5.setState(r1)
        L3b:
            int r1 = r5.f37768g
            r5.f37770h = r1
            float r1 = r5.f37788q
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L70
            goto L65
        L46:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 < 0) goto L68
            float r1 = r5.f37788q
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L5b
            int r0 = r5.f37770h
            int r1 = r5.f37768g
            if (r0 != r1) goto L5b
            y.r$l r0 = y.r.l.MOVING
            r5.setState(r0)
        L5b:
            int r0 = r5.f37772i
            r5.f37770h = r0
            float r0 = r5.f37788q
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L70
        L65:
            y.r$l r0 = y.r.l.FINISHED
            goto L6d
        L68:
            r0 = -1
            r5.f37770h = r0
            y.r$l r0 = y.r.l.MOVING
        L6d:
            r5.setState(r0)
        L70:
            y.t r0 = r5.f37760c
            if (r0 != 0) goto L75
            return
        L75:
            r0 = 1
            r5.f37792t = r0
            r5.f37791s = r6
            r5.f37786p = r6
            r1 = -1
            r5.f37790r = r1
            r5.f37782n = r1
            r6 = 0
            r5.f37762d = r6
            r5.f37793u = r0
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.r.setProgress(float):void");
    }

    public void setScene(t tVar) {
        x xVar;
        this.f37760c = tVar;
        boolean zIsRtl = isRtl();
        tVar.f37868p = zIsRtl;
        t.b bVar = tVar.f37855c;
        if (bVar != null && (xVar = bVar.f37884l) != null) {
            xVar.c(zIsRtl);
        }
        m();
    }

    public void setStartState(int i10) {
        if (super.isAttachedToWindow()) {
            this.f37770h = i10;
            return;
        }
        if (this.f37767f0 == null) {
            this.f37767f0 = new j();
        }
        j jVar = this.f37767f0;
        jVar.f37832c = i10;
        jVar.f37833d = i10;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i10, int i11, int i12) {
        setState(l.SETUP);
        this.f37770h = i10;
        this.f37768g = -1;
        this.f37772i = -1;
        z.a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.b(i10, i11, i12);
            return;
        }
        t tVar = this.f37760c;
        if (tVar != null) {
            tVar.b(i10).c(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }

    public void setState(l lVar) {
        l lVar2 = l.FINISHED;
        if (lVar == lVar2 && this.f37770h == -1) {
            return;
        }
        l lVar3 = this.f37777k0;
        this.f37777k0 = lVar;
        l lVar4 = l.MOVING;
        if (lVar3 == lVar4 && lVar == lVar4) {
            e();
        }
        int i10 = d.f37802a[lVar3.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (lVar == lVar4) {
                e();
            }
            if (lVar != lVar2) {
                return;
            }
        } else if (i10 != 3 || lVar != lVar2) {
            return;
        }
        f();
    }

    public void setTransition(int i10) {
        t.b next;
        t tVar;
        int i11;
        t tVar2 = this.f37760c;
        if (tVar2 != null) {
            Iterator<t.b> it = tVar2.f37856d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.f37873a != i10);
            this.f37768g = next.f37876d;
            this.f37772i = next.f37875c;
            if (!super.isAttachedToWindow()) {
                if (this.f37767f0 == null) {
                    this.f37767f0 = new j();
                }
                j jVar = this.f37767f0;
                jVar.f37832c = this.f37768g;
                jVar.f37833d = this.f37772i;
                return;
            }
            float f10 = Float.NaN;
            int i12 = this.f37770h;
            if (i12 == this.f37768g) {
                f10 = 0.0f;
            } else if (i12 == this.f37772i) {
                f10 = 1.0f;
            }
            t tVar3 = this.f37760c;
            tVar3.f37855c = next;
            x xVar = next.f37884l;
            if (xVar != null) {
                xVar.c(tVar3.f37868p);
            }
            this.f37779l0.e(this.f37760c.b(this.f37768g), this.f37760c.b(this.f37772i));
            m();
            if (this.f37788q != f10) {
                if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    c(true);
                    tVar = this.f37760c;
                    i11 = this.f37768g;
                } else if (f10 == 1.0f) {
                    c(false);
                    tVar = this.f37760c;
                    i11 = this.f37772i;
                }
                tVar.b(i11).c(this, true);
                setConstraintSet(null);
                requestLayout();
            }
            this.f37788q = Float.isNaN(f10) ? 0.0f : f10;
            if (!Float.isNaN(f10)) {
                setProgress(f10);
                return;
            }
            Log.v("MotionLayout", y.a.b() + " transitionToStart ");
            b(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
    }

    public void setTransitionDuration(int i10) {
        t tVar = this.f37760c;
        if (tVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        t.b bVar = tVar.f37855c;
        if (bVar != null) {
            bVar.f37880h = Math.max(i10, 8);
        } else {
            tVar.f37862j = i10;
        }
    }

    public void setTransitionListener(k kVar) {
        this.f37794v = kVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f37767f0 == null) {
            this.f37767f0 = new j();
        }
        j jVar = this.f37767f0;
        Objects.requireNonNull(jVar);
        jVar.f37830a = bundle.getFloat("motion.progress");
        jVar.f37831b = bundle.getFloat("motion.velocity");
        jVar.f37832c = bundle.getInt("motion.StartState");
        jVar.f37833d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f37767f0.a();
        }
    }

    public void t(int i10, View... viewArr) {
        t tVar = this.f37760c;
        if (tVar == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        a0 a0Var = tVar.f37869q;
        Objects.requireNonNull(a0Var);
        ArrayList arrayList = new ArrayList();
        z zVar = null;
        for (z zVar2 : a0Var.f37605b) {
            if (zVar2.f37934a == i10) {
                for (View view : viewArr) {
                    if (zVar2.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    int currentState = a0Var.f37604a.getCurrentState();
                    if (zVar2.f37938e == 2) {
                        zVar2.a(a0Var, a0Var.f37604a, currentState, null, viewArr2);
                    } else if (currentState == -1) {
                        String str = a0Var.f37607d;
                        StringBuilder sbA = defpackage.a.a("No support for ViewTransition within transition yet. Currently: ");
                        sbA.append(a0Var.f37604a.toString());
                        Log.w(str, sbA.toString());
                    } else {
                        androidx.constraintlayout.widget.c cVarH = a0Var.f37604a.h(currentState);
                        if (cVarH != null) {
                            zVar2.a(a0Var, a0Var.f37604a, currentState, cVarH, viewArr2);
                        }
                    }
                    arrayList.clear();
                }
                zVar = zVar2;
            }
        }
        if (zVar == null) {
            Log.e(a0Var.f37607d, " Could not find ViewTransition");
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return y.a.c(context, this.f37768g) + "->" + y.a.c(context, this.f37772i) + " (pos:" + this.f37788q + " Dpos/Dt:" + this.f37766f;
    }

    public void setTransition(t.b bVar) {
        x xVar;
        t tVar = this.f37760c;
        tVar.f37855c = bVar;
        if (bVar != null && (xVar = bVar.f37884l) != null) {
            xVar.c(tVar.f37868p);
        }
        setState(l.SETUP);
        float f10 = this.f37770h == this.f37760c.d() ? 1.0f : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f37788q = f10;
        this.f37786p = f10;
        this.f37791s = f10;
        this.f37790r = bVar.a(1) ? -1L : getNanoTime();
        int i10 = this.f37760c.i();
        int iD = this.f37760c.d();
        if (i10 == this.f37768g && iD == this.f37772i) {
            return;
        }
        this.f37768g = i10;
        this.f37772i = iD;
        this.f37760c.p(i10, iD);
        this.f37779l0.e(this.f37760c.b(this.f37768g), this.f37760c.b(this.f37772i));
        g gVar = this.f37779l0;
        int i11 = this.f37768g;
        int i12 = this.f37772i;
        gVar.f37825e = i11;
        gVar.f37826f = i12;
        gVar.f();
        m();
    }
}
