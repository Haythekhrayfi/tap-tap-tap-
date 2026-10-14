package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class j extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f10703a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f10704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f10705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f10706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<a> f10707e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f10708f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10710h;

    public interface a {
        void a(int i10);
    }

    public j(o oVar) {
        this.f10706d = oVar;
        Context contextAu = o.au();
        this.f10705c = contextAu;
        this.f10704b = (AudioManager) contextAu.getSystemService("audio");
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void b() {
        this.f10706d.F();
        if (y.a()) {
            this.f10706d.F().b("AudioSessionManager", "Observing ringer mode...");
        }
        this.f10710h = f10703a;
        this.f10705c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void b(final int i10) {
        if (this.f10709g) {
            return;
        }
        this.f10706d.F();
        if (y.a()) {
            this.f10706d.F().b("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f10708f) {
            for (final a aVar : this.f10707e) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.j.1
                    @Override // java.lang.Runnable
                    public void run() {
                        aVar.a(i10);
                    }
                });
            }
        }
    }

    private void c() {
        this.f10706d.F();
        if (y.a()) {
            this.f10706d.F().b("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f10705c.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int a() {
        return this.f10704b.getRingerMode();
    }

    public void a(a aVar) {
        synchronized (this.f10708f) {
            if (this.f10707e.contains(aVar)) {
                return;
            }
            this.f10707e.add(aVar);
            if (this.f10707e.size() == 1) {
                b();
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f10708f) {
            if (this.f10707e.contains(aVar)) {
                this.f10707e.remove(aVar);
                if (this.f10707e.isEmpty()) {
                    c();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f10704b.getRingerMode());
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f10709g = true;
            this.f10710h = this.f10704b.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f10709g = false;
            if (this.f10710h != this.f10704b.getRingerMode()) {
                this.f10710h = f10703a;
                b(this.f10704b.getRingerMode());
            }
        }
    }
}
