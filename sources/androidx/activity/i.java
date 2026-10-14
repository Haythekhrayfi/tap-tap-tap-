package androidx.activity;

import android.app.AppOpsManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.h1;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.p;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.a2;
import fd.c0;
import fd.j0;
import fd.s0;
import fd.s1;
import java.io.Serializable;
import kd.q;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class i {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle a(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = (String) pair.f31811c;
            B b10 = pair.f31812d;
            if (b10 == 0) {
                bundle.putString(str, null);
            } else if (b10 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Byte) {
                bundle.putByte(str, ((Number) b10).byteValue());
            } else if (b10 instanceof Character) {
                bundle.putChar(str, ((Character) b10).charValue());
            } else if (b10 instanceof Double) {
                bundle.putDouble(str, ((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                bundle.putFloat(str, ((Number) b10).floatValue());
            } else if (b10 instanceof Integer) {
                bundle.putInt(str, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                bundle.putLong(str, ((Number) b10).longValue());
            } else if (b10 instanceof Short) {
                bundle.putShort(str, ((Number) b10).shortValue());
            } else if (b10 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b10);
            } else if (b10 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b10);
            } else if (b10 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b10);
            } else if (b10 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b10);
            } else if (b10 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b10);
            } else if (b10 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b10);
            } else if (b10 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b10);
            } else if (b10 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b10);
            } else if (b10 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b10);
            } else if (b10 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b10);
            } else if (b10 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b10);
            } else if (b10 instanceof Object[]) {
                Class<?> componentType = b10.getClass().getComponentType();
                j0.f(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b10);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b10);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b10);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
                    }
                    bundle.putSerializable(str, (Serializable) b10);
                }
            } else if (b10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b10);
            } else if (b10 instanceof IBinder) {
                l0.b.a(bundle, str, (IBinder) b10);
            } else if (b10 instanceof Size) {
                l0.c.a(bundle, str, (Size) b10);
            } else {
                if (!(b10 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b10.getClass().getCanonicalName() + " for key \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
                }
                l0.c.b(bundle, str, (SizeF) b10);
            }
        }
        return bundle;
    }

    public static void b(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public static int e(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> T f(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int g(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strD = d0.i.d(str);
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (!(Process.myUid() == iMyUid && o0.b.a(context.getPackageName(), packageName)) || Build.VERSION.SDK_INT < 29) {
                iC = d0.i.c((AppOpsManager) d0.i.a(context, AppOpsManager.class), strD, packageName);
            } else {
                AppOpsManager appOpsManagerC = d0.j.c(context);
                iC = d0.j.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                if (iC == 0) {
                    iC = d0.j.a(appOpsManagerC, strD, iMyUid, d0.j.b(context));
                }
            }
            if (iC != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void h(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static float i(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static int j(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static int k(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static final androidx.lifecycle.k l(p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        s1 s1Var;
        j0.i(pVar, "<this>");
        androidx.lifecycle.i lifecycle = pVar.getLifecycle();
        j0.h(lifecycle, "lifecycle");
        j0.i(lifecycle, "<this>");
        do {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.f2204a.get();
            if (lifecycleCoroutineScopeImpl == null) {
                a2 a2Var = new a2(null);
                c0 c0Var = s0.f29619a;
                s1Var = q.f32064a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, mc.f.a.C0363a.d(a2Var, s1Var.e0()));
            }
            return lifecycleCoroutineScopeImpl;
        } while (!lifecycle.f2204a.compareAndSet(null, lifecycleCoroutineScopeImpl));
        y8.c0.z(lifecycleCoroutineScopeImpl, s1Var.e0(), null, new androidx.lifecycle.l(lifecycleCoroutineScopeImpl, null), 2, null);
        return lifecycleCoroutineScopeImpl;
    }

    public static InputConnection m(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof h1) {
                    editorInfo.hintText = ((h1) parent).a();
                    break;
                }
            }
        }
        return inputConnection;
    }

    public static final void n(View view, m1.d dVar) {
        j0.i(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, dVar);
    }
}
