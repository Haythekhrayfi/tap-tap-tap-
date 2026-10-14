package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class DM implements Parcelable.Creator<CommentFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final CommentFrame createFromParcel(Parcel parcel) {
        return new CommentFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final CommentFrame[] newArray(int i10) {
        return new CommentFrame[i10];
    }
}
