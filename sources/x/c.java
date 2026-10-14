package x;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends t.e {

    public static class a extends c {
        @Override // x.c
        public void d(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    public static class b extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float[] f37318g = new float[1];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public androidx.constraintlayout.widget.a f37319h;

        @Override // t.e
        public void b(Object obj) {
            this.f37319h = (androidx.constraintlayout.widget.a) obj;
        }

        @Override // x.c
        public void d(View view, float f10) {
            this.f37318g[0] = a(f10);
            x.a.b(this.f37319h, view, this.f37318g);
        }
    }

    /* JADX INFO: renamed from: x.c$c, reason: collision with other inner class name */
    public static class C0454c extends c {
        @Override // x.c
        public void d(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    public static class d extends c {
        @Override // x.c
        public void d(View view, float f10) {
        }
    }

    public static class e extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f37320g = false;

        @Override // x.c
        public void d(View view, float f10) {
            if (view instanceof r) {
                ((r) view).setProgress(a(f10));
                return;
            }
            if (this.f37320g) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f37320g = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    Log.e("ViewOscillator", "unable to setProgress", e10);
                }
            }
        }
    }

    public static class f extends c {
        @Override // x.c
        public void d(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    public static class g extends c {
        @Override // x.c
        public void d(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    public static class h extends c {
        @Override // x.c
        public void d(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    public static class i extends c {
        @Override // x.c
        public void d(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    public static class j extends c {
        @Override // x.c
        public void d(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    public static class k extends c {
        @Override // x.c
        public void d(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    public static class l extends c {
        @Override // x.c
        public void d(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    public static class m extends c {
        @Override // x.c
        public void d(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public abstract void d(View view, float f10);
}
