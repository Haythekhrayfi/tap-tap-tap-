package t1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.activity.k;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.versionedparcelable.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f35660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f35661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f35664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35667k;

    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new q.a(), new q.a(), new q.a());
    }

    public a(Parcel parcel, int i10, int i11, String str, q.a<String, Method> aVar, q.a<String, Method> aVar2, q.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f35660d = new SparseIntArray();
        this.f35665i = -1;
        this.f35666j = 0;
        this.f35667k = -1;
        this.f35661e = parcel;
        this.f35662f = i10;
        this.f35663g = i11;
        this.f35666j = i10;
        this.f35664h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f35665i;
        if (i10 >= 0) {
            int i11 = this.f35660d.get(i10);
            int iDataPosition = this.f35661e.dataPosition();
            this.f35661e.setDataPosition(i11);
            this.f35661e.writeInt(iDataPosition - i11);
            this.f35661e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    public androidx.versionedparcelable.a b() {
        Parcel parcel = this.f35661e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f35666j;
        if (i10 == this.f35662f) {
            i10 = this.f35663g;
        }
        return new a(parcel, iDataPosition, i10, k.a(new StringBuilder(), this.f35664h, "  "), this.f2925a, this.f2926b, this.f2927c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean f() {
        return this.f35661e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] g() {
        int i10 = this.f35661e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f35661e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    public CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f35661e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean i(int i10) {
        while (this.f35666j < this.f35663g) {
            int i11 = this.f35667k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f35661e.setDataPosition(this.f35666j);
            int i12 = this.f35661e.readInt();
            this.f35667k = this.f35661e.readInt();
            this.f35666j += i12;
        }
        return this.f35667k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int j() {
        return this.f35661e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T l() {
        return (T) this.f35661e.readParcelable(a.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String n() {
        return this.f35661e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void p(int i10) {
        a();
        this.f35665i = i10;
        this.f35660d.put(i10, this.f35661e.dataPosition());
        this.f35661e.writeInt(0);
        this.f35661e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void q(boolean z10) {
        this.f35661e.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.a
    public void r(byte[] bArr) {
        if (bArr == null) {
            this.f35661e.writeInt(-1);
        } else {
            this.f35661e.writeInt(bArr.length);
            this.f35661e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f35661e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void t(int i10) {
        this.f35661e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void u(Parcelable parcelable) {
        this.f35661e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void v(String str) {
        this.f35661e.writeString(str);
    }
}
