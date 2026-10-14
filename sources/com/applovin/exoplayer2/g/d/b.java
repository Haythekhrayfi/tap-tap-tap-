package com.applovin.exoplayer2.g.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements com.applovin.exoplayer2.g.a.InterfaceC0092a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.d.b.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6345f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        com.applovin.exoplayer2.l.a.a(i11 == -1 || i11 > 0);
        this.f6340a = i10;
        this.f6341b = str;
        this.f6342c = str2;
        this.f6343d = str3;
        this.f6344e = z10;
        this.f6345f = i11;
    }

    public b(Parcel parcel) {
        this.f6340a = parcel.readInt();
        this.f6341b = parcel.readString();
        this.f6342c = parcel.readString();
        this.f6343d = parcel.readString();
        this.f6344e = ai.a(parcel);
        this.f6345f = parcel.readInt();
    }

    public static b a(Map<String, List<String>> map) {
        int i10;
        boolean z10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List<String> list = map.get("icy-br");
        int i12 = -1;
        boolean z11 = true;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i11 = Integer.parseInt(str4) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        q.c("IcyHeaders", "Invalid bitrate: " + str4);
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        q.c("IcyHeaders", "Invalid bitrate header: " + str4);
                    }
                    z10 = false;
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
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
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        q.c("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        q.c("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z10) {
            return new b(i10, str, str2, str3, zEquals, i12);
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6340a == bVar.f6340a && ai.a((Object) this.f6341b, (Object) bVar.f6341b) && ai.a((Object) this.f6342c, (Object) bVar.f6342c) && ai.a((Object) this.f6343d, (Object) bVar.f6343d) && this.f6344e == bVar.f6344e && this.f6345f == bVar.f6345f;
    }

    public int hashCode() {
        int i10 = (527 + this.f6340a) * 31;
        String str = this.f6341b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6342c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6343d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f6344e ? 1 : 0)) * 31) + this.f6345f;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("IcyHeaders: name=\"");
        sbA.append(this.f6342c);
        sbA.append("\", genre=\"");
        sbA.append(this.f6341b);
        sbA.append("\", bitrate=");
        sbA.append(this.f6340a);
        sbA.append(", metadataInterval=");
        sbA.append(this.f6345f);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6340a);
        parcel.writeString(this.f6341b);
        parcel.writeString(this.f6342c);
        parcel.writeString(this.f6343d);
        ai.a(parcel, this.f6344e);
        parcel.writeInt(this.f6345f);
    }
}
