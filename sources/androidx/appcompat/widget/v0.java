package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public class v0 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1371a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof v0) && !(context.getResources() instanceof x0) && !(context.getResources() instanceof f1)) {
            int i10 = f1.f1218c;
        }
        return context;
    }
}
