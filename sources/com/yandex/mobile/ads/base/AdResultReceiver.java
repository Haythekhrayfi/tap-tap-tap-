package com.yandex.mobile.ads.base;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.impl.o2;
import com.yandex.mobile.ads.impl.x60;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class AdResultReceiver extends ResultReceiver implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<o2> f18207a;

    public AdResultReceiver(Handler handler) {
        super(handler);
        this.f18207a = new WeakReference<>(null);
    }

    public final void a(o2 o2Var) {
        this.f18207a = new WeakReference<>(o2Var);
    }

    @Override // android.os.ResultReceiver, com.yandex.mobile.ads.impl.o2
    public final void onReceiveResult(int i10, Bundle bundle) {
        o2 o2Var;
        WeakReference<o2> weakReference = this.f18207a;
        if (weakReference == null || (o2Var = weakReference.get()) == null) {
            return;
        }
        o2Var.onReceiveResult(i10, bundle);
        x60.d("Result was obtained in the receiver, result code: %d", Integer.valueOf(i10));
    }
}
