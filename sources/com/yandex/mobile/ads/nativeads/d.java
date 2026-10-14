package com.yandex.mobile.ads.nativeads;

import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.gi;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.x51;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements x51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f27725a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CustomClickHandler f27726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ResultReceiver f27727c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27728b;

        public a(String str) {
            this.f27728b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            dVar.f27726b.handleCustomClick(this.f27728b, new b(dVar, 0));
        }
    }

    public class b implements CustomClickHandlerEventListener {
        private b() {
        }

        public /* synthetic */ b(d dVar, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
        public final void onLeftApplication() {
            d.this.f27727c.send(19, null);
        }

        @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
        public final void onReturnedToApplication() {
            d.this.f27727c.send(20, null);
        }
    }

    public d(CustomClickHandler customClickHandler, AdResultReceiver adResultReceiver) {
        this.f27726b = customClickHandler;
        this.f27727c = adResultReceiver;
    }

    @Override // com.yandex.mobile.ads.impl.x51
    public final void a(jw0 jw0Var, String str) {
        ((gi) jw0Var).a(com.applovin.impl.mediation.b.a.c.a("click_type", "custom"));
        this.f27725a.post(new a(str));
    }
}
