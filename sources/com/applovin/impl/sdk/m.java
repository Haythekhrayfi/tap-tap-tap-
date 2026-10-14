package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class m implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AlertDialog f10738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f10739c = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f10740a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.t f10741d;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.m$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f10742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f10743b;

        public AnonymousClass1(o oVar, a aVar) {
            this.f10742a = oVar;
            this.f10743b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVarF;
            String str;
            if (m.this.f10740a.d()) {
                this.f10742a.F();
                if (y.a()) {
                    this.f10742a.F().e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                    return;
                }
                return;
            }
            Activity activityA = this.f10742a.E().a();
            if (activityA != null && com.applovin.impl.sdk.utils.i.a(o.au())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.m.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertDialog unused = m.f10738b = new AlertDialog.Builder(AnonymousClass1.this.f10742a.E().a()).setTitle((CharSequence) AnonymousClass1.this.f10742a.a(com.applovin.impl.sdk.c.b.aV)).setMessage((CharSequence) AnonymousClass1.this.f10742a.a(com.applovin.impl.sdk.c.b.aW)).setCancelable(false).setPositiveButton((CharSequence) AnonymousClass1.this.f10742a.a(com.applovin.impl.sdk.c.b.aX), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.m.1.1.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i10) {
                                AnonymousClass1.this.f10743b.a();
                                dialogInterface.dismiss();
                                m.f10739c.set(false);
                            }
                        }).setNegativeButton((CharSequence) AnonymousClass1.this.f10742a.a(com.applovin.impl.sdk.c.b.aY), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.m.1.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i10) {
                                AnonymousClass1.this.f10743b.b();
                                dialogInterface.dismiss();
                                m.f10739c.set(false);
                                long jLongValue = ((Long) AnonymousClass1.this.f10742a.a(com.applovin.impl.sdk.c.b.aT)).longValue();
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                m.this.a(jLongValue, anonymousClass1.f10742a, anonymousClass1.f10743b);
                            }
                        }).create();
                        m.f10738b.show();
                    }
                });
                return;
            }
            if (activityA == null) {
                this.f10742a.F();
                if (y.a()) {
                    yVarF = this.f10742a.F();
                    str = "No parent Activity found - rescheduling consent alert...";
                    yVarF.e("ConsentAlertManager", str);
                }
            } else {
                this.f10742a.F();
                if (y.a()) {
                    yVarF = this.f10742a.F();
                    str = "No internet available - rescheduling consent alert...";
                    yVarF.e("ConsentAlertManager", str);
                }
            }
            m.f10739c.set(false);
            m.this.a(((Long) this.f10742a.a(com.applovin.impl.sdk.c.b.aU)).longValue(), this.f10742a, this.f10743b);
        }
    }

    public interface a {
        void a();

        void b();
    }

    public m(n nVar, o oVar) {
        this.f10740a = nVar;
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a(long j10, o oVar, a aVar) {
        if (j10 <= 0) {
            return;
        }
        AlertDialog alertDialog = f10738b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (f10739c.getAndSet(true)) {
                long jA = this.f10741d.a();
                oVar.F();
                if (j10 >= jA) {
                    if (y.a()) {
                        y yVarF = oVar.F();
                        StringBuilder sbA = defpackage.a.a("Skip scheduling consent alert - one scheduled already with remaining time of ");
                        sbA.append(this.f10741d.a());
                        sbA.append(" milliseconds");
                        yVarF.d("ConsentAlertManager", sbA.toString());
                        return;
                    }
                    return;
                }
                if (y.a()) {
                    y yVarF2 = oVar.F();
                    StringBuilder sbA2 = i2.a.a("Scheduling consent alert earlier (", j10, "ms) than remaining scheduled time (");
                    sbA2.append(this.f10741d.a());
                    sbA2.append("ms)");
                    yVarF2.b("ConsentAlertManager", sbA2.toString());
                }
                this.f10741d.d();
            }
            oVar.F();
            if (y.a()) {
                oVar.F().b("ConsentAlertManager", "Scheduling consent alert for " + j10 + " milliseconds");
            }
            this.f10741d = com.applovin.impl.sdk.utils.t.a(j10, oVar, new AnonymousClass1(oVar, aVar));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if (this.f10741d == null) {
            return;
        }
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f10741d.b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f10741d.c();
        }
    }
}
