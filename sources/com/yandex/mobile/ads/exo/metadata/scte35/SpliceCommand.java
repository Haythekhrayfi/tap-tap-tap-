package com.yandex.mobile.ads.exo.metadata.scte35;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.v60;

/* JADX INFO: loaded from: classes.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("SCTE-35 splice command: type=");
        sbA.append(getClass().getSimpleName());
        return sbA.toString();
    }
}
