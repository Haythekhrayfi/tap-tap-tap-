package com.applovin.exoplayer2.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.applovin.exoplayer2.g.a.InterfaceC0092a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6321e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6322h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v f6315f = new v.a().f("application/id3").a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v f6316g = new v.a().f("application/x-scte35").a();
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.b.a.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    };

    public a(Parcel parcel) {
        this.f6317a = (String) ai.a(parcel.readString());
        this.f6318b = (String) ai.a(parcel.readString());
        this.f6319c = parcel.readLong();
        this.f6320d = parcel.readLong();
        this.f6321e = (byte[]) ai.a(parcel.createByteArray());
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f6317a = str;
        this.f6318b = str2;
        this.f6319c = j10;
        this.f6320d = j11;
        this.f6321e = bArr;
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0092a
    public v a() {
        String str = this.f6317a;
        Objects.requireNonNull(str);
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f6316g;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f6315f;
            default:
                return null;
        }
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0092a
    public byte[] b() {
        if (a() != null) {
            return this.f6321e;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6319c == aVar.f6319c && this.f6320d == aVar.f6320d && ai.a((Object) this.f6317a, (Object) aVar.f6317a) && ai.a((Object) this.f6318b, (Object) aVar.f6318b) && Arrays.equals(this.f6321e, aVar.f6321e);
    }

    public int hashCode() {
        if (this.f6322h == 0) {
            String str = this.f6317a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f6318b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f6319c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f6320d;
            this.f6322h = Arrays.hashCode(this.f6321e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f6322h;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("EMSG: scheme=");
        sbA.append(this.f6317a);
        sbA.append(", id=");
        sbA.append(this.f6320d);
        sbA.append(", durationMs=");
        sbA.append(this.f6319c);
        sbA.append(", value=");
        sbA.append(this.f6318b);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6317a);
        parcel.writeString(this.f6318b);
        parcel.writeLong(this.f6319c);
        parcel.writeLong(this.f6320d);
        parcel.writeByteArray(this.f6321e);
    }
}
