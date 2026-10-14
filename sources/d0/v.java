package d0;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class v extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<CharSequence> f28605e = new ArrayList<>();

    public v() {
    }

    public v(t tVar) {
        i(tVar);
    }

    @Override // d0.x
    public void b(n nVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((y) nVar).f28622b).setBigContentTitle(this.f28618b);
        if (this.f28620d) {
            bigContentTitle.setSummaryText(this.f28619c);
        }
        Iterator<CharSequence> it = this.f28605e.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    @Override // d0.x
    public void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.textLines");
    }

    @Override // d0.x
    public String d() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // d0.x
    public void h(Bundle bundle) {
        super.h(bundle);
        this.f28605e.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(this.f28605e, bundle.getCharSequenceArray("android.textLines"));
        }
    }
}
