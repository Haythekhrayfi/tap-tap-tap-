package com.yandex.mobile.ads.exo.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.yv;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final yv f18533g = new yv.a().f("application/id3").a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final yv f18534h = new yv.a().f("application/x-scte35").a();
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

    public class a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        public final EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    }

    public EventMessage(Parcel parcel) {
        this.f18535a = (String) da1.a(parcel.readString());
        this.f18536b = (String) da1.a(parcel.readString());
        this.f18537c = parcel.readLong();
        this.f18538d = parcel.readLong();
        this.f18539e = (byte[]) da1.a(parcel.createByteArray());
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f18535a = str;
        this.f18536b = str2;
        this.f18537c = j10;
        this.f18538d = j11;
        this.f18539e = bArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final yv a() {
        String str = this.f18535a;
        Objects.requireNonNull(str);
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f18534h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f18533g;
            default:
                return null;
        }
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final byte[] b() {
        if (a() != null) {
            return this.f18539e;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f18537c == eventMessage.f18537c && this.f18538d == eventMessage.f18538d && da1.a(this.f18535a, eventMessage.f18535a) && da1.a(this.f18536b, eventMessage.f18536b) && Arrays.equals(this.f18539e, eventMessage.f18539e);
    }

    public final int hashCode() {
        if (this.f18540f == 0) {
            String str = this.f18535a;
            int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f18536b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f18537c;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f18538d;
            this.f18540f = Arrays.hashCode(this.f18539e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f18540f;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("EMSG: scheme=");
        sbA.append(this.f18535a);
        sbA.append(", id=");
        sbA.append(this.f18538d);
        sbA.append(", durationMs=");
        sbA.append(this.f18537c);
        sbA.append(", value=");
        sbA.append(this.f18536b);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18535a);
        parcel.writeString(this.f18536b);
        parcel.writeLong(this.f18537c);
        parcel.writeLong(this.f18538d);
        parcel.writeByteArray(this.f18539e);
    }
}
