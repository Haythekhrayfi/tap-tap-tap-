package p6;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import com.inscode.autoclicker.ClickerApplication;
import com.inscode.autoclicker.R;
import d0.t;
import fd.j0;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends l implements uc.l<Boolean, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ClickerApplication f34463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ClickerApplication clickerApplication) {
        super(1);
        this.f34463c = clickerApplication;
    }

    @Override // uc.l
    public w invoke(Boolean bool) {
        Object systemService = this.f34463c.getSystemService("notification");
        j0.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        j0.h(defaultUri, "getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)");
        if (Build.VERSION.SDK_INT >= 26) {
            RingtoneManager.getDefaultUri(2);
            notificationManager.createNotificationChannel(new NotificationChannel("App has finished", "App has finished", 4));
        }
        t tVar = new t(this.f34463c.getApplicationContext(), "App has finished");
        tVar.N.icon = R.drawable.ic_notification;
        tVar.d(this.f34463c.getString(R.string.finished));
        tVar.e(this.f34463c.getString(R.string.app_name));
        tVar.j(defaultUri);
        notificationManager.notify(0, tVar.a());
        return w.f31842a;
    }
}
