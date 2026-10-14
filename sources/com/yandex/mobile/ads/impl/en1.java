package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class en1 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f20298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dm1 f20299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final an1 f20300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f20301e;

    public en1(Handler handler, Context context, dm1 dm1Var, an1 an1Var) {
        super(handler);
        this.f20297a = context;
        this.f20298b = (AudioManager) context.getSystemService("audio");
        this.f20299c = dm1Var;
        this.f20300d = an1Var;
    }

    public final void a() {
        int streamVolume = this.f20298b.getStreamVolume(3);
        int streamMaxVolume = this.f20298b.getStreamMaxVolume(3);
        Objects.requireNonNull(this.f20299c);
        float f10 = 1.0f;
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        } else {
            float f11 = streamVolume / streamMaxVolume;
            if (f11 <= 1.0f) {
                f10 = f11;
            }
        }
        this.f20301e = f10;
        ((nn1) this.f20300d).a(f10);
        this.f20297a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f20297a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        int streamVolume = this.f20298b.getStreamVolume(3);
        int streamMaxVolume = this.f20298b.getStreamMaxVolume(3);
        Objects.requireNonNull(this.f20299c);
        float f10 = 1.0f;
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        } else {
            float f11 = streamVolume / streamMaxVolume;
            if (f11 <= 1.0f) {
                f10 = f11;
            }
        }
        if (f10 != this.f20301e) {
            this.f20301e = f10;
            ((nn1) this.f20300d).a(f10);
        }
    }
}
