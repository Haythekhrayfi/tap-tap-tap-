package r1;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f35034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f35035b;

    public void a(View view) {
        throw null;
    }

    public float b(View view) {
        throw null;
    }

    public void c(View view) {
        throw null;
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        throw null;
    }

    public void e(View view, float f10) {
        throw null;
    }

    public void f(View view, int i10) {
        if (!f35035b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f35034a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f35035b = true;
        }
        Field field = f35034a;
        if (field != null) {
            try {
                f35034a.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }
}
