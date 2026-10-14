package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class gi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f21067a = Executors.newSingleThreadExecutor(new ph0("YandexMobileAds.BaseController"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f21068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ii0 f21069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sk0 f21070d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final pi0 f21071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<Context> f21072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AdResponse<?> f21073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final cj0 f21074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final fi0 f21075f;

        public a(Context context, AdResponse<?> adResponse, cj0 cj0Var, pi0 pi0Var, fi0 fi0Var) {
            this.f21073d = adResponse;
            this.f21074e = cj0Var;
            this.f21071b = pi0Var;
            this.f21072c = new WeakReference<>(context);
            this.f21075f = fi0Var;
        }

        private void a(final Context context, k2 k2Var, final wh0 wh0Var, final fi0 fi0Var) {
            gi0.this.f21070d.a(context, k2Var, wh0Var, new sk0.a() { // from class: com.yandex.mobile.ads.impl.bo1
                @Override // com.yandex.mobile.ads.impl.sk0.a
                public final void a(g20 g20Var) {
                    this.f19300a.a(context, wh0Var, fi0Var, g20Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Context context, wh0 wh0Var, fi0 fi0Var, g20 g20Var) {
            gi0.this.f21069c.a(context, wh0Var, g20Var, this.f21071b, fi0Var);
        }

        @Override // java.lang.Runnable
        public final void run() {
            fi0 fi0Var;
            t2 t2Var;
            Context context = this.f21072c.get();
            if (context != null) {
                try {
                    cj0 cj0Var = this.f21074e;
                    if (cj0Var == null) {
                        fi0Var = this.f21075f;
                        t2Var = v4.f25821d;
                    } else {
                        boolean z10 = true;
                        Collection[] collectionArr = {cj0Var.d()};
                        int i10 = 0;
                        while (true) {
                            if (i10 < 1) {
                                Collection collection = collectionArr[i10];
                                if (collection == null || collection.isEmpty()) {
                                    break;
                                    break;
                                }
                                i10++;
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                        if (!z10) {
                            a(context, gi0.this.f21068b, new wh0(this.f21074e, this.f21073d, gi0.this.f21068b), this.f21075f);
                            return;
                        } else {
                            fi0Var = this.f21075f;
                            t2Var = v4.f25829l;
                        }
                    }
                    fi0Var.a(t2Var);
                } catch (Exception e10) {
                    x60.a(e10, e10.toString(), new Object[0]);
                    this.f21075f.a(v4.f25821d);
                }
            }
        }
    }

    public gi0(Context context, k2 k2Var, w3 w3Var) {
        this.f21068b = k2Var;
        this.f21069c = new ii0(k2Var);
        this.f21070d = new sk0(context, w3Var);
    }

    public final void a() {
        this.f21070d.a();
    }

    public final void a(Context context, AdResponse<?> adResponse, cj0 cj0Var, pi0 pi0Var, fi0 fi0Var) {
        this.f21067a.execute(new a(context, adResponse, cj0Var, pi0Var, fi0Var));
    }
}
