package com.applovin.exoplayer2.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f4428a = new e(new int[]{2}, 8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f4429b = new e(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f4430c = {5, 6, 18, 17, 14, 7, 8};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f4431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4432e;

    public static final class a {
        public static int[] a() {
            com.applovin.exoplayer2.common.a.s.a aVarI = com.applovin.exoplayer2.common.a.s.i();
            for (int i10 : e.f4430c) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i10).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    aVarI.a(Integer.valueOf(i10));
                }
            }
            aVarI.a(2);
            return com.applovin.exoplayer2.common.b.c.a(aVarI.a());
        }
    }

    public e(int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f4431d = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f4431d = new int[0];
        }
        this.f4432e = i10;
    }

    public static e a(Context context) {
        return a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    public static e a(Context context, Intent intent) {
        if (c() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f4429b;
        }
        if (ai.f7595a < 29 || !ai.c(context)) {
            return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f4428a : new e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return new e(a.a(), 8);
    }

    private static boolean c() {
        if (ai.f7595a >= 17) {
            String str = ai.f7597c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f4432e;
    }

    public boolean a(int i10) {
        return Arrays.binarySearch(this.f4431d, i10) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Arrays.equals(this.f4431d, eVar.f4431d) && this.f4432e == eVar.f4432e;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f4431d) * 31) + this.f4432e;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AudioCapabilities[maxChannelCount=");
        sbA.append(this.f4432e);
        sbA.append(", supportedEncodings=");
        sbA.append(Arrays.toString(this.f4431d));
        sbA.append("]");
        return sbA.toString();
    }
}
