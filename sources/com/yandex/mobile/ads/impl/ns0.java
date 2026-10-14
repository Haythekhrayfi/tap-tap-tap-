package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class ns0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f23540a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ks0 f23541b = new ks0();

    private boolean a(Context context, js0 js0Var) {
        try {
            Objects.requireNonNull(this.f23541b);
            context.startActivity(ks0.a(js0Var));
            return true;
        } catch (Exception unused) {
            x60.c("Failed to open preferred package %s", js0Var.b());
            return false;
        }
    }

    public final boolean a(Context context, List<js0> list) {
        Objects.requireNonNull(this.f23540a);
        int i10 = 0;
        while (true) {
            if (context instanceof ContextWrapper) {
                int i11 = i10 + 1;
                if (i10 < 10) {
                    if (context instanceof Activity) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    i10 = i11;
                }
            }
            context = null;
            break;
        }
        if (context != null) {
            Iterator<js0> it = list.iterator();
            while (it.hasNext()) {
                if (a(context, it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
