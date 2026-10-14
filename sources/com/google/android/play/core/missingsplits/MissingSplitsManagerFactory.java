package com.google.android.play.core.missingsplits;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class MissingSplitsManagerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<Boolean> f12311a = new AtomicReference<>(null);

    public static MissingSplitsManager create(Context context) {
        return new b(context, Runtime.getRuntime(), new a(context, context.getPackageManager()), f12311a);
    }
}
