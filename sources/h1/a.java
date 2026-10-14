package h1;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.activity.result.c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f30486a = 0;

    /* JADX INFO: renamed from: h1.a$a, reason: collision with other inner class name */
    public static class C0283a extends MediaBrowserCompat.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f30487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Intent f30488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f30489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public MediaBrowserCompat f30490f;

        public C0283a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f30487c = context;
            this.f30488d = intent;
            this.f30489e = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void a() {
            try {
                MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.f30487c, this.f30490f.f350a.a());
                KeyEvent keyEvent = (KeyEvent) this.f30488d.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
                mediaControllerCompat.f396a.a(keyEvent);
                d();
            } catch (RemoteException e10) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e10);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void b() {
            d();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void c() {
            d();
        }

        public final void d() {
            this.f30490f.f350a.disconnect();
            this.f30489e.finish();
        }
    }

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbA = c.a("Expected 1 service that handles ", str, ", found ");
        sbA.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbA.toString());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameA = a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA != null) {
            intent.setComponent(componentNameA);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
                return;
            } else {
                context.startService(intent);
                return;
            }
        }
        ComponentName componentNameA2 = a(context, "android.media.browse.MediaBrowserService");
        if (componentNameA2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C0283a c0283a = new C0283a(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameA2, c0283a, null);
        c0283a.f30490f = mediaBrowserCompat;
        mediaBrowserCompat.f350a.d();
    }
}
