package com.yandex.mobile.ads.exo.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.pa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f18652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<StreamKey> f18654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f18657g;

    public class a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i10) {
            return new DownloadRequest[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f18659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<StreamKey> f18661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f18662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f18663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f18664g;

        public b(Uri uri, String str) {
            this.f18658a = str;
            this.f18659b = uri;
        }

        public final b a(String str) {
            this.f18663f = str;
            return this;
        }

        public final b a(ArrayList arrayList) {
            this.f18661d = arrayList;
            return this;
        }

        public final b a(byte[] bArr) {
            this.f18664g = bArr;
            return this;
        }

        public final DownloadRequest a() {
            String str = this.f18658a;
            Uri uri = this.f18659b;
            String str2 = this.f18660c;
            List listI = this.f18661d;
            if (listI == null) {
                listI = p.i();
            }
            return new DownloadRequest(str, uri, str2, listI, this.f18662e, this.f18663f, this.f18664g, 0);
        }

        public final b b(String str) {
            this.f18660c = str;
            return this;
        }

        public final b b(byte[] bArr) {
            this.f18662e = bArr;
            return this;
        }
    }

    public DownloadRequest(Parcel parcel) {
        this.f18651a = (String) da1.a(parcel.readString());
        this.f18652b = Uri.parse((String) da1.a(parcel.readString()));
        this.f18653c = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f18654d = Collections.unmodifiableList(arrayList);
        this.f18655e = parcel.createByteArray();
        this.f18656f = parcel.readString();
        this.f18657g = (byte[]) da1.a(parcel.createByteArray());
    }

    private DownloadRequest(String str, Uri uri, String str2, List<StreamKey> list, byte[] bArr, String str3, byte[] bArr2) {
        int iA = da1.a(uri, str2);
        if (iA == 0 || iA == 2 || iA == 1) {
            pa.a("customCacheKey must be null for type: " + iA, str3 == null);
        }
        this.f18651a = str;
        this.f18652b = uri;
        this.f18653c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f18654d = Collections.unmodifiableList(arrayList);
        this.f18655e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f18656f = str3;
        this.f18657g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : da1.f19808f;
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, int i10) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    public final DownloadRequest a(DownloadRequest downloadRequest) {
        ?? EmptyList;
        pa.a(this.f18651a.equals(downloadRequest.f18651a));
        if (this.f18654d.isEmpty() || downloadRequest.f18654d.isEmpty()) {
            EmptyList = Collections.emptyList();
        } else {
            EmptyList = new ArrayList(this.f18654d);
            for (int i10 = 0; i10 < downloadRequest.f18654d.size(); i10++) {
                StreamKey streamKey = downloadRequest.f18654d.get(i10);
                if (!EmptyList.contains(streamKey)) {
                    EmptyList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f18651a, downloadRequest.f18652b, downloadRequest.f18653c, EmptyList, downloadRequest.f18655e, downloadRequest.f18656f, downloadRequest.f18657g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f18651a.equals(downloadRequest.f18651a) && this.f18652b.equals(downloadRequest.f18652b) && da1.a(this.f18653c, downloadRequest.f18653c) && this.f18654d.equals(downloadRequest.f18654d) && Arrays.equals(this.f18655e, downloadRequest.f18655e) && da1.a(this.f18656f, downloadRequest.f18656f) && Arrays.equals(this.f18657g, downloadRequest.f18657g);
    }

    public final int hashCode() {
        int iHashCode = (this.f18652b.hashCode() + (this.f18651a.hashCode() * 31 * 31)) * 31;
        String str = this.f18653c;
        int iHashCode2 = (Arrays.hashCode(this.f18655e) + ((this.f18654d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f18656f;
        return Arrays.hashCode(this.f18657g) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f18653c + ":" + this.f18651a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18651a);
        parcel.writeString(this.f18652b.toString());
        parcel.writeString(this.f18653c);
        parcel.writeInt(this.f18654d.size());
        for (int i11 = 0; i11 < this.f18654d.size(); i11++) {
            parcel.writeParcelable(this.f18654d.get(i11), 0);
        }
        parcel.writeByteArray(this.f18655e);
        parcel.writeString(this.f18656f);
        parcel.writeByteArray(this.f18657g);
    }
}
