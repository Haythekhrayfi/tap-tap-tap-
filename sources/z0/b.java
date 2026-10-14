package z0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f44978a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Editable.Factory f44979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f44980c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f44980c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f44980c;
        return cls != null ? new o(cls, charSequence) : super.newEditable(charSequence);
    }
}
