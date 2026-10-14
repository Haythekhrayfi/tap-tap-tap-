package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f12927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f12928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f12929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f12930e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f12926a = context;
        this.f12927b = (AudioManager) context.getSystemService("audio");
        this.f12928c = aVar;
        this.f12929d = cVar;
    }

    private float a() {
        return this.f12928c.a(this.f12927b.getStreamVolume(3), this.f12927b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f12930e;
    }

    private void b() {
        this.f12929d.a(this.f12930e);
    }

    public void c() {
        this.f12930e = a();
        b();
        this.f12926a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f12926a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f12930e = fA;
            b();
        }
    }
}
