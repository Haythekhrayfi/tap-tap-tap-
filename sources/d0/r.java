package d0;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class r extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f28564e;

    public r() {
    }

    public r(t tVar) {
        i(tVar);
    }

    @Override // d0.x
    public void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // d0.x
    public void b(n nVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((y) nVar).f28622b).setBigContentTitle(this.f28618b).bigText(this.f28564e);
        if (this.f28620d) {
            bigTextStyleBigText.setSummaryText(this.f28619c);
        }
    }

    @Override // d0.x
    public void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.bigText");
    }

    @Override // d0.x
    public String d() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // d0.x
    public void h(Bundle bundle) {
        super.h(bundle);
        this.f28564e = bundle.getCharSequence("android.bigText");
    }

    public r j(CharSequence charSequence) {
        this.f28564e = t.c(charSequence);
        return this;
    }
}
