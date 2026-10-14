package com.applovin.exoplayer2.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.aq;
import com.applovin.exoplayer2.az;
import com.applovin.exoplayer2.ba;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements com.applovin.exoplayer2.l.p.b, com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.l.h, com.applovin.exoplayer2.d.h.a, com.applovin.exoplayer2.e.l, com.applovin.exoplayer2.g.e.g.a, com.applovin.exoplayer2.l.p.a, g6.f.a, i5.b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ p f3988d = new p(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ p f3989e = new p(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ p f3990f = new p(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ p f3991g = new p(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ p f3992h = new p(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p f3993i = new p(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ p f3994j = new p(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p f3995k = new p(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p f3996l = new p(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ p f3997m = new p(9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p f3998n = new p(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ p f3999o = new p(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ p f4000p = new p(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ p f4001q = new p(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ p f4002r = new p(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ p f4003s = new p(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ p f4004t = new p(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ p f4005u = new p(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ p f4006v = new p(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ p f4007w = new p(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ p f4008x = new p(20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ p f4009y = new p(21);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ p f4010z = new p(22);
    public static final /* synthetic */ p A = new p(23);
    public static final /* synthetic */ p B = new p(24);
    public static final /* synthetic */ p C = new p(25);
    public static final /* synthetic */ p D = new p(26);
    public static final /* synthetic */ p E = new p(27);
    public static final /* synthetic */ p F = new p(28);
    public static final /* synthetic */ p G = new p(29);

    public /* synthetic */ p(int i10) {
        this.f4011c = i10;
    }

    @Override // com.applovin.exoplayer2.l.h
    public void accept(Object obj) {
        ((com.applovin.exoplayer2.d.g.a) obj).a();
    }

    @Override // i5.b.a
    public Object c(JsonReader jsonReader) {
        return i5.b.b(jsonReader);
    }

    @Override // com.applovin.exoplayer2.e.l
    public com.applovin.exoplayer2.e.h[] createExtractors() {
        switch (this.f4011c) {
            case 11:
                return com.applovin.exoplayer2.e.a.a.d();
            case 12:
                return com.applovin.exoplayer2.e.c.b.d();
            case 13:
                return com.applovin.exoplayer2.e.f.d.d();
            case 14:
                return com.applovin.exoplayer2.e.g.e.d();
            case 15:
                return com.applovin.exoplayer2.e.i.a.a();
            case 16:
                return com.applovin.exoplayer2.e.i.c.a();
            case 17:
                return com.applovin.exoplayer2.e.i.w.a();
            default:
                return com.applovin.exoplayer2.e.l.a();
        }
    }

    @Override // g6.f.a
    public String d(Object obj) {
        switch (this.f4011c) {
            case 27:
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            default:
                Context context = (Context) obj;
                int i10 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
    }

    @Override // com.applovin.exoplayer2.g.e.g.a
    public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        return com.applovin.exoplayer2.g.e.g.b(i10, i11, i12, i13, i14);
    }

    @Override // com.applovin.exoplayer2.g.a
    public com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
        switch (this.f4011c) {
            case 1:
                return ab.c.a(bundle);
            case 2:
                return ac.a(bundle);
            case 3:
                return new ak(bundle);
            case 4:
                return an.a.a(bundle);
            case 5:
                return aq.a(bundle);
            case 6:
                return az.a(bundle);
            case 7:
                return ba.a(bundle);
            case 8:
                return ba.c.a(bundle);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return com.applovin.exoplayer2.x.a(bundle);
            case 20:
                return com.applovin.exoplayer2.h.a.a.a(bundle);
            case 21:
                return com.applovin.exoplayer2.i.a.a(bundle);
            case 22:
                return com.applovin.exoplayer2.j.c.e.a(bundle);
            case 23:
                return com.applovin.exoplayer2.m.o.a(bundle);
            case 24:
                return com.applovin.exoplayer2.p.b(bundle);
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public void invoke(Object obj) {
        ((an.b) obj).b();
    }

    @Override // com.applovin.exoplayer2.l.p.b
    public void invoke(Object obj, com.applovin.exoplayer2.l.m mVar) {
        a.a((b) obj, mVar);
    }

    @Override // com.applovin.exoplayer2.d.h.a
    public void release() {
        com.applovin.exoplayer2.d.h.a.a();
    }
}
