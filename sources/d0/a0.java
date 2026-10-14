package d0;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f28487a;

    static {
        new HashSet();
    }

    public a0(Context context) {
        this.f28487a = (NotificationManager) context.getSystemService("notification");
    }

    public boolean a() {
        return this.f28487a.areNotificationsEnabled();
    }
}
