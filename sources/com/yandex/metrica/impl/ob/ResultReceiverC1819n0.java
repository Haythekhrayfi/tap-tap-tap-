package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public class ResultReceiverC1819n0 extends ResultReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16905b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f16906a;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n0$a */
    public interface a {
        void a(int i10, Bundle bundle);
    }

    public ResultReceiverC1819n0(Handler handler, a aVar) {
        super(handler);
        this.f16906a = aVar;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i10, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.setClassLoader(Il.class.getClassLoader());
        this.f16906a.a(i10, bundle);
    }
}
