package com.yandex.metrica.impl.ob;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* JADX INFO: loaded from: classes.dex */
public class Sg implements Mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InstallReferrerClient f15006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f15007b;

    public class a implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Xg f15008a;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.Sg$a$a, reason: collision with other inner class name */
        public class RunnableC0177a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Fg f15010a;

            public RunnableC0177a(Fg fg) {
                this.f15010a = fg;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f15008a.a(this.f15010a);
            }
        }

        public a(Xg xg) {
            this.f15008a = xg;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            if (i10 == 0) {
                try {
                    ReferrerDetails installReferrer = Sg.this.f15006a.getInstallReferrer();
                    Fg fg = new Fg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), Fg.a.GP);
                    ((C1941rn) Sg.this.f15007b).execute(new RunnableC0177a(fg));
                } catch (Throwable th) {
                    Sg.a(Sg.this, this.f15008a, th);
                }
            } else {
                Sg.a(Sg.this, this.f15008a, new IllegalStateException(android.support.v4.media.a.a("Referrer check failed with error ", i10)));
            }
            try {
                Sg.this.f15006a.endConnection();
            } catch (Throwable unused) {
            }
        }
    }

    public Sg(InstallReferrerClient installReferrerClient, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this.f15006a = installReferrerClient;
        this.f15007b = interfaceExecutorC1966sn;
    }

    public static void a(Sg sg, Xg xg, Throwable th) {
        ((C1941rn) sg.f15007b).execute(new Tg(sg, xg, th));
    }

    @Override // com.yandex.metrica.impl.ob.Mg
    public void a(Xg xg) throws Throwable {
        this.f15006a.startConnection(new a(xg));
    }
}
