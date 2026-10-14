package r1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f35140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property<View, Float> f35141b;

    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(u.a(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f10) {
            float fFloatValue = f10.floatValue();
            u.f35140a.e(view, fFloatValue);
        }
    }

    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            return e0.f.a(view);
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.f.c(view, rect);
        }
    }

    static {
        f35140a = Build.VERSION.SDK_INT >= 29 ? new z() : new y();
        f35141b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return f35140a.b(view);
    }

    public static void b(View view, int i10, int i11, int i12, int i13) {
        f35140a.d(view, i10, i11, i12, i13);
    }
}
