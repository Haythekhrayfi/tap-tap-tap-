package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f476g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f477c;

    @Override // androidx.lifecycle.n
    public void g(p pVar, androidx.lifecycle.i.b bVar) {
        if (bVar != androidx.lifecycle.i.b.ON_DESTROY) {
            return;
        }
        if (f473d == 0) {
            try {
                f473d = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f475f = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f476g = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f474e = declaredField3;
                declaredField3.setAccessible(true);
                f473d = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f473d == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f477c.getSystemService("input_method");
            try {
                Object obj = f474e.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f475f.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f476g.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
