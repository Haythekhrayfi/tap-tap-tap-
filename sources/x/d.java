package x;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends t.j {

    public static class a extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setAlpha((float) this.f35608a.b(f10, 0));
        }
    }

    public static class b extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.a> f37321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float[] f37322g;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f37321f = sparseArray;
        }

        @Override // t.j
        public void b(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // t.j
        public void c(int i10) {
            int size = this.f37321f.size();
            int iD = this.f37321f.valueAt(0).d();
            double[] dArr = new double[size];
            this.f37322g = new float[iD];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, iD);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.f37321f.keyAt(i11);
                androidx.constraintlayout.widget.a aVarValueAt = this.f37321f.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.b(this.f37322g);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f37322g;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f35608a = t.b.a(i10, dArr, dArr2);
        }

        @Override // x.d
        public void d(View view, float f10) {
            this.f35608a.d(f10, this.f37322g);
            x.a.b(this.f37321f.valueAt(0), view, this.f37322g);
        }
    }

    public static class c extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setElevation((float) this.f35608a.b(f10, 0));
        }
    }

    /* JADX INFO: renamed from: x.d$d, reason: collision with other inner class name */
    public static class C0455d extends d {
        @Override // x.d
        public void d(View view, float f10) {
        }
    }

    public static class e extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setPivotX((float) this.f35608a.b(f10, 0));
        }
    }

    public static class f extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setPivotY((float) this.f35608a.b(f10, 0));
        }
    }

    public static class g extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f37323f = false;

        @Override // x.d
        public void d(View view, float f10) {
            if (view instanceof r) {
                ((r) view).setProgress((float) this.f35608a.b(f10, 0));
                return;
            }
            if (this.f37323f) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f37323f = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf((float) this.f35608a.b(f10, 0)));
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    Log.e("ViewSpline", "unable to setProgress", e10);
                }
            }
        }
    }

    public static class h extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setRotation((float) this.f35608a.b(f10, 0));
        }
    }

    public static class i extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setRotationX((float) this.f35608a.b(f10, 0));
        }
    }

    public static class j extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setRotationY((float) this.f35608a.b(f10, 0));
        }
    }

    public static class k extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setScaleX((float) this.f35608a.b(f10, 0));
        }
    }

    public static class l extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setScaleY((float) this.f35608a.b(f10, 0));
        }
    }

    public static class m extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setTranslationX((float) this.f35608a.b(f10, 0));
        }
    }

    public static class n extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setTranslationY((float) this.f35608a.b(f10, 0));
        }
    }

    public static class o extends d {
        @Override // x.d
        public void d(View view, float f10) {
            view.setTranslationZ((float) this.f35608a.b(f10, 0));
        }
    }

    public abstract void d(View view, float f10);
}
