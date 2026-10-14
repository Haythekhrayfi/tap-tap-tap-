package com.applovin.exoplayer2.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import java.util.Objects;
import l1.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements com.applovin.exoplayer2.g.a.InterfaceC0092a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.c.b.1
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
    public final String f6334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6335b;

    public b(Parcel parcel) {
        this.f6334a = (String) ai.a(parcel.readString());
        this.f6335b = (String) ai.a(parcel.readString());
    }

    public b(String str, String str2) {
        this.f6334a = str;
        this.f6335b = str2;
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0092a
    public void a(ac.a aVar) {
        String str = this.f6334a;
        Objects.requireNonNull(str);
        switch (str) {
            case "ALBUM":
                aVar.c(this.f6335b);
                break;
            case "TITLE":
                aVar.a(this.f6335b);
                break;
            case "DESCRIPTION":
                aVar.g(this.f6335b);
                break;
            case "ALBUMARTIST":
                aVar.d(this.f6335b);
                break;
            case "ARTIST":
                aVar.b(this.f6335b);
                break;
        }
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
        return this.f6334a.equals(bVar.f6334a) && this.f6335b.equals(bVar.f6335b);
    }

    public int hashCode() {
        return this.f6335b.hashCode() + e.a(this.f6334a, 527, 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("VC: ");
        sbA.append(this.f6334a);
        sbA.append("=");
        sbA.append(this.f6335b);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6334a);
        parcel.writeString(this.f6335b);
    }
}
