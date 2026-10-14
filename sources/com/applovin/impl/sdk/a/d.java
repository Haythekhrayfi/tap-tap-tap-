package com.applovin.impl.sdk.a;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f10131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f10132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10133c;

    public d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f10131a = view;
        this.f10132b = friendlyObstructionPurpose;
        this.f10133c = str;
    }

    public View a() {
        return this.f10131a;
    }

    public FriendlyObstructionPurpose b() {
        return this.f10132b;
    }

    public String c() {
        return this.f10133c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        View view = this.f10131a;
        if (view == null ? dVar.f10131a != null : !view.equals(dVar.f10131a)) {
            return false;
        }
        if (this.f10132b != dVar.f10132b) {
            return false;
        }
        String str = this.f10133c;
        String str2 = dVar.f10133c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        View view = this.f10131a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f10132b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f10133c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
