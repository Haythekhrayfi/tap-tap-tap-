package n;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f33567a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f33568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n.a f33569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f33570c;

        public a() {
            this.f33568a = new Intent("android.intent.action.VIEW");
            this.f33569b = new n.a();
            this.f33570c = true;
        }

        public a(l lVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f33568a = intent;
            this.f33569b = new n.a();
            this.f33570c = true;
            if (lVar != null) {
                intent.setPackage(lVar.f33573c.getPackageName());
                IBinder iBinderAsBinder = lVar.f33572b.asBinder();
                PendingIntent pendingIntent = lVar.f33574d;
                Bundle bundle = new Bundle();
                d0.k.b(bundle, "android.support.customtabs.extra.SESSION", iBinderAsBinder);
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                intent.putExtras(bundle);
            }
        }

        public j a() {
            if (!this.f33568a.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                d0.k.b(bundle, "android.support.customtabs.extra.SESSION", null);
                this.f33568a.putExtras(bundle);
            }
            this.f33568a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f33570c);
            Intent intent = this.f33568a;
            Objects.requireNonNull(this.f33569b);
            intent.putExtras(new Bundle());
            this.f33568a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            return new j(this.f33568a, null);
        }
    }

    public j(Intent intent, Bundle bundle) {
        this.f33567a = intent;
    }
}
