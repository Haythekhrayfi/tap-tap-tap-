package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public class Gg extends ResultReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14099b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Eg f14100a;

    public Gg(Handler handler, Eg eg) {
        super(handler);
        this.f14100a = eg;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            Fg fgA = null;
            try {
                fgA = Fg.a(bundle.getByteArray("referrer"));
            } catch (Throwable unused) {
            }
            this.f14100a.a(fgA);
        }
    }
}
