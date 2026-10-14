package com.google.android.gms.common.images;

import androidx.fragment.app.d0;

/* JADX INFO: loaded from: classes.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i10, int i11) {
        this.zaa = i10;
        this.zab = i11;
    }

    public static Size parseSize(String str) throws NumberFormatException {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(120);
        }
        if (iIndexOf < 0) {
            throw zaa(str);
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            throw zaa(str);
        }
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException(d0.a(new StringBuilder(str.length() + 16), "Invalid Size: \"", str, "\""));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i10 = this.zab;
        int i11 = this.zaa;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        int i10 = this.zaa;
        int i11 = this.zab;
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        return sb2.toString();
    }
}
