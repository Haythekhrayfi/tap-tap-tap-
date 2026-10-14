package com.zipoapps.premiumhelper.util;

import android.content.Context;
import android.os.Bundle;
import cd.i;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.zipoapps.blytics.BLyticsEngine;
import com.zipoapps.premiumhelper.toto.TotoRegisterWorker;
import fd.j0;
import java.util.Arrays;
import java.util.Objects;
import kotlin.reflect.KProperty;
import ma.f;
import ma.h;
import ta.e;
import vc.b0;
import vc.t;

/* JADX INFO: loaded from: classes3.dex */
public final class PHMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f28434k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f28435j = new e(null);

    public interface a {
        void a(RemoteMessage remoteMessage);

        void b(RemoteMessage remoteMessage);
    }

    static {
        t tVar = new t(PHMessagingService.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f28434k = new i[]{tVar};
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void d(RemoteMessage remoteMessage) {
        com.zipoapps.premiumhelper.a.c cVar;
        ta.d dVarA = this.f28435j.a(this, f28434k[0]);
        StringBuilder sbA = defpackage.a.a("Message received: ");
        String string = remoteMessage.f12610c.getString("google.message_id");
        if (string == null) {
            string = remoteMessage.f12610c.getString("message_id");
        }
        sbA.append(string);
        sbA.append(", ");
        sbA.append(remoteMessage.e());
        sbA.append(", ");
        sbA.append(remoteMessage.f12610c.getString("message_type"));
        sbA.append(", ");
        sbA.append(remoteMessage.getData());
        dVarA.g(sbA.toString(), new Object[0]);
        h hVarA = h.f33410y.a();
        if (remoteMessage.e() != null) {
            a pushMessageListener = hVarA.f33418g.f34205b.getPushMessageListener();
            if (pushMessageListener != null) {
                pushMessageListener.b(remoteMessage);
                return;
            }
            return;
        }
        com.zipoapps.premiumhelper.a aVar = hVarA.f33419h;
        String str = remoteMessage.getData().get("push-type");
        if (str == null) {
            cVar = com.zipoapps.premiumhelper.a.c.UNKNOWN;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -2098715584) {
                if (iHashCode != -1578013710) {
                    if (iHashCode == 1820922960 && str.equals("NOTIFICATION_TYPE_HOLD")) {
                        cVar = com.zipoapps.premiumhelper.a.c.HOLD;
                    } else {
                        cVar = com.zipoapps.premiumhelper.a.c.UNKNOWN;
                    }
                } else if (str.equals("NOTIFICATION_TYPE_RECOVERED")) {
                    cVar = com.zipoapps.premiumhelper.a.c.RECOVERED;
                } else {
                    cVar = com.zipoapps.premiumhelper.a.c.UNKNOWN;
                }
            } else if (str.equals("NOTIFICATION_TYPE_CANCELLED")) {
                cVar = com.zipoapps.premiumhelper.a.c.CANCELLED;
            } else {
                cVar = com.zipoapps.premiumhelper.a.c.UNKNOWN;
            }
        }
        Objects.requireNonNull(aVar);
        j0.i(cVar, "type");
        Bundle bundleA = androidx.activity.i.a(new jc.h("type", cVar.getValue()));
        ActivePurchaseInfo activePurchaseInfoG = aVar.f28255c.g();
        if (activePurchaseInfoG != null) {
            bundleA.putInt("days_since_purchase", c.h(activePurchaseInfoG.getPurchaseTime()));
        }
        try {
            ((BLyticsEngine) g6.c.f30013d.f30015b).c(aVar.c("Silent_Notification", (Bundle[]) Arrays.copyOf(new Bundle[]{bundleA}, 1)), false);
        } catch (Throwable th) {
            aVar.d().k(6, th, null, new Object[0]);
        }
        a pushMessageListener2 = hVarA.f33418g.f34205b.getPushMessageListener();
        if (pushMessageListener2 != null) {
            pushMessageListener2.a(remoteMessage);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void e(String str) throws Throwable {
        j0.i(str, "token");
        Context applicationContext = getApplicationContext();
        j0.h(applicationContext, "applicationContext");
        if (new f(applicationContext).j()) {
            TotoRegisterWorker.Companion companion = TotoRegisterWorker.Companion;
            Context applicationContext2 = getApplicationContext();
            j0.h(applicationContext2, "applicationContext");
            companion.schedule(applicationContext2, str);
        }
    }
}
