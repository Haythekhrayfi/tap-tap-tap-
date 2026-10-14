package com.google.android.play.core.assetpacks;

import androidx.fragment.app.d0;
import com.developer.filepicker.model.DialogConfigs;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class dx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f12180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f12182f;

    public dx() {
    }

    public dx(String str, long j10, int i10, boolean z10, boolean z11, byte[] bArr) {
        this();
        this.f12177a = str;
        this.f12178b = j10;
        this.f12179c = i10;
        this.f12180d = z10;
        this.f12181e = z11;
        this.f12182f = bArr;
    }

    public static dx a(String str, long j10, int i10, boolean z10, byte[] bArr, boolean z11) {
        return new dx(str, j10, i10, z10, z11, bArr);
    }

    public final boolean a() {
        if (c() == null) {
            return false;
        }
        return c().endsWith(DialogConfigs.DIRECTORY_SEPERATOR);
    }

    public final boolean b() {
        return e() == 0;
    }

    public String c() {
        return this.f12177a;
    }

    public long d() {
        return this.f12178b;
    }

    public int e() {
        return this.f12179c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dx) {
            dx dxVar = (dx) obj;
            String str = this.f12177a;
            if (str != null ? str.equals(dxVar.c()) : dxVar.c() == null) {
                if (this.f12178b == dxVar.d() && this.f12179c == dxVar.e() && this.f12180d == dxVar.f() && this.f12181e == dxVar.g() && Arrays.equals(this.f12182f, dxVar.f12182f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean f() {
        return this.f12180d;
    }

    public boolean g() {
        return this.f12181e;
    }

    public byte[] h() {
        return this.f12182f;
    }

    public int hashCode() {
        String str = this.f12177a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f12178b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f12179c) * 1000003) ^ (true != this.f12180d ? 1237 : 1231)) * 1000003) ^ (true == this.f12181e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f12182f);
    }

    public String toString() {
        String str = this.f12177a;
        long j10 = this.f12178b;
        int i10 = this.f12179c;
        boolean z10 = this.f12180d;
        boolean z11 = this.f12181e;
        String string = Arrays.toString(this.f12182f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(string).length());
        v.e.a(sb2, "ZipEntry{name=", str, ", size=");
        sb2.append(j10);
        sb2.append(", compressionMethod=");
        sb2.append(i10);
        sb2.append(", isPartial=");
        sb2.append(z10);
        sb2.append(", isEndOfArchive=");
        sb2.append(z11);
        return d0.a(sb2, ", headerBytes=", string, "}");
    }
}
