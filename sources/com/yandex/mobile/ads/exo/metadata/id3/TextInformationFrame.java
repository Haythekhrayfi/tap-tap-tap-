package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.developer.filepicker.model.DialogConfigs;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.ec0;
import com.yandex.mobile.ads.impl.z11;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18595c;

    public class a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i10) {
            return new TextInformationFrame[i10];
        }
    }

    public TextInformationFrame(Parcel parcel) {
        super((String) da1.a(parcel.readString()));
        this.f18594b = parcel.readString();
        this.f18595c = (String) da1.a(parcel.readString());
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f18594b = str2;
        this.f18595c = str3;
    }

    private static ArrayList a(String str) {
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

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ec0.a aVar) {
        byte b10;
        String str = this.f18583a;
        Objects.requireNonNull(str);
        switch (str) {
            case "TAL":
                b10 = 0;
                break;
            case "TCM":
                b10 = 1;
                break;
            case "TDA":
                b10 = 2;
                break;
            case "TP1":
                b10 = 3;
                break;
            case "TP2":
                b10 = 4;
                break;
            case "TP3":
                b10 = 5;
                break;
            case "TRK":
                b10 = 6;
                break;
            case "TT2":
                b10 = 7;
                break;
            case "TXT":
                b10 = 8;
                break;
            case "TYE":
                b10 = 9;
                break;
            case "TALB":
                b10 = 10;
                break;
            case "TCOM":
                b10 = 11;
                break;
            case "TDAT":
                b10 = 12;
                break;
            case "TDRC":
                b10 = 13;
                break;
            case "TDRL":
                b10 = 14;
                break;
            case "TEXT":
                b10 = 15;
                break;
            case "TIT2":
                b10 = 16;
                break;
            case "TPE1":
                b10 = 17;
                break;
            case "TPE2":
                b10 = 18;
                break;
            case "TPE3":
                b10 = 19;
                break;
            case "TRCK":
                b10 = 20;
                break;
            case "TYER":
                b10 = 21;
                break;
            default:
                b10 = -1;
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    aVar.b(this.f18595c);
                    break;
                case 1:
                case 11:
                    aVar.e(this.f18595c);
                    break;
                case 2:
                case 12:
                    aVar.d(Integer.valueOf(Integer.parseInt(this.f18595c.substring(2, 4)))).c(Integer.valueOf(Integer.parseInt(this.f18595c.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    aVar.c(this.f18595c);
                    break;
                case 4:
                case 18:
                    aVar.a(this.f18595c);
                    break;
                case 5:
                case 19:
                    aVar.f(this.f18595c);
                    break;
                case 6:
                case 20:
                    String str2 = this.f18595c;
                    int i10 = da1.f19803a;
                    String[] strArrSplit = str2.split(DialogConfigs.DIRECTORY_SEPERATOR, -1);
                    aVar.k(Integer.valueOf(Integer.parseInt(strArrSplit[0]))).j(strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null);
                    break;
                case 7:
                case 16:
                    aVar.l(this.f18595c);
                    break;
                case 8:
                case 15:
                    aVar.m(this.f18595c);
                    break;
                case 9:
                case 21:
                    aVar.e(Integer.valueOf(Integer.parseInt(this.f18595c)));
                    break;
                case 13:
                    ArrayList arrayListA = a(this.f18595c);
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.c((Integer) arrayListA.get(2));
                            }
                        }
                        aVar.d((Integer) arrayListA.get(1));
                    }
                    aVar.e((Integer) arrayListA.get(0));
                    break;
                case 14:
                    ArrayList arrayListA2 = a(this.f18595c);
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.f((Integer) arrayListA2.get(2));
                            }
                        }
                        aVar.g((Integer) arrayListA2.get(1));
                    }
                    aVar.h((Integer) arrayListA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return da1.a(this.f18583a, textInformationFrame.f18583a) && da1.a(this.f18594b, textInformationFrame.f18594b) && da1.a(this.f18595c, textInformationFrame.f18595c);
    }

    public final int hashCode() {
        int iA = z11.a(this.f18583a, 527, 31);
        String str = this.f18594b;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18595c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f18583a + ": description=" + this.f18594b + ": value=" + this.f18595c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18583a);
        parcel.writeString(this.f18594b);
        parcel.writeString(this.f18595c);
    }
}
