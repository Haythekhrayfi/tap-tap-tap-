package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.util.Pair;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class wb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final xb f26238c = ot0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wb f26239d = new wb(new int[]{2}, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final wb f26240e = new wb(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.yandex.mobile.ads.embedded.guava.collect.q<Integer, Integer> f26241f = new com.yandex.mobile.ads.embedded.guava.collect.q.a().a(5, 6).a(17, 6).a(7, 6).a(18, 6).a(6, 8).a(8, 8).a(14, 8).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f26242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26243b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AudioAttributes f26244a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static int a(int i10, int i11) {
            for (int i12 = 8; i12 > 0; i12--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(da1.a(i12)).build(), f26244a)) {
                    return i12;
                }
            }
            return 0;
        }

        public static int[] a() {
            int i10 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
            com.yandex.mobile.ads.embedded.guava.collect.p.a aVar = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
            Iterator it = wb.f26241f.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f26244a)) {
                    aVar.b(Integer.valueOf(iIntValue));
                }
            }
            aVar.b((Object) 2);
            return h70.a(aVar.a());
        }
    }

    public wb(int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f26242a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f26242a = new int[0];
        }
        this.f26243b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if ((r1 >= 23 && r7.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.wb a(android.content.Context r7) {
        /*
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.media.action.HDMI_AUDIO_PLUG"
            r0.<init>(r1)
            r1 = 0
            android.content.Intent r0 = r7.registerReceiver(r1, r0)
            int r1 = com.yandex.mobile.ads.impl.da1.f19803a
            r2 = 1
            r3 = 0
            r4 = 17
            if (r1 < r4) goto L2e
            com.yandex.mobile.ads.impl.xb r4 = com.yandex.mobile.ads.impl.wb.f26238c
            java.lang.String r5 = r4.a()
            java.lang.String r6 = com.yandex.mobile.ads.impl.da1.f19805c
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L2c
            java.lang.String r4 = r4.c()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L2e
        L2c:
            r4 = r2
            goto L2f
        L2e:
            r4 = r3
        L2f:
            if (r4 == 0) goto L40
            android.content.ContentResolver r4 = r7.getContentResolver()
            java.lang.String r5 = "external_surround_sound_enabled"
            int r4 = android.provider.Settings.Global.getInt(r4, r5, r3)
            if (r4 != r2) goto L40
            com.yandex.mobile.ads.impl.wb r7 = com.yandex.mobile.ads.impl.wb.f26240e
            goto L89
        L40:
            r4 = 29
            r5 = 8
            if (r1 < r4) goto L6a
            boolean r4 = com.yandex.mobile.ads.impl.da1.d(r7)
            if (r4 != 0) goto L60
            r4 = 23
            if (r1 < r4) goto L5d
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r1 = "android.hardware.type.automotive"
            boolean r7 = r7.hasSystemFeature(r1)
            if (r7 == 0) goto L5d
            goto L5e
        L5d:
            r2 = r3
        L5e:
            if (r2 == 0) goto L6a
        L60:
            com.yandex.mobile.ads.impl.wb r7 = new com.yandex.mobile.ads.impl.wb
            int[] r0 = com.yandex.mobile.ads.impl.wb.a.a()
            r7.<init>(r0, r5)
            goto L89
        L6a:
            if (r0 == 0) goto L87
            java.lang.String r7 = "android.media.extra.AUDIO_PLUG_STATE"
            int r7 = r0.getIntExtra(r7, r3)
            if (r7 != 0) goto L75
            goto L87
        L75:
            com.yandex.mobile.ads.impl.wb r7 = new com.yandex.mobile.ads.impl.wb
            java.lang.String r1 = "android.media.extra.ENCODINGS"
            int[] r1 = r0.getIntArrayExtra(r1)
            java.lang.String r2 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r0 = r0.getIntExtra(r2, r5)
            r7.<init>(r1, r0)
            goto L89
        L87:
            com.yandex.mobile.ads.impl.wb r7 = com.yandex.mobile.ads.impl.wb.f26239d
        L89:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wb.a(android.content.Context):com.yandex.mobile.ads.impl.wb");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    public final Pair<Integer, Integer> a(yv yvVar) {
        boolean z10;
        String str = yvVar.f27115l;
        Objects.requireNonNull(str);
        int iB = te0.b(str, yvVar.f27112i);
        com.yandex.mobile.ads.embedded.guava.collect.q<Integer, Integer> qVar = f26241f;
        if (!qVar.containsKey(Integer.valueOf(iB))) {
            return null;
        }
        int i10 = 6;
        if (iB == 18) {
            if (!(Arrays.binarySearch(this.f26242a, 18) >= 0)) {
                iB = 6;
            } else if (iB == 8) {
                if (Arrays.binarySearch(this.f26242a, 8) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    iB = 7;
                }
            }
        } else if (iB == 8) {
            if (Arrays.binarySearch(this.f26242a, 8) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                iB = 7;
            }
        }
        if (!(Arrays.binarySearch(this.f26242a, iB) >= 0)) {
            return null;
        }
        int iIntValue = yvVar.f27128y;
        if (iIntValue == -1 || iB == 18) {
            int i11 = yvVar.f27129z;
            if (i11 == -1) {
                i11 = 48000;
            }
            if (da1.f19803a >= 29) {
                iIntValue = a.a(iB, i11);
            } else {
                Integer orDefault = qVar.getOrDefault(Integer.valueOf(iB), 0);
                Objects.requireNonNull(orDefault);
                iIntValue = orDefault.intValue();
            }
        } else if (iIntValue > this.f26243b) {
            return null;
        }
        int i12 = da1.f19803a;
        if (i12 > 28) {
            i10 = iIntValue;
        } else if (iIntValue == 7) {
            i10 = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i10 = iIntValue;
        }
        if (i12 <= 26 && f26238c.b().equals(da1.f19804b) && i10 == 1) {
            i10 = 2;
        }
        int iA = da1.a(i10);
        if (iA == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iA));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb)) {
            return false;
        }
        wb wbVar = (wb) obj;
        return Arrays.equals(this.f26242a, wbVar.f26242a) && this.f26243b == wbVar.f26243b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f26242a) * 31) + this.f26243b;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("AudioCapabilities[maxChannelCount=");
        sbA.append(this.f26243b);
        sbA.append(", supportedEncodings=");
        sbA.append(Arrays.toString(this.f26242a));
        sbA.append("]");
        return sbA.toString();
    }
}
