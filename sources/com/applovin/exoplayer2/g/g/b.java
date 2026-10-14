package com.applovin.exoplayer2.g.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements com.applovin.exoplayer2.g.a.InterfaceC0092a {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SCTE-35 splice command: type=");
        sbA.append(getClass().getSimpleName());
        return sbA.toString();
    }
}
