package com.yandex.mobile.ads.exo.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.ec0;
import com.yandex.mobile.ads.impl.li1;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.v60;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18556f;

    public class a implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        public final IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyHeaders[] newArray(int i10) {
            return new IcyHeaders[i10];
        }
    }

    public IcyHeaders(int i10, String str, String str2, String str3, boolean z10, int i11) {
        pa.a(i11 == -1 || i11 > 0);
        this.f18551a = i10;
        this.f18552b = str;
        this.f18553c = str2;
        this.f18554d = str3;
        this.f18555e = z10;
        this.f18556f = i11;
    }

    public IcyHeaders(Parcel parcel) {
        this.f18551a = parcel.readInt();
        this.f18552b = parcel.readString();
        this.f18553c = parcel.readString();
        this.f18554d = parcel.readString();
        this.f18555e = da1.a(parcel);
        this.f18556f = parcel.readInt();
    }

    public static IcyHeaders a(Map<String, List<String>> map) {
        int i10;
        boolean z10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        int i12;
        List<String> list = map.get("icy-br");
        int i13 = -1;
        boolean z11 = true;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i12 = Integer.parseInt(str4) * 1000;
                if (i12 > 0) {
                    z10 = true;
                    i10 = i12;
                } else {
                    try {
                        p90.d("IcyHeaders", "Invalid bitrate: " + str4);
                        i10 = -1;
                        z10 = false;
                    } catch (NumberFormatException unused) {
                        li1.a("Invalid bitrate header: ", str4, "IcyHeaders");
                        z10 = false;
                        i10 = i12;
                    }
                }
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
        } else {
            i10 = -1;
            z10 = false;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i14 = Integer.parseInt(str5);
                if (i14 > 0) {
                    i11 = i14;
                } else {
                    try {
                        p90.d("IcyHeaders", "Invalid metadata interval: " + str5);
                    } catch (NumberFormatException unused3) {
                        i13 = i14;
                        li1.a("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                    z11 = z10;
                    i11 = i13;
                }
            } catch (NumberFormatException unused4) {
            }
        } else {
            z11 = z10;
            i11 = i13;
        }
        if (z11) {
            return new IcyHeaders(i10, str, str2, str3, zEquals, i11);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ec0.a aVar) {
        String str = this.f18553c;
        if (str != null) {
            aVar.j(str);
        }
        String str2 = this.f18552b;
        if (str2 != null) {
            aVar.i(str2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f18551a == icyHeaders.f18551a && da1.a(this.f18552b, icyHeaders.f18552b) && da1.a(this.f18553c, icyHeaders.f18553c) && da1.a(this.f18554d, icyHeaders.f18554d) && this.f18555e == icyHeaders.f18555e && this.f18556f == icyHeaders.f18556f;
    }

    public final int hashCode() {
        int i10 = (this.f18551a + 527) * 31;
        String str = this.f18552b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18553c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18554d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f18555e ? 1 : 0)) * 31) + this.f18556f;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("IcyHeaders: name=\"");
        sbA.append(this.f18553c);
        sbA.append("\", genre=\"");
        sbA.append(this.f18552b);
        sbA.append("\", bitrate=");
        sbA.append(this.f18551a);
        sbA.append(", metadataInterval=");
        sbA.append(this.f18556f);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18551a);
        parcel.writeString(this.f18552b);
        parcel.writeString(this.f18553c);
        parcel.writeString(this.f18554d);
        boolean z10 = this.f18555e;
        int i11 = da1.f19803a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f18556f);
    }
}
