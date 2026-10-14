package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;

/* JADX INFO: loaded from: classes3.dex */
public final class df1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f19855c = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile df1 f19856d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xw0 f19858b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public final df1 a(Context context) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            df1 df1Var = df1.f19856d;
            if (df1Var == null) {
                synchronized (this) {
                    df1Var = df1.f19856d;
                    if (df1Var == null) {
                        df1Var = new df1(context, 0);
                        df1.f19856d = df1Var;
                    }
                }
            }
            return df1Var;
        }
    }

    private df1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f19857a = applicationContext;
        this.f19858b = ik1.a(applicationContext, 4);
    }

    public /* synthetic */ df1(Context context, int i10) {
        this(context);
    }

    public final void a(String str) {
        fd.j0.i(str, ImagesContract.URL);
        this.f19858b.a(gi1.a(this.f19857a, str));
    }
}
