package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdLoader;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InstreamAdLoader f27233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InstreamAdRequestConfiguration f27234c;

    public static class a implements InstreamAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ViewGroup> f27235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<List<qc1>> f27236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f27237c;

        public a(ViewGroup viewGroup, List<qc1> list, b bVar) {
            this.f27237c = bVar;
            this.f27235a = new WeakReference<>(viewGroup);
            this.f27236b = new WeakReference<>(list);
        }

        @Override // com.yandex.mobile.ads.instream.InstreamAdLoadListener
        public final void onInstreamAdFailedToLoad(String str) {
            this.f27237c.a();
        }

        @Override // com.yandex.mobile.ads.instream.InstreamAdLoadListener
        public final void onInstreamAdLoaded(InstreamAd instreamAd) {
            ViewGroup viewGroup = this.f27235a.get();
            List<qc1> listEmptyList = this.f27236b.get();
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            if (viewGroup != null) {
                this.f27237c.a(viewGroup, listEmptyList, instreamAd);
            } else {
                this.f27237c.a();
            }
        }
    }

    public interface b {
        void a();

        void a(ViewGroup viewGroup, List<qc1> list, InstreamAd instreamAd);
    }

    public z80(Context context, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f27232a = context.getApplicationContext();
        this.f27234c = instreamAdRequestConfiguration;
        this.f27233b = new InstreamAdLoader(context);
    }

    public final void a() {
        this.f27233b.setInstreamAdLoadListener(null);
    }

    public final void a(ViewGroup viewGroup, List<qc1> list, b bVar) {
        this.f27233b.setInstreamAdLoadListener(new a(viewGroup, list, bVar));
        this.f27233b.loadInstreamAd(this.f27232a, this.f27234c);
    }
}
