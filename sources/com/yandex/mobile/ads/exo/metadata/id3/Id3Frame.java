package com.yandex.mobile.ads.exo.metadata.id3;

import com.yandex.mobile.ads.exo.metadata.Metadata;

/* JADX INFO: loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18583a;

    public Id3Frame(String str) {
        this.f18583a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f18583a;
    }
}
