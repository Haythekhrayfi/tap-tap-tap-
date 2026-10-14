package x;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import t.o;
import y.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends o {

    public static class a extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            view.setAlpha(d(f10, j10, view, dVar));
            return this.f35643h;
        }
    }

    public static class b extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f37324k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.a> f37325l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public SparseArray<float[]> f37326m = new SparseArray<>();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float[] f37327n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float[] f37328o;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f37324k = str.split(",")[1];
            this.f37325l = sparseArray;
        }

        @Override // t.o
        public void b(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // t.o
        public void c(int i10) {
            int size = this.f37325l.size();
            int iD = this.f37325l.valueAt(0).d();
            double[] dArr = new double[size];
            int i11 = iD + 2;
            this.f37327n = new float[i11];
            this.f37328o = new float[iD];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = this.f37325l.keyAt(i12);
                androidx.constraintlayout.widget.a aVarValueAt = this.f37325l.valueAt(i12);
                float[] fArrValueAt = this.f37326m.valueAt(i12);
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.b(this.f37327n);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f37327n;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                dArr2[i12][iD] = fArrValueAt[0];
                dArr2[i12][iD + 1] = fArrValueAt[1];
            }
            this.f35636a = t.b.a(i10, dArr, dArr2);
        }

        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            this.f35636a.d(f10, this.f37327n);
            float[] fArr = this.f37327n;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f35644i;
            if (Float.isNaN(this.f35645j)) {
                float fA = dVar.a(view, this.f37324k, 0);
                this.f35645j = fA;
                if (Float.isNaN(fA)) {
                    this.f35645j = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
            }
            float f13 = (float) ((((j11 * 1.0E-9d) * ((double) f11)) + ((double) this.f35645j)) % 1.0d);
            this.f35645j = f13;
            this.f35644i = j10;
            float fA2 = a(f13);
            this.f35643h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f37328o;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f35643h;
                float[] fArr3 = this.f37327n;
                this.f35643h = z10 | (((double) fArr3[i10]) != 0.0d);
                fArr2[i10] = (fArr3[i10] * fA2) + f12;
                i10++;
            }
            x.a.b(this.f37325l.valueAt(0), view, this.f37328o);
            if (f11 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                this.f35643h = true;
            }
            return this.f35643h;
        }
    }

    public static class c extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            view.setElevation(d(f10, j10, view, dVar));
            return this.f35643h;
        }
    }

    public static class d extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            return this.f35643h;
        }
    }

    /* JADX INFO: renamed from: x.e$e, reason: collision with other inner class name */
    public static class C0456e extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f37329k = false;

        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            if (view instanceof r) {
                ((r) view).setProgress(d(f10, j10, view, dVar));
            } else {
                if (this.f37329k) {
                    return false;
                }
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f37329k = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(d(f10, j10, view, dVar)));
                    } catch (IllegalAccessException | InvocationTargetException e10) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e10);
                    }
                }
            }
            return this.f35643h;
        }
    }

    public static class f extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            view.setRotation(d(f10, j10, view, dVar));
            return this.f35643h;
        }
    }

    public static class g extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            view.setRotationX(d(f10, j10, view, dVar));
            return this.f35643h;
        }
    }

    public static class h extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            view.setRotationY(d(f10, j10, view, dVar));
            return this.f35643h;
        }
    }

    public static class i extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            view.setScaleX(d(f10, j10, view, dVar));
            return this.f35643h;
        }
    }

    public static class j extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            view.setScaleY(d(f10, j10, view, dVar));
            return this.f35643h;
        }
    }

    public static class k extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            view.setTranslationX(d(f10, j10, view, dVar));
            return this.f35643h;
        }
    }

    public static class l extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            view.setTranslationY(d(f10, j10, view, dVar));
            return this.f35643h;
        }
    }

    public static class m extends e {
        @Override // x.e
        public boolean e(View view, float f10, long j10, t.d dVar) {
            view.setTranslationZ(d(f10, j10, view, dVar));
            return this.f35643h;
        }
    }

    public float d(float f10, long j10, View view, t.d dVar) {
        HashMap<String, float[]> map;
        float f11;
        this.f35636a.d(f10, this.f35642g);
        float[] fArr = this.f35642g;
        boolean z10 = true;
        float f12 = fArr[1];
        if (f12 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            this.f35643h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f35645j)) {
            float fA = dVar.a(view, this.f35641f, 0);
            this.f35645j = fA;
            if (Float.isNaN(fA)) {
                this.f35645j = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
        }
        float f13 = (float) (((((j10 - this.f35644i) * 1.0E-9d) * ((double) f12)) + ((double) this.f35645j)) % 1.0d);
        this.f35645j = f13;
        String str = this.f35641f;
        if (dVar.f35571a.containsKey(view)) {
            map = dVar.f35571a.get(view);
            if (map == null) {
                map = new HashMap<>();
            }
            if (map.containsKey(str)) {
                float[] fArrCopyOf = map.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f13;
                map.put(str, fArrCopyOf);
            } else {
                map.put(str, new float[]{f13});
            }
            this.f35644i = j10;
            f11 = this.f35642g[0];
            float fA2 = (a(this.f35645j) * f11) + this.f35642g[2];
            if (f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f12 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                z10 = false;
            }
            this.f35643h = z10;
            return fA2;
        }
        map = new HashMap<>();
        map.put(str, new float[]{f13});
        dVar.f35571a.put(view, map);
        this.f35644i = j10;
        f11 = this.f35642g[0];
        float fA3 = (a(this.f35645j) * f11) + this.f35642g[2];
        if (f11 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            z10 = false;
        }
        this.f35643h = z10;
        return fA3;
    }

    public abstract boolean e(View view, float f10, long j10, t.d dVar);
}
