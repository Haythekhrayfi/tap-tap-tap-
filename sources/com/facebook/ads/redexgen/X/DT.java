package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class DT implements Parcelable.Creator<UrlLinkFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final UrlLinkFrame createFromParcel(Parcel parcel) {
        return new UrlLinkFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UrlLinkFrame[] newArray(int i10) {
        return new UrlLinkFrame[i10];
    }
}
