package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f12944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f12946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12947d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f12944a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f12945b = view.getClass().getCanonicalName();
        this.f12946c = friendlyObstructionPurpose;
        this.f12947d = str;
    }

    public String a() {
        return this.f12947d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f12946c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f12944a;
    }

    public String d() {
        return this.f12945b;
    }
}
