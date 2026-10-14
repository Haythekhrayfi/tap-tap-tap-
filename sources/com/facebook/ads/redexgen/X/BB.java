package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BB implements Parcelable.Creator<DrmInitData> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final DrmInitData createFromParcel(Parcel parcel) {
        return new DrmInitData(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final DrmInitData[] newArray(int i10) {
        return new DrmInitData[i10];
    }
}
