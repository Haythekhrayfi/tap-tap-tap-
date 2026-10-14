package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;

/* JADX INFO: loaded from: classes3.dex */
final class m40 implements k40.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f22905a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w3 f22906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l40 f22907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y3 f22908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InstreamAdLoadListener f22909e;

    public m40(Context context, w3 w3Var, l40 l40Var) {
        this.f22906b = w3Var;
        this.f22907c = l40Var;
        this.f22908d = new y3(context, w3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InstreamAd instreamAd) {
        InstreamAdLoadListener instreamAdLoadListener = this.f22909e;
        if (instreamAdLoadListener != null) {
            instreamAdLoadListener.onInstreamAdLoaded(instreamAd);
        }
        this.f22907c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        InstreamAdLoadListener instreamAdLoadListener = this.f22909e;
        if (instreamAdLoadListener != null) {
            instreamAdLoadListener.onInstreamAdFailedToLoad(str);
        }
        this.f22907c.a();
    }

    @Override // com.yandex.mobile.ads.impl.k40.a
    public final void a(v50 v50Var) {
        v2.a(l6.f22632g.a());
        this.f22906b.a(v3.f25800c);
        this.f22908d.a();
        this.f22905a.post(new do1(this, v50Var));
    }

    public final void a(wh1 wh1Var) {
        this.f22908d.b(new l60(wh1Var));
    }

    public final void a(InstreamAdLoadListener instreamAdLoadListener) {
        this.f22909e = instreamAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.k40.a
    public final void a(String str) {
        this.f22906b.a(v3.f25800c);
        this.f22908d.a(str);
        this.f22905a.post(new do1(this, str));
    }
}
