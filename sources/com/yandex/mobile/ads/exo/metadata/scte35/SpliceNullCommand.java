package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new a();

    public class a implements Parcelable.Creator<SpliceNullCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceNullCommand[] newArray(int i10) {
            return new SpliceNullCommand[i10];
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
    }
}
