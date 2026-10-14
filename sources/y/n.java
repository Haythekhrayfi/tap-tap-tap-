package y;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class n {
    public k[] A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f37728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37729c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t.b[] f37736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t.b f37737k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f37741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f37742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f37743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f37744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f37745s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap<String, x.e> f37750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap<String, x.d> f37751y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap<String, x.c> f37752z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f37727a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37730d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37731e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f37732f = new s();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f37733g = new s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f37734h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f37735i = new l();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f37738l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f37739m = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f37740n = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float[] f37746t = new float[4];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<s> f37747u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float[] f37748v = new float[1];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList<d> f37749w = new ArrayList<>();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public n(View view) {
        this.f37728b = view;
        this.f37729c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            Objects.requireNonNull((ConstraintLayout.b) layoutParams);
        }
    }

    public final float a(float f10, float[] fArr) {
        float f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f37740n;
            if (f12 != 1.0d) {
                float f13 = this.f37739m;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        t.c cVar = this.f37732f.f37836c;
        float f14 = Float.NaN;
        for (s sVar : this.f37747u) {
            t.c cVar2 = sVar.f37836c;
            if (cVar2 != null) {
                float f15 = sVar.f37838e;
                if (f15 < f10) {
                    cVar = cVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = sVar.f37838e;
                }
            }
        }
        if (cVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) cVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d10);
            }
        }
        return f10;
    }

    public void b(double d10, float[] fArr, float[] fArr2) {
        float f10;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f37736j[0].c(d10, dArr);
        this.f37736j[0].e(d10, dArr2);
        float f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        Arrays.fill(fArr2, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        s sVar = this.f37732f;
        int[] iArr = this.f37741o;
        float f12 = sVar.f37840g;
        float f13 = sVar.f37841h;
        float f14 = sVar.f37842i;
        float f15 = sVar.f37843j;
        float f16 = 0.0f;
        int i10 = 0;
        float f17 = f12;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (i10 < iArr.length) {
            float f20 = f13;
            float f21 = f14;
            float f22 = (float) dArr[i10];
            float f23 = (float) dArr2[i10];
            int i11 = iArr[i10];
            double[] dArr3 = dArr2;
            if (i11 != 1) {
                if (i11 == 2) {
                    f16 = f23;
                    f14 = f21;
                    f13 = f22;
                } else if (i11 == 3) {
                    f11 = f23;
                    f14 = f22;
                } else if (i11 != 4) {
                    f13 = f20;
                    f14 = f21;
                } else {
                    f19 = f23;
                    f14 = f21;
                    f15 = f22;
                }
                i10++;
                dArr2 = dArr3;
            } else {
                f18 = f23;
                f14 = f21;
                f17 = f22;
            }
            f13 = f20;
            i10++;
            dArr2 = dArr3;
        }
        float f24 = f13;
        float f25 = f14;
        float f26 = 2.0f;
        float f27 = (f11 / 2.0f) + f18;
        float fA = (f19 / 2.0f) + f16;
        n nVar = sVar.f37848o;
        if (nVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            nVar.b(d10, fArr3, fArr4);
            float f28 = fArr3[0];
            float f29 = fArr3[1];
            float f30 = fArr4[0];
            float f31 = fArr4[1];
            double d11 = f17;
            double d12 = f24;
            float fA2 = (float) (androidx.appcompat.app.w.a(d12, d11, f28) - ((double) (f25 / 2.0f)));
            float fCos = (float) ((((double) f29) - (Math.cos(d12) * d11)) - ((double) (f15 / 2.0f)));
            double d13 = f18;
            double d14 = f16;
            float fCos2 = (float) ((Math.cos(d12) * d14) + androidx.appcompat.app.w.a(d12, d13, f30));
            fA = (float) androidx.appcompat.app.w.a(d12, d14, ((double) f31) - (Math.cos(d12) * d13));
            f26 = 2.0f;
            f17 = fA2;
            f27 = fCos2;
            f10 = fCos;
        } else {
            f10 = f24;
        }
        fArr[0] = (f25 / f26) + f17 + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        fArr[1] = (f15 / f26) + f10 + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        fArr2[0] = f27;
        fArr2[1] = fA;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x032b  */
    public boolean c(View view, float f10, long j10, t.d dVar) {
        x.e.d dVar2;
        boolean zE;
        float f11;
        View view2;
        n nVar;
        boolean z10;
        x.e.d dVar3;
        double d10;
        boolean z11;
        int i10;
        double d11;
        float f12;
        boolean z12;
        float fA = a(f10, null);
        int i11 = this.E;
        float interpolation = 1.0f;
        if (i11 != -1) {
            float f13 = 1.0f / i11;
            float fFloor = ((float) Math.floor(fA / f13)) * f13;
            float f14 = (fA % f13) / f13;
            if (!Float.isNaN(this.F)) {
                f14 = (f14 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(f14);
            } else if (f14 <= 0.5d) {
                interpolation = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
            fA = (interpolation * f13) + fFloor;
        }
        float f15 = fA;
        HashMap<String, x.d> map = this.f37751y;
        if (map != null) {
            Iterator<x.d> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().d(view, f15);
            }
        }
        HashMap<String, x.e> map2 = this.f37750x;
        if (map2 != null) {
            dVar2 = null;
            zE = false;
            for (x.e eVar : map2.values()) {
                if (eVar instanceof x.e.d) {
                    dVar2 = (x.e.d) eVar;
                } else {
                    zE |= eVar.e(view, f15, j10, dVar);
                }
            }
        } else {
            dVar2 = null;
            zE = false;
        }
        t.b[] bVarArr = this.f37736j;
        if (bVarArr != null) {
            double d12 = f15;
            bVarArr[0].c(d12, this.f37742p);
            this.f37736j[0].e(d12, this.f37743q);
            t.b bVar = this.f37737k;
            if (bVar != null) {
                double[] dArr = this.f37742p;
                if (dArr.length > 0) {
                    bVar.c(d12, dArr);
                    this.f37737k.e(d12, this.f37743q);
                }
            }
            if (this.H) {
                dVar3 = dVar2;
                d10 = d12;
                view2 = view;
                nVar = this;
            } else {
                s sVar = this.f37732f;
                int[] iArr = this.f37741o;
                double[] dArr2 = this.f37742p;
                double[] dArr3 = this.f37743q;
                boolean z13 = this.f37730d;
                float f16 = sVar.f37840g;
                float f17 = sVar.f37841h;
                float f18 = sVar.f37842i;
                float f19 = sVar.f37843j;
                if (iArr.length != 0) {
                    f12 = f17;
                    if (sVar.f37851r.length <= iArr[iArr.length - 1]) {
                        int i12 = iArr[iArr.length - 1] + 1;
                        sVar.f37851r = new double[i12];
                        sVar.f37852s = new double[i12];
                    }
                } else {
                    f12 = f17;
                }
                float f20 = f18;
                Arrays.fill(sVar.f37851r, Double.NaN);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    sVar.f37851r[iArr[i13]] = dArr2[i13];
                    sVar.f37852s[iArr[i13]] = dArr3[i13];
                }
                float f21 = Float.NaN;
                float f22 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                int i14 = 0;
                float f23 = f16;
                float f24 = 0.0f;
                float f25 = f19;
                float f26 = 0.0f;
                float f27 = f12;
                float f28 = 0.0f;
                float f29 = f27;
                while (true) {
                    double[] dArr4 = sVar.f37851r;
                    dVar3 = dVar2;
                    if (i14 >= dArr4.length) {
                        break;
                    }
                    if (!Double.isNaN(dArr4[i14])) {
                        float f30 = (float) (Double.isNaN(sVar.f37851r[i14]) ? 0.0d : sVar.f37851r[i14] + 0.0d);
                        float f31 = (float) sVar.f37852s[i14];
                        if (i14 == 1) {
                            f22 = f31;
                            f23 = f30;
                        } else if (i14 == 2) {
                            f24 = f31;
                            f29 = f30;
                        } else if (i14 == 3) {
                            f26 = f31;
                            f20 = f30;
                        } else if (i14 == 4) {
                            f28 = f31;
                            f25 = f30;
                        } else if (i14 == 5) {
                            f21 = f30;
                        }
                    }
                    i14++;
                    dVar2 = dVar3;
                }
                n nVar2 = sVar.f37848o;
                if (nVar2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar2.b(d12, fArr, fArr2);
                    float f32 = fArr[0];
                    float f33 = fArr[1];
                    float f34 = fArr2[0];
                    float f35 = fArr2[1];
                    d10 = d12;
                    double d13 = f32;
                    double d14 = f23;
                    double d15 = f29;
                    z12 = z13;
                    float fA2 = (float) (androidx.appcompat.app.w.a(d15, d14, d13) - ((double) (f20 / 2.0f)));
                    float fCos = (float) ((((double) f33) - (Math.cos(d15) * d14)) - ((double) (f25 / 2.0f)));
                    double d16 = f22;
                    double d17 = f24;
                    float fCos2 = (float) ((Math.cos(d15) * d14 * d17) + androidx.appcompat.app.w.a(d15, d16, f34));
                    float fSin = (float) ((Math.sin(d15) * d14 * d17) + (((double) f35) - (Math.cos(d15) * d16)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin;
                    }
                    if (Float.isNaN(f21)) {
                        view2 = view;
                    } else {
                        view2 = view;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2(fSin, fCos2)) + ((double) f21)));
                    }
                    f29 = fCos;
                    f23 = fA2;
                } else {
                    view2 = view;
                    z12 = z13;
                    d10 = d12;
                    if (!Float.isNaN(f21)) {
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((f28 / 2.0f) + f24, (f26 / 2.0f) + f22)) + ((double) f21) + ((double) StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)));
                    }
                }
                if (view2 instanceof c) {
                    ((c) view2).a(f23, f29, f20 + f23, f29 + f25);
                } else {
                    float f36 = f23 + 0.5f;
                    int i15 = (int) f36;
                    float f37 = f29 + 0.5f;
                    int i16 = (int) f37;
                    int i17 = (int) (f36 + f20);
                    int i18 = (int) (f37 + f25);
                    int i19 = i17 - i15;
                    int i20 = i18 - i16;
                    if (((i19 == view.getMeasuredWidth() && i20 == view.getMeasuredHeight()) ? false : true) || z12) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                    }
                    view2.layout(i15, i16, i17, i18);
                }
                nVar = this;
                nVar.f37730d = false;
            }
            if (nVar.C != -1) {
                if (nVar.D == null) {
                    nVar.D = ((View) view.getParent()).findViewById(nVar.C);
                }
                View view3 = nVar.D;
                if (view3 != null) {
                    float bottom = (nVar.D.getBottom() + view3.getTop()) / 2.0f;
                    float right = (nVar.D.getRight() + nVar.D.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view2.setPivotX(left);
                        view2.setPivotY(top);
                    }
                }
            }
            HashMap<String, x.d> map3 = nVar.f37751y;
            if (map3 != null) {
                for (x.d dVar4 : map3.values()) {
                    if (dVar4 instanceof x.d.C0455d) {
                        double[] dArr5 = nVar.f37743q;
                        if (dArr5.length > 1) {
                            d11 = d10;
                            view2.setRotation(((float) ((x.d.C0455d) dVar4).f35608a.b(d11, 0)) + ((float) Math.toDegrees(Math.atan2(dArr5[1], dArr5[0]))));
                        } else {
                            d11 = d10;
                        }
                    } else {
                        d11 = d10;
                    }
                    d10 = d11;
                }
            }
            double d18 = d10;
            if (dVar3 != null) {
                double[] dArr6 = nVar.f37743q;
                view2.setRotation(dVar3.d(f15, j10, view, dVar) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                z11 = zE | dVar3.f35643h;
            } else {
                z11 = zE;
            }
            int i21 = 1;
            while (true) {
                t.b[] bVarArr2 = nVar.f37736j;
                if (i21 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i21].d(d18, nVar.f37746t);
                x.a.b(nVar.f37732f.f37849p.get(nVar.f37744r[i21 - 1]), view2, nVar.f37746t);
                i21++;
            }
            l lVar = nVar.f37734h;
            if (lVar.f37710d == 0) {
                if (f15 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    i10 = lVar.f37711e;
                    view2.setVisibility(i10);
                } else if (f15 >= 1.0f) {
                    lVar = nVar.f37735i;
                    i10 = lVar.f37711e;
                    view2.setVisibility(i10);
                } else if (nVar.f37735i.f37711e != lVar.f37711e) {
                    i10 = 0;
                    view2.setVisibility(i10);
                }
            }
            if (nVar.A != null) {
                int i22 = 0;
                while (true) {
                    k[] kVarArr = nVar.A;
                    if (i22 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i22].g(f15, view2);
                    i22++;
                }
            }
            f11 = f15;
            z10 = z11;
        } else {
            f11 = f15;
            boolean z14 = zE;
            view2 = view;
            nVar = this;
            s sVar2 = nVar.f37732f;
            float f38 = sVar2.f37840g;
            s sVar3 = nVar.f37733g;
            float fA3 = w.e.a(sVar3.f37840g, f38, f11, f38);
            float f39 = sVar2.f37841h;
            float fA4 = w.e.a(sVar3.f37841h, f39, f11, f39);
            float f40 = sVar2.f37842i;
            float f41 = sVar3.f37842i;
            float fA5 = w.e.a(f41, f40, f11, f40);
            float f42 = sVar2.f37843j;
            float f43 = sVar3.f37843j;
            float f44 = fA3 + 0.5f;
            int i23 = (int) f44;
            float f45 = fA4 + 0.5f;
            int i24 = (int) f45;
            int i25 = (int) (f44 + fA5);
            int iA = (int) (f45 + w.e.a(f43, f42, f11, f42));
            int i26 = i25 - i23;
            int i27 = iA - i24;
            if (f41 != f40 || f43 != f42 || nVar.f37730d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i26, 1073741824), View.MeasureSpec.makeMeasureSpec(i27, 1073741824));
                nVar.f37730d = false;
            }
            view2.layout(i23, i24, i25, iA);
            z10 = z14;
        }
        HashMap<String, x.c> map4 = nVar.f37752z;
        if (map4 != null) {
            for (x.c cVar : map4.values()) {
                if (cVar instanceof x.c.d) {
                    double[] dArr7 = nVar.f37743q;
                    view2.setRotation(((x.c.d) cVar).a(f11) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                } else {
                    cVar.d(view2, f11);
                }
            }
        }
        return z10;
    }

    public final void d(s sVar) {
        sVar.d((int) this.f37728b.getX(), (int) this.f37728b.getY(), this.f37728b.getWidth(), this.f37728b.getHeight());
    }

    public void e(Rect rect, Rect rect2, int i10, int i11, int i12) {
        int i13;
        int iWidth;
        int i14;
        int i15;
        int i16;
        if (i10 != 1) {
            if (i10 == 2) {
                i14 = rect.left + rect.right;
                i15 = rect.top;
                i16 = rect.bottom;
            } else if (i10 == 3) {
                i13 = rect.left + rect.right;
                iWidth = ((rect.height() / 2) + rect.top) - (i13 / 2);
            } else {
                if (i10 != 4) {
                    return;
                }
                i14 = rect.left + rect.right;
                i15 = rect.bottom;
                i16 = rect.top;
            }
            rect2.left = i11 - ((rect.width() + (i15 + i16)) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        }
        i13 = rect.left + rect.right;
        iWidth = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.left = iWidth;
        rect2.top = i12 - ((rect.height() + i13) / 2);
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void f(int i10, int i11, long j10) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        Object obj;
        String str5;
        String str6;
        String str7;
        String str8;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        Object obj2;
        Object obj3;
        n nVar;
        Object obj4;
        Object obj5;
        Object obj6;
        x.c cVar;
        Iterator<d> it;
        Iterator<String> it2;
        float f10;
        String str9;
        HashMap<String, x.c> map;
        String str10;
        Object obj7;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        byte b10;
        byte b11;
        float f11;
        String str16;
        String str17;
        byte b12;
        byte b13;
        byte b14;
        byte b15;
        x.c gVar;
        x.c bVar;
        String str18;
        String str19;
        String str20;
        double dA;
        String str21;
        androidx.constraintlayout.widget.a aVar;
        Object obj8;
        HashSet<String> hashSet3;
        Iterator<String> it3;
        Object obj9;
        byte b16;
        byte b17;
        int i12;
        float f12;
        Iterator<String> it4;
        HashMap<String, Integer> map2;
        Object obj10;
        Object obj11;
        byte b18;
        byte b19;
        x.e gVar2;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        Object obj12;
        Object obj13;
        byte b20;
        byte b21;
        x.d iVar;
        Object obj14;
        x.d dVar;
        androidx.constraintlayout.widget.a aVar3;
        String str22;
        String str23;
        n nVar2 = this;
        new HashSet();
        HashSet<String> hashSet4 = new HashSet<>();
        HashSet<String> hashSet5 = new HashSet<>();
        HashSet<String> hashSet6 = new HashSet<>();
        HashMap<String, Integer> map3 = new HashMap<>();
        int i13 = nVar2.B;
        if (i13 != -1) {
            nVar2.f37732f.f37845l = i13;
        }
        l lVar = nVar2.f37734h;
        l lVar2 = nVar2.f37735i;
        if (lVar.c(lVar.f37709c, lVar2.f37709c)) {
            hashSet5.add("alpha");
        }
        String str24 = "elevation";
        if (lVar.c(lVar.f37712f, lVar2.f37712f)) {
            hashSet5.add("elevation");
        }
        int i14 = lVar.f37711e;
        int i15 = lVar2.f37711e;
        if (i14 != i15 && lVar.f37710d == 0 && (i14 == 0 || i15 == 0)) {
            hashSet5.add("alpha");
        }
        String str25 = "rotation";
        if (lVar.c(lVar.f37713g, lVar2.f37713g)) {
            hashSet5.add("rotation");
        }
        if (!Float.isNaN(lVar.f37723q) || !Float.isNaN(lVar2.f37723q)) {
            hashSet5.add("transitionPathRotate");
        }
        String str26 = "progress";
        if (!Float.isNaN(lVar.f37724r) || !Float.isNaN(lVar2.f37724r)) {
            hashSet5.add("progress");
        }
        if (lVar.c(lVar.f37714h, lVar2.f37714h)) {
            hashSet5.add("rotationX");
        }
        if (lVar.c(lVar.f37715i, lVar2.f37715i)) {
            hashSet5.add("rotationY");
        }
        if (lVar.c(lVar.f37718l, lVar2.f37718l)) {
            hashSet5.add("transformPivotX");
        }
        if (lVar.c(lVar.f37719m, lVar2.f37719m)) {
            hashSet5.add("transformPivotY");
        }
        String str27 = "scaleX";
        if (lVar.c(lVar.f37716j, lVar2.f37716j)) {
            hashSet5.add("scaleX");
        }
        Object obj15 = "rotationX";
        String str28 = "scaleY";
        if (lVar.c(lVar.f37717k, lVar2.f37717k)) {
            hashSet5.add("scaleY");
        }
        Object obj16 = "rotationY";
        if (lVar.c(lVar.f37720n, lVar2.f37720n)) {
            hashSet5.add("translationX");
        }
        Object obj17 = "translationX";
        String str29 = "translationY";
        if (lVar.c(lVar.f37721o, lVar2.f37721o)) {
            hashSet5.add("translationY");
        }
        boolean zC = lVar.c(lVar.f37722p, lVar2.f37722p);
        String str30 = "translationZ";
        if (zC) {
            hashSet5.add("translationZ");
        }
        ArrayList<d> arrayList2 = nVar2.f37749w;
        if (arrayList2 != null) {
            Iterator<d> it5 = arrayList2.iterator();
            arrayList = null;
            while (it5.hasNext()) {
                Iterator<d> it6 = it5;
                d next = it5.next();
                String str31 = str29;
                if (next instanceof h) {
                    h hVar = (h) next;
                    str22 = str30;
                    str23 = str26;
                    s sVar = new s(i10, i11, hVar, nVar2.f37732f, nVar2.f37733g);
                    int iBinarySearch = Collections.binarySearch(nVar2.f37747u, sVar);
                    if (iBinarySearch == 0) {
                        StringBuilder sbA = defpackage.a.a(" KeyPath position \"");
                        sbA.append(sVar.f37839f);
                        sbA.append("\" outside of range");
                        Log.e("MotionController", sbA.toString());
                    }
                    nVar2.f37747u.add((-iBinarySearch) - 1, sVar);
                    int i16 = hVar.f37668f;
                    if (i16 != -1) {
                        nVar2.f37731e = i16;
                    }
                } else {
                    str22 = str30;
                    str23 = str26;
                    str27 = str27;
                    if (next instanceof f) {
                        next.d(hashSet6);
                    } else if (next instanceof j) {
                        next.d(hashSet4);
                    } else if (next instanceof k) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add((k) next);
                    } else {
                        next.f(map3);
                        next.d(hashSet5);
                    }
                }
                str29 = str31;
                it5 = it6;
                str27 = str27;
                str30 = str22;
                str26 = str23;
            }
            str = str30;
            str2 = str26;
            str3 = str29;
            str4 = str27;
        } else {
            str = "translationZ";
            str2 = "progress";
            str3 = "translationY";
            str4 = "scaleX";
            arrayList = null;
        }
        if (arrayList != null) {
            nVar2.A = (k[]) arrayList.toArray(new k[0]);
        }
        char c10 = 1;
        if (hashSet5.isEmpty()) {
            obj = obj17;
            str5 = str3;
            str6 = str4;
            str7 = str;
            str8 = str2;
            hashSet = hashSet5;
            hashSet2 = hashSet6;
            obj2 = obj15;
            obj3 = obj16;
        } else {
            nVar2.f37751y = new HashMap<>();
            Iterator<String> it7 = hashSet5.iterator();
            while (it7.hasNext()) {
                String next2 = it7.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str32 = next2.split(",")[c10];
                    for (d dVar2 : nVar2.f37749w) {
                        Iterator<String> it8 = it7;
                        HashMap<String, androidx.constraintlayout.widget.a> map4 = dVar2.f37614e;
                        if (map4 != null && (aVar3 = map4.get(str32)) != null) {
                            sparseArray.append(dVar2.f37610a, aVar3);
                        }
                        it7 = it8;
                    }
                    it7 = it7;
                    x.d.b bVar2 = new x.d.b(next2, sparseArray);
                    obj17 = obj17;
                    str3 = str3;
                    str = str;
                    str2 = str2;
                    hashSet5 = hashSet5;
                    hashSet6 = hashSet6;
                    dVar = bVar2;
                    obj13 = obj16;
                    str4 = str4;
                    obj14 = obj15;
                } else {
                    it7 = it7;
                    switch (next2.hashCode()) {
                        case -1249320806:
                            obj17 = obj17;
                            str3 = str3;
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            b20 = next2.equals(obj12) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            obj17 = obj17;
                            str3 = str3;
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet6 = hashSet6;
                            obj13 = obj16;
                            if (next2.equals(obj13)) {
                                hashSet5 = hashSet5;
                                obj12 = obj15;
                                b20 = 1;
                            } else {
                                hashSet5 = hashSet5;
                                obj12 = obj15;
                            }
                            break;
                        case -1225497657:
                            obj17 = obj17;
                            str3 = str3;
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            if (next2.equals(obj17)) {
                                hashSet6 = hashSet6;
                                obj13 = obj16;
                                hashSet5 = hashSet5;
                                obj12 = obj15;
                                b20 = 2;
                            } else {
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                            }
                            break;
                        case -1225497656:
                            str3 = str3;
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet6 = hashSet6;
                            obj13 = obj16;
                            if (next2.equals(str3)) {
                                obj17 = obj17;
                                hashSet5 = hashSet5;
                                obj12 = obj15;
                                b20 = 3;
                            } else {
                                obj17 = obj17;
                                hashSet5 = hashSet5;
                                obj12 = obj15;
                            }
                            break;
                        case -1225497655:
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            obj17 = obj17;
                            if (next2.equals(str)) {
                                str3 = str3;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = 4;
                            } else {
                                str3 = str3;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                            }
                            break;
                        case -1001078227:
                            str4 = str4;
                            str2 = str2;
                            if (next2.equals(str2)) {
                                obj17 = obj17;
                                str3 = str3;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = 5;
                                str = str;
                            } else {
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                            }
                            break;
                        case -908189618:
                            str4 = str4;
                            if (next2.equals(str4)) {
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = 6;
                                str2 = str2;
                            } else {
                                str = str;
                                str2 = str2;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                            }
                            break;
                        case -908189617:
                            if (next2.equals("scaleY")) {
                                b21 = 7;
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                str2 = str2;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = b21;
                                str4 = str4;
                            }
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            break;
                        case -797520672:
                            if (next2.equals("waveVariesBy")) {
                                b21 = 8;
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                str2 = str2;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = b21;
                                str4 = str4;
                            }
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            break;
                        case -760884510:
                            if (next2.equals("transformPivotX")) {
                                b21 = 9;
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                str2 = str2;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = b21;
                                str4 = str4;
                            }
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            break;
                        case -760884509:
                            if (next2.equals("transformPivotY")) {
                                b21 = 10;
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                str2 = str2;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = b21;
                                str4 = str4;
                            }
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            break;
                        case -40300674:
                            if (next2.equals("rotation")) {
                                b21 = 11;
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                str2 = str2;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = b21;
                                str4 = str4;
                            }
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            break;
                        case -4379043:
                            if (next2.equals("elevation")) {
                                b21 = 12;
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                str2 = str2;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = b21;
                                str4 = str4;
                            }
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            break;
                        case 37232917:
                            if (next2.equals("transitionPathRotate")) {
                                b21 = 13;
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                str2 = str2;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = b21;
                                str4 = str4;
                            }
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            break;
                        case 92909918:
                            if (next2.equals("alpha")) {
                                b21 = 14;
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                str2 = str2;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = b21;
                                str4 = str4;
                            }
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            break;
                        case 156108012:
                            if (next2.equals("waveOffset")) {
                                b21 = 15;
                                obj17 = obj17;
                                str3 = str3;
                                str = str;
                                str2 = str2;
                                hashSet5 = hashSet5;
                                hashSet6 = hashSet6;
                                obj12 = obj15;
                                obj13 = obj16;
                                b20 = b21;
                                str4 = str4;
                            }
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            break;
                        default:
                            str4 = str4;
                            str = str;
                            str2 = str2;
                            hashSet5 = hashSet5;
                            hashSet6 = hashSet6;
                            obj12 = obj15;
                            obj13 = obj16;
                            break;
                    }
                    switch (b20) {
                        case 0:
                            iVar = new x.d.i();
                            break;
                        case 1:
                            iVar = new x.d.j();
                            break;
                        case 2:
                            iVar = new x.d.m();
                            break;
                        case 3:
                            iVar = new x.d.n();
                            break;
                        case 4:
                            iVar = new x.d.o();
                            break;
                        case 5:
                            iVar = new x.d.g();
                            break;
                        case 6:
                            iVar = new x.d.k();
                            break;
                        case 7:
                            iVar = new x.d.l();
                            break;
                        case 8:
                            iVar = new x.d.a();
                            break;
                        case 9:
                            iVar = new x.d.e();
                            break;
                        case 10:
                            iVar = new x.d.f();
                            break;
                        case 11:
                            iVar = new x.d.h();
                            break;
                        case 12:
                            iVar = new x.d.c();
                            break;
                        case 13:
                            iVar = new x.d.C0455d();
                            break;
                        case 14:
                            iVar = new x.d.a();
                            break;
                        case 15:
                            iVar = new x.d.a();
                            break;
                        default:
                            iVar = null;
                            break;
                    }
                    obj14 = obj12;
                    dVar = iVar;
                }
                if (dVar == null) {
                    obj15 = obj14;
                    obj16 = obj13;
                    c10 = 1;
                } else {
                    dVar.f35612e = next2;
                    nVar2.f37751y.put(next2, dVar);
                    c10 = 1;
                    Object obj18 = obj14;
                    obj16 = obj13;
                    obj15 = obj18;
                }
            }
            obj = obj17;
            str5 = str3;
            str6 = str4;
            str7 = str;
            str8 = str2;
            hashSet = hashSet5;
            hashSet2 = hashSet6;
            Object obj19 = obj16;
            obj2 = obj15;
            obj3 = obj19;
            ArrayList<d> arrayList3 = nVar2.f37749w;
            if (arrayList3 != null) {
                for (d dVar3 : arrayList3) {
                    if (dVar3 instanceof e) {
                        dVar3.a(nVar2.f37751y);
                    }
                }
            }
            nVar2.f37734h.a(nVar2.f37751y, 0);
            nVar2.f37735i.a(nVar2.f37751y, 100);
            Iterator<String> it9 = nVar2.f37751y.keySet().iterator();
            while (it9.hasNext()) {
                String next3 = it9.next();
                int iIntValue = (!map3.containsKey(next3) || (num = map3.get(next3)) == null) ? 0 : num.intValue();
                Iterator<String> it10 = it9;
                x.d dVar4 = nVar2.f37751y.get(next3);
                if (dVar4 != null) {
                    dVar4.c(iIntValue);
                }
                it9 = it10;
            }
        }
        if (hashSet4.isEmpty()) {
            nVar = nVar2;
            obj4 = obj;
            obj5 = obj3;
            obj6 = obj2;
        } else {
            if (nVar2.f37750x == null) {
                nVar2.f37750x = new HashMap<>();
            }
            Iterator<String> it11 = hashSet4.iterator();
            while (it11.hasNext()) {
                String next4 = it11.next();
                if (!nVar2.f37750x.containsKey(next4)) {
                    if (!next4.startsWith("CUSTOM,")) {
                        it4 = it11;
                        map2 = map3;
                        switch (next4.hashCode()) {
                            case -1249320806:
                                obj10 = obj3;
                                obj11 = obj2;
                                b18 = next4.equals(obj11) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                obj10 = obj3;
                                if (next4.equals(obj10)) {
                                    b18 = 1;
                                    obj11 = obj2;
                                }
                                obj11 = obj2;
                                break;
                            case -1225497657:
                                if (next4.equals(obj)) {
                                    b19 = 2;
                                    b18 = b19;
                                    obj10 = obj3;
                                    obj11 = obj2;
                                } else {
                                    obj10 = obj3;
                                    obj11 = obj2;
                                }
                                break;
                            case -1225497656:
                                if (next4.equals(str5)) {
                                    b19 = 3;
                                    b18 = b19;
                                    obj10 = obj3;
                                    obj11 = obj2;
                                } else {
                                    obj10 = obj3;
                                    obj11 = obj2;
                                }
                                break;
                            case -1225497655:
                                if (next4.equals(str7)) {
                                    b19 = 4;
                                    b18 = b19;
                                    obj10 = obj3;
                                    obj11 = obj2;
                                } else {
                                    obj10 = obj3;
                                    obj11 = obj2;
                                }
                                break;
                            case -1001078227:
                                if (next4.equals(str8)) {
                                    b19 = 5;
                                    b18 = b19;
                                    obj10 = obj3;
                                    obj11 = obj2;
                                } else {
                                    obj10 = obj3;
                                    obj11 = obj2;
                                }
                                break;
                            case -908189618:
                                if (next4.equals(str6)) {
                                    b19 = 6;
                                    b18 = b19;
                                    obj10 = obj3;
                                    obj11 = obj2;
                                } else {
                                    obj10 = obj3;
                                    obj11 = obj2;
                                }
                                break;
                            case -908189617:
                                if (next4.equals("scaleY")) {
                                    b19 = 7;
                                    b18 = b19;
                                    obj10 = obj3;
                                    obj11 = obj2;
                                } else {
                                    obj10 = obj3;
                                    obj11 = obj2;
                                }
                                break;
                            case -40300674:
                                if (next4.equals("rotation")) {
                                    b19 = 8;
                                    b18 = b19;
                                    obj10 = obj3;
                                    obj11 = obj2;
                                } else {
                                    obj10 = obj3;
                                    obj11 = obj2;
                                }
                                break;
                            case -4379043:
                                if (next4.equals("elevation")) {
                                    b19 = 9;
                                    b18 = b19;
                                    obj10 = obj3;
                                    obj11 = obj2;
                                } else {
                                    obj10 = obj3;
                                    obj11 = obj2;
                                }
                                break;
                            case 37232917:
                                if (next4.equals("transitionPathRotate")) {
                                    b19 = 10;
                                    b18 = b19;
                                    obj10 = obj3;
                                    obj11 = obj2;
                                } else {
                                    obj10 = obj3;
                                    obj11 = obj2;
                                }
                                break;
                            case 92909918:
                                if (next4.equals("alpha")) {
                                    b19 = 11;
                                    b18 = b19;
                                    obj10 = obj3;
                                    obj11 = obj2;
                                } else {
                                    obj10 = obj3;
                                    obj11 = obj2;
                                }
                                break;
                            default:
                                obj10 = obj3;
                                obj11 = obj2;
                                break;
                        }
                        switch (b18) {
                            case 0:
                                gVar2 = new x.e.g();
                                gVar2.f35644i = j10;
                                break;
                            case 1:
                                gVar2 = new x.e.h();
                                gVar2.f35644i = j10;
                                break;
                            case 2:
                                gVar2 = new x.e.k();
                                gVar2.f35644i = j10;
                                break;
                            case 3:
                                gVar2 = new x.e.l();
                                gVar2.f35644i = j10;
                                break;
                            case 4:
                                gVar2 = new x.e.m();
                                gVar2.f35644i = j10;
                                break;
                            case 5:
                                gVar2 = new x.e.C0456e();
                                gVar2.f35644i = j10;
                                break;
                            case 6:
                                gVar2 = new x.e.i();
                                gVar2.f35644i = j10;
                                break;
                            case 7:
                                gVar2 = new x.e.j();
                                gVar2.f35644i = j10;
                                break;
                            case 8:
                                gVar2 = new x.e.f();
                                gVar2.f35644i = j10;
                                break;
                            case 9:
                                gVar2 = new x.e.c();
                                gVar2.f35644i = j10;
                                break;
                            case 10:
                                gVar2 = new x.e.d();
                                gVar2.f35644i = j10;
                                break;
                            case 11:
                                gVar2 = new x.e.a();
                                gVar2.f35644i = j10;
                                break;
                            default:
                                gVar2 = null;
                                break;
                        }
                    } else {
                        SparseArray sparseArray2 = new SparseArray();
                        String str33 = next4.split(",")[1];
                        it4 = it11;
                        Iterator<d> it12 = nVar2.f37749w.iterator();
                        while (it12.hasNext()) {
                            Iterator<d> it13 = it12;
                            d next5 = it12.next();
                            HashMap<String, Integer> map5 = map3;
                            HashMap<String, androidx.constraintlayout.widget.a> map6 = next5.f37614e;
                            if (map6 != null && (aVar2 = map6.get(str33)) != null) {
                                sparseArray2.append(next5.f37610a, aVar2);
                            }
                            map3 = map5;
                            it12 = it13;
                        }
                        map2 = map3;
                        gVar2 = new x.e.b(next4, sparseArray2);
                        obj10 = obj3;
                        obj11 = obj2;
                    }
                    if (gVar2 != null) {
                        gVar2.f35641f = next4;
                        nVar2.f37750x.put(next4, gVar2);
                    }
                    obj2 = obj11;
                    obj = obj;
                    map3 = map2;
                    obj3 = obj10;
                    it11 = it4;
                }
            }
            HashMap<String, Integer> map7 = map3;
            obj5 = obj3;
            obj6 = obj2;
            Object obj20 = obj;
            ArrayList<d> arrayList4 = nVar2.f37749w;
            if (arrayList4 != null) {
                Iterator<d> it14 = arrayList4.iterator();
                while (it14.hasNext()) {
                    d next6 = it14.next();
                    if (next6 instanceof j) {
                        j jVar = (j) next6;
                        HashMap<String, x.e> map8 = nVar2.f37750x;
                        Objects.requireNonNull(jVar);
                        Iterator<String> it15 = map8.keySet().iterator();
                        while (it15.hasNext()) {
                            it14 = it14;
                            String next7 = it15.next();
                            x.e eVar = map8.get(next7);
                            map8 = map8;
                            if (eVar == null) {
                                it3 = it15;
                                obj9 = obj20;
                            } else if (!next7.startsWith("CUSTOM")) {
                                Object obj21 = obj5;
                                Object obj22 = obj6;
                                j jVar2 = jVar;
                                it3 = it15;
                                switch (next7.hashCode()) {
                                    case -1249320806:
                                        obj9 = obj20;
                                        obj6 = obj22;
                                        obj5 = obj21;
                                        b16 = next7.equals(obj6) ? (byte) 0 : (byte) -1;
                                        break;
                                    case -1249320805:
                                        obj9 = obj20;
                                        obj5 = obj21;
                                        if (next7.equals(obj5)) {
                                            b16 = 1;
                                            obj6 = obj22;
                                        } else {
                                            obj6 = obj22;
                                        }
                                        break;
                                    case -1225497657:
                                        obj9 = obj20;
                                        if (next7.equals(obj9)) {
                                            b16 = 2;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        }
                                        obj6 = obj22;
                                        obj5 = obj21;
                                        break;
                                    case -1225497656:
                                        if (next7.equals(str5)) {
                                            b17 = 3;
                                            b16 = b17;
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        } else {
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        }
                                        break;
                                    case -1225497655:
                                        if (next7.equals(str7)) {
                                            b17 = 4;
                                            b16 = b17;
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        } else {
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        }
                                        break;
                                    case -1001078227:
                                        if (next7.equals(str8)) {
                                            b17 = 5;
                                            b16 = b17;
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        } else {
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        }
                                        break;
                                    case -908189618:
                                        if (next7.equals(str6)) {
                                            b17 = 6;
                                            b16 = b17;
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        } else {
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        }
                                        break;
                                    case -908189617:
                                        if (next7.equals("scaleY")) {
                                            b17 = 7;
                                            b16 = b17;
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        } else {
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        }
                                        break;
                                    case -40300674:
                                        if (next7.equals("rotation")) {
                                            b17 = 8;
                                            b16 = b17;
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        } else {
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        }
                                        break;
                                    case -4379043:
                                        if (next7.equals("elevation")) {
                                            b17 = 9;
                                            b16 = b17;
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        } else {
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        }
                                        break;
                                    case 37232917:
                                        if (next7.equals("transitionPathRotate")) {
                                            b17 = 10;
                                            b16 = b17;
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        } else {
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        }
                                        break;
                                    case 92909918:
                                        if (next7.equals("alpha")) {
                                            b17 = 11;
                                            b16 = b17;
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        } else {
                                            obj9 = obj20;
                                            obj6 = obj22;
                                            obj5 = obj21;
                                        }
                                        break;
                                    default:
                                        obj9 = obj20;
                                        obj6 = obj22;
                                        obj5 = obj21;
                                        break;
                                }
                                switch (b16) {
                                    case 0:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37674k)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37674k;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 1:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37675l)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37675l;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 2:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37679p)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37679p;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 3:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37680q)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37680q;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 4:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37681r)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37681r;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 5:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37682s)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37682s;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 6:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37677n)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37677n;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 7:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37678o)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37678o;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 8:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37673j)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37673j;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 9:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37672i)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37672i;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 10:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37676m)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37676m;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    case 11:
                                        jVar = jVar2;
                                        if (!Float.isNaN(jVar.f37671h)) {
                                            i12 = jVar.f37610a;
                                            f12 = jVar.f37671h;
                                            eVar.b(i12, f12, jVar.f37684u, jVar.f37683t, jVar.f37685v);
                                        }
                                        break;
                                    default:
                                        jVar = jVar2;
                                        Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + next7 + "\"");
                                        break;
                                }
                            } else {
                                androidx.constraintlayout.widget.a aVar4 = jVar.f37614e.get(next7.substring(7));
                                if (aVar4 != null) {
                                    x.e.b bVar3 = (x.e.b) eVar;
                                    Iterator<String> it16 = it15;
                                    int i17 = jVar.f37610a;
                                    float f13 = jVar.f37684u;
                                    Object obj23 = obj6;
                                    int i18 = jVar.f37683t;
                                    Object obj24 = obj5;
                                    float f14 = jVar.f37685v;
                                    bVar3.f37325l.append(i17, aVar4);
                                    bVar3.f37326m.append(i17, new float[]{f13, f14});
                                    bVar3.f35637b = Math.max(bVar3.f35637b, i18);
                                    it15 = it16;
                                    obj6 = obj23;
                                    obj5 = obj24;
                                    jVar = jVar;
                                }
                            }
                            it15 = it3;
                            obj20 = obj9;
                        }
                    }
                    it14 = it14;
                    obj20 = obj20;
                    nVar2 = this;
                }
            }
            obj4 = obj20;
            nVar = this;
            for (Iterator<String> it17 = nVar.f37750x.keySet().iterator(); it17.hasNext(); it17 = it17) {
                String next8 = it17.next();
                HashMap<String, Integer> map9 = map7;
                map7 = map9;
                nVar.f37750x.get(next8).c(map9.containsKey(next8) ? map9.get(next8).intValue() : 0);
            }
        }
        int size = nVar.f37747u.size() + 2;
        s[] sVarArr = new s[size];
        sVarArr[0] = nVar.f37732f;
        Object obj25 = obj6;
        sVarArr[size - 1] = nVar.f37733g;
        if (nVar.f37747u.size() > 0 && nVar.f37731e == -1) {
            nVar.f37731e = 0;
        }
        Iterator<s> it18 = nVar.f37747u.iterator();
        int i19 = 1;
        while (it18.hasNext()) {
            sVarArr[i19] = it18.next();
            i19++;
        }
        HashSet hashSet7 = new HashSet();
        Iterator<String> it19 = nVar.f37733g.f37849p.keySet().iterator();
        while (it19.hasNext()) {
            Iterator<String> it20 = it19;
            String next9 = it19.next();
            Object obj26 = obj5;
            if (nVar.f37732f.f37849p.containsKey(next9)) {
                StringBuilder sb2 = new StringBuilder();
                obj8 = obj4;
                sb2.append("CUSTOM,");
                sb2.append(next9);
                String string = sb2.toString();
                hashSet3 = hashSet;
                if (!hashSet3.contains(string)) {
                    hashSet7.add(next9);
                }
            } else {
                obj8 = obj4;
                hashSet3 = hashSet;
            }
            it19 = it20;
            hashSet = hashSet3;
            obj5 = obj26;
            obj4 = obj8;
        }
        Object obj27 = obj4;
        Object obj28 = obj5;
        String[] strArr = (String[]) hashSet7.toArray(new String[0]);
        nVar.f37744r = strArr;
        nVar.f37745s = new int[strArr.length];
        int i20 = 0;
        while (true) {
            String[] strArr2 = nVar.f37744r;
            if (i20 < strArr2.length) {
                String str34 = strArr2[i20];
                nVar.f37745s[i20] = 0;
                for (int i21 = 0; i21 < size; i21++) {
                    if (sVarArr[i21].f37849p.containsKey(str34) && (aVar = sVarArr[i21].f37849p.get(str34)) != null) {
                        int[] iArr = nVar.f37745s;
                        iArr[i20] = aVar.d() + iArr[i20];
                        break;
                    }
                }
                i20++;
            } else {
                boolean z10 = sVarArr[0].f37845l != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i22 = 1;
                while (i22 < size) {
                    String str35 = str5;
                    s sVar2 = sVarArr[i22];
                    String str36 = str7;
                    s sVar3 = sVarArr[i22 - 1];
                    String str37 = str8;
                    String str38 = str6;
                    boolean zB = sVar2.b(sVar2.f37840g, sVar3.f37840g);
                    boolean zB2 = sVar2.b(sVar2.f37841h, sVar3.f37841h);
                    zArr[0] = sVar2.b(sVar2.f37839f, sVar3.f37839f) | zArr[0];
                    boolean z11 = zB | zB2 | z10;
                    zArr[1] = zArr[1] | z11;
                    zArr[2] = z11 | zArr[2];
                    zArr[3] = zArr[3] | sVar2.b(sVar2.f37842i, sVar3.f37842i);
                    zArr[4] = zArr[4] | sVar2.b(sVar2.f37843j, sVar3.f37843j);
                    i22++;
                    str5 = str35;
                    str6 = str38;
                    str28 = str28;
                    str25 = str25;
                    str24 = str24;
                    str7 = str36;
                    str8 = str37;
                }
                String str39 = str6;
                String str40 = str8;
                String str41 = str7;
                String str42 = str24;
                String str43 = str25;
                String str44 = str5;
                String str45 = str28;
                int i23 = 0;
                for (int i24 = 1; i24 < length; i24++) {
                    if (zArr[i24]) {
                        i23++;
                    }
                }
                nVar.f37741o = new int[i23];
                int iMax = Math.max(2, i23);
                nVar.f37742p = new double[iMax];
                nVar.f37743q = new double[iMax];
                int i25 = 0;
                for (int i26 = 1; i26 < length; i26++) {
                    if (zArr[i26]) {
                        nVar.f37741o[i25] = i26;
                        i25++;
                    }
                }
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) double.class, size, nVar.f37741o.length);
                double[] dArr2 = new double[size];
                for (int i27 = 0; i27 < size; i27++) {
                    s sVar4 = sVarArr[i27];
                    double[] dArr3 = dArr[i27];
                    int[] iArr2 = nVar.f37741o;
                    float[] fArr = {sVar4.f37839f, sVar4.f37840g, sVar4.f37841h, sVar4.f37842i, sVar4.f37843j, sVar4.f37844k};
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < iArr2.length) {
                        if (iArr2[i28] < 6) {
                            dArr3[i29] = fArr[iArr2[i28]];
                            i29++;
                        }
                        i28++;
                        sVarArr = sVarArr;
                    }
                    dArr2[i27] = sVarArr[i27].f37838e;
                }
                s[] sVarArr2 = sVarArr;
                int i30 = 0;
                while (true) {
                    int[] iArr3 = nVar.f37741o;
                    if (i30 < iArr3.length) {
                        int i31 = iArr3[i30];
                        String[] strArr3 = s.f37835t;
                        if (i31 < strArr3.length) {
                            String strA = androidx.activity.k.a(new StringBuilder(), strArr3[nVar.f37741o[i30]], " [");
                            for (int i32 = 0; i32 < size; i32++) {
                                StringBuilder sbA2 = defpackage.a.a(strA);
                                sbA2.append(dArr[i32][i30]);
                                strA = sbA2.toString();
                            }
                        }
                        i30++;
                    } else {
                        nVar.f37736j = new t.b[nVar.f37744r.length + 1];
                        int i33 = 0;
                        while (true) {
                            String[] strArr4 = nVar.f37744r;
                            if (i33 >= strArr4.length) {
                                nVar.f37736j[0] = t.b.a(nVar.f37731e, dArr2, dArr);
                                if (sVarArr2[0].f37845l != -1) {
                                    int[] iArr4 = new int[size];
                                    double[] dArr4 = new double[size];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) double.class, size, 2);
                                    for (int i34 = 0; i34 < size; i34++) {
                                        iArr4[i34] = sVarArr2[i34].f37845l;
                                        dArr4[i34] = sVarArr2[i34].f37838e;
                                        dArr5[i34][0] = sVarArr2[i34].f37840g;
                                        dArr5[i34][1] = sVarArr2[i34].f37841h;
                                    }
                                    nVar.f37737k = new t.a(iArr4, dArr4, dArr5);
                                }
                                float f15 = Float.NaN;
                                nVar.f37752z = new HashMap<>();
                                if (nVar.f37749w != null) {
                                    Iterator<String> it21 = hashSet2.iterator();
                                    while (it21.hasNext()) {
                                        String next10 = it21.next();
                                        if (next10.startsWith("CUSTOM")) {
                                            bVar = new x.c.b();
                                            obj25 = obj25;
                                            obj28 = obj28;
                                            str44 = str44;
                                            obj27 = obj27;
                                            str39 = str39;
                                            str45 = str45;
                                            str43 = str43;
                                            str42 = str42;
                                            str16 = str41;
                                            str17 = str40;
                                        } else {
                                            switch (next10.hashCode()) {
                                                case -1249320806:
                                                    obj25 = obj25;
                                                    obj28 = obj28;
                                                    str44 = str44;
                                                    obj27 = obj27;
                                                    str39 = str39;
                                                    str45 = str45;
                                                    str43 = str43;
                                                    str42 = str42;
                                                    str16 = str41;
                                                    str17 = str40;
                                                    b12 = next10.equals(obj25) ? (byte) 0 : (byte) -1;
                                                    break;
                                                case -1249320805:
                                                    obj28 = obj28;
                                                    str44 = str44;
                                                    obj27 = obj27;
                                                    str39 = str39;
                                                    str45 = str45;
                                                    str43 = str43;
                                                    str42 = str42;
                                                    str16 = str41;
                                                    str17 = str40;
                                                    if (next10.equals(obj28)) {
                                                        Object obj29 = obj25;
                                                        b12 = 1;
                                                        obj25 = obj29;
                                                    } else {
                                                        obj25 = obj25;
                                                    }
                                                    break;
                                                case -1225497657:
                                                    str44 = str44;
                                                    obj27 = obj27;
                                                    str39 = str39;
                                                    str45 = str45;
                                                    str43 = str43;
                                                    str42 = str42;
                                                    str16 = str41;
                                                    str17 = str40;
                                                    if (next10.equals(obj27)) {
                                                        obj25 = obj25;
                                                        b12 = 2;
                                                        obj28 = obj28;
                                                    } else {
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                    }
                                                    break;
                                                case -1225497656:
                                                    str44 = str44;
                                                    str39 = str39;
                                                    str45 = str45;
                                                    str43 = str43;
                                                    str42 = str42;
                                                    str16 = str41;
                                                    str17 = str40;
                                                    if (next10.equals(str44)) {
                                                        b13 = 3;
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        b12 = b13;
                                                        obj27 = obj27;
                                                    } else {
                                                        obj27 = obj27;
                                                    }
                                                    break;
                                                case -1225497655:
                                                    str39 = str39;
                                                    str45 = str45;
                                                    str43 = str43;
                                                    str42 = str42;
                                                    str16 = str41;
                                                    str17 = str40;
                                                    if (next10.equals(str16)) {
                                                        str44 = str44;
                                                        b13 = 4;
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        b12 = b13;
                                                        obj27 = obj27;
                                                    } else {
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                    }
                                                    break;
                                                case -1001078227:
                                                    str39 = str39;
                                                    str45 = str45;
                                                    str43 = str43;
                                                    str42 = str42;
                                                    str17 = str40;
                                                    if (next10.equals(str17)) {
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        b12 = 5;
                                                        str16 = str41;
                                                    } else {
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str16 = str41;
                                                    }
                                                    break;
                                                case -908189618:
                                                    str39 = str39;
                                                    str45 = str45;
                                                    str43 = str43;
                                                    str42 = str42;
                                                    if (next10.equals(str39)) {
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str16 = str41;
                                                        b12 = 6;
                                                        str17 = str40;
                                                    } else {
                                                        str17 = str40;
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str16 = str41;
                                                    }
                                                    break;
                                                case -908189617:
                                                    str45 = str45;
                                                    str43 = str43;
                                                    str42 = str42;
                                                    if (next10.equals(str45)) {
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str16 = str41;
                                                        str17 = str40;
                                                        b12 = 7;
                                                        str39 = str39;
                                                    } else {
                                                        str39 = str39;
                                                        str17 = str40;
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str16 = str41;
                                                    }
                                                    break;
                                                case -797520672:
                                                    str43 = str43;
                                                    str42 = str42;
                                                    if (next10.equals("waveVariesBy")) {
                                                        b14 = 8;
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str39 = str39;
                                                        str16 = str41;
                                                        str17 = str40;
                                                        b12 = b14;
                                                        str45 = str45;
                                                    }
                                                    str16 = str41;
                                                    str17 = str40;
                                                    break;
                                                case -40300674:
                                                    str43 = str43;
                                                    str42 = str42;
                                                    if (next10.equals(str43)) {
                                                        b14 = 9;
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str39 = str39;
                                                        str16 = str41;
                                                        str17 = str40;
                                                        b12 = b14;
                                                        str45 = str45;
                                                    }
                                                    str16 = str41;
                                                    str17 = str40;
                                                    break;
                                                case -4379043:
                                                    str42 = str42;
                                                    if (next10.equals(str42)) {
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str39 = str39;
                                                        str45 = str45;
                                                        str16 = str41;
                                                        str17 = str40;
                                                        b12 = 10;
                                                        str43 = str43;
                                                    } else {
                                                        str43 = str43;
                                                        str16 = str41;
                                                        str17 = str40;
                                                    }
                                                    break;
                                                case 37232917:
                                                    if (next10.equals("transitionPathRotate")) {
                                                        b15 = 11;
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str39 = str39;
                                                        str45 = str45;
                                                        str43 = str43;
                                                        str16 = str41;
                                                        str17 = str40;
                                                        b12 = b15;
                                                        str42 = str42;
                                                    }
                                                    str43 = str43;
                                                    str42 = str42;
                                                    str16 = str41;
                                                    str17 = str40;
                                                    break;
                                                case 92909918:
                                                    if (next10.equals("alpha")) {
                                                        b15 = 12;
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str39 = str39;
                                                        str45 = str45;
                                                        str43 = str43;
                                                        str16 = str41;
                                                        str17 = str40;
                                                        b12 = b15;
                                                        str42 = str42;
                                                    }
                                                    str43 = str43;
                                                    str42 = str42;
                                                    str16 = str41;
                                                    str17 = str40;
                                                    break;
                                                case 156108012:
                                                    if (next10.equals("waveOffset")) {
                                                        b15 = 13;
                                                        obj25 = obj25;
                                                        obj28 = obj28;
                                                        str44 = str44;
                                                        obj27 = obj27;
                                                        str39 = str39;
                                                        str45 = str45;
                                                        str43 = str43;
                                                        str16 = str41;
                                                        str17 = str40;
                                                        b12 = b15;
                                                        str42 = str42;
                                                    }
                                                    str43 = str43;
                                                    str42 = str42;
                                                    str16 = str41;
                                                    str17 = str40;
                                                    break;
                                                default:
                                                    str43 = str43;
                                                    str42 = str42;
                                                    str16 = str41;
                                                    str17 = str40;
                                                    break;
                                            }
                                            switch (b12) {
                                                case 0:
                                                    gVar = new x.c.g();
                                                    break;
                                                case 1:
                                                    gVar = new x.c.h();
                                                    break;
                                                case 2:
                                                    gVar = new x.c.k();
                                                    break;
                                                case 3:
                                                    gVar = new x.c.l();
                                                    break;
                                                case 4:
                                                    gVar = new x.c.m();
                                                    break;
                                                case 5:
                                                    gVar = new x.c.e();
                                                    break;
                                                case 6:
                                                    gVar = new x.c.i();
                                                    break;
                                                case 7:
                                                    gVar = new x.c.j();
                                                    break;
                                                case 8:
                                                    gVar = new x.c.a();
                                                    break;
                                                case 9:
                                                    gVar = new x.c.f();
                                                    break;
                                                case 10:
                                                    gVar = new x.c.C0454c();
                                                    break;
                                                case 11:
                                                    gVar = new x.c.d();
                                                    break;
                                                case 12:
                                                    gVar = new x.c.a();
                                                    break;
                                                case 13:
                                                    gVar = new x.c.a();
                                                    break;
                                                default:
                                                    gVar = null;
                                                    break;
                                            }
                                            bVar = gVar;
                                        }
                                        if (bVar == null) {
                                            str45 = str45;
                                            str39 = str39;
                                            str40 = str17;
                                            str41 = str16;
                                        } else {
                                            if ((bVar.f35576e == 1) && Float.isNaN(f15)) {
                                                float[] fArr2 = new float[2];
                                                float f16 = 1.0f / 99;
                                                float fHypot = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                                double d10 = 0.0d;
                                                double d11 = 0.0d;
                                                int i35 = 0;
                                                while (i35 < 100) {
                                                    float f17 = i35 * f16;
                                                    String str46 = str17;
                                                    String str47 = str16;
                                                    double d12 = f17;
                                                    t.c cVar2 = nVar.f37732f.f37836c;
                                                    Iterator<s> it22 = nVar.f37747u.iterator();
                                                    float f18 = Float.NaN;
                                                    float f19 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                                    while (it22.hasNext()) {
                                                        Iterator<s> it23 = it22;
                                                        s next11 = it22.next();
                                                        float f20 = f16;
                                                        t.c cVar3 = next11.f37836c;
                                                        if (cVar3 != null) {
                                                            float f21 = next11.f37838e;
                                                            if (f21 < f17) {
                                                                f19 = f21;
                                                                cVar2 = cVar3;
                                                            } else if (Float.isNaN(f18)) {
                                                                f18 = next11.f37838e;
                                                            }
                                                        }
                                                        it22 = it23;
                                                        f16 = f20;
                                                    }
                                                    float f22 = f16;
                                                    if (cVar2 != null) {
                                                        if (Float.isNaN(f18)) {
                                                            f18 = 1.0f;
                                                        }
                                                        float f23 = f18 - f19;
                                                        dA = (((float) cVar2.a((f17 - f19) / f23)) * f23) + f19;
                                                    } else {
                                                        dA = d12;
                                                    }
                                                    nVar.f37736j[0].c(dA, nVar.f37742p);
                                                    String str48 = str39;
                                                    nVar.f37732f.c(dA, nVar.f37741o, nVar.f37742p, fArr2, 0);
                                                    if (i35 > 0) {
                                                        fHypot = (float) (Math.hypot(d10 - ((double) fArr2[1]), d11 - ((double) fArr2[0])) + ((double) fHypot));
                                                    }
                                                    i35++;
                                                    d11 = fArr2[0];
                                                    d10 = fArr2[1];
                                                    str45 = str45;
                                                    str16 = str47;
                                                    f16 = f22;
                                                    str39 = str48;
                                                    str17 = str46;
                                                }
                                                str45 = str45;
                                                str18 = str39;
                                                str19 = str17;
                                                str20 = str16;
                                                f15 = fHypot;
                                            } else {
                                                str45 = str45;
                                                str18 = str39;
                                                str19 = str17;
                                                str20 = str16;
                                            }
                                            bVar.f35573b = next10;
                                            nVar.f37752z.put(next10, bVar);
                                            str40 = str19;
                                            str41 = str20;
                                            str39 = str18;
                                        }
                                    }
                                    String str49 = str44;
                                    Object obj30 = obj27;
                                    String str50 = str39;
                                    String str51 = str43;
                                    String str52 = str42;
                                    String str53 = str41;
                                    String str54 = str40;
                                    Iterator<d> it24 = nVar.f37749w.iterator();
                                    while (it24.hasNext()) {
                                        d next12 = it24.next();
                                        if (next12 instanceof f) {
                                            f fVar = (f) next12;
                                            HashMap<String, x.c> map10 = nVar.f37752z;
                                            Objects.requireNonNull(fVar);
                                            Iterator<String> it25 = map10.keySet().iterator();
                                            while (it25.hasNext()) {
                                                String next13 = it25.next();
                                                if (next13.startsWith("CUSTOM")) {
                                                    androidx.constraintlayout.widget.a aVar5 = fVar.f37614e.get(next13.substring(7));
                                                    if (aVar5 != null) {
                                                        if (aVar5.f1486c == androidx.constraintlayout.widget.a.b.FLOAT_TYPE && (cVar = map10.get(next13)) != null) {
                                                            int i36 = fVar.f37610a;
                                                            int i37 = fVar.f37634h;
                                                            String str55 = fVar.f37635i;
                                                            int i38 = fVar.f37640n;
                                                            it = it24;
                                                            it2 = it25;
                                                            f10 = f15;
                                                            HashMap<String, x.c> map11 = map10;
                                                            cVar.f35577f.add(new t.e.c(i36, fVar.f37636j, fVar.f37637k, fVar.f37638l, aVar5.a()));
                                                            if (i38 != -1) {
                                                                cVar.f35576e = i38;
                                                            }
                                                            cVar.f35574c = i37;
                                                            cVar.b(aVar5);
                                                            cVar.f35575d = str55;
                                                            str9 = str54;
                                                            obj25 = obj25;
                                                            obj28 = obj28;
                                                            map = map11;
                                                            str10 = str45;
                                                            obj7 = obj30;
                                                            str11 = str53;
                                                        } else {
                                                            str9 = str54;
                                                            f10 = f15;
                                                            it = it24;
                                                            map = map10;
                                                            it2 = it25;
                                                            obj25 = obj25;
                                                            obj28 = obj28;
                                                            str10 = str45;
                                                            obj7 = obj30;
                                                            str11 = str53;
                                                        }
                                                        it24 = it;
                                                        fVar = fVar;
                                                        map10 = map;
                                                        obj30 = obj7;
                                                        str45 = str10;
                                                        str52 = str52;
                                                        it25 = it2;
                                                        f15 = f10;
                                                        str51 = str51;
                                                        str53 = str11;
                                                        str54 = str9;
                                                        obj28 = obj28;
                                                        obj25 = obj25;
                                                    }
                                                } else {
                                                    f10 = f15;
                                                    it = it24;
                                                    HashMap<String, x.c> map12 = map10;
                                                    it2 = it25;
                                                    switch (next13.hashCode()) {
                                                        case -1249320806:
                                                            str54 = str54;
                                                            obj25 = obj25;
                                                            obj28 = obj28;
                                                            str12 = str45;
                                                            obj7 = obj30;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            b10 = next13.equals(obj25) ? (byte) 0 : (byte) -1;
                                                            break;
                                                        case -1249320805:
                                                            str54 = str54;
                                                            obj28 = obj28;
                                                            str12 = str45;
                                                            obj7 = obj30;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            if (next13.equals(obj28)) {
                                                                b10 = 1;
                                                                obj25 = obj25;
                                                            } else {
                                                                obj25 = obj25;
                                                            }
                                                            break;
                                                        case -1225497657:
                                                            str54 = str54;
                                                            str12 = str45;
                                                            obj7 = obj30;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            if (next13.equals(obj7)) {
                                                                b10 = 2;
                                                                obj25 = obj25;
                                                                obj28 = obj28;
                                                            } else {
                                                                obj25 = obj25;
                                                                obj28 = obj28;
                                                            }
                                                            break;
                                                        case -1225497656:
                                                            str54 = str54;
                                                            str12 = str45;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            obj25 = obj25;
                                                            obj28 = obj28;
                                                            if (next13.equals(str13)) {
                                                                obj7 = obj30;
                                                                b10 = 3;
                                                            } else {
                                                                obj7 = obj30;
                                                            }
                                                            break;
                                                        case -1225497655:
                                                            str54 = str54;
                                                            str12 = str45;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            if (next13.equals(str14)) {
                                                                obj25 = obj25;
                                                                obj28 = obj28;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                b10 = 4;
                                                            } else {
                                                                obj25 = obj25;
                                                                obj28 = obj28;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                            }
                                                            break;
                                                        case -1001078227:
                                                            str54 = str54;
                                                            str12 = str45;
                                                            str15 = str50;
                                                            if (next13.equals(str54)) {
                                                                b10 = 5;
                                                                obj25 = obj25;
                                                                obj28 = obj28;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                            } else {
                                                                str14 = str53;
                                                                obj25 = obj25;
                                                                obj28 = obj28;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                            }
                                                            break;
                                                        case -908189618:
                                                            str12 = str45;
                                                            str15 = str50;
                                                            if (next13.equals(str15)) {
                                                                b10 = 6;
                                                                obj25 = obj25;
                                                                obj28 = obj28;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                                str54 = str54;
                                                            } else {
                                                                str54 = str54;
                                                                obj25 = obj25;
                                                                obj28 = obj28;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                            }
                                                            break;
                                                        case -908189617:
                                                            str12 = str45;
                                                            if (next13.equals(str12)) {
                                                                b10 = 7;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                                str15 = str50;
                                                            } else {
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                                str15 = str50;
                                                            }
                                                            break;
                                                        case -40300674:
                                                            if (next13.equals(str51)) {
                                                                b11 = 8;
                                                                b10 = b11;
                                                                str12 = str45;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                                str15 = str50;
                                                            }
                                                            str12 = str45;
                                                            obj7 = obj30;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            break;
                                                        case -4379043:
                                                            if (next13.equals(str52)) {
                                                                b11 = 9;
                                                                b10 = b11;
                                                                str12 = str45;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                                str15 = str50;
                                                            }
                                                            str12 = str45;
                                                            obj7 = obj30;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            break;
                                                        case 37232917:
                                                            if (next13.equals("transitionPathRotate")) {
                                                                b11 = 10;
                                                                b10 = b11;
                                                                str12 = str45;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                                str15 = str50;
                                                            }
                                                            str12 = str45;
                                                            obj7 = obj30;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            break;
                                                        case 92909918:
                                                            if (next13.equals("alpha")) {
                                                                b11 = 11;
                                                                b10 = b11;
                                                                str12 = str45;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                                str15 = str50;
                                                            }
                                                            str12 = str45;
                                                            obj7 = obj30;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            break;
                                                        case 156108012:
                                                            if (next13.equals("waveOffset")) {
                                                                b11 = 12;
                                                                b10 = b11;
                                                                str12 = str45;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                                str15 = str50;
                                                            }
                                                            str12 = str45;
                                                            obj7 = obj30;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            break;
                                                        case 1530034690:
                                                            if (next13.equals("wavePhase")) {
                                                                b11 = 13;
                                                                b10 = b11;
                                                                str12 = str45;
                                                                obj7 = obj30;
                                                                str13 = str49;
                                                                str14 = str53;
                                                                str15 = str50;
                                                            }
                                                            str12 = str45;
                                                            obj7 = obj30;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            break;
                                                        default:
                                                            str12 = str45;
                                                            obj7 = obj30;
                                                            str13 = str49;
                                                            str14 = str53;
                                                            str15 = str50;
                                                            break;
                                                    }
                                                    switch (b10) {
                                                        case 0:
                                                            f11 = fVar.f37645s;
                                                            break;
                                                        case 1:
                                                            f11 = fVar.f37646t;
                                                            break;
                                                        case 2:
                                                            f11 = fVar.f37649w;
                                                            break;
                                                        case 3:
                                                            f11 = fVar.f37650x;
                                                            break;
                                                        case 4:
                                                            f11 = fVar.f37651y;
                                                            break;
                                                        case 5:
                                                            f11 = fVar.f37639m;
                                                            break;
                                                        case 6:
                                                            f11 = fVar.f37647u;
                                                            break;
                                                        case 7:
                                                            f11 = fVar.f37648v;
                                                            break;
                                                        case 8:
                                                            f11 = fVar.f37643q;
                                                            break;
                                                        case 9:
                                                            f11 = fVar.f37642p;
                                                            break;
                                                        case 10:
                                                            f11 = fVar.f37644r;
                                                            break;
                                                        case 11:
                                                            f11 = fVar.f37641o;
                                                            break;
                                                        case 12:
                                                            f11 = fVar.f37637k;
                                                            break;
                                                        case 13:
                                                            f11 = fVar.f37638l;
                                                            break;
                                                        default:
                                                            if (!next13.startsWith("CUSTOM")) {
                                                                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + next13);
                                                            }
                                                            f11 = Float.NaN;
                                                            break;
                                                    }
                                                    float f24 = f11;
                                                    if (Float.isNaN(f24)) {
                                                        map = map12;
                                                    } else {
                                                        map = map12;
                                                        x.c cVar4 = map.get(next13);
                                                        if (cVar4 != null) {
                                                            int i39 = fVar.f37610a;
                                                            str10 = str12;
                                                            int i40 = fVar.f37634h;
                                                            str50 = str15;
                                                            String str56 = fVar.f37635i;
                                                            str9 = str54;
                                                            int i41 = fVar.f37640n;
                                                            str11 = str14;
                                                            str49 = str13;
                                                            cVar4.f35577f.add(new t.e.c(i39, fVar.f37636j, fVar.f37637k, fVar.f37638l, f24));
                                                            if (i41 != -1) {
                                                                cVar4.f35576e = i41;
                                                            }
                                                            cVar4.f35574c = i40;
                                                            cVar4.f35575d = str56;
                                                            it24 = it;
                                                            fVar = fVar;
                                                            map10 = map;
                                                            obj30 = obj7;
                                                            str45 = str10;
                                                            str52 = str52;
                                                            it25 = it2;
                                                            f15 = f10;
                                                            str51 = str51;
                                                            str53 = str11;
                                                            str54 = str9;
                                                            obj28 = obj28;
                                                            obj25 = obj25;
                                                        }
                                                    }
                                                    str45 = str12;
                                                    str50 = str15;
                                                    str54 = str54;
                                                    str53 = str14;
                                                    str49 = str13;
                                                    map10 = map;
                                                    obj30 = obj7;
                                                    obj28 = obj28;
                                                    obj25 = obj25;
                                                    it25 = it2;
                                                    f15 = f10;
                                                    it24 = it;
                                                }
                                            }
                                        }
                                        nVar = this;
                                        it24 = it24;
                                        obj30 = obj30;
                                        str45 = str45;
                                        str52 = str52;
                                        f15 = f15;
                                        str51 = str51;
                                        str53 = str53;
                                        str54 = str54;
                                        obj28 = obj28;
                                        obj25 = obj25;
                                    }
                                    float f25 = f15;
                                    Iterator<x.c> it26 = nVar.f37752z.values().iterator();
                                    while (it26.hasNext()) {
                                        it26.next().c(f25);
                                    }
                                    return;
                                }
                                return;
                            }
                            String str57 = strArr4[i33];
                            int i42 = 0;
                            int i43 = 0;
                            double[] dArr6 = null;
                            double[][] dArr7 = null;
                            while (i42 < size) {
                                if (sVarArr2[i42].f37849p.containsKey(str57)) {
                                    if (dArr7 == null) {
                                        dArr6 = new double[size];
                                        androidx.constraintlayout.widget.a aVar6 = sVarArr2[i42].f37849p.get(str57);
                                        dArr7 = (double[][]) Array.newInstance((Class<?>) double.class, size, aVar6 == null ? 0 : aVar6.d());
                                    }
                                    dArr6[i43] = sVarArr2[i42].f37838e;
                                    s sVar5 = sVarArr2[i42];
                                    double[] dArr8 = dArr7[i43];
                                    androidx.constraintlayout.widget.a aVar7 = sVar5.f37849p.get(str57);
                                    if (aVar7 != null) {
                                        if (aVar7.d() == 1) {
                                            dArr8[0] = aVar7.a();
                                        } else {
                                            int iD = aVar7.d();
                                            float[] fArr3 = new float[iD];
                                            aVar7.b(fArr3);
                                            int i44 = 0;
                                            int i45 = 0;
                                            while (i44 < iD) {
                                                dArr8[i45] = fArr3[i44];
                                                i44++;
                                                str57 = str57;
                                                dArr6 = dArr6;
                                                i45++;
                                                dArr7 = dArr7;
                                            }
                                        }
                                    }
                                    str21 = str57;
                                    i43++;
                                    dArr6 = dArr6;
                                    dArr7 = dArr7;
                                } else {
                                    str21 = str57;
                                }
                                i42++;
                                str57 = str21;
                            }
                            i33++;
                            nVar.f37736j[i33] = t.b.a(nVar.f37731e, Arrays.copyOf(dArr6, i43), (double[][]) Arrays.copyOf(dArr7, i43));
                        }
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a(" start: x: ");
        sbA.append(this.f37732f.f37840g);
        sbA.append(" y: ");
        sbA.append(this.f37732f.f37841h);
        sbA.append(" end: x: ");
        sbA.append(this.f37733g.f37840g);
        sbA.append(" y: ");
        sbA.append(this.f37733g.f37841h);
        return sbA.toString();
    }
}
