package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class v91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u91 f25920a;

    public v91() {
        this(new u91());
    }

    public v91(u91 u91Var) {
        fd.j0.i(u91Var, "intentCreator");
        this.f25920a = u91Var;
    }

    public final boolean a(Context context, String str) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(str, ImagesContract.URL);
        try {
            Objects.requireNonNull(this.f25920a);
            context.startActivity(u91.a(context, str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
