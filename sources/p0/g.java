package p0;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.inscode.autoclicker.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f34374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f34375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f34376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f34377d;

    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = e0.s.f34369d;
            e0.s sVar = (e0.s) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (sVar == null) {
                sVar = new e0.s();
                view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
            }
            WeakReference<KeyEvent> weakReference = sVar.f34372c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                sVar.f34372c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReferenceValueAt = null;
                if (sVar.f34371b == null) {
                    sVar.f34371b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = sVar.f34371b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReferenceValueAt = sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReferenceValueAt == null) {
                    weakReferenceValueAt = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReferenceValueAt != null) {
                    View view2 = weakReferenceValueAt.get();
                    if (view2 == null || !e0.g.b(view2)) {
                        return true;
                    }
                    sVar.b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"LambdaLast"})
    public static boolean b(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f34374a) {
                        try {
                            f34375b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f34374a = true;
                    }
                    Method method = f34375b;
                    if (method != null) {
                        try {
                            Object objInvoke = method.invoke(actionBar, keyEvent);
                            if (objInvoke != null) {
                                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (zBooleanValue) {
                        return true;
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (e0.d(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && e0.d(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f34376c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f34377d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f34376c = true;
        }
        Field field = f34377d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (e0.d(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }
}
