package com.inscode.autoclicker.fcm;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.inscode.autoclicker.R;
import d0.b;
import d0.c;
import d0.r;
import d0.t;
import fd.j0;
import java.util.Map;
import ma.h;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageListenerService extends FirebaseMessagingService implements le.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f13044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f13045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f13046l;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    static {
        new a(null);
        f13044j = 1;
        f13045k = "play";
        f13046l = ImagesContract.URL;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void d(RemoteMessage remoteMessage) {
        boolean zI;
        try {
            Map<String, String> data = remoteMessage.getData();
            j0.h(data, "remoteMessage.data");
            String str = data.get("type");
            j0.g(str, "null cannot be cast to non-null type kotlin.String");
            String str2 = str;
            String str3 = data.get("message");
            j0.g(str3, "null cannot be cast to non-null type kotlin.String");
            String str4 = str3;
            String str5 = data.get("target");
            String str6 = str5 instanceof String ? str5 : null;
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            j0.f(launchIntentForPackage);
            Intent flags = launchIntentForPackage.setPackage(null).setFlags(270532608);
            j0.h(flags, "packageManager\n         …ITY_RESET_TASK_IF_NEEDED)");
            if (j0.d(str2, f13045k)) {
                flags = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.inscode.autoclicker"));
            }
            if (j0.d(str2, f13046l)) {
                String str7 = data.get(ImagesContract.URL);
                j0.g(str7, "null cannot be cast to non-null type kotlin.String");
                flags = new Intent("android.intent.action.VIEW", Uri.parse(str7));
            }
            Object systemService = getSystemService("notification");
            j0.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("clickmate", "Clickmate", 3));
            }
            if (str6 != null) {
                zI = j0.d(str6, "pro") ? h.f33410y.a().i() : true;
                if (j0.d(str6, "nopro")) {
                    zI = !h.f33410y.a().i();
                }
            } else {
                zI = true;
            }
            if (zI) {
                t tVar = new t(this, "clickmate");
                tVar.N.icon = R.drawable.ic_notification;
                Object obj = e0.a.f28964a;
                tVar.D = e0.a.d.a(this, R.color.colorAccent);
                tVar.f(-1);
                r rVar = new r();
                rVar.j(str4);
                if (tVar.f28594p != rVar) {
                    tVar.f28594p = rVar;
                    rVar.i(tVar);
                }
                tVar.h(BitmapFactory.decodeResource(getResources(), R.drawable.logo_transparent));
                tVar.e(getString(R.string.app_name));
                tVar.d(str4);
                tVar.g(16, true);
                tVar.f28585g = PendingIntent.getActivity(getApplicationContext(), 0, flags, 67108864);
                int i10 = f13044j;
                f13044j = i10 + 1;
                notificationManager.notify(i10, tVar.a());
            }
        } catch (Exception e10) {
            xe.a.f37601c.b(b.a(e10, c.a("[ClickService] Message listener exception: ", e10, ' ')), new Object[0]);
        }
    }

    @Override // le.a
    public wd.b getKoin() {
        return le.a.C0352a.a();
    }
}
