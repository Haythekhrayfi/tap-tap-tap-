package com.applovin.exoplayer2;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements com.applovin.exoplayer2.l.p.a, g.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k0 f7553d = new k0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k0 f7554e = new k0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k0 f7555f = new k0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ k0 f7556g = new k0(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k0 f7557h = new k0(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k0 f7558i = new k0(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ k0 f7559j = new k0(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ k0 f7560k = new k0(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ k0 f7561l = new k0(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ k0 f7562m = new k0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7563c;

    public /* synthetic */ k0(int i10) {
        this.f7563c = i10;
    }

    @Override // com.applovin.exoplayer2.g.a
    public g fromBundle(Bundle bundle) {
        switch (this.f7563c) {
            case 1:
                return ab.a(bundle);
            case 2:
                return ab.e.a(bundle);
            case 3:
                return aj.a(bundle);
            case 4:
                return am.a(bundle);
            case 5:
                return an.e.a(bundle);
            case 6:
                return ax.a(bundle);
            case 7:
                return ba.a.a(bundle);
            case 8:
                return o.a(bundle);
            default:
                return v.a(bundle);
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public void invoke(Object obj) {
        r.e((an.b) obj);
    }
}
