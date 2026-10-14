package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import com.developer.filepicker.model.DialogConfigs;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator<l>() { // from class: com.applovin.exoplayer2.g.e.l.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6389b;

    public l(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f6388a = parcel.readString();
        this.f6389b = (String) ai.a(parcel.readString());
    }

    public l(String str, String str2, String str3) {
        super(str);
        this.f6388a = str2;
        this.f6389b = str3;
    }

    private static List<Integer> a(String str) {
        int i10;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                i10 = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        i10 = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                i10 = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(i10));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.applovin.exoplayer2.g.a.InterfaceC0092a
    public void a(ac.a aVar) {
        String str = this.f6377f;
        Objects.requireNonNull(str);
        byte b10 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b10 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b10 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b10 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b10 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b10 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b10 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b10 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b10 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b10 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b10 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b10 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b10 = 11;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b10 = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b10 = 13;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b10 = 14;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b10 = 15;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b10 = 16;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b10 = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b10 = 18;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b10 = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b10 = 20;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b10 = 21;
                }
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    aVar.c(this.f6389b);
                    break;
                case 1:
                case 11:
                    aVar.i(this.f6389b);
                    break;
                case 2:
                case 12:
                    aVar.e(Integer.valueOf(Integer.parseInt(this.f6389b.substring(2, 4)))).f(Integer.valueOf(Integer.parseInt(this.f6389b.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    aVar.b(this.f6389b);
                    break;
                case 4:
                case 18:
                    aVar.d(this.f6389b);
                    break;
                case 5:
                case 19:
                    aVar.j(this.f6389b);
                    break;
                case 6:
                case 20:
                    String[] strArrA = ai.a(this.f6389b, DialogConfigs.DIRECTORY_SEPERATOR);
                    aVar.a(Integer.valueOf(Integer.parseInt(strArrA[0]))).b(strArrA.length > 1 ? Integer.valueOf(Integer.parseInt(strArrA[1])) : null);
                    break;
                case 7:
                case 16:
                    aVar.a(this.f6389b);
                    break;
                case 8:
                case 15:
                    aVar.h(this.f6389b);
                    break;
                case 9:
                case 21:
                    aVar.d(Integer.valueOf(Integer.parseInt(this.f6389b)));
                    break;
                case 13:
                    List<Integer> listA = a(this.f6389b);
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.f(listA.get(2));
                            }
                        }
                        aVar.e(listA.get(1));
                    }
                    aVar.d(listA.get(0));
                    break;
                case 14:
                    List<Integer> listA2 = a(this.f6389b);
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.i(listA2.get(2));
                            }
                        }
                        aVar.h(listA2.get(1));
                    }
                    aVar.g(listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return ai.a((Object) this.f6377f, (Object) lVar.f6377f) && ai.a((Object) this.f6388a, (Object) lVar.f6388a) && ai.a((Object) this.f6389b, (Object) lVar.f6389b);
    }

    public int hashCode() {
        int iA = l1.e.a(this.f6377f, 527, 31);
        String str = this.f6388a;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6389b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f6377f + ": description=" + this.f6388a + ": value=" + this.f6389b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6377f);
        parcel.writeString(this.f6388a);
        parcel.writeString(this.f6389b);
    }
}
